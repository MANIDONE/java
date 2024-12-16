

import java.util.Arrays;

public class task1 {
    public static void main(String[] args) {
        int[] a = {7, 2, 15, 11};
        int target = 9;

        // Sort the array
        Arrays.sort(a);

        // Two-pointer technique
        int i = 0;
        int j = a.length - 1;
        while (i < j) {
            int sum = a[i] + a[j];
            if (sum == target) {
                System.out.println("Indices: " + i + " " + j);
                return; // Exit if only one pair is needed
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }
        }
        System.out.println("No such pair found.");
    }
}
