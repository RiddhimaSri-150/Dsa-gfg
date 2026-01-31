import java.util.ArrayList;

public class ClosestString {
    // User function Template for Java


        int shortestDistance(ArrayList<String> s, String word1, String word2) {
            // code here
           Integer i1 = null;
           Integer  i2 = null;
           int ans = Integer.MAX_VALUE;
            for (int i = 0; i < s.size(); i++) {
                if(word1.equals(s.get(i))){
                    i1 = i;
                    if(i2!=null) ans=Math.min(Math.abs(i2-i1),ans);
                }
                if(word2.equals(s.get(i))){
                    i2 = i;
                    if(i1!=null) ans=Math.min(Math.abs(i2-i1),ans);
                }

            }
            return ans;
        }
    };

