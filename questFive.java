import java.util.Scanner;

public class questFive {
    public static void main(String[] args) {
        int [][] arr = new int[10][10];

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++){

                System.out.print("Enter value for index [" + i + "] [" + j + "]");
                arr[i][j] = input.nextInt();
                System.out.println();
                
            }
   
        }

        // print the array using a for- eac loop

        System.out.println("\nThe values you entered are: ");
        for(int [] row : arr){
            for(int value : row){
                System.out.print(value + " ");
            };
            System.out.println();
        }
    }
}
