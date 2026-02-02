class Solution {

    public boolean valid(String s,int l,int r){
        if(l>=r) return true;
        if(s.charAt(l)!=s.charAt(r)) return false;
        
        return valid(s,l+1,r-1);
    }
        
    
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^a-zA-Z0-9]","");
        
        s=s.toLowerCase();
        
        return valid(s,0,s.length()-1);
    }
        
}