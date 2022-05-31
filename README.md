# Indigo Card Game
Stage 5 of 5 for JetBrains Academy - Kotlin - [Indigo Card Game project](https://hyperskill.org/projects/214/stages/1076/implement).   
This stage has us make the computer make smarter moves when playing. I added that the computer will select a card worth points if going to win the table's cards, and select cards not worth anything if not going to win ( while still obeying the other rules set forth for this stage ).    
## Requirements
### Description
It is time to make the computer smarter. Until now, the computer played a random card, but now it will follow a certain strategy.

For testing purposes, print the computer cards in hand before the computer chooses a card.

From now on, we will introduce the term **candidate cards**. They are the cards in hand that can win the cards on the table.

The strategy is as follows:
1. If there is only one card in hand, put it on the table (Example 2);
2. If there is only one candidate card, put it on the table (Example 3);
3. If there are no cards on the table:
    * If there are cards in hand with the same suit, throw one of them at random (Example 4). For example, if the cards in hand are `7♥ 9♥ 8♣ A♠ 3♦ 7♦ Q♥` (multiple `♥`, and `♦` suits), the computer will play one card at random.
    * If there are no cards in hand with the same suit, but there are cards with the same rank (this situation occurs only when there are 4 or fewer cards in hand), then throw one of them at random (Example 5). For example, if the cards in hand are `7♦ 7♥ 4♠ K♣`, throw one of `7♦ 7♥` at random.
    * If there are no cards in hand with the same suit or rank, throw any card at random. For example, if the cards in hand are `9♥ 8♣ A♠ 3♦`, throw any of them at random.
4. If there are cards on the table but no candidate cards, use the same tactics as in step 3. That is:
    * If there are cards in hand with the same suit, throw one of them at random (Example 6). For example, if the top card on the table is `A♦`, and the cards in hand are `6♣ Q♥ 8♣ J♠ 7♣` (multiple `♣` suit), the computer will place any of `6♣ 8♣ 7♣` at random.
    * If there are no cards in hand with the same suit, but there are cards with the same rank (this may occur when there are 3 or fewer cards in hand), throw one of them at random (Example 7). For example, if the top card on the table is `A♦` and the cards in hand are `J♠ Q♥ J♣`, put one of `J♠ J♣` at random.
    * If there are no cards in hand with the same suit or rank, then put any card at random. For example, if the top card on the table is `A♦`, and the cards in hand are `J♠ Q♥ K♣`, throw any of them at random.
5. If there are two or more candidate cards:
    * If there are 2 or more candidate cards with the same suit as the top card on the table, throw one of them at random (Example 8). For example, if the top card on the table is `5♥`, and the cards in hand are `6♥ 8♣ 5♠ 7♦ 7♥`, then the candidate cards are `6♥ 7♥ 5♠`. There are 2 candidate cards with the same suit as the top card on the table, `6♥ 7♥`. Place any at random.
    * If the above isn't applicable, but there are 2 or more candidate cards with the same rank as the top card on the table, throw one of them at random (example 9). For example, if the top card on the table is `J♥`, and the cards in hand are `3♥ J♣ J♠ 6♦`, then the candidate cards are `3♥ J♣ J♠`. In this case, there are no 2 or more candidate cards with the same suit, but there are 2 candidate cards with the same rank as the top card on the table that are `J♣ J♠`. Put any at random.
    * If nothing of the above is applicable, then throw any of the candidate cards at random.    

The strategy above can be improved. Moreover, the computer can play even better if it keeps track of the cards that have been played. However, our goal isn't a complex algorithm for the computer, but to learn how to apply the strategy.
### Objectives
Implement the strategy above.

For testing purposes, print the computer cards in hand. Every time the computer plays, print an extra line. It should contain the computer cards in hand separated by one space, just before the computer plays its card (Example 1):
```text
4 cards on the table, and the top card is A♣
6♣ 8♣ Q♦ 10♦ Q♥ 4♠
Computer plays 6♣
```
### Examples
The greater-than symbol followed by a space (`> `) represents the user input. Note that it's not part of the input.
#### Example 1: a new line with computer's cards in hand
```text
Indigo Card Game
Play first?
no
Initial cards on the table: 6♣ 7♥ 3♦ 4♥

4 cards on the table, and the top card is 4♥
8♣ 3♠ 8♥ K♥ 2♦ K♦
Computer plays 8♥
Computer wins cards
Score: Player 0 - Computer 0
Cards: Player 0 - Computer 5

No cards on the table
Cards in hand: 1)J♦ 2)4♠ 3)J♣ 4)A♦ 5)5♠ 6)Q♦
Choose a card to play (1-6):
exit
Game Over
```
#### Example 2: one card in hand
```text
......

1 cards on the table, and the top card is K♣
8♥
Computer plays 8♥

......
```
#### Example 3: only one candidate card
```text
......

3 cards on the table, and the top card is K♥
K♦ J♠ Q♣
Computer plays K♦
Computer wins cards
Score: Player 3 - Computer 7
Cards: Player 8 - Computer 15

......
```
#### Example 4: no cards on the table; various suits
```text
......

No cards on the table
6♣ K♦ Q♣ 2♥
Computer plays 6♣

......
```
#### Example 5: no cards on the table; various ranks (different suits)
```text
......

No cards on the table
2♥ 3♠ 3♦ 4♣
Computer plays 3♠

......
```
#### Example 6: cards on the table, but no candidate card; various suits
```text
......

3 cards on the table, and the top card is 7♣
Q♦ J♦ 10♠ 2♥
Computer plays Q♦

......
```
#### Example 7: cards on the table, but no candidate card; various ranks (different suits)
```text
......

3 cards on the table, and the top card is 8♦
6♠ J♥ 6♣
Computer plays 6♠

......
```
#### Example 8: two or more candidate cards with the same suit
```text
......

1 cards on the table, and the top card is 5♥
9♦ J♥ J♦ 2♥ 5♠
Computer plays J♥
Computer wins cards
Score: Player 5 - Computer 1
Cards: Player 12 - Computer 7

......
```
#### Example 9: two or more candidate cards with the same rank
```text
......

3 cards on the table, and the top card is 5♣
5♠ 5♥ 9♣ 2♦
Computer plays 5♥
Computer wins cards
Score: Player 0 - Computer 3
Cards: Player 0 - Computer 9

......
```