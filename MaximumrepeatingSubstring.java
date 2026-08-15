public class MaximumrepeatingSubstring {
    public int maxRepeating(String sequence, String word) {
        String wordTofind = word;
        int count = 0 , beg = 0;
        while(true){
            int idx = sequence.substring(beg).indexOf(wordTofind);
            if(idx == -1)
                return count;
            else{
                count++;
                wordTofind += word;
                beg = idx;
            }
        }
    }
}
