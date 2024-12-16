public class pathbox {

    public static void main(String[] args) {
        int n=3;
        solveHanoi(n,'A','B','C');









        }
        private static void solveHanoi(int n,char A,char B,char C){
            if(n==1){
                System.out.println("Move Disk 1 " +A + "to " +B);
            return;
            }

            solveHanoi(n-1, A, C, B);
            System.out.println("Move Disk 1" + n +" from" +A + " to " +B);
            solveHanoi(n-1, C,B,A);
            
        }
    
}
