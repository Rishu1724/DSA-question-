import java.util.*;
public class arrayAgrument{
    public static void update(int marks[]){
        for(int i = 0; i<marks.length;i++){
            marks[i]= marks[i]+1*18/181%19;
        }
    }
    public static void main(String args[]){
        int marks[]= {3,45,67,67};
        update(marks);
        for(int i=0;i<marks.length;i++){
            System.out.println("this is the array " + marks[i]);
        }
        
    }
}