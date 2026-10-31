import java.util.Scanner;

class SumOfDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Calculate sum of digits : ");
        System.out.print("Please Enter you number : ");
        long num = input.nextLong();
        long sum = sumofdigits(num);
        System.out.print(" calculate sum of digits number is : " + sum);
    }

    public static long sumofdigits(long num) {
        long sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
