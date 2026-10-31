import java.util.Scanner;
class FloatMultilication {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO FLOAT MULTIPLICATION CALCULATOR : ");
        System.out.print("Enter the first number : ");
        Double       first = input.nextDouble();
        System.out.print("Enter the second number : ");
        Double second = input.nextDouble();
        Double mul = first * second;
        System.out.println("two number multiplication is : " + mul);
        

    }
    
}
