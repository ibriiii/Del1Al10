public class E001_Del1Al10 {
    public static void main(String[] args) {
        int contador = 0;

        for (int i = 1; i <= 10; i++) System.out.print(i + " ");

        System.out.println();
        while (contador < 10) {
            contador++;
            System.out.printf(contador + " ");
        }

        System.out.println();
        contador = 0;
        do {
            contador++;
            System.out.printf(contador + " ");
        } while (contador < 10);
    }
}
