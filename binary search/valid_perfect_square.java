class Solution {
    public boolean isPerfectSquare(int num) {
        
        if(num == 1)
            return true;
        long l = 1;
        long h = num;
        
        while(l<=h)
        {
            long mid = l + (h-l)/2;
            if (mid*mid == num)
                return true;
            
            else if (mid*mid > num)
                h = mid-1;
            
            else
                l = mid+1;
        }
        
        return false;
    }
}