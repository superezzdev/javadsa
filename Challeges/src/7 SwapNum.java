import java.util.Scanner;

class SwapNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("A : ");
        int A = in.nextInt();
        System.out.print("B : ");
        int B = in.nextInt();

        /*
        int C = A; //<-- C is Temporary  variable
        A = B;
        B = C;
        */

        //Without Temporary Variable

        A = A + B;
        B = A - B;
        A = A - B;

        System.out.println("Number Swapped");
        System.out.println("A : " + A);
        System.out.println("B : " + B);
    }
}
