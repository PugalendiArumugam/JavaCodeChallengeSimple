import java.util.Arrays;

//*
//* given two sorted arrays num1 and num2 size m and n respectively returns the median
//* of two sorted arrays
//*  num1 = [1,2] num2 = [3]
//*  result = 2.00   [1,2.3]  the median is 2
//* eg2
//* num1 = [1,20 num2 =[3,4]
//* result = 2.50    /// [1,2,3,4] median is 2+3/2 = 2.50

public class MedianOfTwoArraynums {
    public static void main(String[] args) {
        int[] intArray1 = new int[]{1,4,7,8,9,10};
        int[] intArray2 = new int[]{2,3,5,6};
        double result = medianValue(intArray1, intArray2);
        System.out.println(result);

    }

    public static double medianValue(int[] array1, int[] array2) {
        int p1 =0, p2=0, p3=0;

        int[] resultArray = new int[(array1.length+array2.length)];

        boolean processOk = true;
        if (p1>array1.length-1 && p2>array2.length-1) {
            processOk = false;
            System.out.println("Both arrays are empty");
        }

        while (processOk) {
            if (p1<=array1.length-1 && p2<=array2.length-1 ) {
               if (array1[p1]<array2[p2]) {
                   resultArray[p3] = array1[p1];
                   p1++;
                   p3++;
               } else {
                   resultArray[p3] = array2[p2];
                   p2++;
                   p3++;
               }
            } else if (p1<=array1.length-1){
                resultArray[p3] = array1[p1];
                p3++;
                p1++;
            } else if (p2<=array2.length-1) {
                resultArray[p3] = array2[p2];
                p3++;
                p2++;
            }
            if (p1>array1.length-1 && p2>array2.length-1) {
                processOk = false;
            }
        }
        System.out.println(Arrays.toString(resultArray));
        if (resultArray.length%2==0) {
           return (float) ((resultArray[(resultArray.length/2)-1]) + (resultArray[resultArray.length/2]))/2;
        } else {
            return (float) resultArray[resultArray.length/2];
        }
    }
}
