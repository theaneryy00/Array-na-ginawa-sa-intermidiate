import java.util.Scanner;
public class mp2 {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);  

    System.out.print("Enter the size of storage:");
    int n = sc.nextInt();

    int [] array = new int[n];
    System.out.print(" Enter element for index: " );
    for (int i = 0; i <n ; i++) {
       array[i] = sc.nextInt();}
    

    System.out.print("Data:");
    for (int i =0; i < n ; i++)
        System.out.print( array[i] + " ");


    


}
}
