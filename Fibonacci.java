public class Fibonacci {
    public static int fibonacci(int n) {
        if (n <= 1)
            return n;
        else
            return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args) {
        int n = 8;
        int result = fibonacci(n-1);
        System.out.println("The Fibonacci number at position " + n + " is: " + result);
    }
}
