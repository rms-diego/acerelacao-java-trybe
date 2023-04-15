import java.util.Scanner;

public class Input {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("\nDigite um numero: ");
    String input1 = scanner.next();

    System.out.println("\nDigite outro numero: ");
    String input2 = scanner.next();

    int number1 = Integer.parseInt(input1);
    int number2 = Integer.parseInt(input2);

    int result = number1 + number2;

    System.out.println("\n\nA soma dos números é de: " + result);
    scanner.close();
  }
}
