package com.nao20010128nao.Fiendish.blocks

import cn.nukkit.block.BlockLeaves
import cn.nukkit.item.Item
import com.nao20010128nao.Fiendish.PhpMethods

/**
 * Created by nao on 2017/02/21.
 */
class LemiHellLeaves2 extends BlockLeaves{
    LemiHellLeaves2(int meta=0) {
        super(meta)
    }
    
    @Override
    int[][] getDrops(Item item) {
        def drops=[]
        if(item.shears){
            drops+=[Item.LEAVES2,meta&0x03,1]
        }else{
            if(PhpMethods.mt_rand(1,5)==1){ // saplings
                drops+=[Item.SAPLING,meta&0x03,1]
            }
        }
        return drops
    }
}
