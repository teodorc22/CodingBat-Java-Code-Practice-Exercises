//Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.

public boolean nearHundred(int n) {
    // Check if the absolute difference between n and 100 is less than or equal to 10
    // OR if the absolute difference between n and 200 is less than or equal to 10
    if (Math.abs(n - 100) <= 10 || Math.abs(n - 200) <= 10) {
        // If either condition is true, return true
        return true;
    } else {
        // Otherwise, return false
        return false;
    }
}

//For example, if n is 93, 100, 107, 190, 198, or 205, the program should return true. If n is 80, 115, 180, or 210, the program should return false.
//To check if n is close to 100 or 200, the program can use the Math.abs() method to calculate the absolute value of the difference between n and 100 or 200. If that absolute value is less than or equal to 10, then n is within 10 of 100 or 200, respectively, and the program should return true. Otherwise, the program should return false.
