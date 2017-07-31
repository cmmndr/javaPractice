import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainPrimeFactorization {
    public static void main(String[] args) {
        //calculate first 100 primes
        List<Long> primes = new ArrayList();
        long i = 1;
        long k = 2;
        primes.add(k);
        while(primes.size() <= 100){
            long prim = 2*i+1;
            primes.add(prim);
            i++;
        }
        System.out.println("Geben sie eine Zahl ein, von der sie die Primfaktorzerlegung wissen moechten");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List factors = new ArrayList();
        for(Long o : primes){
            while(n % o == 0){
                factors.add(o);
                    n /= o;
                }
            }
        int j = 0;
        for(Object O: factors){
            if(j == 0){
                System.out.print(O);
                j++;
            }else{
                System.out.print(" * " + O);
            }
        }
    }
}
