object Main extends App{
    def factorial(i : BigInt) : BigInt = i match {
        case _ if i == 1 => i
        case _ => i * factorial(i-1)
    }

    // Tail call
    def factorial2(i : BigInt) : BigInt = {
        def fact(i : BigInt, accumulator : BigInt) : BigInt = i match {
            case _ if i == 1 => accumulator
            case _ => fact (i - 1, i * accumulator)
        }
        fact(i,1)
    }
}