public class questTwo {
    public static void main(String[] args) {
        for(int i = 0; i <= 6; i++){
            for(int j = 0; j <= 11 ; j ++){
                
                if(i < 3 &&  j < 4 ){
                    System.out.print("*");
                }else{
                    System.out.print("=");
                }
            }
            System.out.println();
        }
    }
}
