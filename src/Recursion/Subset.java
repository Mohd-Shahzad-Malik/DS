package Recursion;

public class Subset {
    public static void main(String[] args) {
        subset("", "abc");
    }

    private static void subset(String output, String input) {

        if (input.isEmpty()) {
            System.out.println(output);
            return;
        }

        subset(output, input.substring(1));
        subset(output + input.charAt(0), input.substring(1));

    }
}
