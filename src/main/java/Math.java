public class Math {


    public int calculateGCD(int n1, int n2) {
        int gcd = 1;

        for (int i = 1; i <= n1 && i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0)
                gcd = i;
        }
        return gcd;
    }


    public int calculateLCM(int n1,int n2) {
        return (n1*n2)/calculateGCD(n1, n2);
    }

}