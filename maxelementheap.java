import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class maxelementheap {

    public static void main(String[] args) {
        
        int a[] ={1, 2, 3, 1, 4, 5};
        int n=a.length;
        int k =3;
            List<Integer> list= maxheap(a,n,k);
            System.out.println(list);
    }
    public static List<Integer> maxheap(int []a,int n,int k){
        List<Integer> ans= new ArrayList<>(); 

        PriorityQueue<Pair> heap = new PriorityQueue<>(
    (p1, p2) -> p2.value - p1.value
);



            for(int i=0;i<k;i++){
                heap.offer(new Pair(a[i],i));
            }

            ans.add(heap.peek().value);
            for (int i = k; i< a.length; i++) {
                heap.offer(new Pair(a[i], i));
    
                
                while (heap.peek().index <= i - k) {
                    heap.poll();
                }
    
              
                ans.add(heap.peek().value);
            }

            return ans;
        
    }
    static class Pair{
        int value;
        int index;
       
    public Pair (int value,int index){
        this.value=value;
        this.index=index;

    }   
    }
}
