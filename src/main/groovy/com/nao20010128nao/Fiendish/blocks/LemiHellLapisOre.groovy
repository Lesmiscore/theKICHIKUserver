package com.nao20010128nao.Fiendish.blocks

import cn.nukkit.block.BlockOreLapis
import cn.nukkit.item.Item
import cn.nukkit.item.ItemTool
import com.nao20010128nao.Fiendish.PhpMethods
import com.nao20010128nao.Fiendish.Utils

/**
 * Created by nao on 2017/02/21.
 */
class LemiHellLapisOre extends BlockOreLapis{
    LemiHellLapisOre(int meta=0){super(meta)}

    @Override
    int[][] getDrops(Item item) {
        def drops=Utils.createOreDrops(item,ItemTool.TIER_STONE,Item.DYE,4)
        if(drops.length>0){
            drops[0][2]*=PhpMethods.mt_rand(4, 8)
        }
        return drops
    }
}
