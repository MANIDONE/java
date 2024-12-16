public class sumarray {

    public static void main(String[] args) {
        int a[]={7,9,11,11,4};
        System.out.println(sum(a,0,a.length-2));
            }
        
            private static int sum(int[] a,int s, int n) {
                

                if(n==0){
                    return n;
                }
                int re=sum(a,a[n],n-1);
                return re+a[n];

            }
    
}
