import java.util.Scanner;

public class MainCollatz {
    public static void main(String[] args) {
        System.out.println("Geben sie eine positive Ganzzahl > 1 ein:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int steps = 0;

        while (n != 1){
            if(n % 2 == 0){
                System.out.print(n + " ist gerade, daher -> ");
                n /= 2;
                System.out.println(n);
            }else{
                System.out.print(n + " ist ungerade, daher -> ");
                n *= 3;
                n++;
                System.out.println(n);
            }
            steps++;
        }
        System.out.println("Die Anzahl der benoetigten Steps lautet: " + steps);
    }
}
