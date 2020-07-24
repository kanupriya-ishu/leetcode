class Solution {
    public boolean checkIfExist(int[] arr) {
        boolean flag = false;
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr.length; j++)
            {   
                
                 if (arr[i] == 2 * arr[j] && i!=j)
                    {
                        flag = true;
                        break;
                    }
                   
            }
            if(flag==true)
                {
                    break;
                }
            }
            return flag;
            
        }
        
        
    }