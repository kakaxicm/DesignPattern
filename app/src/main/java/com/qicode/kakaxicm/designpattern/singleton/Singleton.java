package com.qicode.kakaxicm.designpattern.singleton;


/**
 * Created by chenming on 2018/6/11
 */
public class Singleton {
    private Singleton(){

    }

    private static class SingletonHolder{
        private static final Singleton sInstance = new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonHolder.sInstance;
    }

    public void showMsg(String s) {
        System.out.println(this.getClass().getSimpleName() + "--" + this + "--" + s);
    }

    
}
