class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        

        // loop over the string array and 
        // calculate the asci value of a string add in to hashmap integer,string[]
        // if exist get the value and push new array with old array

HashMap<String,List<String>>map =new HashMap();



int []  alphabetsInteger=new int[26];

        for(String st:strs){
            char [] chars=st.toCharArray();
alphabetsInteger=new int[26];

                for(char c: chars){                
                 alphabetsInteger[c-'a']++;
                }
               StringBuffer sb=new StringBuffer(); 
            for(int d: alphabetsInteger){                
               sb.append(d).append("#");

                }

                map.computeIfAbsent(sb.toString(),k->new ArrayList()).add(st);
        
        }

        return new ArrayList(map.values());
    }
}
