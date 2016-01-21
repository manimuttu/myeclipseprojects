package ineritance;

class A {                          // Define a class named A
  int i = 1;                       // An instance field
  int f() { return i; }            // An instance method
  static char g() { return 'A'; }  // A class method
}

class B extends A {                // Define a subclass of A
  int i = 2;                       // Shadows field i in class A
  int f() { return -i; }           // Overrides instance method f in class A
  static char g() { return 'B'; }  // Shadows class method g() in class A
}

public class OverrideTest {
  public static void main(String args[]) {
    B b = new B();               // Creates a new object of type B
    System.out.println(b.i);     // Refers to B.i; prints 2
    System.out.println(b.f());   // Refers to B.f(); prints -2
    System.out.println(b.g());   // Refers to B.g(); prints B
    System.out.println(B.g());   // This is a better way to invoke B.g()
    System.out.println("================================");

    A a = (A) b;                 // Casts b to an instance of class A
    System.out.println(a.i);     // Now refers to A.i; prints 1
    System.out.println(a.f());   // Still refers to B.f(); prints -2
    System.out.println(a.g());   // Refers to A.g(); prints A
    System.out.println(A.g());   // This is a better way to invoke A.g()
    System.out.println("================================");
//    2
//    -2
//    B
//    B    
    A a1 = new B();                 // Casts b to an instance of class A
    System.out.println(a1.i);     // Now refers to A.i; prints 1
    System.out.println(a1.f());   // Still refers to B.f(); prints -2
    System.out.println(a1.g());   // Refers to A.g(); prints A
    System.out.println(A.g());   // This is a better way to invoke A.g()
    System.out.println("================================");
//    1
//    -2
//    A
//    A
    
    A d = new A();                 // Casts b to an instance of class A
    System.out.println(d.i);     // Now refers to A.i; prints 1
    System.out.println(d.f());   // Still refers to B.f(); prints -2
    System.out.println(d.g());   // Refers to A.g(); prints A
    System.out.println(A.g());   // This is a better way to invoke A.g()
    System.out.println("================================");
//    1
//    1
//    A
//    A
  }
}