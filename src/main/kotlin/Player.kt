class Player(val hand: Hand, private val name: String = "Computer") {
    private var score = 0
    private var cards = 0

    fun win(table: Hand) {
        score += table.sumPoints()
        cards += table.size()
        table.reset()
        lastWinner = this
        println("$name wins cards")
    }

    fun printScore(computer: Player) {
        println("Score: $name $score - " + computer.name + " " + computer.score)
        println("Cards: $name $cards - " + computer.name + " " + computer.cards)
    }

    fun finalScore(playerWentFirst: Boolean, computer: Player, table: Hand) {
        if (!table.isEmpty()) {
            val cardsWinner = lastWinner ?: if (playerWentFirst) this else computer

            cardsWinner.score += table.sumPoints()
            cardsWinner.cards += table.size()
        }
        if (cards > computer.cards || (cards == computer.cards && playerWentFirst)) score += 3 else {
            computer.score += 3
        }
        printScore(computer)
    }

    companion object {
        private var lastWinner: Player? = null
    }
}