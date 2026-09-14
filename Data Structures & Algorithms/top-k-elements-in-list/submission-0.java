class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap();
    // makeing freequency map        
        for(int num:nums){
           map.put(num,  map.getOrDefault(num,0)+1);
        }
        // inserting into bucket
        List<Integer>[] freequencyList= new List[nums.length+1];
        for(int num:map.keySet()){
            int freeq=map.get(num);
            if(freequencyList[freeq]==null){
                freequencyList[freeq]= new ArrayList();
            }
             freequencyList[freeq].add(num);
        }
    // loop from the top to bottom
    int [] result= new int[k];
    int idx=0;
    for(int i=freequencyList.length-1;i>=0 &&idx<k;i-- ){
            if(freequencyList[i]!=null){
                for(int num :freequencyList[i]){
                    result[idx++]=num;
                  if(  idx ==k )break;
                }
            }        
    }
      return result;
    }
}
