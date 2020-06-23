package com.wolfproductions.wolftweaks;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.wolfproductions.wolftweaks.ItemGroups.WolfsBlockItemGroup;
import com.wolfproductions.wolftweaks.init.BlockInitUpdated;
import com.wolfproductions.wolftweaks.init.ItemInitUpdated;
import com.wolfproductions.wolftweaks.objects.blocks.CustomObsidianBlock;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.IForgeRegistry;



@Mod("wolftweaks")
public class WolfsTweaks
{
	private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "wolftweaks";
    public static WolfsTweaks instance;

    public WolfsTweaks() {
    	final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::setup);
        modEventBus.addListener(this::doClientStuff);
        
        ItemInitUpdated.ITEMS.register(modEventBus);
        BlockInitUpdated.BLOCKS.register(modEventBus);
       
        instance = this;
        
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }
    
    @SubscribeEvent
    public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
    	final IForgeRegistry<Item> registry = event.getRegistry();
    	
    	BlockInitUpdated.BLOCKS.getEntries().stream()
    		.filter(block -> !(block.get() instanceof CustomObsidianBlock))
    		.map(RegistryObject::get).forEach(block -> {
    		final Item.Properties properties = new Item.Properties().group(WolfsBlockItemGroup.instance);
    		final BlockItem blockItem = new BlockItem(block, properties);
    		blockItem.setRegistryName(block.getRegistryName());
    		registry.register(blockItem);
    	});
    	
    	LOGGER.debug("Register BlockItems!");
    }

    private void setup(final FMLCommonSetupEvent event)
    {

    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        
    }

    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {

    }
    
}
