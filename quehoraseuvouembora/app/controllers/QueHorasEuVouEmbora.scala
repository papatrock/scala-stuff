package controllers

import requests.Response
import org.jsoup.Jsoup
import scala.jdk.CollectionConverters._
import play.api.mvc._
import javax.inject.Singleton
import javax.inject._
import play.api.libs.json._
import ujson._

@Singleton
class QueHorasEuVouEmbora @Inject() (
    val controllerComponents: ControllerComponents
) extends BaseController {

  def getHora(): Action[AnyContent] = Action {

    val url = "https://www.dimepkairos.com.br/Dimep/Ponto/BuscarApontamentos"

    val cookie =
      s".AspNet.Cookies=lPSmpkPKsZ56r6d3yQP7pZDcO479zrZI4ORpwzytTd1f6RZC9z6ERypI24uyZzzzhhgaLomOAZn3-VXdliiswqbLb40lv1bjIqaOm1Z8es44oJddpnbmcUU1L3K6nrCVWpVlzElED0fGumbWoeiTi3fzJ0SCd_wX0JSbp43_7zx1KBGBklH_HhdhH6nZunPcVaFWEcPewxT63O2NDX5_wAGW9YpndodzGwXsMHxvb09REc9-l8ROAdG6hghmJ-MwkTy2vRo-Ki4h_-KtL4TOtn9B9GhKGs_R5ZZMAnwdd5g_pv_t6f9ALgkGtweR7CwzXXfUQw; ASP.NET_SessionId=l3ciiktrlmbi11ruanlpgaxg"

    val payload = ujson.Obj(
      "Week" -> ujson.Num(0),
      "IdPessoa" -> ujson.Num(0),
      "IdPeriodo" -> ujson.Num(67),
      "IdPessoaCripto" -> ujson.Str("jvmoqC9E454="),
      "geraMarcacoes" -> ujson.False
    )

    val headers = Map("Content-Type" -> "application/json", "Cookie" -> cookie)

    try {
      val response = requests.post(url, headers = headers, data = payload)
      val doc = Jsoup.parse(response.text())
      val diaContainer = Option(doc.selectFirst("div.DiaApontamento"))
        .getOrElse(
          throw new RuntimeException("Container do dia não encontrado.")
        )

      val data = Option(diaContainer.selectFirst("input[id^=hiddenDiaApont]"))
        .map(_.attr("value").replace('_', '/'))
        .getOrElse("N/A")

      val marcacoes = diaContainer
        .select("span.ApontamentoVisualizacao")
        .asScala
        .map(_.text())
        .toList

      // CORREÇÃO: Passar o JSON diretamente para o Ok()
      Ok(
        Json.obj(
          "data" -> data,
          "marcacoes" -> marcacoes
        )
      )

    } catch {
      case e: Exception =>
        // Adicionado tratamento de erro para retornar uma resposta clara
        InternalServerError(Json.obj("erro" -> e.getMessage))
    }
  }
}
