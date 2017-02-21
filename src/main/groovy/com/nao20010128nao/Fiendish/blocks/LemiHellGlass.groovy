package com.nao20010128nao.Fiendish.blocks

import cn.nukkit.block.BlockGlass
import cn.nukkit.item.Item

/**
 * Created by nao on 2017/02/20.
 */
class LemiHellGlass extends BlockGlass{
    LemiHellGlass(int meta=0){super(meta)}

    @Override
    int[][] getDrops(Item item) {
        [
                [Item.GLASS,0,1]
        ]
    }
}
