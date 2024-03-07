import java.util.Scanner;

public class AskNumber {
    private static Scanner scanner = new Scanner(System.in);
    private int number_a;
    private int number_b;

    public AskNumber() {
        this.number_a = 0;
        this.number_b = 0;
    }

    public int getNumber_a() {
        return number_a;
    }

    public int getNumber_b() {
        return number_b;
    }

    public void setNumber_a(int number_a) {
        this.number_a = number_a;
    }

    public void setNumber_b(int number_b) {
        this.number_b = number_b;
    }

    public int sum() {
        return number_a + number_b;
    }

    public static void main(String[] args) {
        AskNumber askNumber = new AskNumber();

        System.out.println("Enter the first number: ");
        int number_a = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int number_b = scanner.nextInt();

        askNumber.setNumber_a(number_a);
        askNumber.setNumber_b(number_b);

        System.out.println("The first number is: " + askNumber.getNumber_a());
        System.out.println("The second number is: " + askNumber.getNumber_b());
        System.out.println("The sum of the two numbers is: " + askNumber.sum());
    }
}

