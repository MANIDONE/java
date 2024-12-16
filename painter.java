public class painter {
    public static void main(String[] args) {
        
        int []a={3,5,1,7,8,2,5,3,10,1,4,7,5,4,6};
        int n=a.length;
        
            
        int low=10;
        int high= 71;
       
        int k=1;
        while(low>high){
            int mid=low-(low-high)/2;
            

            if(poin( n, a, k)){
                ans+=mid;

            }

            

        }

    }

    private static boolean poin(int n, int[] a, int k) {
        throw new UnsupportedOperationException("Not supported yet.");

        int count =1;
        int currenttime=0;

        for(int i=0;i<n;i++){
            if(currenttime+a[i] > k){

            }
        }
    }
    
}
