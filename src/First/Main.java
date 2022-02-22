package First;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        String[] arr = new String[2];
        arr[0] = "Hello";
        arr[1] = "World!";
        Function<String[], String[]> reverseString = input -> {
            String[] output = new String[input.length];
            for(int a = 0; a<input.length; a++){
                output[a] = new StringBuilder(input[a]).reverse().toString();
            }
            return output;
        };
        arr = reverseString.apply(arr);
        for (String str:arr
             ) {
            System.out.println(str);
        }
    }
}
