package Huzaifa.src.Huzaifa;

public class SimpleCallbyValueprogram {
        int data=50;
        static int a=10;

        public static void main(String args[]){
            SimpleCallbyValueprogram op=new SimpleCallbyValueprogram();
            op.data=20;
            op.a=12;
            System.out.println("before change "+op.data);
            System.out.println("after change "+a);
            SimpleCallbyValueprogram p=new SimpleCallbyValueprogram();
            System.out.println(p.data);
            System.out.println(a);
        }
    }

