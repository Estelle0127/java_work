import java.util.ArrayList;
import java.util.Stack;

public class UserlistOut {

	public static void main(String[] args) {

		ArrayList arrayList = new ArrayList();
		
		arrayList.add("해리");
		arrayList.add("유진");
		arrayList.add("민지");
		arrayList.add("지선");
		
		Stack stack = new Stack();
		stack.addAll(arrayList);
		
//		while(!stack.empty()){
//			System.out.println(stack.pop());
//		}
		
		
	}
}
