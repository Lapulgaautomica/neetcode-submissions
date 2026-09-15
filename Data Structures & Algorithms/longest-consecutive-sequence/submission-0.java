class Solution {
    public int longestConsecutive(int[] nums) {
     
            Set <Integer> seen =new HashSet();
             for(int n:nums){
                  seen.add(n);
             }     

                int mainCount=0;
             int count=0;
                  //  [2,20,4,10,3,4,5]
             // if n+1 is exist
                for(int n:seen){ 
                       if(!seen.contains(n-1)){
                        int c=n;
                        count=0;
                        while(seen.contains(n++)){
                         count++;   
                        }
                        mainCount=Math.max(mainCount,count);
                       }                
                    }

                    return mainCount;
    }
}
