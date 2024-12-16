import java.util.*;  

public class composit {


    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        if (n == 2 || n == 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static void removeAllCompositeNumber(int input[], int n) {
        List<Integer> compo = new ArrayList<>();
        for (int num : input) {
            if (isPrime(num) || num == 1) {
                compo.add(num);
            }
        }

        int[] res = new int[compo.size()];
        for (int i = 0; i < compo.size(); i++) {
            res[i] = compo.get(i);
        }

        for (int su : res) {
            System.out.print(su + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        int n = c.nextInt();  
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = c.nextInt(); 
        }

        removeAllCompositeNumber(arr, n);  }
}
