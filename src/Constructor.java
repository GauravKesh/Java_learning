


public class Constructor {
    String name;
    int age;

    public void val(String name,int Age){
        this.name = name;
        age =  Age;
    }

    public static void main(String[] args){
        Constructor construct = new Constructor();
        construct.val("Gaurav",12);
        System.out.println(construct.name +"is  "+construct.age+" old.");
    }
}
