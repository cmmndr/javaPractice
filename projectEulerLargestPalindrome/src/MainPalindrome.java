import java.util.*;

public class MainPalindrome {
    public static void main(String[] args) {
        List<String> palindrom = new ArrayList();
        for(int first = 999; first>= 100; first--) {
            for (int second = 999; second >= 100; second--) {
                int temp = first * second;

                String original, reverse = "";
                original = String.valueOf(temp);
                int length = original.length();
                for(int j = length-1; j >= 0; j--){
                    reverse = reverse + original.charAt(j);
                }
                if(original.equals(reverse)){
                    palindrom.add(original);
                    //System.out.println("Zahl ist ein Palindrom");
                }
            }
        }
        int highest = 0;
        for(String e : palindrom){
            int temp = Integer.parseInt(e);
            if(temp > highest){
                highest = temp;
            }
            System.out.println(highest);
        }

    }
}
