public class travars {
    public static void main(String[] args) {
        
        int [][]a={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

            for(int i=0;i<a.length;i++){
                if(i==0){
                    for(int j=i;j<a.length;j++){
                    System.out.print(a[i][j]+" ");
                    }
                }else if(i<1) {
                    for(int j=a.length-1;j>=0;j--){
                        System.out.print(a[i][j]+" ");
                    }
                }else{
                    
                }
            }
                
    }
    
}
