/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start = 0;
        int end = n;
        int mid = 0;

        while(mid >= 0 && mid <= n){
            mid = start + (end-start)/2;

            if (isBadVersion(mid)){
                if (isBadVersion(mid-1))
                    end = mid - 1;
                else{
                    return mid;
                }
            }

            else{
                start = mid + 1;
            }
        }

        return 0;
    }
}