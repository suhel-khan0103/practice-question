import java.util.Scanner; 
 class bitwiseOperator{
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        System.out.println("showcasing bitwise AND operator : ");
        System.out.print("Enter the first number : ");
        int first = input.nextInt();
        System.out.print("Enter the second number : ");
        int second= input.nextInt();
        
        int result = first & second ;
        System.out.print(" Bitwise operator is : " +result);
    }
}