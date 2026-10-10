class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> set=new HashMap<>();
        HashMap<Character,Integer> set2=new HashMap<>();
        for(int i =0; i<s.length(); i++){
            char c= s.charAt(i);
            if(set.containsKey(c)){
                set.put(c,set.get(c)+1);
            }
            else{
                set.put(c,1);
            }
        }
        for(int i =0; i<t.length(); i++){
            char c= t.charAt(i);
            if(set2.containsKey(c)){
                set2.put(c,set2.get(c)+1);
            }
            else{
                set2.put(c,1);
            }
        }
        if (set.equals(set2)) return true;
        else return false;
    }
}
