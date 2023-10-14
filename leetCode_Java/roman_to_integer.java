//lines 9 - 13 in main

import javax.naming.InterruptedNamingException;
import java.util.HashMap;

public class roman_to_integer {
    int romanToInt(String s){
        HashMap<String, Integer> rti_key = new HashMap<String, Integer>();//hasmap will hold the roman numerals as keys and the ints as the value
        fillKey(rti_key);//fills in the hashmap
        int convertedNum = 0;//return int
        char[] roman = s.toCharArray();

        for (int i = 0; i < roman.length; i++) {
            String temp = String.valueOf(roman[i]); //converts the individual chars to strings to use .get
            int t = rti_key.get(temp); //stores the int value from the key
            int t2;

            if(i < roman.length - 1) { //temp 2 is created to compare with the next value to find the subtraction cases
                String temp2 = String.valueOf(roman[i + 1]);
                t2 = rti_key.get(temp2);
            }else t2 = 0; //t2 = 0 is used to prevent going out of bounds

            if(t<t2){ //ex: 1 < 5, thus we do subtraction instead of adding -> 4
                convertedNum += Math.abs(t-t2);
                i++; //since we used the character next in the array we need to skip it
            }else convertedNum += rti_key.get(temp);
        }

        return convertedNum;
    }
    /*
    purpose of method is to fill the hashmap
     */
    public static void fillKey(HashMap<String, Integer> rti_key){
        rti_key.put("I", 1);
        rti_key.put("V", 5);
        rti_key.put("X", 10);
        rti_key.put("L", 50);
        rti_key.put("C", 100);
        rti_key.put("D", 500);
        rti_key.put("M", 1000);
    }
}
