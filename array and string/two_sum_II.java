class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int l=0;
        int r=numbers.length-1;
        
        while(l<r)
        {
            if(target > numbers[l] + numbers[r])
            {
                l++;
            }
            
            else if(target < numbers[l] + numbers[r])
            {
                r--;
            }
            else{
                break;
            }
        }
        
        int[] arr = new int[2];
        
        arr[0] = l+1;
        arr[1] = r+1;
        
        return arr;
    }
}