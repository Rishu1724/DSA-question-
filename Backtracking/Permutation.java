// so we have the n string the we have the number of the strign!;
public class Permutation {
    //all backtracking question will be solved on recursion 

        public static void findPermutation(String str, String ans){
            // base case
            if(str.length()== 0){
                System.out.println(ans);
            }
            for(int i=0; i<str.length(); i++){

                char curr = str.charAt(i);
                String NewStr = str.substring(0,i)+str.substring(i+1);
                findPermutation(NewStr,ans+curr);
            }
        }

        public static void main(String args[]){
        String str = "abc";
        findPermutation(str,"");



    }
}
