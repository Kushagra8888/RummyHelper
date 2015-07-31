# RummyHelper

##Data Structure
-   Each card in the deck is represented by a number ranging from 1 - 53
-   1 - 13 represent cards {A, 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K} of spades
-   14 - 26 represent cards {A, 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K} of diamonds
-   27 - 39 represent cards {A, 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K} of hearts
-   39 - 52 represent cards {A, 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K} of clubs
-   53 represents a Joker

##Approach

1. Generate all possible combinations of lengths 5, 4, and 3.
2. Select only the valid combinations out of all combinations.
3. From the above, generate all possible combinations of types {5, 4, 3}, {5, 5, 3} and {4, 3, 3, 3}
4. For each of set of 13, find the number of cards replacements required in the given hand.
5. Find the minimum replacements.

