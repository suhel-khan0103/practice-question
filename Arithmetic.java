import java .util.Scanner;
class Arithmetic{
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        System.out.println("WELCOME TO ARITHMETIC CALCULATOR : ");
        System.out.print("Enter the first number : ");
        double first = input.nextDouble();
        System.out.print("Enter the second number : ");
        double second = input.nextDouble();
        double sum = first + second;
        System.out.println("two number addtion is : " + sum);
        double sub = first - second;
        System.out.println("two number subtraction is : " + sub);
        double mul = first * second;
        System.out.println("two number multiplication is : " + mul);
        double div = first / second;
        System.out.println("two number division is : " + div);
        int mod = (int)first % (int)second;
        System.out.println("two number modulus is : " + mod);
    }
    
}
