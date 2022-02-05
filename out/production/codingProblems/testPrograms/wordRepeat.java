import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class wordRepeat {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine();
        System.out.println("You have entered:" + str);

        String[] sp = str.split(" ");

        Set<String> set = new HashSet<>();

        // here we are iterating in Array
        for (int i = 0; i < sp.length - 1; i++) {

            for (int j = 1; j < sp.length; j++) {

                if (sp[i].equals(sp[j]) && i != j) {
                    set.add(sp[i]);
                }
            }
        }

        // printing the set
        System.out.println("Words that have been repeated are:"+set);
    }
}
