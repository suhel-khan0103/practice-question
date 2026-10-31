 import java.util.Scanner;
 class TriangleArea {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to area calculator");
        System.out.print("please enter your base in cms: ");
        Double base = input.nextDouble();
        System.out.print("please Enter your parpandiculer heightnin cms:");
        Double height = input.nextDouble();
        // Double Area = (base*height)/2;
        Double Area = 0.5*base*height;
        System.out.print("the area of your triangle is :"+Area);
    }
    
}
