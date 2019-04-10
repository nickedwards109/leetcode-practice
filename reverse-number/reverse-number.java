class Solution {
    public int reverse(int x) {
        // handle a negative input by making it positive for processing,
        //   and saving a variable to remember that the input was negative
        boolean negative;
        if (x < 0) { 
          x *= -1;
          negative = true;
        } else {
          negative = false;
        }
        
        // make a string to hold digits as they are removed from the input
        String reversed = "";
        
        // as long as the input hasn't been entirely processed yet,
        //   find the last digit
        //   add this last digit to the string that represents the reversed number
        //   remove the last digit from the input
        while (x > 0) {
            int remainder = x % 10;
            reversed += remainder;
            x = (x - remainder) / 10;
        }
        
        // turn the reversed string into an integer
        int reversedInt = Integer.parseInt(reversed);
        
        // if the input was negative, make the final result negative
        if ( negative == true ) { 
            reversedInt *= -1;
        }
        
        return reversedInt;
    }
}
