public class Solution {
    public String reverseWords(String s) {
        
        if(s != null && !s.isEmpty()) {
            Map<Integer, String> map = new HashMap<Integer, String> ();
            char[] ch = s.trim().toCharArray();
            
            StringBuilder sb = new StringBuilder();
            int size = 0;
            boolean flag = false;
            
            for (int i = 0; i < ch.length; i++) {
                if (i == ch.length-1) {
                    size++;
                    sb.append(ch[i]);
                    String s0 = sb.toString();
                    map.put(size, s0);
                    sb = new StringBuilder();
                } else {
                    if(ch[i] != ' ') {
                        sb.append(ch[i]);
                        flag = false;
                    } else {
                        if (!flag) {
                            size++;
                            String s0 = sb.toString();
                            map.put(size, s0);
                            sb = new StringBuilder();
                            flag = true;
                        } else {
                            // nothing to do
                        }
                    }
                }
            }
            
            String result = "";
            for (int i = size; i > 0; i--) {
                if (i != 1) {
                    result = result + map.get(i) + " ";
                } else {
                    result = result + map.get(i);
                }
            }
            
            return result;
        } else {
            return s;
        }
        
    }
}