package com.nao20010128nao.Fiendish.blocks

import cn.nukkit.block.BlockLeaves
import cn.nukkit.item.Item
import com.nao20010128nao.Fiendish.PhpMethods

/**
 * Created by nao on 2017/02/21.
 */
class LemiHellLeaves extends BlockLeaves{
    LemiHellLeaves(int meta=0) {
        super(meta)
    }

    @Override
    int[][] getDrops(Item item) {
        def drops=[]
        if(item.shears){
            drops+=[Item.LEAVES,meta&0x03,1]
        }else{
            if(PhpMethods.mt_rand(1,5)==1){ // saplings
                drops+=[Item.SAPLING,meta&0x03,1]
            }
            if(((meta&0x03)==OAK)&(PhpMethods.mt_rand(1,200)==1)){ // apples
                drops+=[Item.APPLE,0,1]
            }
        }
        return drops
    }
}
