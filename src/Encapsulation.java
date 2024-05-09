import java.util.*;

    //Better control of class attributes and methods
    //Class attributes can be made read-only (if you only use the get method), or write-only (if you only use the set method)
    //Flexible: the programmer can change one part of the code without affecting other parts
    //Increased security of data
class Joker{
    private String name;
    private void set(){
        Scanner sc = new Scanner(System.in);
        this.name=sc.nextLine(); // set data
    }
    public void  getItem(){
        set();
        // get data
        System.out.println(this.name);
    }
}
public class Encapsulation {

    public static void main(String []args){
        Joker obj =  new Joker();
        obj.getItem();
    }
}
