class Solution {
    public List<Integer> getRow(int rowIndex) {
        if (rowIndex == 0)
        {
            List<List<Integer>> arr = new ArrayList<List<Integer>>();
            List<Integer> a1 = new ArrayList<>();
            a1.add(1);
            arr.add(a1);
            return arr.get(0);
        }
        if (rowIndex == 1){
            List<List<Integer>> arr = new ArrayList<List<Integer>>();
            List<Integer> a1 = new ArrayList<>();
            a1.add(1);
            arr.add(a1);
            List<Integer> a2 = new ArrayList<>(); 
            a2.add(1);
            a2.add(1);
            arr.add(a2);
            return arr.get(1);
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

            for(int i=2; i<=rowIndex; i++)
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
            
            return arr.get(rowIndex);
        }
    }
}