import java.util.ArrayList;
import java.util.List;

public class MainPrime {
    public static void main(String[] args) {
        List<Integer> primes = new ArrayList();
        List<Integer> possiblePrimes = new ArrayList<Integer>();
        for (int i = 2; i < 1000000; i++) {
            possiblePrimes.add(i);
        }
        for (int j : possiblePrimes) {
            for (int x = j; x < j; x++) {
                int temp = x;
                if(possiblePrimes.contains(temp)){
                    possiblePrimes.remove(temp);
                }
            }


            for (int l : primes) {
                System.out.println(l);
            }
        }
    }
}
