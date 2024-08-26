import java.util.*;

public class Pushnonzeroend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[count] = arr[i];
                count++;
            }
        }
        for (int i = count; i < n; i++) {
            arr[i] = 0;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
