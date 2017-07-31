public class E {
    private double e = 1;
    private double n = 100000;


    double calculateE(){
        e = Math.pow(e + (1/n),n);

        return e;
    }

}
