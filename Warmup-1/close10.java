//Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number.

public int close10(int a, int b) {
  // Calculate absolute differences between each number and 10
  int diffA = Math.abs(a - 10);
  int diffB = Math.abs(b - 10);

  // Check if the differences are equal (i.e., a tie)
  if (diffA == diffB) {
    return 0; // Return 0 in the event of a tie
  } 
  // Check which difference is smaller
  else if (diffA < diffB) {
    return a; // Return a if diffA is smaller
  } 
  else {
    return b; // Return b if diffB is smaller
  }
}
