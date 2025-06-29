class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> r = new HashMap<>();
        r.put('I', 1);
        r.put('V', 5);
        r.put('X', 10);
        r.put('L', 50);
        r.put('C', 100);
        r.put('D', 500);
        r.put('M', 1000);

        int total = 0, prev = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int cur = r.get(s.charAt(i));
            if (cur < prev)
                total -= cur;
            else
                total += cur;
            prev = cur;
        }
        return total;
    }
}