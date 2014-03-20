public class Solution {
    public boolean isValid(String s) {
        List<Character> stack = new ArrayList<Character> ();
        char[] ch = s.toCharArray();
        int size = 0;
        
        for (int i = 0; i < ch.length; i++) {
            char current = ch[i];
            size = stack.size();
            
            switch(current) {
                case '(':
                    stack.add('(');
                    break;
                case ')':
                    if (size > 0 && stack.get(size-1) == '(') {
                        stack.remove(size-1);
                    } else {
                        return false;
                    }
                    break;
                case '[':
                    stack.add('[');
                    break;
                case ']':
                    if (size > 0 && stack.get(size-1) == '[') {
                        stack.remove(size-1);
                    } else {
                        return false;
                    }
                    break;
                case '{':
                    stack.add('{');
                    break;
                case '}':
                    if (size > 0 && stack.get(size-1) == '{') {
                        stack.remove(size-1);
                    } else {
                        return false;
                    }
                    break;
            }
        }
        
        if(stack.size() == 0) {
            return true;
        } else {
            return false;
        }
    }
}