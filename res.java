

class res {
   public static void main(String[] args) {
      int[] n = {1, 2, 8, 4, 5, 6};
      System.out.println(sum(n, n.length - 1));
  }

  public static int sum(int[] n, int index) {
     
      if (index < 0) {
          return 0;
      }
    
      return n[index] + sum(n, index - 1);
  }
}