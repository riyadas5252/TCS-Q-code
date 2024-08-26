import java.util.*;

public class MaxCarPark {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int r=sc.nextInt();
    int c=sc.nextInt();

    int arr[][]=new int[r][c];
    int max=0,ans=0;

    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            arr[i][j]=sc.nextInt();
        }
    }

    for(int i=0;i<r;i++){
        int onescount=0;
        for(int j=0;j<c;j++){
            if(arr[i][j]==1){
                onescount++;
            }
        }
        if(onescount>max){
            max=onescount;
            ans=i+1;
        }
        
    }
    
   System.out.println(ans);
    
 }   
}
