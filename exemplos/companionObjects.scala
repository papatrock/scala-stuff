// companionObjects.scala

import scala.math.*

// O "Companion Object"
// Um 'object' com o mesmo nome da 'class' no mesmo arquivo.
object Circle:
  // Método privado, só pode ser usado dentro do object Circle
  private def calculateArea(radius: Double): Double =
    Pi * pow(radius, 2.0)

// A "Companion Class"
// Uma 'class' com o mesmo nome do 'object' no mesmo arquivo.
class Circle(radius: Double):
  import Circle.* // Importa os membros do companion object
  
  // O método 'area' da classe pode acessar o método privado 'calculateArea' do object
  def area: Double = calculateArea(radius)

// Ponto de entrada para executar o código
object Main extends App:
  val circle1 = new Circle(5.0)
  val areaDoCirculo = circle1.area
  
  println(s"Um círculo com raio 5.0 tem uma área de: $areaDoCirculo")
  // Saída: Um círculo com raio 5.0 tem uma área de: 78.53981633974483
