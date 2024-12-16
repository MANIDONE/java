
import java.util.Arrays;

public class last_occurance {
    //last occerance using recursion
   /*  public static void main(String[] args) {
        int []a={1,4,5,4,4,8};
        int n=a.length-1;
        int target=4;
        System.out.println(lastindex(a,target,n));
    }

    public  static int lastindex(int[] a, int target, int n) {
        if(target==a[0])
        {
            return 0;
        }
        if(a[n]!=target)
        {
            return lastindex(a, target, n-1);
            
        }
            return n;
        
    } */


    public static void main(String[] args) {

        //find occurence index  Binary search
        int []a={1,5,5,4,4,6,8,5};
        Arrays.sort(a);
        int target=4;
        int l=0;
        int r=a.length-1;
        System.out.println(first_occurance_binary(a,target,l,r));
    }

    private static int  first_occurance_binary(int[] a, int target,int l,int r) {

        int ans=-1;
        while(l<=r){
            int mid=(r+l)/2;
            if(a[mid]==target){
                ans=mid;
                l=mid+1;
            }
            else if(a[mid]>target){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
    }
}