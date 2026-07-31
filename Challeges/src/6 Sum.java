import java.util.Scanner;

class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please Enter 1st your number: ");
        int A = in.nextInt();
        System.out.print("Please Enter 2nd your number: ");
        int B = in.nextInt();

        int sum = A+B;
        System.out.println(sum);
    }
}
