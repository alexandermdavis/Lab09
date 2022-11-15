import java.util.Stack;

public class MainClass {

	public static void main(String[] args) {
		System.out.println(balancedExpression("(2+4) * 8 + ((3-1) + 7)"));
		System.out.println(balancedExpression("(2+4*7 + (3 -1) + 8"));
		System.out.println(balancedExpression("))2+3(("));
	}
	
	public static Boolean balancedExpression(String expression){
		
		Stack<Character> myStack = new Stack<Character>();
		
		for(int i = 0; i < expression.length(); i++){
			char c = expression.charAt(i);
			if(c == '(') {
				myStack.push('(');
			} else if(c == ')') {
				if(myStack.isEmpty()) {
					return false;
				} else {
					myStack.pop();
				}
			}
		}
		if(myStack.isEmpty()){
			return true;
		} else {
			return false;
		}
	}
}
