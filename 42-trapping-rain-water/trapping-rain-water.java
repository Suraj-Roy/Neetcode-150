class Solution {
    public int trap(int[] height) {
        int endMaxArr[] = new int[height.length];
        int startMaxArr[] = new int[height.length];
        int maxStart = height[0];
        int maxEnd = height[height.length-1];

        for(int i=0;i<height.length;i++){
            if(maxStart<height[i]){
                maxStart = height[i];
            }
            if(maxEnd<height[height.length-1-i]){
                maxEnd = height[height.length-1-i];
            }

             startMaxArr[i] = maxStart;
             endMaxArr[height.length-1-i] = maxEnd;
        }

        int res = 0;

        for(int i=0;i<height.length;i++){
            
            int minVal = (startMaxArr[i]<=endMaxArr[i])? startMaxArr[i]:endMaxArr[i];
            res +=minVal-height[i];
        }
        return res;
    }
}