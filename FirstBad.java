public class FirstBad{
     public int firstBadVersion(int n) {
        int s = 0;
        int e = n;
        while(s <= e){
            int mid = s  + (e-s)/2;
            if(isBadVersion(mid) == true && isBadVersion(mid-1) == false){
                return mid;
            }else if(isBadVersion(mid)== false) s = mid+1;
            else e = mid;
        }
        return -1;
    }
}