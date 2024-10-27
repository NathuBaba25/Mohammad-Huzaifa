package Huzaifa.src;

class B {
    B() {
        System.out.println("hi");
    }
}

public class Hello extends B {
      public Hello() {
          System.out.println("bye");

      }

    public static void main(String[] args) {
      Hello h =  new Hello();
    }
}
