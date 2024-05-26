public class Main2 {

    interface PIvalue {

        double getPi();

    }

    public static void main(String[] args) {
        PIvalue pi = () -> {
            int num = 22;
            int deno = 7;
            return (double) num / deno;
        };
        System.out.println((pi.getPi()));
    }
}
