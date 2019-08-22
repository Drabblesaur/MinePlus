package com.suzhiheng.mineplus;

import com.suzhiheng.mineplus.blocks.*;
import com.suzhiheng.mineplus.lists.ToolMaterialList;
import com.suzhiheng.mineplus.setup.*;
import com.suzhiheng.mineplus.items.*;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("mineplus")
public class MinePlus {

    public static IProxy proxy = DistExecutor.runForDist(() -> () -> new ClientProxy(), () -> () -> new ServerProxy());
    public static ModSetup setup = new ModSetup();
    private static final Logger LOGGER = LogManager.getLogger();

// CONSTRUCTOR
    public MinePlus() {
        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
    }

    private void setup(final FMLCommonSetupEvent event) {
       setup.init();
       proxy.init();
    }

    // You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
    // Event bus for receiving Registry Events)
    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> event) {
            // register a new block here
            //ORES
            event.getRegistry().register(new CopperOre());
            event.getRegistry().register(new TinOre());
            event.getRegistry().register(new PlatinumOre());
            event.getRegistry().register(new TitaniumOre());
            event.getRegistry().register(new AmethystOre());
            //BLOCKS
            event.getRegistry().register(new FirstBlock());
            event.getRegistry().register(new CopperBlock());
            event.getRegistry().register(new TinBlock());
            event.getRegistry().register(new BronzeBlock());
            event.getRegistry().register(new PlatinumBlock());
            event.getRegistry().register(new TitaniumBlock());
            event.getRegistry().register(new AmethystBlock());
        }
        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
            Item.Properties properties = new Item.Properties().group(setup.itemGroup);
            // register a new item here
            //ORES
            event.getRegistry().register(new BlockItem(ModBlocks.COPPER_ORE, properties).setRegistryName("copper_ore"));
            event.getRegistry().register(new BlockItem(ModBlocks.TIN_ORE, properties).setRegistryName("tin_ore"));
            event.getRegistry().register(new BlockItem(ModBlocks.PLATINUM_ORE, properties).setRegistryName("platinum_ore"));
            event.getRegistry().register(new BlockItem(ModBlocks.TITANIUM_ORE,properties).setRegistryName("titanium_ore"));
            event.getRegistry().register(new BlockItem(ModBlocks.AMETHYST_ORE, properties).setRegistryName("amethyst_ore"));
            //BLOCKS
            event.getRegistry().register(new BlockItem(ModBlocks.FIRSTBLOCK, properties).setRegistryName("firstblock"));
            event.getRegistry().register(new BlockItem(ModBlocks.COPPER_BLOCK, properties).setRegistryName("copper_block"));
            event.getRegistry().register(new BlockItem(ModBlocks.TIN_BLOCK, properties).setRegistryName("tin_block"));
            event.getRegistry().register(new BlockItem(ModBlocks.BRONZE_BLOCK, properties).setRegistryName("bronze_block"));
            event.getRegistry().register(new BlockItem(ModBlocks.PLATINUM_BLOCK, properties).setRegistryName("platinum_block"));
            event.getRegistry().register(new BlockItem(ModBlocks.TITANIUM_BLOCK,properties).setRegistryName("titanium_block"));
            event.getRegistry().register(new BlockItem(ModBlocks.AMETHYST_BLOCK, properties).setRegistryName("amethyst_block"));
            //INGOTS
            event.getRegistry().register(new CopperIngot());
            event.getRegistry().register(new TinIngot());
            event.getRegistry().register(new BronzeIngot());
            event.getRegistry().register(new PlatinumIngot());
            event.getRegistry().register(new TitaniumIngot());
            event.getRegistry().register(new Amethyst());
            //PICKAXES
            event.getRegistry().register(new CustomPickaxe(ToolMaterialList.TIN,1,-2.8F,properties).setRegistryName("tin_pickaxe"));
            event.getRegistry().register(new CustomPickaxe(ToolMaterialList.COPPER,1,-2.8F,properties).setRegistryName("copper_pickaxe"));
            event.getRegistry().register(new CustomPickaxe(ToolMaterialList.BRONZE,1,-2.8F,properties).setRegistryName("bronze_pickaxe"));
        }

    }
}
