import java.math.BigDecimal;
import java.math.BigInteger;

public class Sumator {

    public int sum(int a,int b){
        return a+b;
    }

    public double sum(double a,double b){

        return a+b;
    }

    private boolean isNum(String str){
        Double.parseDouble(str);
        return true;

    }

    public String sum(String a,String b){
        int n1 = 0;
        int n2 = 0;
        String sum = "";
        if (isNum(a) && isNum(b)) {
            n1 = Integer.parseInt(a);
            n2 = Integer.parseInt(b);
            sum = Integer.toString(n1+n2);
        }
        return sum;
    }


    public BigDecimal sum(BigDecimal a,BigDecimal b){
        a = a.add(b);
        return a;
    }

    public BigInteger sum(BigInteger a, BigInteger b){
        a = a.add(b);
        return a;
    }

}
