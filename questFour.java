import java.util.Scanner;

public class questFour {
 public static void main(String[] args) {
     int [] arr = new int[10];
     Scanner input = new Scanner(System.in);
      

     for (int i = 0; i < arr.length; i++) {
         System.out.print("Enter " + i + "(index) number :");
         arr[i] = input.nextInt();
         System.out.println();

     }
    for (int i = 0; i < arr.length; i++) {
        
        System.out.print(arr[i] + " ");
    }
     
 }   
}
