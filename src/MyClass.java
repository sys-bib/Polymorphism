public class MyClass {
    public static void main(String[] args) {
        Employee e = new FullTime();
        System.out.println("Full time empolyee salary is " + e.salary() );
        FullTime f = new FullTime();
        f.myMethod();


        e = new Conractor();
        System.out.println("Contractor salary is "+ e.salary());

        System.out.println(Employee.designation());
        System.out.println(FullTime.designation());
        System.out.println(Conractor.designation());

        MyOverLoadingClass myOverLoadingClass = new MyOverLoadingClass();
        myOverLoadingClass.myMethod(5);
        myOverLoadingClass.myMethod("my string");
        myOverLoadingClass.myMethod("my string", 5);
    }
}
