import java.util.Scanner;
public class pivot {
    public static int pivotIndex(int[] nums) {
            int sum = 0;
            int lft = 0;  
            for (int i = 0; i < nums.length; i++) {
                sum += nums[i];
            }
            for (int i = 0; i < nums.length; i++) {
                sum -= nums[i]; 
                if (sum == lft) {
                    return i;  
                }
                lft += nums[i];  
            }
            return -1;
        }
    
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n; 
            System.out.println("Enter the array size");
            n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            
            System.out.println(pivotIndex(arr));
        sc.close();
    }
}
