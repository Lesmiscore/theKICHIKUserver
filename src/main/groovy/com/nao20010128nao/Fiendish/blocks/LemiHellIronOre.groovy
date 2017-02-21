package com.nao20010128nao.Fiendish.blocks

import cn.nukkit.block.BlockOreGold
import cn.nukkit.block.BlockOreIron
import cn.nukkit.item.Item
import cn.nukkit.item.ItemTool
import com.nao20010128nao.Fiendish.PhpMethods

/**
 * Created by nao on 2017/02/21.
 */
class LemiHellIronOre extends BlockOreIron{
    @Override
    int[][] getDrops(Item item) {
        if(item.tier>= ItemTool.TIER_STONE){
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
                    [Item.IRON_INGOT,0,amount]
            ]
        }else{
            return []
        }
    }
}
