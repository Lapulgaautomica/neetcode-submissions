class Solution {
    public boolean isAnagram(String s, String t) {

if (s.length ()!= t.length()) {
    return false;
}
     int [] common= new int[26];
    char [] chars=s.toCharArray();
    for(int i=0;i<chars.length;i++){
        common[s.charAt(i)-'a']++;
        common[t.charAt(i)-'a']--;
    }
        for(int num:common)
            {
               if( num!=0)
                return false;
            }
  return true;
    }

  
}
