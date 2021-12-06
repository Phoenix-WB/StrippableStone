package com.phoenixwb.strippablestone;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod("strippablestone")
@Mod.EventBusSubscriber(modid = StrippableStone.MOD_ID, bus = Bus.MOD)
public class StrippableStone
{	
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "strippablestone";

    public StrippableStone() {
    	MinecraftForge.EVENT_BUS.register(this);
    }
}
