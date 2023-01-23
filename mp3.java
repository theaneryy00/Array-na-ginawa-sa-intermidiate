import java.util.Scanner;
public class mp3 {
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

    
    for (int i =0; i < n/2 ; i++){
        int temp = array[i];
        array[i] = array[n-1-i];
        array[n-1-i] = temp;
    }

        
    System.out.print("Reversed:");
    for (int i =0; i < n ; i++)
        System.out.print( array[i] + " ");


    


}
}
