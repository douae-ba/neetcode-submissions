class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>  set=new HashMap<>();
       for(int i=0;i<strs.length;i++){
        int[] count = new int[26];
        for(int j=0;j<strs[i].length();j++){
            char c = strs[i].charAt(j);
            count[c-'a']+=1;
        }
        String key = Arrays.toString(count);
        if (!set.containsKey(key)) {
                set.put(key, new ArrayList<>());
            }

            set.get(key).add(strs[i]);
       }
       return new ArrayList<>(set.values()); 
    }
}
