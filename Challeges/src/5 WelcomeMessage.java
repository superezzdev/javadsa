import java.util.Scanner;

class WelcomeMessage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please Enter your name:");
        String name = in.nextLine();


        System.out.print("Welcome to superezz's World "+name);
    }
}

