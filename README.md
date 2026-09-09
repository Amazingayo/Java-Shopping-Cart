# Shopping Cart Discount Calculator

A Java-based console application that calculates subtotal pricing from an array of item costs and applies tiered discounts to determine the final payable amount.

## Overview
The program processes an array of prices using an enhanced `for-each` loop, computes the gross total, checks applicable discount thresholds, and prints a final transaction summary.

## Discount Tiers
* **20% off** on order totals $\ge$ 10,000
* **5% off** on order totals $\ge$ 5,000 (and $< 10,000$)
* **0% off** on order totals $< 5,000$

## Features
* Calculates gross cart totals dynamically from an array of prices.
* Evaluates tiered conditions using structured `if / else if / else` branching.
* Displays gross total, discount amount, and final bill.

## How to Run
1. Ensure Java Development Kit (JDK 8 or later) is installed.
2. Compile the source file:
   ```bash
   javac -d . shoppingcart.java
