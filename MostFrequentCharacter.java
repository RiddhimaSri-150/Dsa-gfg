public class MostFrequentCharacter {
    public static char getMaxOccuring(String s){
        int n = s.length();
        int maxFreq = -1;
        char ans = s.charAt(0);
        for (int i = 0; i < n; i++) {
            int count = 1;
            char ch = s.charAt(i);
            int freq = 0;
            for (int j = i + 1; j < n ; j++) {
                if(s.charAt(j) == ch) freq++;
            }
            if(freq > maxFreq){
                maxFreq = freq;
                ans = ch;
            } else if (freq == maxFreq && ch<ans){
                ans = ch;
            }
        }
        return ans;
    }
    public  static char getMaxOccuring1(String s){
        int n = s.length();
        int[] freq = new int[26];
        for (int i = 0; i < n; i++) {
          char ch = s.charAt(i);
          int idx = ch-97;
          freq[idx]++;
        }
        int maxFreq = -1;
        char ans = s.charAt(0);
        for (int i = 0; i < 26; i++) {
            if(freq[i] > maxFreq){
                maxFreq = freq[i];
                ans = (char)(i+97);

            }
        }
        return ans;
    }
}
