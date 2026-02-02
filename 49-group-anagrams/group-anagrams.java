class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String,List<String>> map = new HashMap<>();

        for(String str: strs){
            int arr[] = new int[256];
            StringBuilder sb = new StringBuilder();

            for(int i=0;i<str.length();i++){
                arr[str.charAt(i)-'0']++;
            }

            for(int i=0;i<256;i++){
                sb.append(arr[i]+"#");
            }

            String key = sb.toString();

           map.putIfAbsent(key, new ArrayList<>());
           map.get(key).add(str);
        }

        List<List<String>> result = new ArrayList<>();

        for(Map.Entry<String,List<String>> mp : map.entrySet()){
            result.add(mp.getValue());
        }

        return result;
        
    }
}