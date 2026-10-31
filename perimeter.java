import java.util.Scanner;
class perimeter{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out .println("WELCOME TO PERIMETER CALCULATER");
        System.out.print("please enter your all 4 side: ");
        Double a = input.nextDouble();
        Double b = input.nextDouble();
        Double c = input.nextDouble();
        Double d = input.nextDouble();
        Double perimeter = a+b+c+d;
        System.out.println("perimeter rectangle is :" +perimeter);

    }
   }