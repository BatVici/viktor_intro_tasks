
import static java.lang.Math.random;


public class StringGenerator {


    static String getAlphaNumericString(int n) {


        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz";


        StringBuilder sb = new StringBuilder(n);

        for (int i = 0; i < n; i++) {

            int index = (int) (AlphaNumericString.length() * random());

            // add characters one by one in end of the sb
            sb.append(AlphaNumericString.charAt(index));
        }
        return sb.toString();
    }
}


