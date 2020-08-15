/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int l=1, r=n;
        int fbv=0;
        
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            boolean x = isBadVersion(mid);
            
            if(x==true)
            {
                r=mid-1;
                fbv = mid;
            }
            
            else
            {
                l=mid+1;
            }
        }
        
        return fbv;
    }
}