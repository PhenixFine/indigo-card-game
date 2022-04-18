class Hand {
    private val hand = ArrayDeque<String>()

    fun isEmpty() = hand.isEmpty()

    fun add(cards: List<String>) = cards.toCollection(hand)

    fun add(card: String) = hand.add(card)

    fun take(card: Int) = if (card in 1..hand.size) hand.removeAt(card - 1) else null

    fun takeLast() = if (hand.isNotEmpty()) hand.removeLast() else null

    fun size() = hand.size

    fun topCard() = if (hand.isNotEmpty()) hand.last() else "hand is empty"

    fun cards() = hand.joinToString(" ")

    fun cardsNumbered() = hand.mapIndexed { index, card -> "${index + 1})$card" }.joinToString(" ")

    companion object {
        const val DEAL_SIZE = 6
        const val TABLE_SIZE = 4

        fun create(cards: List<String>) = Hand().also { it.add(cards) }
    }
}