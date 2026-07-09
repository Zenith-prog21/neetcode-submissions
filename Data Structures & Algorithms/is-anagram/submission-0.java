class Solution {
    public boolean isAnagram(String s, String t) {
        Set<Character> hash1 = new HashSet<>();
        Set<Character> hash2 = new HashSet<>();

        for (int i = 0; i < t.length(); i++){
            hash1.add(s.charAt(i));
            hash2.add(t.charAt(i));
        }

            if(hash1.containsAll(hash2)){
                return true;
            }

            return false;
        

    }
}
