public class product {
    public static void main(String[] args) {
        int []a={2,3,0,4};
    int n=a.length;
    int[] result=new int[n];
    int product=1;
    int count=0;
    for(int  i=0;i<a.length;i++){
        if(a[i]!=0)
        {
            product*=a[i];
        }else
        {
            count++;
        }
    }
    for(int i=0;i<a.length;i++){
        if(count>1){
            result[i]=0;
        }
        else if(count==1)
        {
            if(a[i]==0)
            {
                result[i]=product;
            }else
            {
                result[i]=0;
            }
        }else
        {
            result[i]=product/a[i];
        }
    }

    for(int s:result){
        System.out.println(s);
    }
}
}