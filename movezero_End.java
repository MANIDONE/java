public class movezero_End {
    public static void main(String[] args) {
        int []a={0,1,5,1,7};
        int i=-1;
       for(int j=0;j<a.length;j++){
            if(a[j]!=0){
                i++;
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        } 
        for(int s:a){
            System.out.println(s);
        }
    }
}

