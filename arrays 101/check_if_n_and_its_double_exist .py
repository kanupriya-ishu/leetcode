class Solution:
    def checkIfExist(self, arr: List[int]) -> bool:
        for i in range(len(arr)):
            double = 2*arr[i]
            el = arr[: i] + arr[i+1:]
            if double in el:
                return True
        return False