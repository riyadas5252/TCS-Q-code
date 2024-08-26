import java.util.*;

public class Sortriskarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int countzero = 0, countone = 0, counttwo = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                countzero++;
            }
            if (arr[i] == 1) {
                countone++;
            }
            if (arr[i] == 2) {
                counttwo++;
            }
        }

        int i = 0;
        while (countzero > 0) {
            arr[i] = 0;
            countzero--;
            i++;
        }
        while (countone > 0) {
            arr[i] = 1;
            countone--;
            i++;
        }
        while (counttwo > 0) {
            arr[i] = 2;
            counttwo--;
            i++;
        }
        for (i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

    }
}
