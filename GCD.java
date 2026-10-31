import java.util.Scanner;
class GCD {
    public static void main (String[] arys){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to GCD");
        System.out.print("Please enter your first number : ");
        int first =input.nextInt();
        System.out.print("please enter your second number");
        int second = input.nextInt();
        int GCD = GCD(first , second);
        System.out.println("GCD of the number is : "+GCD);
    }
    public static int GCD(int num1, int num2){
        int GCD = 1;
        int i = 2;
        int least = least(num1, num2);
        while (i <= least) {
          if (num1 % i == 0  &&  num2  %  i  ==0) {
            GCD= i;
          }
          i++;
        }
       return GCD;
    }
    public static int least(int num1, int num2){
        if (num1 < num2){
            return num1;
        }else{
            return num2;
        }
    }
}

