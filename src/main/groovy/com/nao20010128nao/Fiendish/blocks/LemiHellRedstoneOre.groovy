package com.nao20010128nao.Fiendish.blocks

import cn.nukkit.block.BlockOreRedstone
import cn.nukkit.item.Item
import cn.nukkit.item.ItemTool
import com.nao20010128nao.Fiendish.PhpMethods
import com.nao20010128nao.Fiendish.level.UnpreventableExplosion

/**
 * Created by nao on 2017/02/21.
 */
class LemiHellRedstoneOre extends BlockOreRedstone{
    LemiHellRedstoneOre(int meta=0){super(meta)}

    @Override
    boolean onBreak(Item item) {
        // TODO: This shouldn't happen always, but sometimes.
        // TODO: Size of explosion should be changed randomly
        def expl=new UnpreventableExplosion(this,100)
        expl.explode() // use this, because it's a simple explosion
        return level.setBlock(this,get(AIR))
    }

    @Override
    int[][] getDrops(Item item) {
        if(item.tier>=ItemTool.TIER_GOLD){
            return [
                    [Item.REDSTONE_DUST, 0, PhpMethods.mt_rand(4,5)]
            ]
        }else{
            return []
        }
    }
}
