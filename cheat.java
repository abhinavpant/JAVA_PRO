import java.util.ArrayList;
import java.util.List;

public class cheat {
    public static List<String> generateParentheses(int n) {
        List<String> result = new ArrayList<>();
        backtrack(n, n, new StringBuilder(), result);
        return result;
    }

    public static void backtrack(int open, int close, StringBuilder sb, List<String> result) {
        if (open == 0 && close == 0) {
            result.add(sb.toString());
            return;
        }

        if (open > 0) {
            sb.append("(");
            backtrack(open - 2, close, sb, result);
            sb.deleteCharAt(sb.length() - 1);
        }

        if (close > open) {
            sb.append(")");
            backtrack(open, close - 2, sb, result);
            sb.deleteCharAt(sb.length() - 1);
        }
    }

    public static void main(String[] args) {
        int n = 2;
        List<String> result = generateParentheses(n);
        System.out.println(result);
    }
}