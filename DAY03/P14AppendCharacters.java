class P14AppendCharacters {
    public static void main(String[] args) {
        String s = "coaching";
        String t = "coding";
        int j = 0;

        for (int i = 0; i < s.length() && j < t.length(); i++) {
            if (s.charAt(i) == t.charAt(j)) {
                j++;
            }
        }
        System.out.println(t.substring(j,t.length())+" need to add to the "+s+"\ntotal chars are:"+(t.length()-j));
    }
}
