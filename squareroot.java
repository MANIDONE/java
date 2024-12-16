public class squareroot {
    //Squareroot using Binary
    public static void main(String[] args) {
        
        int a=12;

        System.out.println(square(a));
    }

  public static int square(int number) {
    int l=0;
    int r=number;
    int ans=0;
    while(l<=r){
        int mid=l+(r-l)/2;
        
        if(mid*mid==number){
            return mid;
        }else if(mid*mid<number){
            l=mid+1;
            ans=mid;

        }else{
            r=mid-1;
        }
    }



    return ans;
    }
    
}
