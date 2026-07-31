import java.util.Scanner;

class Perimeter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("A: ");
        int A = in.nextInt();
        System.out.print("B: ");
        int B = in.nextInt();
        System.out.print("C: ");
        int C = in.nextInt();
        System.out.print("D: ");
        int D = in.nextInt();


        int res = A+B+C+D;
        System.out.println("Perimeter of rectangle: "+res);
    }
}
