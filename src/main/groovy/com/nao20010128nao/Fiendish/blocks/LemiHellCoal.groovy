package com.nao20010128nao.Fiendish.blocks

import cn.nukkit.block.BlockCoal
import cn.nukkit.item.Item
import com.nao20010128nao.Fiendish.PhpMethods

/**
 * Created by nao on 2017/02/20.
 */
class LemiHellCoal extends BlockCoal {
    @Override
    int[][] getDrops(Item item) {
        if(item.pickaxe){
            def rand=PhpMethods.mt_rand(0,9)
            def data
            switch(rand){
                case 9:
                    data=[Item.COAL_BLOCK,0,1]
                    break
                default:
                    data=[Item.COAL,0,rand]
                    break
            }
            return [data]
        }else{
            return []
        }
    }
}
