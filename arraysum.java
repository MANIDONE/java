import java.util.HashSet;
public class arraysum {

    public static void main(String[] args) {
        int[] a = {1, 3, 8, 4, 2, 7};
        int target = 5;
       
        for (int i = 0; i < a.length - 1; i++) {
            HashSet<Integer> seen = new HashSet<>();
            int currentTarget = target - a[i];
           
            for (int j = i + 1; j < a.length; j++) {
                if (seen.contains(currentTarget - a[j])) {
                    System.out.println("Combination: " + a[i] + ", " + a[j] + ", " + (currentTarget - a[j]));
                    return; 
                }
                seen.add(a[j]);
            }
        }
        System.out.println("No combination found.");
    }
}

                                                                

