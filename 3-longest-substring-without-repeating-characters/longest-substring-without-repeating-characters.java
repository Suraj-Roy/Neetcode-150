class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();

        int index = 0;
        int res = 1;

        if(s.length()==0) return 0;

        for(int i=0;i<s.length();i++){
            
            while(set.contains(s.charAt(i))){
                
                set.remove(s.charAt(index++));
            }

            res = Math.max(res,i-index+1);
            set.add(s.charAt(i));

        }

        return res;
    }
}