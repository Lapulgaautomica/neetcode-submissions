class Solution {


// use a special char infront of the string and length and end with special char;

//#2abc*2#ef*

//loop  
// i=0
// j=i+1
// substring (j,length);
// push the value to list
// i=j+length
// j=j+i;
        



    public String encode(List<String> strs) {
        StringBuffer sb=new StringBuffer();
        for(String s:strs){
            sb.append(s.length()).append("#").append(s).append("#");
        }
       
        return sb.toString();
    }

    public List<String> decode(String str) {

        char [] chars=str.toCharArray();
        List<String> list= new ArrayList();
int i=0;
int j=0;
        while(i<str.length()){
            while(str.charAt(j)!='#'){
                
                j++;
            }
           
            //2#abc#1#c#
            int length=Integer.parseInt(str.substring(i,j));
            list.add(str.substring(j+1,length+j+1));   
            i=j+1+length+1;
            j=i;
        }

                return list;
    }
}
