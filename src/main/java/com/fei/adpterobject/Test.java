package com.fei.adpterobject;

import javax.transaction.TransactionRequiredException;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package com.fei.adapter
 * @date 2019/10/9 11:25
 * @Copyright © 2019
 */
public class Test {
    public static void main(String[] args) {
       /* Targetable target = new Adapter();
        target.method1();
        target.method2();
*/

        Source source = new Source();
        Targetable target = new Wrapper(source);
        target.method1();
        target.method2();

    }
}
