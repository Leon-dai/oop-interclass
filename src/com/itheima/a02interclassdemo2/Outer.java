package com.itheima.a02interclassdemo2;

public class Outer {
    public class Inner{
        static int a = 10;
    }
    public Inner getInstance(){
        return new Inner();
    }
}
