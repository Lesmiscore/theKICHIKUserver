package com.nao20010128nao.Fiendish

import java.security.SecureRandom

/**
 * Created by nao on 2017/02/20.
 */
class PhpMethods {
    static final ThreadLocal<SecureRandom> random=new ThreadLocal<>()
    static int mt_rand(int min,int max){
        min+random.get().nextDouble()*(max-min)
    }
}
