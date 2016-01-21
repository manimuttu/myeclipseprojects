package ineritance;
class Parent
{
    String name;

    public Parent(String n) throws Exception 
    {
        name = n;
        throw new Exception();
    }
    
}
public class Child extends Parent {
    String name;

    public Child(String n1, String n2) throws Exception
    {
        
        super(n1);       //passing argument to parent class constructor
        this.name = n2;
    }
    public void details()
    {
        System.out.println(super.name+" and "+name);
    }
     public static void main(String[] args) throws Exception
    {
        Child cobj = new Child("Parent","Child");
        cobj.details();
    }
}