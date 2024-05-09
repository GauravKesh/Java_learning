
//In Java, it is also possible to nest classes (a class within a class). The purpose of nested classes is to group classes that belong together, which makes your code more readable and maintainable.
//
//To access the inner class, create an object of the outer class, and then create an object of the inner class:


class OuterClass {
    int x = 10;

    class InnerClass {
        int y = 5;
    }
}
//Private Inner Class
//Unlike a "regular" class, an inner class can be private or protected. If you don't want outside objects to access the inner class,
// declare the class as private:

class OuterClass_Private {
    int x = 10;

    private  class InnerClass_Private {
        int y = 5;
    }
}


//Static Inner Class
//An inner class can also be static, which means that you can access it without creating an object of the outer class:
//Note: just like static attributes and methods, a static inner class does not have access to members of the outer class.
class OuterClassStatic {
    int x = 10;

    static class InnerClassStatic {
        int y = 5;
    }
}

//Access Outer Class From Inner Class
//One advantage of inner classes, is that they can access attributes and methods of the outer class:
class OuterClassA {
    int x = 10;

    class InnerClassA {
        public int myInnerMethod() {
            return x;
        }
    }
}

public class Inner_Classes {
    public static void main(String[] args) {
///        Java Inner Classes
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.y + myOuter.x);
///        Private Inner Class
        OuterClass_Private myOuter_Private= new OuterClass_Private();
//        myOuter_Private.InnerClass_Private myInner_Private = myOuter_Private.new InnerClass_Private();
        System.out.println(myInner.y + myOuter.x);
///        Static Inner Class
        OuterClassStatic.InnerClassStatic myInnerStatic = new OuterClassStatic.InnerClassStatic();
        System.out.println(myInnerStatic.y);
///         FOR ACCESS OUTER FROM INNER
        OuterClassA myOuterA = new OuterClassA();
        OuterClassA.InnerClassA myInnerA = myOuterA.new InnerClassA();
        System.out.println(myInnerA.myInnerMethod());
    }
}



