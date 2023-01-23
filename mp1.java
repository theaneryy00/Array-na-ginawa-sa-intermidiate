import java.util.Scanner;
public class mp1 {

    public static void main(String[] args) throws Exception {
    Scanner sc=new Scanner(System.in);  
    
    int [] numbers= new int [5];
    
    System.out.print("Enter element 1: ");
    numbers[0]= sc.nextInt();

    System.out.print("Enter element 2: ");
    numbers[1]= sc.nextInt();

    System.out.print("Enter element 3: ");
    numbers[2]= sc.nextInt();

    System.out.print("Enter element 4: ");
    numbers[3]= sc.nextInt();

    System.out.print("Enter element 5: ");
    numbers[4]= sc.nextInt();
    
    char index= 0;
   
for (int i = 0; i < numbers.length; i++) {
  System.out.println(numbers[i]);
}
}
}
