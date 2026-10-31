class Parameter{
    public static void main (String[]args){
        int num = sumTwoNumbers(87,76);
        System.out.println(num );     
        //    System.out.println(sumTwoNumbers(6,7));
//       System.out.println(sumTwoNumbers(-78,9));
//       System.out.println(sumTwoNumbers(-96,96));
// System.out.println(sumTwoNumbers(7,9));
      
    
    }
    public static int sumTwoNumbers(int first , int second){
        System.out.println("first number is receving : "+ first);
        System.out.println("second number is receving : "+ second);
        int sum = first + second;
        return sum;
    }
}