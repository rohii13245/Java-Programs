package scjpQuestios;

public class A1 {

 void foo() throws Exception { throw new Exception(); }
 }
 class SubB2 extends A {
 void foo() { System.out.println("B "); }
}
class Tester {
 public static void main(String[] args) {
             SubB2 a = new SubB2();
             a.foo();
             }
}

