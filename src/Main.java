public class Main {
    public static void main(String[] args) {
        int[] result = Digitize.digitize(123456);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
