
import java.util.Arrays;



public class binarysearch {

    public static void main(String[] args) {
        int []a={10,8,9,4,2,7,3,1};
        int l=0;
        int r=a.length-1;
        int t=3;
        Arrays.sort(a);
        System.out.println(leanersearch(a,l,r,t));
    }

    public  static int leanersearch(int[] a, int l, int r, int t) {
        
            int mid=(l+r)/2;
            if(a[mid]==t){
                return mid;
            }else if(t<a[mid]){
                return leanersearch(a,l,r-1,t);
            }else if(t>a[mid]){
                return leanersearch(a,l,r+1,t);
            }
        return -1;
       
    }



        

    
    
}
