import java.util.Scanner;
 class simpleLoop {
    public static void main(String[]args){
   //  int count = 500;
   //  while (count >=200){
   //    System.out.print(count);
   //    count= count-1;
   //  } 
      Scanner input = new Scanner(System.in);
      int i=0;
      while (i<5){
         int inp = input.nextInt();
         System.out.println("number is : "+inp);
         i = i + 1;
      }
   }
}