public class ValidParenthesis {


    // this will only search for brackets that are immediately follow the bracket in question.
    // whilst this is not the complete answer I need to think about how to approach this otherwise.

    public static boolean isValid(String s) {
        if (s.length() % 2 != 0){
            return false;
        }

        for(int i = 0; i < s.length(); i++){
            for(int y = i + 1; y< s.length(); y++){
                char a = s.charAt(i);
                char b = s.charAt(y);

                //System.out.println("a: " + a + "| b: " + b);

                if(a == '(' && b != ')') {
                    return false;
                } else if(a == '[' && b != ']') {
                    return false;
                } else if(a == '{' && b != '}') {
                    return false;
                } else {
                    y++;
                    i++;
                }
                i++;

            }
        }
        return true;
    }
    public static void main(String [] args){
        System.out.println(isValid("()"));
        System.out.println(isValid("{}}"));
        System.out.println(isValid("{(}}"));
        System.out.println(isValid("{}{}"));
        System.out.println(isValid("()[]{}"));
    }
}
