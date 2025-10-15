public class TodasTabuadas {
    public static void main(String[] args) {
        for (int n = 1; n <= 10; n++) {
            System.out.println("\nTabuada do " + n + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(n + " x " + i + " = " + (n * i));
            }
        }
    }
}

