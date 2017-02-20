package com.nao20010128nao.Fiendish.blocks

import cn.nukkit.block.BlockOreRedstoneGlowing
import cn.nukkit.item.Item
import cn.nukkit.item.ItemTool
import com.nao20010128nao.Fiendish.PhpMethods
import com.nao20010128nao.Fiendish.level.UnpreventableExplosion

/**
 * Created by nao on 2017/02/20.
 */
class LemiHellGlowingRedstoneOre extends BlockOreRedstoneGlowing{
    @Override
    int getLightLevel() {
        9
    }

    @Override
    int onUpdate(int type) {
        level.setBlock(this,get(REDSTONE_ORE,meta))
        return 0
    }

    @Override
    boolean onBreak(Item item) {
        // TODO: This shouldn't happen always, but sometimes.
        // TODO: Size of explosion should be changed
        def expl=new UnpreventableExplosion(this,100)
        expl.explode() // use this, because it's a simple explosion
        return level.setBlock(this,get(AIR))
    }

    @Override
    int[][] getDrops(Item item) {
        if(item.tier>= ItemTool.TIER_IRON){
            return [
                    [Item.REDSTONE_DUST, 0, PhpMethods.mt_rand(4,5)]
            ]
        }else{
            return []
        }
    }
}
