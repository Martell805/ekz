import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static Stack<Integer> splitStack(Stack<Integer> stack) {
        Queue<Integer> nonNegatives = new LinkedList<>();
        Stack<Integer> result = new Stack<>();

        for(Integer el: stack) {
            if(el >= 0) {
                nonNegatives.add(el);
                continue;
            }

            result.push(el);
        }

        for(Integer el: nonNegatives) {
            result.push(el);
        }

        return result;
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.addAll(List.of(
                1, -2, 3, -4, 5, 6, -7
        ));

        System.out.println(stack);
        System.out.println(splitStack(stack));
    }
}
