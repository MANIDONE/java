 class continu {
    public static void main(String[] args) {
        int []a={1,2,3,3,3,1,1};
        int count=0;    
        int max=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==3){
                count++;
            }else{
                max=Math.max(count, max);
                count=0;
            }
        }
        System.out.println(Math.max(count, max));
    }
}
