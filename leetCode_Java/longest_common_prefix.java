import java.util.ArrayList;

class longest_common_prefix{
    public String longestCommonPrefix(String[] strs) {
        char[] headString = strs[0].toCharArray(); //convert the first head string to a char array to compare
        String solution = "$$"; //stores return value

        if(strs.length == 1)
            return solution = strs[0];

        int i = 1;
        while(i < strs.length){
            if(headString[0] != strs[i].charAt(0))
                break;
            char[] temp = strs[i].toCharArray(); //holds current I rotation of string to chars
            ArrayList<Character> tempSolution = new ArrayList<Character>();
            for(int j = 0; j < strs[i].length(); j++){
                if(headString[j] == temp[j]){
                    tempSolution.add(temp[j]);
                }
                else break;
            }
            StringBuilder stringBuilder = new StringBuilder();
            for (char c : tempSolution) {
                stringBuilder.append(c);
            }
            solution = stringBuilder.toString();
            i++;
        }

        return solution;
    }
}