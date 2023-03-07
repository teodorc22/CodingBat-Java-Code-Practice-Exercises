//Given 2 int values, return true if one is negative and one is positive. Except if the parameter "negative" is true, then return true only if both are negative.

public boolean posNeg(int a, int b, boolean negative) {
  // check if negative is true
  if (negative) {
    // return true only if both are negative
    return (a < 0 && b < 0);
    // negative is false
  } else {
    // return true if one is negative and one is positive
    return (a < 0 && b > 0) || (a > 0 && b < 0); 
  }
}
