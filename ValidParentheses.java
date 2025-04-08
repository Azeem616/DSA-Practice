import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s){          //can check whwter false or no?
        Stack<Character> stack = new Stack<>();       //
        for (char ch : s.toCharArray()) {              // ch, curent character checking,,, tochararray convert string to array

            if (ch == '(' || ch == '[' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) return false;

                char top = stack.pop();

                if ((ch == ')' && top != '(') ||         //so if ch=) must be meet '(' , otherwise other closing it will be false
                        (ch == '}' && top != '{') ||     //so if ch=} must be meet '{' , otherwise other closing it will be false
                        (ch == ']' && top != '[')) {     //so if ch=] must be meet '[' , otherwise other closing it will be false
                    return false;
                }
                }
            }
            return stack.isEmpty();
        }

    public static void main(String [] args) {
        String input = "{[()]}";
        boolean result = isValid(input);

        System.out.println("Is the string valid? " + result);
    }
}
