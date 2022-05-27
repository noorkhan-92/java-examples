package examples;

import java.util.Arrays;

public class SortByHeight {

    public SortByHeight() {
        int[] a = {-1, 150, 190, 170, -1, -1, 160, 180};
        System.out.println(Arrays.toString(solution(a)));
    }

    int[] solution(int[] a) {
        int b = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] == -1) {
                    break;
                }
                if (a[i] < a[j]) {
                    a[i] = a[i] + a[j];
                    a[j] = a[i] - a[j];
                    a[i] = a[i] - a[j];
                }
            }
        }
        return a;
    }

    public static void main(String args[]) {
        new SortByHeight();
    }

}
