package com.itheima.a04interclassdemo4;

public class Test {
    public static void main(String[] args) {
        // 注意事项：
        // 1.静态内部类也是成员内部类中的一种
        // 2.静态内部类只能访问外部类中的静态变量和静态方法，
        // 如果想要访问非静态的需要创建外部类的对象。
        // 创建静态内部类对象的格式：
        // 外部类名.内部类名 对象名 = new 外部类名.内部类名();
        // 调用静态方法的格式：
        // 外部类名.内部类名.方法名();

        /*1.什么是静态内部类？
        静态内部类是一种特殊的成员内部类。
        2.直接创建静态内部类对象的方式？
        Outer.Inner oi = new Outer.Inner();
        3.如何调用静态内部类中的方法？
        非静态方法：先创建对象，用对象调用
        静态方法：外部类名.内部类名.方法名();*/

        //创建静态内部类的对象
        //只要是静态的东西，都可以用类名点直接获取
        Outer.Inner oi = new Outer.Inner();
        oi.show1();

        Outer.Inner.show2();
    }
}
