class Solution:
    def validMountainArray(self, A: List[int]) -> bool:
        
        if len(A)==0: 
            return False
        mid = 0
        for i in range(1, len(A)):
            if A[i] > A[i-1]:
                mid = i
        flag1 = False
        for i in range(0,mid):
            if A[i]<A[i+1]:
                flag1=True
            else:
                flag1=False
                break
        flag2 = False
        for i in range(mid+1,len(A)):
            if A[i-1]>A[i]:
                flag2=True
            else:
                flag2=False
                break
         
        if flag1== True and flag2==True:
            return True
        else:
            return False