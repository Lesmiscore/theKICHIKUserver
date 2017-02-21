package com.nao20010128nao.Fiendish

import cn.nukkit.block.Block
import cn.nukkit.block.Block as blk
import cn.nukkit.block.BlockIce
import cn.nukkit.block.BlockLiquid
import cn.nukkit.event.EventHandler
import cn.nukkit.event.Listener
import cn.nukkit.event.block.BlockBreakEvent
import cn.nukkit.plugin.PluginBase
import com.nao20010128nao.Fiendish.blocks.*

// Use this name here used at the original plugin
class LemiHell extends PluginBase implements Listener{
    @Override
    void onEnable() {
        server.logger.info("Loading §o§4The §lKICHIKU §r§o§5server")
        dataFolder.mkdirs()
        server.pluginManager.registerEvents(this,this)

        if(""=="1"){// please make here true if you want.
            server.setPropertyString("motd","§o§4The §lKICHIKU §r§o§5server")
            server.setPropertyString("description","§o§4The §lKICHIKU §r§o§5server")
            server.setPropertyInt("spawn-protection",2)
            server.setPropertyInt("max-players",100)
        }

        initAllBlocks()
    }

    @Override
    void onDisable() {
    }

    void initAllBlocks(){
        blk.init()

        Map<Integer,Class<? extends Block>> override=[:]
        override[blk.COAL_BLOCK]=LemiHellCoal.class
        override[blk.COAL_ORE]=LemiHellCoalOre.class
        override[blk.COBWEB]=LemiHellCobweb.class
        override[blk.DIAMOND_BLOCK]=LemiHellDiamond.class
        override[blk.EMERALD_BLOCK]=LemiHellEmerald.class
        override[blk.EMERALD_ORE]=LemiHellEmeraldOre.class
        override[blk.GLASS]=LemiHellGlass.class
        override[blk.GLASS_PANE]=LemiHellGlassPane.class
        override[blk.GLOWING_REDSTONE_ORE]=LemiHellGlowingRedstoneOre.class
        override[blk.GOLD_BLOCK]=LemiHellGold.class
        override[blk.GOLD_ORE]=LemiHellGoldOre.class
        override[blk.IRON_BLOCK]=LemiHellIron.class
        override[blk.IRON_ORE]=LemiHellIronOre.class
        override[blk.LAPIS_BLOCK]=LemiHellLapis.class
        override[blk.LAPIS_ORE]=LemiHellLapisOre.class
        override[blk.LEAVES]=LemiHellLeaves.class
        override[blk.LEAVES2]=LemiHellLeaves2.class
        override[blk.MONSTER_SPAWNER]=LemiHellMonsterSpawner.class
        override[blk.REDSTONE_ORE]=LemiHellRedstoneOre.class
        override[blk.SAPLING]=LemiHellSapling.class

        // change all the blocks this plugin overrides
        override.entrySet().each {
            blk.list[it.key]=it.value
            def e = it.value.getDeclaredConstructor(Integer.TYPE)
            e.accessible=true
            0..15.each {d->
                blk.fullList[it.key<<4 | d]= e.newInstance(d)
            }
            def defaultBlock=it.value.newInstance()
            blk.solid[it.key] = defaultBlock.solid
            blk.transparent[it.key] = defaultBlock.transparent
            blk.hardness[it.key] = defaultBlock.hardness
            blk.light[it.key] = defaultBlock.lightLevel
            if(defaultBlock.solid) {
                if(defaultBlock.transparent) {
                    if(!(defaultBlock instanceof BlockLiquid) && !(defaultBlock instanceof BlockIce)) {
                        blk.lightFilter[it.key] = 1
                    } else {
                        blk.lightFilter[it.key] = 2
                    }
                } else {
                    blk.lightFilter[it.key] = 15
                }
            } else {
                blk.lightFilter[it.key] = 1
            }
        }

        /* original code:
        blk::$list[blk::COAL_BLOCK           ]=\nao20010128nao\blocks\Coal               ::class;
        blk::$list[blk::COAL_ORE             ]=\nao20010128nao\blocks\CoalOre            ::class;
        blk::$list[blk::COBWEB               ]=\nao20010128nao\blocks\CobWeb             ::class;
        blk::$list[blk::DIAMOND_BLOCK        ]=\nao20010128nao\blocks\Diamond            ::class;
        blk::$list[blk::EMERALD_BLOCK        ]=\nao20010128nao\blocks\Emerald            ::class;
        blk::$list[blk::EMERALD_ORE          ]=\nao20010128nao\blocks\EmeraldOre         ::class;
        blk::$list[blk::GLASS                ]=\nao20010128nao\blocks\Glass              ::class;
        blk::$list[blk::GLASS_PANE           ]=\nao20010128nao\blocks\GlassPane          ::class;
        blk::$list[blk::GLOWING_REDSTONE_ORE ]=\nao20010128nao\blocks\GlowingRedstoneOre ::class;
        blk::$list[blk::GOLD_BLOCK           ]=\nao20010128nao\blocks\Gold               ::class;
        blk::$list[blk::GOLD_ORE             ]=\nao20010128nao\blocks\GoldOre            ::class;
        blk::$list[blk::IRON_BLOCK           ]=\nao20010128nao\blocks\Iron               ::class;
        blk::$list[blk::IRON_ORE             ]=\nao20010128nao\blocks\IronOre            ::class;
        blk::$list[blk::LAPIS_BLOCK          ]=\nao20010128nao\blocks\Lapis              ::class;
        blk::$list[blk::LAPIS_ORE            ]=\nao20010128nao\blocks\LapisOre           ::class;
        blk::$list[blk::LEAVES               ]=\nao20010128nao\blocks\Leaves             ::class;
        blk::$list[blk::LEAVES2              ]=\nao20010128nao\blocks\Leaves2            ::class;
        blk::$list[blk::MONSTER_SPAWNER      ]=\nao20010128nao\blocks\MonsterSpawner     ::class;
        blk::$list[blk::REDSTONE_ORE         ]=\nao20010128nao\blocks\RedstoneOre        ::class;
        blk::$list[blk::SAPLING              ]=\nao20010128nao\blocks\Sapling            ::class;
        */
    }

    @EventHandler
    void onBlockBreak(BlockBreakEvent ev){
        ev.drops=Utils.intArrayArrayToItems(Block.get(ev.block.id,ev.block.damage).getDrops(ev.item))
    }
}
