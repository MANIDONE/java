public class rotatearray {
    public static void main(String[] args) {
        
        int a[]={5,6,7,1,2,3,4};
        int t=2;
        int mid=a.length/2;
        for(int i=0;i<a.length-1;i++){
           
                swap(a[i],a[i-a.length]);



            }
                
        

        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }


}
                
private static void  swap(int i, int j) {
 
            int temp=i;
            i=j;
            j=temp;
    }
}
