public class cdc {

    public static void main(String[] args) {
 
            int i=5;
            int j=0;
            printdc(i);
            printic(j);
    
    
            
                }
            
                private static void printdc(int i) {
                   
                    if(i==0){
                        return;
                    }
                    System.out.print(i+" ");
                    printdc(i-1);
                }
                private static void printic(int j) {
                   
                    if(j==5){
                        return;
                    }
                    System.out.print(j+" ");
                    printic(j+1);
                }
    }
    

