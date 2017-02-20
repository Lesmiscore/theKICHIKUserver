package com.nao20010128nao.Fiendish

import java.security.SecureRandom

/**
 * Created by nao on 2017/02/20.
 */
class PhpMethods {
    private static SecureRandom random=new SecureRandom()
    static int mt_rand(int min,int max){
        min+random.nextDouble()*(max-min)
    }
}
