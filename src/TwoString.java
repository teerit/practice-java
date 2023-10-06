public class TwoString {

    public static void main(String[] args) {
        String result = twoStrings("hello", "world");
        System.out.println(result);
    }

    public static String twoStrings(String s1, String s2) {
        return s1.chars()
                .distinct()
                .mapToObj(c -> String.valueOf((char) c))
                .anyMatch(s2::contains) ? "YES" : "NO";
    }
}
