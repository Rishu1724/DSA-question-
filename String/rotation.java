public class rotation {

    static boolean rotationStr(String s, String t){
        int n = s.length();
         int m= t.length();
         if(n!=m){
            return false;

         }
         String doubled = s+s;
         return doubled.contains(t); 
          
    }
    public static void main(String args[]){
        String s= "Rishu";
        String t ="shuRi";
        
        System.out.println(rotationStr(s,t));

    }
}
