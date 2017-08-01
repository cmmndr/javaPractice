import java.util.Random;
import java.util.Scanner;

public class MainCoinFlip {
    public static void main(String[] args) {
        System.out.println("Geben sie eine Anzahl von Wuerfen ein, wie oft die Muenze geworfen werden soll:");
        Scanner scanner = new Scanner(System.in);
        int wurfAnzahl = scanner.nextInt();
        int kopfAnzahl = 0;
        int zahlAnzahl = 0;
        Random r = new Random();
        for(int i = 0; i < wurfAnzahl; i++){
            if(r.nextFloat() >= 0.50){
                kopfAnzahl++;
            }else{
                zahlAnzahl++;
            }
        }
        System.out.println(kopfAnzahl);
        System.out.println(zahlAnzahl);
    }
}
