# JTradeLedger

A console-based stock portfolio analyzer built in Java. This project simulates a simple trading environment where users can buy and sell stocks, track their transaction history, and calculate the total value of their portfolio based on mock market prices.

## Features
*   **Live Market Simulation:** Browse available stocks with fixed mock prices.
*   **Trade Execution:** Buy and sell shares with automatic balance deductions and additions.
*   **Validation Logic:** Prevents over-drafting cash or selling unowned shares.
*   **Transaction Ledger:** Maintains a chronological record of all executed trades.
*   **Portfolio Valuation:** Calculates the real-time total value of the user's account (cash balance + current stock holdings).

## Tech Stack
*   **Language:** Java (Core Java, OOP, Collections)
*   **IDE:** IntelliJ IDEA
*   **Version Control:** Git / GitHub

## Project Structure
The application relies on the following core classes:
*   `Main`: The driver class containing the interactive console menu loop.
*   `Market`: Acts as the simulated exchange, storing available stocks and prices.
*   `Portfolio`: Manages the user's cash balance and transaction history.
*   `Stock`: Data model for an individual company ticker and price.
*   `Trade`: Data model for a single executed transaction (receipt).

## How to Run
1. Clone the repository to your local machine:
   ```bash
   git clone [https://github.com/Yax-H-Patel/JTradeLedger.git](https://github.com/yourusername/JTradeLedger.git)
