import java.util.*;

public class ProductNdigits {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int result=1;
        while ((n>0)) {
            int remainder = n%10;
            int quotent = n/10;
            result=remainder*result;
            n=quotent;
        }
        System.out.println(result);
    }
}