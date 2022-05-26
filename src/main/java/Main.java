public class Main {

    public static void main(String[] args) {

        System.out.println(reverse("Kido"));

    }

    static String reverse(String string) {
        return String.valueOf(new StringBuilder(string).reverse());
    }
}
