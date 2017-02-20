package com.nao20010128nao.Fiendish.blocks

import cn.nukkit.block.BlockCobweb
import cn.nukkit.entity.Entity
import cn.nukkit.item.Item
import cn.nukkit.item.ItemTool

/**
 * Created by nao on 2017/02/20.
 */
class LemiHellCobweb extends BlockCobweb{
    @Override
    boolean hasEntityCollision() {
        true
    }

    @Override
    int getToolType() {
        ItemTool.TYPE_PICKAXE
    }

    @Override
    void onEntityCollide(Entity entity) {
        entity.resetFallDistance()
        entity.kill()
    }

    @Override
    int[][] getDrops(Item item) {
        // TODO: What should I drop?
        []
    }
}
