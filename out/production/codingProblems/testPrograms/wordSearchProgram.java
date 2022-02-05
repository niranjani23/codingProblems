import java.util.Scanner;

public class wordSearchProgram {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str= sc.nextLine();
        System.out.println("You have entered:"+str);

        String[] sp=str.split(" ");
        //System.out.println("second word is :" + sp[1]);
        String sl=sp[sp.length - 2];
        System.out.println("Second last word is :" + sl);

    }
}
