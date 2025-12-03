public class NonRepeatingCharacter {
    private static final int MAX_CHAR = 26;
    public static char nonRep(String s){
        int[] freq = new int[MAX_CHAR];
        for(char c: s.toCharArray()){
            freq[c-'a']++;
        }
        for (char c: s.toCharArray()){
            if(freq[c - 'a'] == 1){
                return c;
            }
        }
        return'$';
    }
}
