import java.util.*;
public class NoOfChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int count1=0;
        int count2=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='#'){
                count1++;
            }
            if(str.charAt(i)=='*'){
                count2++;
            }
        }
        System.out.println(count1-count2);
    }
}
