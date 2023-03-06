//Given 2 ints, a and b, return true if one of them is 10 or if their sum is 10.

public boolean makes10(int a, int b) {
  //Declare the sum
 int sum = a + b;
  //If one of the int numbers is 10 or the sum is 10
  if((a == 10 || b == 10) || sum == 10) {
    return true;
  } else {
    return false;
  }
}
