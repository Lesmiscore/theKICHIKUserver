package com.nao20010128nao.Fiendish.blocks

import cn.nukkit.block.BlockOreEmerald
import cn.nukkit.item.Item
import cn.nukkit.item.ItemTool
import com.nao20010128nao.Fiendish.Utils

/**
 * Created by nao on 2017/02/20.
 */
class LemiHellEmeraldOre extends BlockOreEmerald{
    @Override
    int[][] getDrops(Item item) {
        Utils.createOreDrops(item,ItemTool.TIER_IRON,Item.EMERALD)
    }
}
