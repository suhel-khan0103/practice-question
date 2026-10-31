import java.util.Scanner; 
 public class armStrongNumber {
    public static void main (String[]args){
        Scanner input = new Scanner (System.in);
        System.out.println("WELCOME TO ARMSTRONG NUMBER : ");
        System.out.println("please enter your number : ");
        int num = input.nextInt();
        boolean isArmstrong = isArmstrong(num);
        if  (isArmstrong){
        System.out.println("your number is   armstrong : ");
    } else {
        System.out.println("your number is  not armstrong : ");
    }
}
    public static boolean isArmstrong(int num){
        int noOfDigits = noOfDigits(num);
        int numCopy = num ;
        int FinalNumber = 0;
        while (num>0) {
            int LastDigit = num % 10 ;
            num/=10;
            FinalNumber+= pow(LastDigit,noOfDigits);
        }
        return FinalNumber == numCopy;
    }
        public static int pow (int num1 , int num2){
            int result = 1;
            int i=0;
            while (i<num2){
                result*=num1;
                i++;
            }
            return result;
        }
        public static int noOfDigits(int num){
            int digits = 0 ;
            while (num>0){
                digits++;
                num/=10;
            }
            return digits;
        }



}
