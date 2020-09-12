class Solution:
    def reverseWords(self, s: str) -> str:
        l = list(s.split())
        l2 = []
        for i in l:
            l2.append(i[::-1])
        s1 = " ".join(i for i in l2)
        return s1
        