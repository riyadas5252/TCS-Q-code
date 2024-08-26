import java.util.*;
public class NoOftwofourwheeler {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v=sc.nextInt();
        int w =sc.nextInt();

        int x=(w-(2*v))/2;
        int y=v-x;
        if(w>=2 && (w%2==0)&&v<w){
            System.out.println("TW-"+ x +" " +"FW-"+ y);
        }
        else{
            System.out.println("INVALID INPUT");
        }

    }
}
