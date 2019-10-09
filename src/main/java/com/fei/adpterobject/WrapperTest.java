package com.fei.adpterobject;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package com.fei.adpterobject
 * @date 2019/10/9 14:27
 * @Copyright © 2019
 */
public class WrapperTest {
    public static void main(String[] args) {

        Sourceable source1 = new SourceSub1();

        Sourceable source2 = new SourceSub2();

        source1.method1();
        source1.method2();
        source2.method1();
        source2.method2();
    }
}
