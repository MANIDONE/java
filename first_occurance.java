



public class first_occurance {
    //find occurence firstindex  recuresion
      public static void main(String[] args) {
        int []a={1,4,5,4,4,8};
        int n=0;
        int target=4;
        System.out.println(fisrtindex(a,target,n));
    }

    public  static int fisrtindex(int[] a, int target, int n) {
        if(target==a[0]){
            return 0;
        }
        if(a[n]==target){
            return n;
        }else{
           return fisrtindex(a, target, n+1);}
 
    } 
     
   /*  public static void main(String[] args) {

        //find occurence firstindex  Binary search
        int []a={1,5,5,4,4,6,8,5};
        Arrays.sort(a);
        int target=4;
        System.out.println(first_occurance_binary(a,target));
    }

    private static int  first_occurance_binary(int[] a, int target) {
      
       
        int l=0;
        int r=a.length-1;
        int ans=-1;
        while(l<=r){
            int mid=(r+l)/2;
            if(a[mid]==target){
                ans=mid;
                r=mid-1;
            }
            else if(a[mid]>target){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
    }  */
}
