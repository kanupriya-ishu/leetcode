# The isBadVersion API is already defined for you.
# @param version, an integer
# @return an integer
# def isBadVersion(version):

class Solution:
    def firstBadVersion(self, n):
        """
        :type n: int
        :rtype: int
        """
        l=1
        r=n
        fbv=0
        
        while l<=r :
        
            mid=(l+r)//2;
            x = isBadVersion(mid);
            
            if x==True:
            
                r=mid-1
                fbv = mid
            
            
            else:
            
                l=mid+1
        
        return fbv