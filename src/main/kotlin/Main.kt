fun main() {
    val deck = Deck()
    val table = deck.getHand(Hand.TABLE_SIZE)
    val player = deck.getHand(Hand.DEAL_SIZE)
    val computer = deck.getHand(Hand.DEAL_SIZE)
    var isPlayerTurn: Boolean
    var exit = false

    println("Indigo Card Game")
    isPlayerTurn = getPlayerTurn()
    println("Initial cards on the table: " + table.cards())

    while (!exit) {
        println("\n" + table.size() + " cards on the table, and the top card is " + table.topCard())
        if (table.size() == Deck.RANGE.last) break
        with((if (isPlayerTurn) player else computer)) { if (isEmpty()) add(deck.getCards(Hand.DEAL_SIZE)) }
        if (isPlayerTurn) exit = playerTurn(player, table) else computerTurn(computer, table)
        isPlayerTurn = !isPlayerTurn
    }
    println("Game Over")
}

private fun getPlayerTurn(): Boolean {
    while (true) {
        when (getString("Play first?")) {
            "yes" -> return true
            "no" -> return false
        }
    }
}

private fun playerTurn(hand: Hand, table: Hand): Boolean {
    println("Cards in hand: " + hand.cardsNumbered())

    while (true) {
        val action = getString("Choose a card to play (1-${hand.size()}):")

        if (action == "exit") return true
        table.add(hand.take(action.toIntOrNull() ?: continue) ?: continue)
        return false
    }
}

private fun computerTurn(hand: Hand, table: Hand) {
    val card = hand.takeLast() ?: return

    println("Computer plays $card")
    table.add(card)
}

private fun getString(message: String): String {
    println(message)
    return readln()
}