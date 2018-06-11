package com.qicode.kakaxicm.designpattern;

import com.qicode.kakaxicm.designpattern.singleton.DCLSingleton;
import com.qicode.kakaxicm.designpattern.singleton.EnumSingleton;
import com.qicode.kakaxicm.designpattern.singleton.HungrySingleton;
import com.qicode.kakaxicm.designpattern.singleton.LazySingleton;
import com.qicode.kakaxicm.designpattern.singleton.Singleton;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void testSignleton() {
        //二者hash一样
        HungrySingleton hungrySingleton1 = HungrySingleton.getsInstance();
        hungrySingleton1.showMsg("我是饿汉式");
        HungrySingleton hungrySingleton2 = HungrySingleton.getsInstance();
        hungrySingleton2.showMsg("我是饿汉式");

        //二者hash一样
        LazySingleton lazySingleton1 = LazySingleton.getsInstance();
        hungrySingleton1.showMsg("我是懒汉式");
        LazySingleton lazySingleton2 = LazySingleton.getsInstance();
        hungrySingleton2.showMsg("我是懒汉式");

        //二者hash一样
        DCLSingleton dclSingleton1 = DCLSingleton.getsInstance();
        dclSingleton1.showMsg("我是DCL");
        DCLSingleton dclSingleton2 = DCLSingleton.getsInstance();
        dclSingleton2.showMsg("我是DCL");

        //二者hash一样
        Singleton singleton1 = Singleton.getInstance();
        singleton1.showMsg("我是静态内部类模式");
        //二者hash一样
        Singleton singleton2 = Singleton.getInstance();
        singleton2.showMsg("我是静态内部类模式");


        EnumSingleton enumSingleton = EnumSingleton.INSTANCE;
        enumSingleton.showMsg("我是枚举模式");
    }
}