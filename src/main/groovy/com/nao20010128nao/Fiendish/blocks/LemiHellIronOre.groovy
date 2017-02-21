package com.nao20010128nao.Fiendish.blocks

import cn.nukkit.block.BlockOreIron
import cn.nukkit.item.Item
import cn.nukkit.item.ItemTool
import com.nao20010128nao.Fiendish.Utils

/**
 * Created by nao on 2017/02/21.
 */
class LemiHellIronOre extends BlockOreIron{
    @Override
    int[][] getDrops(Item item) {
        Utils.createOreDrops(item,ItemTool.TIER_STONE,Item.IRON_INGOT)
    }
}
