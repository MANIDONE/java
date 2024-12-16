public class prix_sum {
    public static void main(String[] args) {
        int[] a={1,2,3,4};
        
        int []prix_sum=new int[a.length];


        
        prix_sum[0]=a[0];
        for(int i=1;i<a.length;i++){
            prix_sum[i]=a[i]+prix_sum[i-1];
        }
















        for(int sum:prix_sum){
            System.out.println(sum);
        }
    }
    
}
