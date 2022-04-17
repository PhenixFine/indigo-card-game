fun main() {
    val deck = Deck()
    var exit = false

    while (!exit) {
        when (getString("Choose an action (reset, shuffle, get, exit):")) {
            "reset" -> deck.reset()
            "shuffle" -> deck.shuffle()
            "get" -> println(getCards(deck))
            "exit" -> exit = true
            else -> println("Wrong action.")
        }
    }
    println("Bye")
}

private fun getCards(deck: Deck): String {
    val invalid = "Invalid number of cards."
    val insufficient = "The remaining cards are insufficient to meet the request."
    val number = getString("Number of cards:").toIntOrNull() ?: return invalid

    return if (number !in Deck.RANGE) invalid else deck.get(number)?.joinToString(" ") ?: insufficient
}

private fun getString(message: String): String {
    println(message)
    return readln()
}