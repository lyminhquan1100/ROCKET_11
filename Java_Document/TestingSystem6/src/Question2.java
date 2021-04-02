public class Question2 {
    public static void main(String[] args) {
        try {
            float result = divide(7, 0);
            System.out.println(result);

        } catch (ArithmeticException e) {
            System.out.println("Ngu vl lam sao chia cho so 0 duoc!");
        } finally {
            System.out.println("OK xong");
        }
    }

    public static float divide(int a, int b) {
        return a / b;
    }
}
