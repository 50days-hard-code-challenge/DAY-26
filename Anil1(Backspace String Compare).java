import java.util.*;
class Solution {
    public boolean backspaceCompare(String s, String t) {
      int n = s.length();
      int m = t.length();
      Stack<Character> stack1 = new Stack<>();
      Stack<Character> stack2 = new Stack<>();

      for(int i = 0; i<n; i++){
          if(stack1.isEmpty() && s.charAt(i) == '#'){
              continue;
          }
          else if(s.charAt(i) != '#'){
               stack1.push(s.charAt(i));
         }
          else{
              stack1.pop();
          }
      }
      for(int i = 0; i<m; i++){
          if(stack2.isEmpty() && t.charAt(i) == '#'){
             continue;
          }
          else if(t.charAt(i) != '#'){
               stack2.push(t.charAt(i));
          }
          else{
              stack2.pop();
          }
      }
      
      // Compare the contents of the two stacks
      return (stack1.equals(stack2));
        
    }
}
