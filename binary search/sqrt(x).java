class Solution {
    public int mySqrt(int x) {
       int low = 0, high = x, ans=0;
        while(low <= high)
        {
            int mid =(high+low)/2;

            if((double)mid*mid == x)
                return mid;
            else if((double)mid*mid < x)
            {
                ans = mid;
                low = mid+1;
            }
            else
                high = mid - 1;
        }
        return ans;
    }
}