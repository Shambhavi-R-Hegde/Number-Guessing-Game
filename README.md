# Number Guessing Game (Java)

A simple Command Line Interface (CLI) based Number Guessing Game built using Java.

The player selects a difficulty level and tries to guess a randomly generated number within limited attempts.

---

## Features

- Three Difficulty Levels:
  - Easy → 1–50 (10 attempts)
  - Medium → 1–100 (7 attempts)
  - Hard → 1–500 (5 attempts)
- Random number generation
- Limited attempts system
- Attempt counter
- Input validation
- Win / Lose messages
- Dynamic range and attempts based on difficulty

---

## Concepts Used

- Variables & Data Types
- Conditional Statements (`if-else`, `switch`)
- Loops (`while`)
- Boolean logic
- Java `Random` class
- User input using `Scanner`
- Dynamic configuration using variables

---

## How It Works

1. The user selects a difficulty level.
2. The game sets:
   - Maximum number range
   - Maximum allowed attempts
3. A random number is generated.
4. The user keeps guessing until:
   - The correct number is guessed  
   - OR the attempts run out

---

## Example Run
```
Please select the difficulty level:
1. Easy
2. Medium
3. Hard

2

Now game runs between 1 and 100 with only 7 guesses.

Please guess the number:
50
Too Low 😕

Attempts left: 6

75
Too High 😕

Attempts left: 5

63
Congratulations!! You guessed it right 🥳
Number of attempts used: 3
```
