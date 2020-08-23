import java.math.BigInteger;
class Solution {
    public int[] plusOne(int[] digits) {
        BigInteger n = new BigInteger("0");
		BigInteger A;
        for(int i=0; i<digits.length; i++)
        {
        	A  = BigInteger.valueOf(digits[i]);
        	n = n.multiply(BigInteger.valueOf(10));
        	n = n.add(A);
        }
        
        n = n.add(BigInteger.valueOf(1));
        int digi = getDigitCount(n);
        int[] arr = new int[digi];
        for(int i =digi-1; i>=0; i--)
        {
        	BigInteger temp = n.mod(BigInteger.valueOf(10));
        	n = n.divide(BigInteger.valueOf(10));
        	arr[i] = temp.intValue();
        }
        
        
        return arr;
            
    }
    
    public static int getDigitCount(BigInteger number) {
		  double factor = Math.log(2) / Math.log(10);
		  int digitCount = (int) (factor * number.bitLength() + 1);
		  if (BigInteger.TEN.pow(digitCount - 1).compareTo(number) > 0) {
		    return digitCount - 1;
		  }
		  return digitCount;
		}
}