package com.nao20010128nao.Fiendish.blocks

import cn.nukkit.block.BlockMobSpawner
import cn.nukkit.item.Item
import com.nao20010128nao.Fiendish.level.UnpreventableExplosion

/**
 * Created by nao on 2017/02/21.
 */
class LemiHellMonsterSpawner extends BlockMobSpawner{
    LemiHellMonsterSpawner(int meta=0){super(meta)}

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
        []
    }
}
