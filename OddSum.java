
import java.util.Scanner;
 class OddSum {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("welcomr to odd Sum : ");
        System.out.print("please enter your number : ");
        int num = input.nextInt();
        int sum = OddSum(num);
        System.out.println("OddSum till  "   +  num  +  " is "  +  sum);
    }
        public static int OddSum(int num){
            int sum = 0;
            int i = 1;
            while (i<=num){
                sum+=i;
                i+=2;
            }
            return sum;
        }
    
}
