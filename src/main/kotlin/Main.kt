fun main() {
    val deck = Deck()
    val table = deck.getHand(Hand.TABLE_SIZE)
    val player = Player(deck.getHand(Hand.DEAL_SIZE), "Player")
    val computer = Player(deck.getHand(Hand.DEAL_SIZE))
    var isPlayerTurn: Boolean
    val playerWentFirst: Boolean
    var exit = false

    println("Indigo Card Game")
    isPlayerTurn = getPlayerTurn().also { playerWentFirst = it }
    println("Initial cards on the table: " + table.cards())

    while (!exit) {
        printCardsOnTable(table)
        if (isEmpty(player.hand, computer.hand, deck)) break
        if (isPlayerTurn) exit = playerTurn(player, computer, table) else computerTurn(computer, player, table)
        isPlayerTurn = !isPlayerTurn
    }
    if (!exit) player.finalScore(playerWentFirst, computer, table)
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

private fun printCardsOnTable(table: Hand) {
    if (table.isEmpty()) println("\nNo cards on the table") else {
        println("\n" + table.size() + " cards on the table, and the top card is " + table.topCard())
    }
}

private fun isEmpty(player: Hand, computer: Hand, deck: Deck): Boolean {
    if (deck.isEmpty() && player.isEmpty() && computer.isEmpty()) return true
    if (player.isEmpty() && computer.isEmpty()) {
        player.add(deck.getCards(Hand.DEAL_SIZE))
        computer.add(deck.getCards(Hand.DEAL_SIZE))
    }
    return false
}

private fun playerTurn(player: Player, computer: Player, table: Hand): Boolean {
    println("Cards in hand: " + player.hand.cardsNumbered())

    while (true) {
        val action = getString("Choose a card to play (1-${player.hand.size()}):")
        if (action == "exit") return true
        val card = player.hand.take(action.toIntOrNull() ?: continue) ?: continue
        if (isWin(player, card, table)) player.printScore(computer)
        return false
    }
}

private fun computerTurn(computer: Player, player: Player, table: Hand) {
    val card = computer.hand.takeLast() ?: return

    println("Computer plays $card")
    if (isWin(computer, card, table)) player.printScore(computer)
}

private fun isWin(player: Player, card: String, table: Hand): Boolean {
    val won = table.isWin(card)

    table.add(card)
    return if (won) {
        player.win(table)
        true
    } else false
}

private fun getString(message: String): String {
    println(message)
    return readln()
}