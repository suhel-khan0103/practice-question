import java.util.Scanner; 
 class statement {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("your age");
        int age=input.nextInt();
        if (age>=18){
        System.out.println("you are eligible to drive");
        } else   {
            System.out.println("beta cycle chala lo" );
        
        } 
        

    }
}
