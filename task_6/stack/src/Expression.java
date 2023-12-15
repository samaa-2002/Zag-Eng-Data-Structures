public class Expression {


    public  static boolean isValid(String s) {
        StackBasedOnLinkedList<Character> stack=new StackBasedOnLinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (isOpenBracket(ch))
                stack.push(ch);
             else if (iscloswbracket(ch)) {
                char top = stack.pop();
                if (!isMatch(top, ch))
                    return false;
            }
        }
        return stack.isEmpty();
    }
        public static boolean isOpenBracket (char ch){
         return  (ch=='{'||ch=='<'||ch=='['||ch=='(');
        }
        public static boolean iscloswbracket(char ch){
        return (ch=='}'||ch=='>'||ch==']'||ch==')');
        }


    public static boolean isMatch (char right,char left){
        return right=='{'&&left=='}'||
                right=='<'&&left=='>'||
                right=='('&&left==')'||
                right=='['&&left==']';

    }
}

