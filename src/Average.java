public class Average {
    public static double find_average(int[] array){
        int avrg = 0;
        for (int i = 0; i < array.length; i++){
            avrg += array[i];
        }
        avrg /= array.length;
        return avrg;
    }
}