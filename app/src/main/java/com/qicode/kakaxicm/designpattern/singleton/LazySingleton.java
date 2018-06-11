package com.qicode.kakaxicm.designpattern.singleton;

/**
 * Created by chenming on 2018/6/11
 */
public class LazySingleton {

    private static LazySingleton sInstance;
    private LazySingleton() {

    }

    public static synchronized LazySingleton getsInstance(){
        if(sInstance == null){
            sInstance = new LazySingleton();
        }
        return sInstance;
    }

    public void showMsg(String s) {
        System.out.println(this.getClass().getSimpleName() + "--" + this + "--" + s);
    }

}
