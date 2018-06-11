package com.qicode.kakaxicm.designpattern.singleton;

/**
 * Created by chenming on 2018/6/11
 * 饿汉式，线程安全
 */
public class HungrySingleton {
    private static HungrySingleton sInstance = new HungrySingleton();

    private HungrySingleton() {

    }

    public static HungrySingleton getsInstance() {
        return sInstance;
    }

    public void showMsg(String s) {
        System.out.println(this.getClass().getSimpleName() + "--" + this + "--" + s);
    }
}
