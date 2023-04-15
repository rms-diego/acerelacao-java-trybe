import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n\nDigite o seu nome\n");
        String name = scanner.nextLine();

        System.out.println("\n\nDigite o sua idade\n");
        String ageInput = scanner.next();

        int age = Integer.parseInt(ageInput);

        System.out.println("\n\nDigite o sua data de nascimento\nexemplo: 21/12/1945\n");
        String birthDate = scanner.next();

        Person person = new Person(name, age, birthDate);

        System.out.println(person.showPerson());

        scanner.close();
    }
}
