public class MergeTwoSortedArray{
    public void merge(int[] nums1, int m, int[] nums2, int n) {
      int[] res = new int[m+n];
      int i =0,j =0,k=0;
      while(i<m && j<n){
          if(nums1[i] < nums2[j]){
              res[k] = nums1[i];
              i++;
              k++;
          }
          else if(nums1[i] == nums2[j]){
              res[k] = nums1[i];
              res[k+1] = nums2[j];
              k = k+2;
              i++;j++;
          }else{
              res[k] = nums2[j];
              j++;
              k++;
          }

      }
      if(i<m){
          for (int l = i; l < m; l++) {
              res[k]= nums1[l];
          }
      }else{
          for (int l = j; l < n; l++) {
              res[k] = nums2[l];
          }
      }
        for (int l = 0; l < res.length; l++) {
            nums1[l]= res[l];
        }
    }
}