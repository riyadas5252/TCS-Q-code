import java.util.*;

public class Findnodays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();

        String arr[] = { "mon", "tue", "wed", "thu", "fri", "sat", "sun" };
        int i=0;
        for (i = 0; i < arr.length; i++) {
            if (arr[i].equals(str)) {
                break;
            }
        }
        int remDaysForFirstSun = 6-i;
        int ans=1;
        n = n - remDaysForFirstSun;
        if(n>0){
            ans+=(n/7);
        }

        System.out.println(ans);

    }
}
