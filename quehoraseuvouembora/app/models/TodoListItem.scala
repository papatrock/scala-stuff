package models // define o pacote

final case class TodoListItem(id : Long, description: String, var isItDone: Boolean)
