public class AppMain {
    public static void main(String[] args) {

        String line1 = "";
        for (int i = 0; i < 5; i++) {
            line1 += randValue(100) + " ";
        }
        System.out.println(line1);

        String line2 = "";
        for (int i = 0; i < 5; i++) {
            line2 += randValue(100, 500) + " ";
        }
        System.out.println(line2);
    }
    

    public static int randValue(int maxValue) {
        return (int)(Math.random() * 10);
    }

    public static int randValue(int minValue, int maxValue) {
        return minValue + (int)(Math.random() * (maxValue - minValue));
    }
}
