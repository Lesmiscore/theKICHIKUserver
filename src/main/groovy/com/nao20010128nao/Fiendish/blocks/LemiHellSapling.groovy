package com.nao20010128nao.Fiendish.blocks

import cn.nukkit.Player
import cn.nukkit.block.Block
import cn.nukkit.block.BlockSapling
import cn.nukkit.item.Item
import cn.nukkit.level.Level
import cn.nukkit.level.generator.object.tree.ObjectTree
import cn.nukkit.math.NukkitRandom
import com.nao20010128nao.Fiendish.PhpMethods
import com.nao20010128nao.Fiendish.Utils

/**
 * Created by nao on 2017/02/21.
 */
class LemiHellSapling extends BlockSapling{
    LemiHellSapling(int meta=0) {
        super(meta)
    }

    @Override
    boolean place(Item item, Block block, Block target, int face, double fx, double fy, double fz) {
        def down=getSide(SIDE_DOWN)
        if(down.id==GRASS|down.id==DIRT|down.id==FARMLAND){
            return level.setBlock(block,this,true,true)
        }
        return false
    }

    @Override
    boolean onActivate(Item item, Player player=null) {
        if(item.id==Item.DYE & item.damage==0x0f){  // bonemeal
            if(PhpMethods.mt_rand(0,5)!=2)// less chance of growing
                return false
            ObjectTree.growTree(level,x as int,y as int,z as int,new NukkitRandom(Utils.random.get().nextLong()),meta & 0x07)
            if((player.gamemode & 0x01)==0){
                item.count--
            }
            return true
        }else {// as Nukkit does
            this.level.loadChunk((int)x >> 4, (int)z >> 4);
            return false
        }
    }

    @Override
    int onUpdate(int type) {
        switch(type){
            case Level.BLOCK_UPDATE_NORMAL:
                if(getSide(SIDE_DOWN).transparent){
                    level.useBreakOn(this)
                    return Level.BLOCK_UPDATE_NORMAL
                }
                break
            case Level.BLOCK_UPDATE_RANDOM:
                if(PhpMethods.mt_rand(1,7)==1){
                    if((meta&0x08)==0x08){
                        if(PhpMethods.mt_rand(0,5)!=2)// less chance of growing
                            return Level.BLOCK_UPDATE_NORMAL
                        ObjectTree.growTree(level,x as int,y as int,z as int,new NukkitRandom(Utils.random.get().nextLong()),meta & 0x07)
                    }else{
                        meta|=0x08
                        level.setBlock(this,this,true)
                        return Level.BLOCK_UPDATE_RANDOM
                    }
                }else{
                    return Level.BLOCK_UPDATE_RANDOM
                }
                break
            default: return Level.BLOCK_UPDATE_NORMAL
        }
        return Level.BLOCK_UPDATE_NORMAL
    }
}
