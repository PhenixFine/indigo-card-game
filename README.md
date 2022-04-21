# Indigo Card Game
Stage 4 of 5 for JetBrains Academy - Kotlin - [Indigo Card Game project](https://hyperskill.org/projects/214/stages/1075/implement).   
This stage has us implement rules and track scores and cards won.
## Requirements
### Description
We will implement the game rules in this stage. The game loop is ready, but the program can't do anything; the cards are just piling up on the table.

The game rules are easy:    
1. Four cards are placed face-up on the table;
2. Six cards are dealt to each player;
3. The players take turns in playing cards. If the card has the same suit or rank as the topmost card, then the player wins all the cards on the table;
4. When both players have no cards in hand, go to step 2 unless there are no more remaining cards in the card deck.
5. **The remaining cards on the table go to the player who won the cards last.** In the rare case where none of the players win any cards, then all cards go to the player who played first.

When a card with the same suit or rank as the top card on the table is played, the one who tossed it wins all the cards on the table. The program in this situation should save the cards for the winner before clearing the table of all cards. The program should be **keeping track** of all cards won by the two players.

The program should also **count the points** of each player, so develop a point system. The cards with the ranks `A`, `10`, `J`, `Q`, `K` get 1 point each, while the player who has the most cards gets three points. If the players have the same number of cards, then the player who played first gets these points. The total points in this game are 23. The player with the most points wins the game.
### Objectives
If the player throws a card that has the same suit or rank as the top card on the table, print the score and the cards won by each player with the message:
```text
Player wins cards
Score: Player 2 - Computer 0
Cards: Player 5 - Computer 0
```
The second line shows the total points. The third line shows the number of cards for each player (here, the numbers are random).

If the computer throws a card that has the same suit or rank as the top card on the table, print the score and the cards won by each player with the message:
```text
Computer wins cards
Score: Player 2 - Computer 1
Cards: Player 5 - Computer 5
```
If there are no cards on the table, print the message `No cards on the table` instead of `X cards on the table, and the top card is Y`.

When the game ends, **add the points of the remaining cards** and print the score and the cards won before the `Game Over` message:
```text
Score: Player 6 - Computer 17
Cards: Player 12 - Computer 40
Game Over
```
Since this is the final score, the sum of cards should be 52, and the sum of points should be 23.
### Examples
The greater-than symbol followed by a space (`> `) represents the user input. Note that it's not part of the input.    
The examples have been shortened.
#### Example 1: standard execution; player first
```text
Indigo Card Game
Play first?
> yes
Initial cards on the table: 5♦ J♦ K♣ 5♠

4 cards on the table, and the top card is 5♠
Cards in hand: 1)J♠ 2)8♦ 3)2♦ 4)6♥ 5)2♣ 6)A♦
Choose a card to play (1-6):
> 1
Player wins cards
Score: Player 3 - Computer 0
Cards: Player 5 - Computer 0

No cards on the table
Computer plays Q♠

1 cards on the table, and the top card is Q♠
Cards in hand: 1)8♦ 2)2♦ 3)6♥ 4)2♣ 5)A♦
Choose a card to play (1-5):
> 2

2 cards on the table, and the top card is 2♦
Computer plays 7♠

3 cards on the table, and the top card is 7♠
Cards in hand: 1)8♦ 2)6♥ 3)2♣ 4)A♦
Choose a card to play (1-4):
> 3

4 cards on the table, and the top card is 2♣
Computer plays 5♣
Computer wins cards
Score: Player 3 - Computer 1
Cards: Player 5 - Computer 5

No cards on the table
Cards in hand: 1)8♦ 2)6♥ 3)A♦
Choose a card to play (1-3):
> 1

1 cards on the table, and the top card is 8♦
Computer plays 4♦
Computer wins cards
Score: Player 3 - Computer 1
Cards: Player 5 - Computer 7


...................................
...................................
...................................


1 cards on the table, and the top card is K♥
Cards in hand: 1)3♥ 2)2♥
Choose a card to play (1-2):
> 2
Player wins cards
Score: Player 12 - Computer 8
Cards: Player 26 - Computer 23

No cards on the table
Computer plays 9♠

1 cards on the table, and the top card is 9♠
Cards in hand: 1)3♥
Choose a card to play (1-1):
> 1

2 cards on the table, and the top card is 3♥
Computer plays 6♣

3 cards on the table, and the top card is 6♣
Score: Player 15 - Computer 8
Cards: Player 29 - Computer 23
Game Over
```
#### Example 2: standard execution; computer first
```text
Indigo Card Game
Play first?
> no
Initial cards on the table: A♠ 10♠ 2♣ J♦

4 cards on the table, and the top card is J♦
Computer plays 2♦
Computer wins cards
Score: Player 0 - Computer 3
Cards: Player 0 - Computer 5

No cards on the table
Cards in hand: 1)9♥ 2)J♠ 3)9♦ 4)7♦ 5)10♣ 6)5♠
Choose a card to play (1-6):
> 1

1 cards on the table, and the top card is 9♥
Computer plays 3♣

2 cards on the table, and the top card is 3♣
Cards in hand: 1)J♠ 2)9♦ 3)7♦ 4)10♣ 5)5♠
Choose a card to play (1-5):
> 5

3 cards on the table, and the top card is 5♠
Computer plays Q♦

4 cards on the table, and the top card is Q♦
Cards in hand: 1)J♠ 2)9♦ 3)7♦ 4)10♣
Choose a card to play (1-4):
> 2
Player wins cards
Score: Player 1 - Computer 3
Cards: Player 5 - Computer 5

No cards on the table
Computer plays 4♣

1 cards on the table, and the top card is 4♣
Cards in hand: 1)J♠ 2)7♦ 3)10♣
Choose a card to play (1-3):
> 1

2 cards on the table, and the top card is J♠
Computer plays 7♣

3 cards on the table, and the top card is 7♣
Cards in hand: 1)7♦ 2)10♣
Choose a card to play (1-2):
> 1
Player wins cards
Score: Player 2 - Computer 3
Cards: Player 9 - Computer 5

No cards on the table
Computer plays 5♦


...................................
...................................
...................................


3 cards on the table, and the top card is 3♥
Computer plays 9♣

4 cards on the table, and the top card is 9♣
Cards in hand: 1)7♠ 2)K♦
Choose a card to play (1-2):
> 2

5 cards on the table, and the top card is K♦
Computer plays J♥

6 cards on the table, and the top card is J♥
Cards in hand: 1)7♠
Choose a card to play (1-1):
> 1

7 cards on the table, and the top card is 7♠
Score: Player 17 - Computer 6
Cards: Player 35 - Computer 17
Game Over
```