class Solution {
    public int evalRPN(String[] tokens) {

        Set<String> ops = Set.of("+","-","/","*");
        
        Stack<Integer> stack = new Stack<>();
        
        int res=0;
        
        
        for(String i:tokens){
            
            if(!ops.contains(i)) stack.push(Integer.parseInt(i));
            else{
                int a = stack.pop();
                int b = stack.pop();
                switch(i){
                    case "+":
                        stack.push(b+a);
                        break;
                    case "-":
                        stack.push(b-a);
                        break;
                    case "*":
                        stack.push(b*a);
                        break;
                    case "/":
                        stack.push(b/a);
                        break;
                }
            }
        }
        
        return stack.pop();
    }
}