package com.example.basicjava;

class SuperObject {
    public void paint() {
        draw();
    }

    public void draw() {
        draw();
        System.out.println("Super Object");
    }

}

class SubObject extends SuperObject {
    public void paint() {
        super.draw();
    }

    public void draw() {
        System.out.println("Sub Object");
    }

}

public class Solution_D {
    public static void main(String[] args) {
        SuperObject a = new SubObject();
        a.paint();
        /**
         * a.paint() -> SubObject의 paint()를 호출 -> super.draw() 부모클래스의 draw()메소드를 호출한다.
         * SuperObject의 draw() -> draw()는 자식 클래스의 draw()를 호출하기 때문에 SubObject가 출력된다.
         * 그 다음 밑의 SuperObject가 출력되기 때문에 출력결과는 다음과 같다.
         * 출력 결과
         * Sub Object
         * Super Object
         * */

    }
}
