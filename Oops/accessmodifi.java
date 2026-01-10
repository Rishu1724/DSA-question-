
public class accessmodifi{
    public static void main(String args[]){
        Pen p1 = new Pen();// creating a pen obeject p1
        p1.setColor("Blue");
        System.out.println("this is the pen object ");
        System.out.println(p1.color);


        Bankaccount myAcc = new Bankaccount();
        myAcc.username = "Rishu";
        myAcc.setPassword("ace");


    }
}

class Pen {
    // variabls
    String color;
    int tip;

    // this is the methods of this class (Pen)
    void setColor(String newColor){
        color = newColor;
    }
    /*this is the method of the class pen */
    
    void setTip(int newTip){
        tip=newTip;
    }

}
class Bankaccount{ 
    public String username;
    private String password;
    public void setPassword(String pwd){
        password = pwd;

    }

}