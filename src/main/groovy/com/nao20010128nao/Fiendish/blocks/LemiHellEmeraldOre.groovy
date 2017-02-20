package com.nao20010128nao.Fiendish.blocks

import cn.nukkit.block.BlockOreEmerald
import cn.nukkit.item.Item
import cn.nukkit.item.ItemTool
import com.nao20010128nao.Fiendish.PhpMethods

/**
 * Created by nao on 2017/02/20.
 */
class LemiHellEmeraldOre extends BlockOreEmerald{
    @Override
    int[][] getDrops(Item item) {
        if(item.tier>= ItemTool.TIER_IRON){
            def rand=PhpMethods.mt_rand(1,20)
            def amount=1
            switch (rand){
                case 2:
                    amount=2
                    break
                case 3:
                    amount=1000
                    break
            }
            return [
                    [Item.EMERALD,0,amount]
            ]
        }else{
            return []
        }
    }
}
