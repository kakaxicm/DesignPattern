package com.qicode.kakaxicm.designpattern.singleton;

/**
 * Created by chenming on 2018/6/11
 */
public enum EnumSingleton {
    INSTANCE;
    public void showMsg(String s) {
        System.out.println(this.getClass().getSimpleName() + "--" + this + "--" + s);
    }
}
