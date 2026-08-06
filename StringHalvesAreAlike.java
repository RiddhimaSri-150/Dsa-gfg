public class StringHalvesAreAlike {
    public static boolean halvesAreAlike(String s) {
     if(s.length()%2 !=0) return false;
     int count1 = 0, count2 =0;
        for (int i = 0; i <= s.length()/2 - 1; i++) {
           if(s.charAt(i) == 'a'||s.charAt(i) == 'e' || s.charAt(i) == 'i' ||s.charAt(i) == 'o' ||s.charAt(i) == 'u' ||s.charAt(i) == 'A' ||s.charAt(i) == 'E' ||s.charAt(i) == 'I' ||s.charAt(i) == 'O' ||s.charAt(i) == 'U'){
               count1 ++;
           }
        }
        for (int i = s.length()/2; i <= s.length() - 1; i++) {
            if(s.charAt(i) == 'a'||s.charAt(i) == 'e' || s.charAt(i) == 'i' ||s.charAt(i) == 'o' ||s.charAt(i) == 'u' ||s.charAt(i) == 'A' ||s.charAt(i) == 'E' ||s.charAt(i) == 'I' ||s.charAt(i) == 'O' ||s.charAt(i) == 'U'){
                count2++;
            }
        }
        return count1 == count2;
    }

    public static void main(String[] args) {
        boolean res = halvesAreAlike("book");
        System.out.println(res);
    }
}
