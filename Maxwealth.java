public class Maxwealth{
    public static void main(Strings[] args){
       int[][] arr = {
                {23, 4, 5},
                {34, 56,88,  1},
                {12, 45, 89}
        };
         int result = maximumWealth(arr);
          System.out.println(result);
    }
    public int maximumWealth(int[][] accounts){
        int ans = Integer.MIN_VALUE;
        for (int person =0; person<accounts.length; person++){
            //when you start a new col, take a new sum for that row
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum+=accounts[person][account];
            }
            //now we have sum of accounts  of person
            //check with overall ans
            if(sum> ans){
                ans = sum;
            }
        }
        return ans;
    }
}