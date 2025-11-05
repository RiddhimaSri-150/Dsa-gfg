public class Dicerolls{
    public staticvoid main(String[] args){
      dice("", 5)
    }
     static void dice(String p,int target){
        if(target == 0){
            System.out.println(p);
            return;
        }
        for (int i = 1; i <= 6 && i<= target ; i++) {
            dice(p+i, target - i);
        }
    }
    // Return output as an  ArrayList/
     static ArrayList<String> DiceRet(String p, int target){
        if(target == 0){
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 1; i <= 6 && i<= target ; i++) {
            ans.addAll(DiceRet(p+i, target - i));
        }
        return ans;
    }
}