package com.itheima.a01interclassdemo1;

public class Test {
    public static void main(String[] args) {
        /*
            需求：写一个Javabean类描述汽车。
            属性：汽车的品牌，车龄，颜色，发动机的品牌，使用年限。
            内部类的访问特点：
                内部类可以直接访问外部类的成员，包括私有
                外部类要访问内部类的成员，必须创建对象

            1．什么是内部类？
                写在一个类里面的类就叫做内部类
            2. 什么时候用到内部类？
                B类表示的事物是A类的一部分，且B单独存在没有意义
                比如：汽车的发动机，ArrayList的迭代器，人的心脏等等
         */
        Car c = new Car();
        c.carName = "宾利";
        c.carAge = 1;
        c.carColor = "粉色";

        c.show();

    }
}
