public class count {

    public static void main(String[] args) {
        int j=1234;
        
        
            int count=0;
            int c=printd(j,count);
            System.out.println(c);
        
            }
        
            private static int printd(int i ,int count) {
               
                if(i<1){
                    return count;
                }
                
               count++;
                i=i/10;
                
                
                return printd(i,count);
    }
    
}
