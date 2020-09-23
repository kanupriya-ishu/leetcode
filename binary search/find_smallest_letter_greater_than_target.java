class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int n = letters.length;
        
        int lo = 0, hi = n;

        
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (letters[mid] > target)     hi = mid;
            else    lo = mid + 1;                 
        }
 
        //Because lo can end up pointing to index 'n', in which case we return the first element
        return letters[lo % n];
    }
}