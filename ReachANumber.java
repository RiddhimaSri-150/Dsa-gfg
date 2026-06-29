public class ReachANumber {
    public static int reachNumber(int target) {
        target = Math.abs(target);
        int sum = 0, i = 0;
        while (sum < target || (sum - target) % 2 != 0) {
            i++;
            sum += i;
        }
        return i;
    }

    public static void main(String[] args) {
        int tar = 2;
        int res = reachNumber(tar);
        System.out.println(res);
    }
}
