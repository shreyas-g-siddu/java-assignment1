import java.util.*;
public class ExceptionHandling {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        
        try {
            System.out.println(numbers[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds.");
        }
        
        try{
	int result = divide(10, 0);
    System.out.println("Result: " + result);
        }
	catch(ArithmeticException e){
        System.out.println("NOT DIVISIBLE BY ZERO");}
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}