public class Solution {
    public static void main(String args[]){
         System.out.println(numberOfSteps(14));
    }
    public static int numberOfSteps(int num){
        return helper2(num, 0);
    }
    private static int helper2(int n, int c){
        if(n == 0){
            return c;
        }
        if(n%2 == 0){
            return helper2(n/2, c++);
        }

        return helper2(n -1, c++);


    }
}