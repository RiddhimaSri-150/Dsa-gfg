import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlusOne {
    public static int[] plusOne(int[] digits){
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] arr = new int[digits.length + 1];
        arr[0] = 1;
        return arr;
    }

    public static void main(String[] args) {
        int[] mat = {9};
        int[] res = plusOne(mat);
        for (int i = 0; i < mat.length ; i++) {
            System.out.print(mat[i]);
        }
    }
}