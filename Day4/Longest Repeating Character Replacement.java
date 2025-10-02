class Solution {
    public int characterReplacement(String s, int k) {
        
        int n=s.length();
        int start=0;
        int end=0;
        int ans=0;
        int max=0;
        int[] freq=new int[26];
        while(end<n){
            char c=s.charAt(end);
            freq[c-'A']++;
            end++;
            max=Math.max(max,freq[c-'A']);
            while(start<end && (end-start) - max>k){
                freq[s.charAt(start)-'A']--;
                start++;
            }
            ans=Math.max(ans,end-start);
        }
        return ans;
    }
}