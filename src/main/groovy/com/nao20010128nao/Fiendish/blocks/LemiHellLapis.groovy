package com.nao20010128nao.Fiendish.blocks

import cn.nukkit.block.BlockLapis
import cn.nukkit.item.Item
import cn.nukkit.item.ItemTool
import com.nao20010128nao.Fiendish.PhpMethods

/**
 * Created by nao on 2017/02/21.
 */
class LemiHellLapis extends BlockLapis{
    @Override
    int[][] getDrops(Item item) {
        if(item.tier>= ItemTool.TIER_STONE){
            def rand=PhpMethods.mt_rand(0,9)
            def data
            switch(rand){
                case 9:
                    data=[Item.LAPIS_BLOCK,0,1]
                    break
                default:
                    data=[Item.DYE,4,rand]// damage 4 is lapis lazuli
                    break
            }
            return [data]
        }else{
            return []
        }
    }
}
