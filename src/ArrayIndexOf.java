import java.util.stream.IntStream;

public class ArrayIndexOf {
  public static void main(String[] args) {
    int[] array1 = {1, 3, 5, 7, 9};

    int elementToFind = 3;

    int indexOfElement = IntStream.range(0, array1.length)
                              .filter(i -> elementToFind == array1[i])
                              .findFirst().orElse(-1);

    System.out.println("Index of " + elementToFind + " is " + indexOfElement);
  }
}
