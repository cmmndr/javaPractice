public class mainSumSquareDiff {
    public static void main(String[] args) {
        long squareofsums = 0;
        long sumofsquares = 0;
        for(long i = 1; i <= 100; i++){
            squareofsums = squareofsums + i;
            sumofsquares += i*i;
       }
        squareofsums = squareofsums*squareofsums;
        System.out.println(squareofsums);
        System.out.println(sumofsquares);
        System.out.println(squareofsums - sumofsquares);
    }
}
