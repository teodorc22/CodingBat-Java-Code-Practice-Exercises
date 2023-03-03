//We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23. We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.

public boolean parrotTrouble(boolean talking, int hour) {
    // Check if the parrot is talking
    if (talking) {
        // Check if the hour is before 7 or after 20
        if (hour < 7 || hour > 20) {
            // We are in trouble if the parrot is talking and the hour is before 7 or after 20
            return true;
        }
    }
    // We are not in trouble if the parrot is not talking or the hour is between 7 and 20
    return false;
}
