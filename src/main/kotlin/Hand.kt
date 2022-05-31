class Hand {
    private val hand = ArrayDeque<String>()

    fun add(cards: List<String>) = cards.toCollection(hand)

    fun add(card: String) = hand.add(card)

    fun take(card: Int) = if (card in 1..hand.size) hand.removeAt(card - 1) else null

    fun reset() = hand.clear()

    fun size() = hand.size

    fun topCard() = if (hand.isNotEmpty()) hand.last() else ""

    fun cards() = hand.joinToString(" ")

    fun cardsNumbered() = hand.mapIndexed { index, card -> "${index + 1})$card" }.joinToString(" ")

    fun isEmpty() = hand.isEmpty()

    fun isWin(playerCard: String, topCard: String = topCard()) = topCard.isNotEmpty()
            && (topCard.dropLast(1) == playerCard.dropLast(1) || topCard.last() == playerCard.last())

    fun sumPoints() = hand.map { if (points.contains(it.dropLast(1))) 1 else 0 }.sum()

    fun bestMove(topCard: String) = when {
        hand.size == 1 -> hand.first()
        topCard.isEmpty() -> worstCard()
        else -> bestCard(topCard)
    }.also { hand.remove(it) }

    private fun worstCard(): String {
        val suits = hand.filter { card -> hand.count { card.last() == it.last() } > 1 }
        val ranks: List<String> by lazy { hand.filter { card -> hand.count { card.first() == it.first() } > 1 } }

        return when {
            suits.isNotEmpty() -> selectCard(suits, false)
            ranks.isNotEmpty() -> selectCard(ranks, false)
            else -> selectCard(hand, false)
        }
    }

    private fun bestCard(topCard: String): String {
        val suits = hand.filter { topCard.last() == it.last() }
        val ranks: List<String> by lazy { hand.filter { topCard.first() == it.first() } }

        return when {
            suits.size > 1 -> selectCard(suits, true)
            ranks.size > 1 -> selectCard(ranks, true)
            suits.isNotEmpty() || ranks.isNotEmpty() -> selectCard(suits + ranks, true)
            else -> worstCard()
        }
    }

    companion object {
        const val DEAL_SIZE = 6
        const val TABLE_SIZE = 4
        private val points = "A 10 J Q K".split(" ")

        fun create(cards: List<String>) = Hand().also { it.add(cards) }

        private fun selectCard(cards: List<String>, selectBest: Boolean): String {
            val filterCards = if (selectBest) cards::filter else cards::filterNot
            val selected = filterCards { points.contains(it.dropLast(1)) }

            return if (selected.isNotEmpty()) selected.random() else cards.random()
        }
    }
}