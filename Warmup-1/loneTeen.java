//We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 2 int values, return true if one or the other is teen, but not both.

public boolean loneTeen(int a, int b) {
  //say that a number is "teen" if it is in the range 13..19 inclusive
  boolean aInRange = (a >= 13 && a <= 19);
  //say that a number is "teen" if it is in the range 13..19 inclusive
  boolean bInRange = (b >= 13 && b <= 19);
  //but not both
  if(aInRange && bInRange) {
    return false;
  }
  //return true if one or the other is teen
  if(aInRange || bInRange) {
    return true;
  }
  return false;
}
