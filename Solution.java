class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int ans = 0;
        int leftCounter = 0;
        int rightCounter = 0;
        int dash = 0;
        for(int i = 0; i < moves.length(); i++){
            if(moves.charAt(i) == 'L') leftCounter++;
            else if(moves.charAt(i) == 'R') rightCounter++;
            else dash++;
        }
        ans = Math.abs((leftCounter - rightCounter)) + dash;
        return ans;
    }
}