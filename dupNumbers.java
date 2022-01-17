public class dupNumbers {

    public static void main(String[] args) {

        int[] arry = new int[]{1,2,3,4,10,11,1,2,10};
        int sum = 0;

        System.out.println("Duplicates in the array:");

 //Read all the numbers from the array
         for(int i=0;i<arry.length;i++) {
             //Read the numbers so we can compare
            for(int j=i+1;j<arry.length;j++)
                //Compare both the arryas to find duplicates
                if(arry[i]==arry[j]){

                    System.out.println(arry[j]);

            }

        }
    }

}
