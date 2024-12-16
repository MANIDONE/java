

import java.util.Arrays;

public class two_Sum {
    public static void main(String[] args) {
        int []a={2,7,11,15};
       
        int target=9;
        twoSum(a, target);
                for(int re:a){
                    System.out.println(re);
                }
                
            }
            
        
        public static int[] twoSum(int[] nums, int target) {
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
        int sum=0;
        int []a=new int[2];
        
        while(i<j){
            sum=nums[i]+nums[j];
            if(target==sum){
                a[0]=i;
                a[1]=j;
            }else if(target<sum){
                j--;
            }else{
                i++;
            }

        }
        return a;
    }
}
