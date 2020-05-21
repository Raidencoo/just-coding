import java.util.HashMap;
import java.util.Stack;

/**
 * @说明：
 * @类型名称：ValidParenthesis
 * @创建者: Raiden
 * @创建时间: 2020/5/20 17:04
 * @修改者: Raiden
 * @修改时间: 2020/5/20 17:04
 */
/*
    给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
    有效字符串需满足：
    左括号必须用相同类型的右括号闭合。
    左括号必须以正确的顺序闭合。
    注意空字符串可被认为是有效字符串。
* */
public class ValidParenthesis {
    public static void main(String[] args) {
        System.out.println(verificationParenthesis("(("));
    }

       public static Boolean verificationParenthesis(String s){
           if (s==null){
               return false;
           }
           if ("".equals(s)){
               return true;
           }
           char[] chars = s.toCharArray();
           if (chars.length%2==1){
               return false;
           }
           HashMap<Character, Character> map = new HashMap<>();
           map.put('{','}');
           map.put('(',')');
           map.put('[',']');
           Stack stack = new Stack();
           for (int i=0;i<chars.length;i++) {
               if (map.containsKey(chars[i])){
                   stack.push(chars[i]);

               }else {
                   if (stack.empty())
                       return false;
                   char pop = (char)stack.pop();
                   if (chars[i]!=map.get(pop))
                       return false;

               }
           }
           return stack.empty();
       }
}
