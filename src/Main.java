import java.lang.reflect.Array;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Exercise 1.");

        int[] theFirstArray = new int[3];
        theFirstArray[0] = 1;
        theFirstArray[1] = 2;
        theFirstArray[2] = 3;

        float[] theSecondArray = {1.57f, 7.654f, 9.986f};

        boolean[] theThirdArray = new boolean[3];
        theThirdArray[0] = false;
        theThirdArray[1] = false;
        theThirdArray[2] = true;
        System.out.println();


        System.out.println("Exercise 2.");
        System.out.println(Arrays.toString(theFirstArray));
        System.out.println(Arrays.toString(theSecondArray));
        System.out.println(Arrays.toString(theThirdArray));
        System.out.println();


        System.out.println("Exercise 3.");
        System.out.print(theFirstArray[2] + ", " + theFirstArray[1] + ", " + theFirstArray[0]);
        System.out.println();
        System.out.print(theSecondArray[2] + ", " + theSecondArray[1] + ", " + theSecondArray[0]);
        System.out.println();
        System.out.print(theThirdArray[2] + ", " + theThirdArray[1] + ", " + theThirdArray[0]);
        System.out.println();
        System.out.println();


        System.out.println("Exercise 4.");
        for(int i = 0; i < theFirstArray.length; i++) {
            if (theFirstArray[0] % 2 != 0) {
                theFirstArray[0] += 1;
            } else if (theFirstArray[1] % 2 != 0) {
                theFirstArray[1] += 1;
            } else if (theFirstArray[2] % 2 !=0) {
                theFirstArray[2] += 1;
                System.out.println(Arrays.toString(theFirstArray));
            }
        }
    }
}