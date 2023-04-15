public class Person {
  private String name = "";
  private int age = 0;
  private String birthDate = "";

  public Person(String name, int age, String birthDate) {
    this.name = name;
    this.birthDate = birthDate;

    if (age >= 0) {
      this.age = age;
    }
  }

  public String showPerson() {
    String message = String.format(
        "\n\nMeu nome é: %s\nMinha idade é: %d anos\nNasci na data: %s",
        this.name,
        this.age,
        this.birthDate);

    return message;
  }
}
