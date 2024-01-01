import java.util.Arrays;
import java.util.List;

public class PlusMinus {

    public static void main(String[] args) {
        List<Integer> arr = List.of(-4, 3, -9, 0, 4, 1);
        plusMinus(arr);
    }

    public static void plusMinus(List<Integer> arr) {
        int size = arr.size();
        float countPos = 0.0F;
        float countNeg = 0.0F;
        float countZero = 0.0F;

        for (Integer number : arr) {
            if (number > 0) {
                countPos++;
            }

            if (number < 0) {
                countNeg++;
            }

            if (number == 0) {
                countZero++;
            }
        }

        System.out.println(countPos / size);
        System.out.println(countNeg / size);
        System.out.println(countZero / size);
    }
}
