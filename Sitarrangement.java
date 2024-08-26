import java.math.BigInteger;
import java.util.Scanner;

public class Sitarrangement {
    public static BigInteger fact(int num) {
        BigInteger ans = BigInteger.ONE;
        for (int i = num; i > 0; i--) {
            ans = ans.multiply(BigInteger.valueOf(i));
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigInteger ans = fact(n - 1);
        System.out.println(ans.multiply(BigInteger.valueOf(2)));
        sc.close();  // Closing the Scanner to prevent resource leak
    }
}
