package com.example.basicjava;

class Connection{
     //Test
    private static Connection _inst = null;
    private int count = 0;

    static public Connection get(){ //Singleton Pattern
        if(_inst == null) {
            _inst = new Connection();
            return _inst;
        }
        return _inst;
    }

    public void count() {count++;}
    public int getCount() {return count;}

}


public class MainJava {

     public static void main(String[] args) {

         Connection conn1 = Connection.get();
         System.out.println(conn1.getCount());  //0
         conn1.count();

         Connection conn2 = Connection.get();
         System.out.println(conn1.getCount());  //1
         conn2.count();

         Connection conn3 = Connection.get();   //2
         System.out.println(conn1.getCount());
         conn3.count();;

         System.out.println(conn1.getCount());  //3

     }

}
