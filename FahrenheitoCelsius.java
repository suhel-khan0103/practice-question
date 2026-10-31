  import java.util.Scanner;
   class FahrenheitoCelsius{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to tempreature convert .");
        System.out.print("enter your temp in F : ");
        float  fah = input.nextFloat();
        Float cel = (fah-32)*5/9 ;
        System.out.println("your tempreature is : " +cel+"c");

    }
   }
