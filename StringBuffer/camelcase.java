// package StringBuffer;
public class camelcase {

    static String converCamel(String s) {
        StringBuilder res = new StringBuilder();
        boolean capanext = false;

        for (int i = 0; i<s.length(); i++) {
            if(s.charAt(i)==' '){
                capanext = true;
                 res.append(s.charAt(i));
            

            }
            else if (capanext ==true){
                res.append(Character.toUpperCase(s.charAt(i)));
                capanext = false;
            }
            else{
                res.append(s.charAt(i));
            }
        }
        return res.toString();
    }

    public static void main(String args[]) {
        String s= "i am rishu";
        System.err.println(converCamel(s));
    }
}
