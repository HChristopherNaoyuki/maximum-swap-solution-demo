# Maximum Swap

## Description
The **Maximum Swap** project provides a solution to find the maximum integer that can be formed by swapping two digits in a given non-negative integer. The approach involves iterating through the digits of the number, identifying the best possible swap to achieve the largest value.

## Features
- Efficiently calculates the maximum number by swapping two digits.
- Handles edge cases where no swaps can improve the number.
- Includes test cases to demonstrate functionality.

## Code Overview
- **Class**: `Solution`
  - **Method**: `maximumSwap(int num)` 
    - Takes a non-negative integer as input and returns the maximum possible integer by performing a single swap of two digits.
  - **Main Method**: Contains test cases that showcase the usage of the `maximumSwap` method.

## Usage
1. Clone the repository or download the source code.
2. Open the project in your preferred Java IDE.
3. Compile the `Solution` class.
4. Run the `main` method to see example outputs.

## Example Output
Upon running the main method, the following outputs will be produced:
```
7236
9973
4231
```

### Explanation of Test Cases:
- For `2736`, swapping `2` and `7` gives `7236`.
- For `9973`, no swap can increase the number, so it remains `9973`.
- For `1234`, swapping `1` and `4` yields `4231`.

## Requirements
- Java Development Kit (JDK) 8 or higher
- A Java IDE (e.g., IntelliJ IDEA, Eclipse)
