public class Main {
    public static void main(String[] args) {
        double numbers[] = {4.2, 6.4, 8.3, -5.7, -5.9, 9.2, -11.3, 6.9, 9.5, -7.5, 14.7, 4.8, 6.9, 3.9, -6.4};
        double sum = 0;
        int kolichestvo = 0;
        boolean isnegative = false;
        for (double play : numbers) {
            if (play < 0) {
                isnegative = true;
            } else if (play > 0 && isnegative) {
                sum = play;
                kolichestvo++;
                System.out.println(play);
            }
        }
        System.out.println("среднее арифметическое число: " + sum / kolichestvo);

    }
}