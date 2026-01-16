public class EqualPointBrackets {
    static long EqualBrackets(String str){
        int n = str.length();
        int Opencnt = 0;
        int Closecnt = 0;
        for (int i = 0; i < n; ++i) {
            if (str.charAt(i) == ')'){
                Closecnt++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (Closecnt == Opencnt){
                return i;
            }
            if (str.charAt(i) == '(')
                Opencnt++;
            if (str.charAt(i) == ')')
                Closecnt--;
        }
        return -1;
    }
    public static void main(String[] args) {
        String s ="))";
        System.out.println(EqualBrackets(s));
    }
}
