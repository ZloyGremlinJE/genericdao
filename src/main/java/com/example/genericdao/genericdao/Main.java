package com.example.genericdao.genericdao;

public class Main {
    public static void main(String[] args) {
        Integer a =  1000;
        Integer b =  0;
        //b = (Object) a;
        System.out.println(b);
        a = 1001;
        System.out.println(b);

        Test t1 = new Test();
        t1.f = 10;


        Test t2 = new Test();

        t2 = t1;
        System.out.println(t2.f);

        t1.f = 20;

        System.out.println(t2.f);
    }


    static class Test{
        public Integer f ;
    }

}
