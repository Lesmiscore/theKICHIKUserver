package com.nao20010128nao.Fiendish.blocks

import cn.nukkit.block.BlockGlassPane
import cn.nukkit.item.Item

/**
 * Created by nao on 2017/02/20.
 */
class LemiHellGlassPane extends BlockGlassPane{
    LemiHellGlassPane(int meta=0){super(meta)}

    @Override
    int[][] getDrops(Item item) {
        [
                [Item.GLASS_PANE,0,1]
        ]
    }
}
