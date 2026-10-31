import java.util.Scanner;

public class bitwiseLeftShift {
     public static void main(String []args){
        Scanner input = new Scanner(System.in);
        System.out.println("showcasing bitwise LEFT SHIFT operator : ");
        System.out.print(" please Enter  your  number : ");
        int num = input.nextInt();
        int result = num >> 1 ;
        System.out.print("yiur result is : " + result);
     }    
}
