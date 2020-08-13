# The guess API is already defined for you.
# @param num, your guess
# @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
# def guess(num: int) -> int:

class Solution:
    def guessNumber(self, n: int) -> int:
        l=1
        r=n
        while l<=r:
            mid = (r+l)//2
            guess_no = guess(mid)
            if guess_no==0:
                return mid
            elif guess_no==-1:
                r=mid-1
            else:
                l=mid+1
        return 0