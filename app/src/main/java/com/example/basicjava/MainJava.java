package com.example.basicjava;

class Connection{
     //Test
    private static Connection _inst = null;
    private int count = 0;

    static public Connection get(){
        if(_inst == null) {
            _inst = new Connection();
            return _inst;
        }
        return _inst;
    }
    public void count() {count++;}
    public int getCount() {return count;}


}

class Test {

    static int a = 3;
    int b = 15;

}
public class MainJava {

     public static void main(String[] args) {

         Test c = new Test();
         Test.a = 5;
         System.out.println(Test.a);
         System.out.println(c.b);

         Connection conn1 = Connection.get();
         conn1.count();
         Connection conn2 = Connection.get();
         conn2.count();
         Connection conn3 = Connection.get();
         conn3.count();;

         System.out.println(conn1.getCount());
     }

}
