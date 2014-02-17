package ph.zai.util;

import java.util.Stack;

public class JaysArithmeticInterpreter1 {

	public double interpret(String stmt) {
		
		String[] stmtX = validateExpression(stmt);
		double dVal = 0.0;
		
		Stack<Double> operands = new Stack<Double>();
		Stack<String> operators = new Stack<String>();
		String x = "";
		
		
		for (int i=1;i<stmtX.length;i++) {
			x = stmtX[i];
			
			if (x.equals("(")) {
				
			}
			else if (x.equals("+") || x.equals("-") || 
						x.equals("*") || x.equals("/")) 
				operators.push(x); 
			else if (x.equals(")")){
				dVal = operands.pop();
				x = operators.pop();
				if (x.equals("+")) dVal = operands.pop() + dVal;
				else if (x.equals("*")) dVal = operands.pop() * dVal;
				else if (x.equals("-")) dVal = operands.pop() - dVal;
				else if (x.equals("/")) dVal = operands.pop() / dVal;
				operands.push(dVal);
			} else operands.push(Double.parseDouble(x));		
		}
		return operands.pop().doubleValue();
	}
	
	public String[] validateExpression(String str){
		StringBuilder sbStr = new StringBuilder();
		
		char ch = 0;
		for (int i=0;i<str.length();i++){
			ch = str.charAt(i);
			
			if (ch=='+' || ch=='-' || ch=='*' || ch=='(' || ch==')'){
				sbStr.append(':');
				sbStr.append(ch);
				sbStr.append(':');
			} else if (String.valueOf(ch).matches("[0-9]")){
				sbStr.append(ch);
			}
		}
		String[] results = sbStr.toString().replaceAll("::", ":").split(":");
		return results;
	}
}
