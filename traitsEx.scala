// Uma classe base abstrata
abstract class Animal(val nome: String) {
  def som: String
}

// Traits para comportamentos
trait Corredor {
  def correr(): Unit = println(s"Estou correndo!")
}

trait Nadador {
  def nadar(): Unit = println(s"Estou nadando!")
}

trait Voador {
  def voar(): Unit = println(s"Estou voando!")
}

// Classes que herdam da classe base e misturam traits
class Cachorro(nome: String) extends Animal(nome) with Corredor {
  def som: String = "Au au!"
}

class Pato(nome: String) extends Animal(nome) with Corredor with Nadador with Voador {
  def som: String = "Quack!"
}

class Peixe(nome: String) extends Animal(nome) with Nadador {
  def som: String = "Glub glub!"
}

// Main entry point for the application
object Main extends App {
  // Utilização
  val rex = new Cachorro("Rex")
  println(s"${rex.nome} diz: ${rex.som}")
  rex.correr()

  println() // For spacing

  val donald = new Pato("Donald")
  println(s"${donald.nome} diz: ${donald.som}")
  donald.nadar()
  donald.voar()

  println() // For spacing

  val nemo = new Peixe("Nemo")
  println(s"${nemo.nome} diz: ${nemo.som}")
  nemo.nadar()
}
