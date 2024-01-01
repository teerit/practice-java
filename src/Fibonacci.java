public class Fibonacci {
    public static void main(String[] args) {
        String input = args[0];
        Integer number = 0;

        try {
            number = Integer.valueOf(input);
            System.out.println("Enter the number of times: " + input);
            System.out.println(fibo(number));
        } catch (NumberFormatException exception) {
            System.out.println("The number format is incorrect");
        }
    }

    public static Integer fibo(Integer number) {
        if (number == 0) {
            return 0;
        } else if (number == 1) {
            return 1;
        } else {
            return fibo(number - 2) + fibo(number - 1);
        }
    }

}
