import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainHappyN {
    static int n;
    static List happyDigits = new ArrayList();

    static List listOfHappyNumbers = new ArrayList();
    static int recursioncounter = 0;
    public static void main(String[] args) {
        //System.out.println("Geben sie eine Zahl ein von der Sie wissen moechten, ob sie eine Happy Number ist: ");
        //Scanner scanner = new Scanner(System.in);
        List digits = new ArrayList();
        //n = scanner.nextInt();
        for(int i = 7; i < 100; i++){
            n = i;
            System.out.println("Ist " + n + " eine Happy Number?");
            happyDigits = Listifier(n);
            happyNumberS(happyDigits);
            recursioncounter = 0;
        }

    }

    private static List Listifier(int happy){
        List digits = new ArrayList();

        int delimiter = 10000000;
        while(happy % delimiter == happy){
            delimiter /= 10;
        }
        for(int j = delimiter; j >=1; j/=10 ){
            digits.add(happy/j);
            happy -= (happy/j)*j;
        }
        /*for(Object e : digits){
            System.out.println(e);
        }*/
        return digits;
    }
    static List listOfUniqueSums = new ArrayList();
    private static int happyNumberS(List ints){
        List tempList = new ArrayList();
        int overallsum = 0;
        for(Object e : ints){
            int sum = 0;
            sum = (int)e;
            sum *= sum;
            overallsum += sum;
        }
        if(overallsum != 1){
            if(!listOfHappyNumbers.contains(overallsum)){
                if(!listOfUniqueSums.contains(overallsum)){
                    listOfUniqueSums.add(overallsum);
                    recursioncounter++;
                    happyNumberS(Listifier(overallsum));
                }
            }
        }
        if(overallsum == 1){
            System.out.println(n + " ist eine Happy Number. Glueckwunsch!");
            listOfHappyNumbers.add(n);
            recursioncounter++;
        }
        if(listOfHappyNumbers.contains(overallsum) && recursioncounter == 0){
            System.out.println(n + " ist eine Happy Number. Glueckwunsch!");
            listOfHappyNumbers.add(n);

        }
        return overallsum;
    }
}
