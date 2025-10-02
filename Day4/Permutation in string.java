class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n=s2.length();
        int m=s1.length();

        int[] freq1=new int[26];
        int[] window=new int[26];

        for(char c:s1.toCharArray()){
            freq1[c-'a']++;
        }
        
        int start=0;
        int end=0;

        while(end<n){
            window[s2.charAt(end)-'a']++;

            if(end-start+1>m){
                window[s2.charAt(start)-'a']--;
                start++;
            }
            if(end-start+ 1== m){
                if(Arrays.equals(freq1,window)){
                    return true;
                }
            }
            end++;
        }
        return false;

    }
}