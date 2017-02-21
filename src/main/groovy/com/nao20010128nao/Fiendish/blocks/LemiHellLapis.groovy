package com.nao20010128nao.Fiendish.blocks

import cn.nukkit.block.BlockLapis
import cn.nukkit.item.Item
import cn.nukkit.item.ItemTool
import com.nao20010128nao.Fiendish.PhpMethods
import com.nao20010128nao.Fiendish.Utils

/**
 * Created by nao on 2017/02/21.
 */
class LemiHellLapis extends BlockLapis{
    @Override
    int[][] getDrops(Item item) {
        Utils.createJewelryBlockDrops(item,ItemTool.TIER_STONE,Item.DYE,4)
    }
}
