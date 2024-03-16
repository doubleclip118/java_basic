package static2.ex;

public class MathArrayUtils {
    private static int max = -100000000;
    private static int min = 100000000;

    private MathArrayUtils() {
    }

    public static int sum(int []list){
        int sum1 = 0;
        for (int i : list) {
            sum1+=i;
        }
        return sum1;
    }

    public static double average(int []list){
        int su = 0;
        for (int i : list) {
            su+=i;
        }
        return su/list.length;
    }

    public static int min(int []list){
        for (int i : list) {
            if(i<min){
                min = i;
            }
        }
        return min;
    }

    public static int max(int []list){
        for (int i : list) {
            if(i>min){
                max = i;
            }
        }
        return max;
    }


}
