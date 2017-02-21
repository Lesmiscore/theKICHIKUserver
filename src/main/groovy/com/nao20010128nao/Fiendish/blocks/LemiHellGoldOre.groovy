package com.nao20010128nao.Fiendish.blocks

import cn.nukkit.block.BlockOreGold
import cn.nukkit.item.Item
import cn.nukkit.item.ItemTool
import com.nao20010128nao.Fiendish.PhpMethods
import com.nao20010128nao.Fiendish.Utils

/**
 * Created by nao on 2017/02/21.
 */
class LemiHellGoldOre extends BlockOreGold{
    @Override
    int[][] getDrops(Item item) {
        Utils.createOreDrops(item,ItemTool.TIER_IRON,Item.GOLD_INGOT)
    }
}
