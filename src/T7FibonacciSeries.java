import java.util.Arrays;

public class T7FibonacciSeries {
    public static void main(String[] args) {
        int [] fibonacciSeries= new int[10];
        fibonacciSeries[0]=0;
        fibonacciSeries[1]=1;
        for (int i = 2; i <fibonacciSeries.length ; i++) {
            fibonacciSeries[i]=fibonacciSeries[i-2]+fibonacciSeries[i-1];
        }

        System.out.println(Arrays.toString(fibonacciSeries));
    }
}
