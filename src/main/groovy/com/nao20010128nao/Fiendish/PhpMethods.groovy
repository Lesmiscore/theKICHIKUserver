package com.nao20010128nao.Fiendish

import java.security.SecureRandom

/**
 * Created by nao on 2017/02/20.
 */
class PhpMethods {
    static int mt_rand(int min,int max){
        min+ Utils.random.get().nextDouble()*(max-min)
    }
}
