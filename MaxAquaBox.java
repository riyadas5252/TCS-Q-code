import java.util.Scanner;

public class MaxAquaBox {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        String s=str.next();
        int l=str.nextInt();

        int maximum=0,count=0;
        for(int i =0;i<s.length();i++){
            if(i%l==0){
                maximum=Math.max(maximum, count);
                count=0;
            }
            if(s.charAt(i)=='a'){
                count++;
            }
        }
        maximum=Math.max(maximum, count);
        System.out.println(maximum);
    }
}
