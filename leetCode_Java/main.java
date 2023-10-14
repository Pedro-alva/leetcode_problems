public class main {
    public static void main(String[] args) {
        //longest common prefix problem
        /*longest_common_prefix lcp = new longest_common_prefix();
        String[] strs = {"",""};
        String h = lcp.longestCommonPrefix(strs);
        System.out.println(h);*/

        //roman to integer problem
        String s = "MCMXCIV";
        roman_to_integer rti = new roman_to_integer();
        int rti_answer = rti.romanToInt(s);
        System.out.println(rti_answer);
    }
}
