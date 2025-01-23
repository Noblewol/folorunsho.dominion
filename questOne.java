public class questOne {
    public static void main(String args[]){


      for(int i = 0; i < 4; i++){
         for(int j = 0; j < 12; j++)
             if(j == 4 || j ==5 || j ==6 ||  j == 7){
                 System.out.print("=");
      }else{
         System.out.print("*");
      }
      System.out.println();
    }
}
}