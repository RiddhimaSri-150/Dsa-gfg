public class EvenNUmberOfDigits {
    public int findNumbers(int[] nums) {
        int n = nums.length;
        int count = 0;
        for (int num : nums) {
            if(isEven(num)){
               count ++;
            }
        }
        return count;
    }
    private boolean isEven(int num){
        int digits = 0;
        while(num > 0){

            digits++;
            num = num/10;
        }
        return digits%2 ==0;
    }

}
