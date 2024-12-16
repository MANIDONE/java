 class sample1 {
    public static void main(String[] args) {
        
        int a[] ={1,2,3,4,5};
        int n=a.length-1;
        int p=5;
        System.out.println((sum(a,n)));
        System.out.println(product(p));
        System.out.println(sub(p));
            }
        
            private static int sum(int[] a, int n) {
                // TODO Auto-generated method stub
                if(n==0){
                    return a[n];
                }

                return a[n]+sum(a, n-1);
            }
            private static int product(int n){
                if(n==1){
                    return 1;
                }
                return n*product(n-1);
            }

            private static int sub(int n){
                if(n==0) return 0;

                return n-sub(n-1);
            }
    
}
