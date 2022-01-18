public class palindrome {

    public static void main(String[] args) {

        String originalstr = "racecar";
        String reversestr = "";

        int strlength = originalstr.length();

        //Reverse String
        for(int i = strlength-1;i>=0;i--) {
            // reversestr variable has the reversed string
            reversestr = reversestr + originalstr.charAt(i);
        }
        //Comparing two strings using equals method
        if(originalstr.equals(reversestr))
            System.out.println("It's a palindrome");
            else
                System.out.println("It's not a palindrome");



    }
}
