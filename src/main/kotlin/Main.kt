fun main() {
    val ranks = "A 2 3 4 5 6 7 8 9 10 J Q K"
    val suits = "♦ ♥ ♠ ♣"
    val deck = suits.split(" ").flatMap { suit -> ranks.split(" ").map { rank -> rank + suit } }

    println(ranks)
    println(suits)
    println(deck.joinToString(" "))
}