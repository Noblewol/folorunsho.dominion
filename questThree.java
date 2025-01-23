import java.util.Arrays;
import java.util.Scanner;

public class questThree {
    public static void main(String[] args) {
        int [] arr = new int[12];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 12 numbers");

        for(int i = 0; i < arr.length; i++){
             arr[i] = input.nextInt();
        }
// sort array
 Arrays.sort(arr);

        //median 

        int medianSum = arr[5] + arr[6]; 

        double median = medianSum/2.0;
 // calculate total sum
        int sum = 0;
        
        for(int i =0 ; i < arr.length; i++){
            sum+= arr[i];
        }
        // calculate mean
        double mean = sum/arr.length;
         
   // calculate varianceSum

    int varianceSum = 0;

    for (int i = 0; i < arr.length; i++) {
        varianceSum+= Math.pow(arr[i] - mean, 2);
    }

    int variance = varianceSum/arr.length;

   //calculate Standarddeviation

   double sD = Math.sqrt(variance);

   System.out.println("The median is " + median);
   System.out.println("Total sum is " + sum);
        System.out.println("Mean is " + mean);
        System.out.println("The standard deviation is " + sD);
    }
}
