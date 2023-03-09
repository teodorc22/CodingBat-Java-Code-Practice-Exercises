//Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, or return 0 if neither is in that range.

public int max1020(int a, int b) {
  // Check if a is in range 10..20 inclusive
  boolean aInRange = (a >= 10 && a <= 20);
  
  // Check if b is in range 10..20 inclusive
  boolean bInRange = (b >= 10 && b <= 20);
  
  // Check if both a and b are outside the range 10..20 inclusive
  if (!aInRange && !bInRange) {
    return 0; // Neither is in the range, return 0
  }
  
  // Check if a is in the range and b is not
  if (aInRange && !bInRange) {
    return a; // Only a is in the range, return a
  }
  
  // Check if b is in the range and a is not
  if (bInRange && !aInRange) {
    return b; // Only b is in the range, return b
  }
  
  // Both a and b are in the range, return the larger one
  return Math.max(a, b);
}
