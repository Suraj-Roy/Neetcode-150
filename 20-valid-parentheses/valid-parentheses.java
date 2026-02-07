class Solution {
    public boolean isValid(String s) {

        if(s.length()%2!=0) return false;

        Map<Character,Character> map = new HashMap<>();
        map.put(']','[');
        map.put('}','{');
        map.put(')','(');
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                
            
                if(stack.isEmpty()||stack.pop()!=map.get(ch)){
                    return false;
                }
            }
            else{
                stack.push(ch);
            }
        }
        return stack.size() == 0;
    }
}