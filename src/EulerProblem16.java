import java.math.BigInteger;

/**
 * Power digit sum
 *
 * Problem 16
 * 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
 *
 * What is the sum of the digits of the number 2^1000?
 */

public class EulerProblem16 {

    public static void main(String[] args){

        BigInteger x = BigInteger.valueOf(1);

        for (int i = 1; i <= 1000 ; i++) {
            x = x.multiply(BigInteger.valueOf(2));
        }

        String num = x.toString();

        int sum = 0;

        for (int i = 0; i < num.length(); i++) {
            sum += ((int)num.charAt(i) - 48);
        }

        System.out.println("The sum of the digits of the number 2^1000 is " + sum);
    }

}
