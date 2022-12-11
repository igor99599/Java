package number5_6;

import java.nio.charset.StandardCharsets;
import java.util.Stack;

public class ProcessStrings implements Stringable{
    @Override
    public int countSymbols(String str) {
        return str.toCharArray().length;
    }

    @Override
    public String oddString(String str) {
        StringBuilder new_str = new StringBuilder();
        for(int i = 1; i < countSymbols(str); i += 2){
            new_str.append(str.charAt(i));
        }
        return new_str.toString();
    }

    @Override
    public String reverse(String str) {
        StringBuilder new_str = new StringBuilder();
        for(int i = countSymbols(str) - 1; i >= 0; i--){
            new_str.append(str.charAt(i));
        }
        return new_str.toString();
    }

    public static void main(String[] args) {
        ProcessStrings ps = new ProcessStrings();
        String str = "Hello!";
        System.out.println(ps.countSymbols(str));
        System.out.println(ps.oddString(str));
        System.out.println(ps.reverse(str));
    }
}
