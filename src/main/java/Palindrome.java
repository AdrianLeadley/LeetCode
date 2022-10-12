public class Palindrome {

    // Did not know enough about palidromes to complete without looking at solution.
    // The examples with give you hints as to what code you need to add for a final solution.

    public static boolean isPalindrome(int x) {
        if(x < 0 || x % 10 == 0 && x !=0) {
            // (x < 0) because palindrome  cannot be smaller than 0
            // x % 10 == 0 && x !=0 because the last digit cannot be a 0 unless it is 0
            return false;
        }
        int r = 0;
        while(x>r){
            r = r * 10 + x % 10;
            System.out.println("r: " + r);
            /**
             * e.g. x = 1234
             * r = (0 * 10) + (1234 % 10)
             * r = 0 + 123
             *
             * x is still bigger than the r so the while loop continues
             * **/
            x /= 10;
            // divide x by 10 and set new value
            System.out.println("x: " + x);
        }
        return x == r || x == r/10;
    }






    public static void main(String [] args){
        System.out.println(isPalindrome(-1));
        System.out.println(isPalindrome(12345));



    }
}

