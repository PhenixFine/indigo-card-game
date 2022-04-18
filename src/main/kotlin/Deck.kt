class Deck {
    private val deck = ArrayDeque<String>()

    init {
        val ranks = "A 2 3 4 5 6 7 8 9 10 J Q K".split(" ")
        val suits = "♦ ♥ ♠ ♣".split(" ")

        suits.flatMap { suit -> ranks.map { rank -> rank + suit } }.shuffled().toCollection(deck)
    }

    fun getHand(num: Int) = Hand.create(getCards(num))

    fun getCards(num: Int) = if (deck.size >= num) (1..num).map { deck.removeLast() } else emptyList()

    companion object {
        val RANGE = 1..52
    }
}