class Solution {
    public List<String> generateParenthesis(int n) {
        
        List<String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        backtrack(result,n,sb,0,0);
        return result;

    }

    public void backtrack(List<String> result,int n,StringBuilder sb,int open,int close){
        if(sb.length()==2*n){
            result.add(sb.toString());
            return;
        }

        if(open<n){
            sb.append("(");
            backtrack(result,n,sb,open+1,close);
            sb.deleteCharAt(sb.length()-1);
        }

        if(close<open){
            sb.append(")");
            backtrack(result,n,sb,open,close+1);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}