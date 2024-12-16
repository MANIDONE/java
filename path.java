public class path {
    public static void main(String[] args) {
        int n=5;
        System.out.println(path(n,""));  
    }
    private static int path(int n,String s) {
           if(n==0){
            System.out.println(s);
            return 1;
           } else if(n<0){
            return 0;
           }

           int x=path(n-1, s+" j1 ");
           int y=path(n-2, s+" j2 ");
           int z=path(n-3, s+" j3 ");
           return x+y+z;
    }
}
