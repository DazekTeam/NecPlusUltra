package com.dazek.necplusultra;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = NecPlusUltra.MODID, name = NecPlusUltra.NAME, version = NecPlusUltra.VERSION)
public class NecPlusUltra
{
    public static final String MODID = "necplusultra";
    public static final String NAME = "Nec Plus Ultra";
    public static final String VERSION = "0.0.1alpha0";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}
