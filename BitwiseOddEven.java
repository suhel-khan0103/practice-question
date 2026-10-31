import java.util.Scanner;
 class BitwiseOddEven {
    public static void main(String[]args){
        Scanner input =new Scanner(System.in);
        System.out.println("welcom to Even and Odd with the help of bitwise operator");
        System.out.print("Enter the number");
        int num = input.nextInt();
        
        if ((num & 1) == 1 ){
            System.out.print("your number is Odd : ");
        } else{
            System.out.print("your number is Even : ");
        }
    
    }
}
