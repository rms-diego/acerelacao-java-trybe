public class Tipos {
    public static void main(String[] args) {
        // primitivos
        int inteiros = 10;
        char caractere = 'a';
        boolean bool = true;

        // array
        int[] arr = new int[2];
        arr[0] = 1;
        arr[1] = 2;

        // strings
        String frase = "aaaaaa";

        System.out.println("\n\nTypes");
        System.out.println(inteiros);
        System.out.println(caractere);
        System.out.println(frase);
        System.out.println(bool);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
