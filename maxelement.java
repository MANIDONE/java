public class maxelement {//Maximumelement Find using rec 
    public static void main(String[] args) {
        int[] n={1,2,8,4,5,6};
       
     
    System.out.println(findMax(n,n.length));

    }

    public static int findMax(int[] n,int index) {
      if(index==1){
        return n[0];
      }
      return Math.max(n[index-1], findMax(n, index-1));
}
}

