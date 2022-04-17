class Deck {
    private val _deck: List<String>
    private val deck = ArrayDeque<String>()

    init {
        val ranks = "A 2 3 4 5 6 7 8 9 10 J Q K"
        val suits = "♦ ♥ ♠ ♣"
        _deck = suits.split(" ").flatMap { suit -> ranks.split(" ").map { rank -> rank + suit } }
        _deck.toCollection(deck)
    }

    fun reset() {
        deck.clear()
        _deck.toCollection(deck)
        println("Card deck is reset.")
    }

    fun get(num: Int) = if (deck.size >= num) (1..num).map { deck.removeLast() } else null

    fun shuffle() {
        deck.shuffle()
        println("Card deck is shuffled.")
    }

    companion object {
        val RANGE = 1..52
    }
}