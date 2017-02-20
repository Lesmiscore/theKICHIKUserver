package com.nao20010128nao.Fiendish.blocks

import cn.nukkit.block.BlockDiamond
import cn.nukkit.item.Item
import cn.nukkit.item.ItemTool
import com.nao20010128nao.Fiendish.PhpMethods

/**
 * Created by nao on 2017/02/20.
 */
class LemiHellDiamond extends BlockDiamond{
    @Override
    int[][] getDrops(Item item) {
        if(item.tier>= ItemTool.TIER_IRON){
            def rand=PhpMethods.mt_rand(0,9)
            def data
            switch(rand){
                case 9:
                    data=[Item.DIAMOND_BLOCK,0,1]
                    break
                default:
                    data=[Item.DIAMOND,0,rand]
                    break
            }
            return [data]
        }else{
            return []
        }
    }
}
