class Hand {
    private val hand = ArrayDeque<String>()
    private val points = "A 10 J Q K".split(" ")

    fun add(cards: List<String>) = cards.toCollection(hand)

    fun add(card: String) = hand.add(card)

    fun take(card: Int) = if (card in 1..hand.size) hand.removeAt(card - 1) else null

    fun takeLast() = if (hand.isNotEmpty()) hand.removeLast() else null

    fun reset() = hand.clear()

    fun size() = hand.size

    fun topCard() = if (hand.isNotEmpty()) hand.last() else ""

    fun cards() = hand.joinToString(" ")

    fun cardsNumbered() = hand.mapIndexed { index, card -> "${index + 1})$card" }.joinToString(" ")

    fun isEmpty() = hand.isEmpty()

    fun isWin(playerCard: String, topCard: String = topCard()) = topCard.isNotEmpty()
            && (topCard.dropLast(1) == playerCard.dropLast(1) || topCard.last() == playerCard.last())

    fun sumPoints() = hand.map { if (points.contains(it.dropLast(1))) 1 else 0 }.sum()

    companion object {
        const val DEAL_SIZE = 6
        const val TABLE_SIZE = 4

        fun create(cards: List<String>) = Hand().also { it.add(cards) }
    }
}