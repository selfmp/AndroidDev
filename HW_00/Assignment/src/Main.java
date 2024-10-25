
public class Main {
    public static int findMax(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            int x = arr[i];
            if (x > max) max = x;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] ints = {1, 3, 4, 2};
        System.out.println(findMax(ints));
    }

}
