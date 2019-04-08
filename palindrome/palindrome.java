class Solution {
    public boolean isPalindrome(int x) {
        // convert the input integer to a string for comparison purposes
        String inputString = Integer.toString(x);
        
        // if the input is a single digit, return true
        if (inputString.length() == 1) {
            return true;
        }
        
        // make a string to represent a possible palindrome
        String possiblePalindrome = "";

        
        // get the last digit
        // add that digit to the front of a string
        // remove the last digit from the input
        // keep doing this until the input string is gone
        while (x>0) {
            int remainder = x % 10;
            String remainderString = Integer.toString(remainder);
            possiblePalindrome = possiblePalindrome + remainderString;
            x = (x - remainder) / 10;
        }
        
        // check whether the input string matches the possible palindrome
        if (inputString.equals(possiblePalindrome)) {
            return true;
        } else {
            return false;
        }
    }
}
