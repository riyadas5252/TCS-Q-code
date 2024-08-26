import java.util.Scanner;

public class Countmaxvalue {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int maximum=Integer.MIN_VALUE;
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]>maximum){
                maximum=arr[i];
                count++;
            }
        }
        System.out.println(count);
    }
}
