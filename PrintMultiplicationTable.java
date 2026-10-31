//     public static void main(String [] args){
//         Scanner Scanner = new Scanner(System.in);
//         System.out.println("Welcome to multiplication world \n");
//         System.out.print("Please inter your number ");
//         int num = Scanner.nextInt();
//         PrintMultiplicationTable(num);
//         System.out.print("\t");
//         for (int n = 1; n<=num ;n++){
//         PrintMultiplicationTable(n);
//         }

//     }


//         public static void PrintMultiplicationTable(int num){
//         int i=1;
//         while (i <=10){
//             System.out.println(num+"x"+i+"="+(num * i));
//             i++;
//         }

//     }
// }
class PrintMultiplicationTable {

    public static void main(String[] args) {
        System.out.println("Welcome to multiplication world \n");

        // Header row - column numbers
        System.out.print("i\t");
        for (int num = 1; num <= 12; num++) {
            System.out.print(num + "\t");
        }
        System.out.println();

        // Rows: i = 1 to 10
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + "\t");
            for (int num = 1; num <= 12; num++) {
                System.out.print((num * i) + "\t");
            }
            System.out.println(); // next row pe jao
        }
    }
}