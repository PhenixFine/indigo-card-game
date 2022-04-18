# Indigo Card Game
Stage 3 of 5 for JetBrains Academy - Kotlin - [Indigo Card Game project](https://hyperskill.org/projects/214/stages/1074/implement).   
This stage has us start the basics of the game, where the player and computer piles the cards onto the table.
## Requirements
### Description
We have a virtual card deck, and now, it is time to build the game's basic core and loop.

In the beginning, there are four cards on the table. The players get six cards and take turns in throwing one card at a time. One of the players is the computer. When they both have no cards in hand, deal another six cards to the players. This continues until there are no more cards in the deck. If you do the calculations, they will give you four deals (4 cards + 4 deals * 2 * 6 cards = 52 cards).

In the current stage, just pile up the cards on the table. We will implement a win condition in the next stage.

For each turn, print the information of the number of cards on the table and the top card. When it is the computer's turn, always put the first card in hand. The computer AI will get better in the final stage.

Users should have the option to exit the program at any time.
### Objectives
Print the project title: `Indigo Card Game`.

Ask whether users want to play first by prompting the `Play first?` statement. The only available input options should be `yes` or `no` (case-insensitive). For any other input, print the question again (Example 3). If `yes`, then the player plays first (Example 1), and if `no`, then the computer plays first (Example 2).

Print the first 4 cards from the deck with the message: `Initial cards on the table: J♣ Q♣ 9♦ 5♦` (the cards here are random). Divide the cards with a single space. The last card on the right is the top card on the table.

After that, the player and computer take turns in putting cards on the table. If it is the player's turn, print the message `4 cards on the table, and the top card is 5♦`, where the first number is the number of cards on the table, and the card is the top card. Then print the cards in the player's hand with a prompt to choose one of them, as follows:    
```text
Cards in hand: 1)9♥ 2)4♠ 3)A♣ 4)9♣ 5)4♥ 6)3♥
Choose a card to play (1-6):
```
Divide the cards with a single space. The player should enter a number within the range of `1` to `<Number of cards in hand>`. If the input contains something else, prompt `Choose a card to play (1-6):` once again (Example 4).

If it is the computer's turn, print the message `5 cards on the table, and the top card is X` (a random card), where the first number is the number of cards on the table, and the card is the top card. Then, the computer should play the first card in hand. Print the message `Computer plays X` (a random card).

Once there are no more cards to play, print the message `52 cards on the table, and the top card is X` (a random card), followed by the message `Game Over`. Terminate the program.

If the player inputs `exit`, when prompted for a card, print the message Game Over and terminate the program (Examples 3 and 4).
### Examples
The greater-than symbol followed by a space (`> `) represents the user input. Note that it's not part of the input.    
Example 2 has been shortened.
#### Example 1: standard execution; player first
```text
Indigo Card Game
Play first?
> yes
Initial cards on the table: 5♥ 3♦ 10♠ A♣

4 cards on the table, and the top card is A♣
Cards in hand: 1)2♥ 2)7♠ 3)4♦ 4)5♣ 5)9♠ 6)A♠
Choose a card to play (1-6):
> 2

5 cards on the table, and the top card is 7♠
Computer plays A♦

6 cards on the table, and the top card is A♦
Cards in hand: 1)2♥ 2)4♦ 3)5♣ 4)9♠ 5)A♠
Choose a card to play (1-5):
> 4

7 cards on the table, and the top card is 9♠
Computer plays 4♣

8 cards on the table, and the top card is 4♣
Cards in hand: 1)2♥ 2)4♦ 3)5♣ 4)A♠
Choose a card to play (1-4):
> 4

9 cards on the table, and the top card is A♠
Computer plays 9♦

10 cards on the table, and the top card is 9♦
Cards in hand: 1)2♥ 2)4♦ 3)5♣
Choose a card to play (1-3):
> 1

11 cards on the table, and the top card is 2♥
Computer plays 10♣

12 cards on the table, and the top card is 10♣
Cards in hand: 1)4♦ 2)5♣
Choose a card to play (1-2):
> 2

13 cards on the table, and the top card is 5♣
Computer plays 7♥

14 cards on the table, and the top card is 7♥
Cards in hand: 1)4♦
Choose a card to play (1-1):
> 1

15 cards on the table, and the top card is 4♦
Computer plays 8♥

16 cards on the table, and the top card is 8♥
Cards in hand: 1)K♣ 2)3♣ 3)2♣ 4)K♥ 5)7♣ 6)6♣
Choose a card to play (1-6):
> 2

17 cards on the table, and the top card is 3♣
Computer plays 10♥

18 cards on the table, and the top card is 10♥
Cards in hand: 1)K♣ 2)2♣ 3)K♥ 4)7♣ 5)6♣
Choose a card to play (1-5):
> 3

19 cards on the table, and the top card is K♥
Computer plays 4♥

20 cards on the table, and the top card is 4♥
Cards in hand: 1)K♣ 2)2♣ 3)7♣ 4)6♣
Choose a card to play (1-4):
> 1

21 cards on the table, and the top card is K♣
Computer plays 4♠

22 cards on the table, and the top card is 4♠
Cards in hand: 1)2♣ 2)7♣ 3)6♣
Choose a card to play (1-3):
> 1

23 cards on the table, and the top card is 2♣
Computer plays Q♦

24 cards on the table, and the top card is Q♦
Cards in hand: 1)7♣ 2)6♣
Choose a card to play (1-2):
> 1

25 cards on the table, and the top card is 7♣
Computer plays 6♥

26 cards on the table, and the top card is 6♥
Cards in hand: 1)6♣
Choose a card to play (1-1):
> 1

27 cards on the table, and the top card is 6♣
Computer plays A♥

28 cards on the table, and the top card is A♥
Cards in hand: 1)3♠ 2)10♦ 3)K♦ 4)5♦ 5)K♠ 6)Q♥
Choose a card to play (1-6):
> 1

29 cards on the table, and the top card is 3♠
Computer plays 8♦

30 cards on the table, and the top card is 8♦
Cards in hand: 1)10♦ 2)K♦ 3)5♦ 4)K♠ 5)Q♥
Choose a card to play (1-5):
> 1

31 cards on the table, and the top card is 10♦
Computer plays J♠

32 cards on the table, and the top card is J♠
Cards in hand: 1)K♦ 2)5♦ 3)K♠ 4)Q♥
Choose a card to play (1-4):
> 1

33 cards on the table, and the top card is K♦
Computer plays 8♣

34 cards on the table, and the top card is 8♣
Cards in hand: 1)5♦ 2)K♠ 3)Q♥
Choose a card to play (1-3):
> 1

35 cards on the table, and the top card is 5♦
Computer plays 5♠

36 cards on the table, and the top card is 5♠
Cards in hand: 1)K♠ 2)Q♥
Choose a card to play (1-2):
> 2

37 cards on the table, and the top card is Q♥
Computer plays 2♠

38 cards on the table, and the top card is 2♠
Cards in hand: 1)K♠
Choose a card to play (1-1):
> 1

39 cards on the table, and the top card is K♠
Computer plays Q♣

40 cards on the table, and the top card is Q♣
Cards in hand: 1)6♦ 2)J♣ 3)7♦ 4)Q♠ 5)9♥ 6)3♥
Choose a card to play (1-6):
> 6

41 cards on the table, and the top card is 3♥
Computer plays 6♠

42 cards on the table, and the top card is 6♠
Cards in hand: 1)6♦ 2)J♣ 3)7♦ 4)Q♠ 5)9♥
Choose a card to play (1-5):
> 5

43 cards on the table, and the top card is 9♥
Computer plays 9♣

44 cards on the table, and the top card is 9♣
Cards in hand: 1)6♦ 2)J♣ 3)7♦ 4)Q♠
Choose a card to play (1-4):
> 4

45 cards on the table, and the top card is Q♠
Computer plays J♦

46 cards on the table, and the top card is J♦
Cards in hand: 1)6♦ 2)J♣ 3)7♦
Choose a card to play (1-3):
> 3

47 cards on the table, and the top card is 7♦
Computer plays 8♠

48 cards on the table, and the top card is 8♠
Cards in hand: 1)6♦ 2)J♣
Choose a card to play (1-2):
> 2

49 cards on the table, and the top card is J♣
Computer plays J♥

50 cards on the table, and the top card is J♥
Cards in hand: 1)6♦
Choose a card to play (1-1):
> 1

51 cards on the table, and the top card is 6♦
Computer plays 2♦

52 cards on the table, and the top card is 2♦
Game Over
```
#### Example 2: standard execution; computer first
```text
Indigo Card Game
Play first?
> no
Initial cards on the table: J♥ A♠ 8♥ 10♣

4 cards on the table, and the top card is 10♣
Computer plays 4♥

5 cards on the table, and the top card is 4♥
Cards in hand: 1)9♠ 2)4♣ 3)7♥ 4)4♦ 5)5♥ 6)K♥
Choose a card to play (1-6):
> 6

6 cards on the table, and the top card is K♥
Computer plays J♦


....................................
....................................
....................................


47 cards on the table, and the top card is Q♣
Cards in hand: 1)5♠ 2)5♦ 3)6♦
Choose a card to play (1-3):
> 1

48 cards on the table, and the top card is 5♠
Computer plays 2♥

49 cards on the table, and the top card is 2♥
Cards in hand: 1)5♦ 2)6♦
Choose a card to play (1-2):
> 2

50 cards on the table, and the top card is 6♦
Computer plays 8♣

51 cards on the table, and the top card is 8♣
Cards in hand: 1)5♦
Choose a card to play (1-1):
> 1

52 cards on the table, and the top card is 5♦
Game Over
```
#### Example 3: play first? wrong input; exit
```text
CIndigo Card Game
Play first?
> OK
Play first?
> sure
Play first?
> Noway
Play first?
> 0
Play first?
> yes
Initial cards on the table: J♥ 3♠ 8♠ Q♥

4 cards on the table, and the top card is Q♥
Cards in hand: 1)6♥ 2)9♥ 3)8♣ 4)6♦ 5)Q♦ 6)3♦
Choose a card to play (1-6):
> exit
Game Over
```
#### Example 4: wrong card to play; exit
```text
Indigo Card Game
Play first?
> yes
Initial cards on the table: 4♦ 10♠ 9♣ 7♦

4 cards on the table, and the top card is 7♦
Cards in hand: 1)Q♦ 2)6♥ 3)4♥ 4)4♠ 5)Q♠ 6)3♦
Choose a card to play (1-6):
> 0
Choose a card to play (1-6):
> 7
Choose a card to play (1-6):
> one
Choose a card to play (1-6):
> 5

5 cards on the table, and the top card is Q♠
Computer plays K♠

6 cards on the table, and the top card is K♠
Cards in hand: 1)Q♦ 2)6♥ 3)4♥ 4)4♠ 5)3♦
Choose a card to play (1-5):
> exit
Game Over
```