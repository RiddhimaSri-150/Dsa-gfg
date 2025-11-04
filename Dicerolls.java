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
}