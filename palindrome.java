public class palindrome {
    
    public boolean checkForPalindrome(String originalstr)
    {
        String reversestr = "";

        int strlength = originalstr.length();

        //Reverse String
        for(int i = strlength-1;i>=0;i--) {
            // reversestr variable has the reversed string
            reversestr = reversestr + originalstr.charAt(i);
        }
        //Comparing two strings using equals method
        if(originalstr.equals(reversestr))
        {
            System.out.println("It's a palindrome");
            return true;
        }
        
            else
            {
                System.out.println("It's not a palindrome");
                return false;
            }
                
        
    }

    public static void main(String[] args) {

       // Initialize and instantiate the palindrome object - "check"
       palindrome check = new palindrome();
       check.checkForPalindrome("racecar");

    }
}
