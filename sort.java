



public class sort {
    public static void main(String[] args) {
        int []a={0,0,1,0,0,1,};
            sort(a);
    
    }

    public static void  sort(int[] a) {
        int l=0;
        int r=a.length-1;
        while(l<=r){
            while(a[l]==0){
                l++;
            }while(a[r]==1){
                r--;
            }
            if(l<r){
                a[l]=0;
                a[r]=1;
                l++;
                r--;
            }
        }
        
        for (int c : a) {
            System.out.print(c+" ");
        }
        
    }
    
}
