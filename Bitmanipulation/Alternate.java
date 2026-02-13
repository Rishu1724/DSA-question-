public class Alternate {

    public static int opeRation(int n){
            return n%4;
    }


    public static void main(String args[]){
        int n= 5;
        System.out.println(" " +opeRation(n));


        /*
        this is the left shift 
        
        
        */
        int l = n>>2;
        int m = n^2;
        int o = n&2;
        int p = n|2;


        int k = n<<2;
        System.out.println(k);
         System.out.println(l);
          System.out.println(m);

           System.out.println(o);
            System.out.println(p);




    }
}
