import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        System.out.println("Введите любое число");
        Scanner scanner = new Scanner(System.in);
        int MyInt = scanner.nextInt();
        int b = MyInt % 10;
        if (b == 7) {
            System.out.println("Последняя цифра " + b);
        } else {
            System.out.println("Последняя цифра не 7");
        }
    }
}