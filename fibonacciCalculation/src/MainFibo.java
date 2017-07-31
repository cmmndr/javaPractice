import java.util.Scanner;

public class MainFibo {

    public static void main(String[] args) {
       System.out.println("Geben sie eine Anzahl von Fibonacci Sequenzen an, die sie errechnet haben moechten:");
       Scanner scanner = new Scanner(System.in);
       int n = scanner.nextInt();
       long fibo = 1;
       long prev = 0;
       long result = 0;
       for(int i = 0; i < n; i++){
           prev = result;
           result += fibo;
           fibo = prev;
       }
       System.out.println(result);
    }
}
