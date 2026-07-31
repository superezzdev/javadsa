import java.util.Scanner;

class FloatProduct {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("A : ");
        float A = in.nextFloat();
        System.out.print("B : ");
        float B = in.nextFloat();

        float product = A*B;

        System.out.println("Float Product: "+ product);
    }
}
