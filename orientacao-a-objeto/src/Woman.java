public class Woman extends Person {

    public Woman(String name, int age, String birthDate) {
        super(name, age, birthDate);
    }

    @Override
    public String showPerson() {
        String message = String.format("%s\nMeu gênero é: Feminino", super.showPerson());
        return message;
    }

}
