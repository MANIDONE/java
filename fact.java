public class fact {
    public static void main(String[] args) {
        
        int fact=5;
        System.out.println(fac(fact));
            }
        
            private static int  fac(int fact) {
                // TODO Auto-generated method stub

                if(fact==1||fact==0){
                    return 1;
                }

                int f=fac(fact-1);
                 return f*fact;
                
            }
    
}
