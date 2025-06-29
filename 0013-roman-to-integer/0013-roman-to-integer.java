class Solution {
    public int romanToInt(String s) {
        String symbols = "IVXLCDM";
        int[] value = {1, 5, 10, 50, 100, 500, 1000};

        Map<Character, Integer> numerals = new HashMap<>();
        for (int i = 0; i < 7; i++)
            numerals.put(symbols.charAt(i), value[i]);

        int romanToInteger = numerals.get(s.charAt(s.length() - 1));
        for (int i = 0; i < s.length() - 1; i++) {
            int sign = numerals.get(s.charAt(i)) < numerals.get(s.charAt(i + 1)) ? -1 : 1;
            romanToInteger += sign * numerals.get(s.charAt(i));
        }
        return romanToInteger;
    }
}