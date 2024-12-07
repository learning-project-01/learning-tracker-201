**Problem**
```
Given a 2d array of int values

Iterate row by row
Iterate column by column
Assume in this below 2d array if I read it as a sequence of elements with index 0 to 3
{
 {10, 21},
 {22, 13}
}
I can say at 0th index 10, 1st index 21, 2nd index 22, 3rd index 13.

Given an index say 1, we should be able to print value as 21.
Somehow, we have to derive row and column from the given index. using java
```
**Solution**
- A 2D array is like a grid, and we can treat its elements as a 1D sequence.
- If the 2D array has dimensions rows x cols:
- The row for a given 1D index is calculated as:row = index/cols
- (integer division in Java: index / cols)
- The column is calculated as: column = index%cols
- (remainder of division in Java: index % cols)
