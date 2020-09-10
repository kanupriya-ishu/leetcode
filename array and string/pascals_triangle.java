class Solution {
    public List<List<Integer>> generate(int numRows) {
        if (numRows == 0)
        {
            List<List<Integer>> a1 = new ArrayList<List<Integer>>();
            return a1;
        }
        if (numRows == 1)
        {
            List<List<Integer>> arr = new ArrayList<List<Integer>>();
            List<Integer> a1 = new ArrayList<>();
            a1.add(1);
            arr.add(a1);
            return arr;
        }
        if (numRows == 2){
            List<List<Integer>> arr = new ArrayList<List<Integer>>();
            List<Integer> a1 = new ArrayList<>();
            a1.add(1);
            arr.add(a1);
            List<Integer> a2 = new ArrayList<>(); 
            a2.add(1);
            a2.add(1);
            arr.add(a2);
            return arr;
        }
        
        else
        {
            List<List<Integer>> arr = new ArrayList<List<Integer>>();
            List<Integer> a1 = new ArrayList<>();
            a1.add(1);
            arr.add(a1);
            List<Integer> a2 = new ArrayList<>(); 
            a2.add(1);
            a2.add(1);
            arr.add(a2);
            System.out.println(arr);

            for(int i=2; i<numRows; i++)
            {
                List<Integer> a3 = new ArrayList<>();
                for(int j=0; j < arr.get(i-1).size()-1; j++)
                {
                    int sum = arr.get(i-1).get(j) + arr.get(i-1).get(j+1);
                    a3.add(sum);
                }
                a3.add(0,1);
                a3.add(1);
                arr.add(a3);
            }
            
            return arr;
        }
            
    }
}