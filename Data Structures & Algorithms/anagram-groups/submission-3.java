class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
int [] freequency=new int[26];
Map <String,List<String>> map=new HashMap();
for (String str:strs) {
    freequency=new int[26];
    StringBuffer sb=new StringBuffer();
char [] chars=str.toCharArray();
    for(char c: chars){
        freequency[c-'a']++;
    }
    for(int i: freequency){
        sb.append(i).append("#");
    }
    map.computeIfAbsent(sb.toString(),k->new ArrayList()).add(str);
}
        return new ArrayList(map.values());
    }
}
