import java.util.Scanner;

class Arithmatic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("A : ");
        int A = in.nextInt();
        System.out.print("B : ");
        int B = in.nextInt();


        int sum = A+B;
        int sub = A-B;
        int div = A/B;
        int multi = A*B;
        int mod = A%B;


        System.out.println("Sum: "+sum);
        System.out.println("Sub: "+sub);
        System.out.println("Div: "+div);
        System.out.println("Multi: "+multi);
        System.out.println("Mod: "+mod);
    }
}
