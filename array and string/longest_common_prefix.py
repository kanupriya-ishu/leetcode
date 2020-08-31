class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        if len(strs)==0:
            return ""
        small = min(strs)
        s = ""
        
        for i in range(len(small)):
            flag = True
            c = small[i]
            
            for j in range(len(strs)):
                if strs[j][i]!=c:
                    flag = False
                    break
            if flag == False:
                break
            else:
                s = s + c
        return s
                