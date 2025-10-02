class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list=new ArrayList<>();
        if(p.length()>s.length()) return list;
        int[] freq1=new int[26];
        int[] freq2=new int[26];
        int l=p.length();
        int n=s.length();
        for(int i=0;i<l;i++){
            freq1[p.charAt(i)-'a']++;
        }
        for(int i=0;i<n;i++){
            freq2[s.charAt(i)-'a']++;
            if(i<l-1) continue;
            if(Arrays.equals(freq1,freq2)) list.add(i-l+1);
            freq2[s.charAt(i-l+1)-'a']--;
        }
        return list;
    }
}