class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        for i in range(len(digits)-1,-1,-1):
            if digits[i]!=9:
                digits[i]+=1
                break
            else:
                digits[i]=0
        l=[]
        if digits[0]==0:
            l.append(1)
            l=l+digits
            return l
        
        return digits
