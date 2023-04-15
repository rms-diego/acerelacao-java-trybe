public class CondicaoELoops {
  public static void main(String[] args) {
    int condition = 10;

    // if/else
    if (condition >= 10) {
      System.out.println("\nTrue\n\n");
    } else {
      System.out.println("false\n\n");
    }

    int[] numbers = new int[10];

    // loop for
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = i + 1;
    }

    for (int i = 0; i < numbers.length; i++) {
      System.out.println(numbers[i]);
    }

    // loop while
    while (numbers[0] == 1) {
      System.out.println("\n\nO index '0' do array de numbers é: " + numbers[0]);
      break;
    }
  }
}
