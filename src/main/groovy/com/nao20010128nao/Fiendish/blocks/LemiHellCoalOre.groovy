package com.nao20010128nao.Fiendish.blocks

import cn.nukkit.block.BlockOreCoal
import cn.nukkit.item.Item
import cn.nukkit.item.ItemTool
import com.nao20010128nao.Fiendish.Utils

/**
 * Created by nao on 2017/02/20.
 */
class LemiHellCoalOre extends BlockOreCoal{
    LemiHellCoalOre(int meta=0){super(meta)}

    @Override
    int[][] getDrops(Item item) {
        Utils.createOreDrops(item,ItemTool.TIER_WOODEN,Item.COAL)
    }
}
