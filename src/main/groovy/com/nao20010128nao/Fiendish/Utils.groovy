package com.nao20010128nao.Fiendish

import cn.nukkit.item.Item
import cn.nukkit.item.ItemTool

import java.security.SecureRandom

/**
 * Created by nao on 2017/02/21.
 */
class Utils {
    static final ThreadLocal<SecureRandom> random=new ThreadLocal<>()
    static int[][] createOreDrops(Item item,int leastTier,int itemId,int itemDamage=0){
        if(item.tier>= leastTier){
            def rand=PhpMethods.mt_rand(1,20)
            def amount=1
            switch (rand){
                case 2:
                    amount=2
                    break
                case 3:
                    amount=1000
                    break
            }
            return [
                    [itemId, itemDamage, amount]
            ]
        }else{
            return []
        }
    }
    static int[][] createJewelryBlockDrops(
            Item item,
            int leastTier,
            int jewelryItemId,
            int jewelryItemDamage=0,
            int packedItemId=item.id,
            int packedItemDamage=item.damage
    ){
        if(item.tier>= leastTier){
            def rand=PhpMethods.mt_rand(0,9)
            def data
            switch(rand){
                case 9:
                    data=[packedItemId,packedItemDamage,1]
                    break
                default:
                    data=[jewelryItemId,jewelryItemDamage,rand]
                    break
            }
            return [data]
        }else{
            return []
        }
    }
}
