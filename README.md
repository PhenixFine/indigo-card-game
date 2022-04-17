# Indigo Card Game
Stage 2 of 5 for JetBrains Academy - Kotlin - [Indigo Card Game project](https://hyperskill.org/projects/214/stages/1073/implement).   
This stage just has us add actions reset, shuffle, get, and exit for the user.
## Requirements
### Description
In this stage, we will create a virtual card deck.

Provide the following operations to the card deck:
* Get the top cards from the deck and print them. Remove these cards from the deck;
* Shuffle the deck;
* Reset the deck (deal a new deck of 52 cards).   

In this stage, we will also create a simple menu to test our virtual card deck
### Objectives
Print the message: `Choose an action (reset, shuffle, get, exit):`. Users can choose one of the available options `reset`, `shuffle`, `get`, `exit`, and press enter. In case users enter anything else, print the message `Wrong action.` and ask users once again (Example 4).

If `reset`:
* Reset the deck to the original 52 cards;
* Print the message `Card deck is reset.`;
* Prompt for new action.

If `shuffle`:
* Change the order of the remaining cards in the deck;
* Print the message `Card deck is shuffled.`;
* Prompt for new action.

If `get`:
* Ask for the number of cards to be taken from the top of the deck with the prompt `Number of cards:`
* Users should input a number between `1` and `52`. Otherwise, for any number outside this range or for any non-number input, print `Invalid number of cards.` (Example 2); 
* These cards are to be removed from the top of the deck and printed divided by one space (`6♦ 3♦ 8♦ 4♠ 9♦`). If the number of cards is larger than the number of the remaining cards in the deck, print `The remaining cards are insufficient to meet the request.` (Example 3); 
* Prompt for new action.    

If `exit`:
* Print `Bye`; 
* Terminate the program.
### Examples
The greater-than symbol followed by a space (`> `) represents the user input. Note that it's not part of the input.
#### Example 1: standard execution
```text
Choose an action (reset, shuffle, get, exit):
> reset
Card deck is reset.
Choose an action (reset, shuffle, get, exit):
> shuffle
Card deck is shuffled.
Choose an action (reset, shuffle, get, exit):
> get
Number of cards:
> 10
2♥ A♦ 8♠ 2♣ Q♠ 8♣ 5♥ 8♥ K♠ J♣
Choose an action (reset, shuffle, get, exit):
> get
Number of cards:
> 6
J♦ J♠ 3♣ Q♣ 10♠ 5♦
Choose an action (reset, shuffle, get, exit):
> reset
Card deck is reset.
Choose an action (reset, shuffle, get, exit):
> get
Number of cards:
> 52
K♣ Q♣ J♣ 10♣ 9♣ 8♣ 7♣ 6♣ 5♣ 4♣ 3♣ 2♣ A♣ K♦ Q♦ J♦ 10♦ 9♦ 8♦ 7♦ 6♦ 5♦ 4♦ 3♦ 2♦ A♦ K♥ Q♥ J♥ 10♥ 9♥ 8♥ 7♥ 6♥ 5♥ 4♥ 3♥ 2♥ A♥ K♠ Q♠ J♠ 10♠ 9♠ 8♠ 7♠ 6♠ 5♠ 4♠ 3♠ 2♠ A♠
Choose an action (reset, shuffle, get, exit):
> reset
Card deck is reset.
Choose an action (reset, shuffle, get, exit):
> shuffle
Card deck is shuffled.
Choose an action (reset, shuffle, get, exit):
> get
Number of cards:
> 52
5♥ K♣ 4♣ Q♣ 6♣ J♣ 7♦ J♥ 2♣ 7♠ 8♦ 6♥ 9♥ 7♣ 10♥ 7♥ 5♦ 10♦ 6♦ K♠ 5♠ K♥ 6♠ A♣ 3♥ J♠ 2♦ 3♦ 8♠ 4♦ 5♣ 3♠ 9♠ 8♥ J♦ Q♦ Q♥ 4♥ 10♠ K♦ Q♠ 9♦ 9♣ A♦ 4♠ 2♥ 10♣ 8♣ A♥ 2♠ 3♣ A♠
Choose an action (reset, shuffle, get, exit):
> exit
Bye
```
#### Example 2: invalid number of cards
```text
Choose an action (reset, shuffle, get, exit):
> get
Number of cards:
> 0
Invalid number of cards.
Choose an action (reset, shuffle, get, exit):
> get
Number of cards:
> 53
Invalid number of cards.
Choose an action (reset, shuffle, get, exit):
> get
Number of cards:
> one
Invalid number of cards.
Choose an action (reset, shuffle, get, exit):
> exit
Bye
```
#### Example 3: insufficient cards
```text
Choose an action (reset, shuffle, get, exit):
> reset
Card deck is reset.
Choose an action (reset, shuffle, get, exit):
> get
Number of cards:
> 10
K♣ Q♣ J♣ 10♣ 9♣ 8♣ 7♣ 6♣ 5♣ 4♣
Choose an action (reset, shuffle, get, exit):
> get
Number of cards:
> 43
The remaining cards are insufficient to meet the request.
Choose an action (reset, shuffle, get, exit):
> reset
Card deck is reset.
Choose an action (reset, shuffle, get, exit):
> get
Number of cards:
> 52
K♣ Q♣ J♣ 10♣ 9♣ 8♣ 7♣ 6♣ 5♣ 4♣ 3♣ 2♣ A♣ K♦ Q♦ J♦ 10♦ 9♦ 8♦ 7♦ 6♦ 5♦ 4♦ 3♦ 2♦ A♦ K♥ Q♥ J♥ 10♥ 9♥ 8♥ 7♥ 6♥ 5♥ 4♥ 3♥ 2♥ A♥ K♠ Q♠ J♠ 10♠ 9♠ 8♠ 7♠ 6♠ 5♠ 4♠ 3♠ 2♠ A♠
Choose an action (reset, shuffle, get, exit):
> get
Number of cards:
> 1
The remaining cards are insufficient to meet the request.
Choose an action (reset, shuffle, get, exit):
> exit
Bye
```
#### Example 4: wrong actions
```text
Choose an action (reset, shuffle, get, exit):
> card
Wrong action.
Choose an action (reset, shuffle, get, exit):
> action
Wrong action.
Choose an action (reset, shuffle, get, exit):
> look card
Wrong action.
Choose an action (reset, shuffle, get, exit):
> deck
Wrong action.
Choose an action (reset, shuffle, get, exit):
> exit
Bye
```