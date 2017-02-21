package com.nao20010128nao.Fiendish.blocks

import cn.nukkit.block.BlockDiamond
import cn.nukkit.item.Item
import cn.nukkit.item.ItemTool
import com.nao20010128nao.Fiendish.PhpMethods
import com.nao20010128nao.Fiendish.Utils

/**
 * Created by nao on 2017/02/20.
 */
class LemiHellDiamond extends BlockDiamond{
    @Override
    int[][] getDrops(Item item) {
        Utils.createJewelryBlockDrops(item,ItemTool.TIER_IRON,Item.DIAMOND)
    }
}
