package calculator;

public class Calculator {

    public static int sum(int n, int m){
        return n + m;
    }
//    public static int factorialOf(int n){
//        if (n < 0){
//            throw new IllegalArgumentException();
//        }
//        if (n == 0) {
//            return 1;
//        }
//        int fact =1;
//        for(int i = 1; i <= n; i++){
//            fact *= i;
//        }
//        return fact;
//    }
    public static int factorialOf(int n){
        if (n < 0){
            throw new IllegalArgumentException();
        }
        if (n == 0) {
            return 1;
        }
        return factorialOf(n-1)*n;
    }
}
