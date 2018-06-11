package com.qicode.kakaxicm.designpattern.singleton;

/**
 * Created by chenming on 2018/6/11
 */
public class DCLSingleton {
    private static DCLSingleton sInstance;

    private DCLSingleton() {

    }

    public static DCLSingleton getsInstance() {
        if (sInstance == null) {
            synchronized (DCLSingleton.class) {
                if(sInstance == null){
                    sInstance = new DCLSingleton();
                }
            }
        }
        return sInstance;
    }

    public void showMsg(String s) {
        System.out.println(this.getClass().getSimpleName() + "--" + this + "--" + s);
    }
}
