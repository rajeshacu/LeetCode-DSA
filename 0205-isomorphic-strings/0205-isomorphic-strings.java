class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<String,String>map = new HashMap();
        if(s.length()!=t.length())
             return false;
        for(int i=0;i<s.length();i++){
            String a = s.charAt(i)+"";
            String b = t.charAt(i)+"";
            if(map.containsKey(a)){
                if(!(map.get(a)).equals(b))
                      return false;
            }else{
                if(map.containsValue(b))
                    return false;
                map.put(a,b);
            }

        }
        return true;
       
    }
}