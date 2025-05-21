
import java.util.*;

public class q1 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the " + i + "th" + " element");
            arr[i] = sc.nextInt();
        }

        int count = missingnumber(arr);
        System.out.println("Smallest missing positive number: " + count);
    }

    public static int missingnumber(int arr[]) {
        Arrays.sort(arr);
        int count = 1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 0) {
                continue;
            }
            if (arr[i] == count) {
                count++;
            } else if (arr[i] > count) {
                return count;
            }

        }

        return count;
    }
}
