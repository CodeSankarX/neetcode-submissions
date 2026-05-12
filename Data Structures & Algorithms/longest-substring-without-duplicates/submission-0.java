class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        
        for(int i=0;i<s.length();i++){
            int len=0;
            HashSet<Character> val=new HashSet();
            for(int j=i;j<s.length();j++){
                if(val.contains(s.charAt(j))){
                    break;
                }
                val.add(s.charAt(j));
                len++;
            }
            max=Math.max(max,len);
        }
        return max;

    }
}
