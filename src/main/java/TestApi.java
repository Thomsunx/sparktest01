import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class TestApi {

	public static void main(String[] args) {
//		Queue<String> queue = new LinkedList<String>();
//		queue.offer("1");
//		queue.offer("2");
//		System.out.println(queue);
//		String str = queue.poll();
//		System.out.println(str);

		Deque<String> stack = new LinkedList<String>();
		stack.push("1");
		stack.push("2");
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
	}
}
