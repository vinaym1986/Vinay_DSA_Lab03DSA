package bracketsbalancer;

import java.util.Set;
import java.util.Stack;

public class BalancedBracketsChecker {
	
	//bracket expression
	
	private String bracketExpression;
	
	public BalancedBracketsChecker(String bracketExpression) {
		this.bracketExpression = bracketExpression;
	}
	
	public Boolean check() {
	    
        int length = bracketExpression.length();
        if ((length % 2) != 0) {
            
            System.out.printf("Bracket Expression doesn't have Even Number of Characters : %d", 
                length);
            System.out.println();
            return false;			
        }		
        
        
        Stack<Character> stack = new Stack<Character>();
        
        Set<Character> openBracketsSet 
            = BalancedBracketsUtils.getOpenBracketCharsSet();
        Set<Character> closeBracketsSet 
            = BalancedBracketsUtils.getCloseBracketCharsSet();

        
        for (int index = 0; index < bracketExpression.length(); index ++) {
            
            char visitedChar = bracketExpression.charAt(index);


            
            if (openBracketsSet.contains(visitedChar)) {

                stack.push(visitedChar);
                
            } else if (closeBracketsSet.contains(visitedChar)) {

                Character closeBracketChar = visitedChar;				
                Character poppedOutItem = stack.pop();
                
                Character potentialOpenBracketChar = poppedOutItem;

                Character openBracketChar 
                    = BalancedBracketsUtils.getOpenBracketChar(closeBracketChar);				
                                
                if (potentialOpenBracketChar.equals(openBracketChar)) {

                    continue;
                }else {

                    break;
                }
           
            } else {            

            	break;
            }
            

        }
        
        
        boolean empty = stack.isEmpty();
        
        if (empty) {
            System.out.printf("The entered String %s has Balanced Brackets \n", bracketExpression );
            return true;
            
        }else {
            System.out.printf("The entered String %s do not contain Balanced Brackets \n", bracketExpression );
            return false;	
        }		

        
        

        
    }


}
