import java.util.Scanner;
public class Logical {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("welcom to ticket discaunt calculater");
        System.out.print("please Enter your age : ");
        int age = input.nextInt();
        System.out.print("Are you female ? (true/false)");
        boolean isFemale = input.nextBoolean();
        if (age<5){
            System.out .print("you got 75% discount");
        }else if (isFemale){
            System.out.print("you got 50% discaount");
        } else if (age>60 && !isFemale) {
            System.out.print("you got no discount");
        }
    }
}
