import java .util.Scanner; 
 class prime {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to checker prime number : ");
        System.out.print("Please enter your number : ");
        int num = input.nextInt();
        boolean isprime = isPrime(num);
            if (isprime) {
                System.out.println("your number number is prime : ");
            } else {
                System.out.println("your number is not prime : ");
            }
        
        }


         public static boolean isPrime(int num){
             int i = 2;
             while (i<num){
               if (num % i == 0) {
                 return false;
                }
                i++;
        }
        return true;
    } 
}
