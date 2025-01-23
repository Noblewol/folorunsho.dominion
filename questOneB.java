public class questOneB {
    public static void main(String[] args) {
        int height = 4;  
        int width = 12;  

        // Single loop to print the flag
        for (int i = 0; i < height * width; i++) {
            
          
            int col = i % width;

            if (col < width / 3 || col >= 2 * width / 3) {
                System.out.print("*");  
            } else {
                System.out.print("="); 
            }

           
            if (col == width - 1) {
                System.out.println();
            }
        }
    }
}
