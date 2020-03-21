package InterviewPrep.StacksAndQueues;

import java.util.Stack;

/**
 * Determines if a string of brackets is balanced.
 */
public class BalancedBrackets {

    /**
     * Find if a string of brackets is balanced.
     *
     * @param brackets string of brackets, brackets being the following characters "()[]{}"
     * @return string of "YES" or "NO"
     */
    static String isBalanced(final String brackets) {
        final Stack<Character> bracketStack = new Stack();
        for(char bracket : brackets.toCharArray()) {
            if(bracket == '{' || bracket == '[' || bracket == '(') {
                bracketStack.push(bracket);
            } else if (bracketStack.empty()){
                return "NO";
            } else if (bracket == '}') {
                if (bracketStack.pop() != '{') {
                    return "NO";
                }
            } else if (bracket == ']') {
                if (bracketStack.pop() != '[') {
                    return "NO";
                }
            } else if (bracket == ')') {
                if (bracketStack.pop() != '(') {
                    return "NO";
                }
            }
        }
        if (bracketStack.empty()) {
            return "YES";
        } else {
            return "NO";
        }
    }

}
