import java.util.Arrays;

public class FlippingTheImage {
    public static int[][] flipAndInvertImage(int[][] image) {
       int[][] ans = new int[image.length][];
        for(int i = 0; i < image.length; i++) {
            reverse(image[i]);
            invert(image[i]);
            ans[i] = image[i];
        }
        return ans;
    }
    private static void reverse(int[] col){
        int start = 0;
        int end = col.length -1;
        while (start < end){
            int temp = col[start];
            col[start] = col[end];
            col[end] = temp;
            start++;
            end--;
        }
    }
    private static void invert(int[] col){
        for (int i = 0; i < col.length; i++) {
            if(col[i] == 0) col[i] = 1;
            else col[i] = 0;
        }
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1,1,0},
                {1,0,1},
                {0,0,0}
        };
        int[][] result = flipAndInvertImage(arr);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
