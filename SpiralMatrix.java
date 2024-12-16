
public class SpiralMatrix {
    public static void spiralDisplay(int[][] arr) {
            int minr=0;// this is your min row
            int minc=0;// this is min col
            int maxr=arr.length-1;
            int maxc=arr[0].length-1;
            int totelcount= arr.length*arr[0].length;
           while(totelcount>0)
           { 
            for(int i=minr;i<=maxr;i++)
            {
                System.out.print(arr[i][minc]+" , ");
                totelcount--; // this you can print left walll
            }
            minc++;
            for(int j=minc;j<=maxc;j++)
            {
                System.out.print(arr[maxr][j]+" , ");// bottem wall
                totelcount--; 
            }
            maxr--;

            for(int i=maxr;i>=minr;i--)
            {
                System.out.print(arr[i][maxc]+" , "); // right wall 
                totelcount--;
            }
            maxc--;

            for(int j=maxc;j>=minc;j--)
            {
                System.out.print(arr[minr][j]+" , ");
                totelcount--;
            }
            minr++;
        }
    }

    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        spiralDisplay(arr);
    }
}
