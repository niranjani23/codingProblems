public class sumInt {
    public static void main(String[] args) {

        int[] arry = new int[]{1,2,3,4,10,11};
        int sum = 0;
        //System.out.println(arry[2]);
        //System.out.println(arry.length);
        for(int i=0;i<arry.length;i++) {
            //Prints the array
            //System.out.println(arry[i]);
            sum+=arry[i];
        }
        System.out.println("The sum of array is: "+sum);

    }
}
