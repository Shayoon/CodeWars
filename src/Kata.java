public class Kata {
    public static int[] digitize(long n) {
        int length = String.valueOf(n).length();
        String nbr = String.valueOf(n);
        int[] result = new int[length];
        int j = 0;
        for (int i = length - 1; i >= 0 ; i--) {
            result[j++] =  Character.digit(nbr.charAt(i),10);
        }
        return result;
    }
}