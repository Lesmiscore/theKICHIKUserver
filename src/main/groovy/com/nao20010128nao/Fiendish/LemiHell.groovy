package com.nao20010128nao.Fiendish

import cn.nukkit.event.Listener
import cn.nukkit.plugin.PluginBase
import cn.nukkit.block.Block as blk
import com.nao20010128nao.Fiendish.blocks.LemiHellCoal
import com.nao20010128nao.Fiendish.blocks.LemiHellCoalOre
import com.nao20010128nao.Fiendish.blocks.LemiHellCobweb
import com.nao20010128nao.Fiendish.blocks.LemiHellDiamond
import com.nao20010128nao.Fiendish.blocks.LemiHellEmerald
import com.nao20010128nao.Fiendish.blocks.LemiHellEmeraldOre
import com.nao20010128nao.Fiendish.blocks.LemiHellGlass
import com.nao20010128nao.Fiendish.blocks.LemiHellGlassPane
import com.nao20010128nao.Fiendish.blocks.LemiHellGlowingRedstoneOre
import com.nao20010128nao.Fiendish.blocks.LemiHellGold
import com.nao20010128nao.Fiendish.blocks.LemiHellGoldOre
import com.nao20010128nao.Fiendish.blocks.LemiHellIron
import com.nao20010128nao.Fiendish.blocks.LemiHellIronOre
import com.nao20010128nao.Fiendish.blocks.LemiHellLapis
import com.nao20010128nao.Fiendish.blocks.LemiHellLapisOre
import com.nao20010128nao.Fiendish.blocks.LemiHellLeaves
import com.nao20010128nao.Fiendish.blocks.LemiHellLeaves2
import com.nao20010128nao.Fiendish.blocks.LemiHellMonsterSpawner
import com.nao20010128nao.Fiendish.blocks.LemiHellRedstoneOre
import com.nao20010128nao.Fiendish.blocks.LemiHellSapling

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

        // TODO: Overwrite fullList, to apply changes
        blk.list[blk.COAL_BLOCK]=LemiHellCoal.class
        blk.list[blk.COAL_ORE]=LemiHellCoalOre.class
        blk.list[blk.COBWEB]=LemiHellCobweb.class
        blk.list[blk.DIAMOND_BLOCK]=LemiHellDiamond.class
        blk.list[blk.EMERALD_BLOCK]=LemiHellEmerald.class
        blk.list[blk.EMERALD_ORE]=LemiHellEmeraldOre.class
        blk.list[blk.GLASS]=LemiHellGlass.class
        blk.list[blk.GLASS_PANE]=LemiHellGlassPane.class
        blk.list[blk.GLOWING_REDSTONE_ORE]=LemiHellGlowingRedstoneOre.class
        blk.list[blk.GOLD_BLOCK]=LemiHellGold.class
        blk.list[blk.GOLD_ORE]=LemiHellGoldOre.class
        blk.list[blk.IRON_BLOCK]=LemiHellIron.class
        blk.list[blk.IRON_ORE]=LemiHellIronOre.class
        blk.list[blk.LAPIS_BLOCK]=LemiHellLapis.class
        blk.list[blk.LAPIS_ORE]=LemiHellLapisOre.class
        blk.list[blk.LEAVES]=LemiHellLeaves.class
        blk.list[blk.LEAVES2]=LemiHellLeaves2.class
        blk.list[blk.MONSTER_SPAWNER]=LemiHellMonsterSpawner.class
        blk.list[blk.REDSTONE_ORE]=LemiHellRedstoneOre.class
        blk.list[blk.SAPLING]=LemiHellSapling.class
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
}
