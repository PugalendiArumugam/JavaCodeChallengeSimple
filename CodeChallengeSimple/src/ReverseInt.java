//************************************************************************
//* Reverse the int value.
//* it has to be done matematically
//* input value % 10 gives the last digit
//* multiply the previous value with 10 and concatenate the last digit
//* replease the process
//************************************************************************

public class ReverseInt {
    public static void main(String[] args) {
        int ivalue = 967523;
        int result = reverse(ivalue);
        System.out.println(result);
    }

    public static int reverse(int input){
        long reversed = 0;
        while (input != 0){
            reversed = reversed * 10 + input % 10;
            input /=10;
            if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE){
                return 0;
            }
        }
        return (int) reversed;
    }
}
