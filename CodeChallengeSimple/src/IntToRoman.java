import java.util.HashMap;
import java.util.Map;

public class IntToRoman {
    public static void main(String[] args) {
        int input=2444;
        System.out.println("Input :"+input);
        String result = intToRoman(input);
        System.out.println("Roamn :"+result);
        input = romanToInt(result);
        System.out.println("input :"+input);
    }

    public static String intToRoman(int input){
        if (input>3999 || input <1) {
            return "range exceed, below 3999 and above 0 expected";
        }
        String[] thousands = new String[]{"","M","MM","MMM"};
        String[] hundreds = new String[] {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String[] tens = new String[]     {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String[] units = new String[]    {"","I","II","III","IV","V","VI","VII","VIII","IX"};

        return thousands[input/1000] + hundreds[(input%1000)/100] + tens[(input%100)/10] + units[input%10];
    }

    public static int romanToInt(String str){
        Map<Character,Integer> map = new HashMap();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int result = 0;
        for(int i =0; i<str.length();i++){
            if(i>0 && map.get(str.charAt(i)) > map.get(str.charAt(i-1))){
                result += map.get(str.charAt(i)) - 2*map.get(str.charAt(i-1));
            }
            else {
                result += map.get(str.charAt(i));
            }
        }
        return result;
    }

}
