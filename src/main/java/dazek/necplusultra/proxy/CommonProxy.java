/*
 * Copyright (C) 2018 Dazek Team
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package dazek.necplusultra.proxy;

import dazek.necplusultra.NecPlusConfig;
import dazek.necplusultra.block.NecBlock;
import dazek.necplusultra.block.TestBlock;
import dazek.necplusultra.item.CompressedPickaxe;
import dazek.necplusultra.item.NecItem;
import dazek.necplusultra.item.fluxitems.ItemEnergyDrink;
import dazek.necplusultra.item.fluxitems.ItemRFBattery;
import java.io.File;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import static net.minecraft.item.Item.ToolMaterial.*;

import net.minecraft.item.ItemBlock;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 *
 * @author Dazek Team
 */

@Mod.EventBusSubscriber
public class CommonProxy {
  public static Configuration config;

  public void preInit(FMLPreInitializationEvent e){
  	File directory = e.getModConfigurationDirectory();
  	config = new Configuration(new File(directory.getPath(), "necplusultra.cfg"));
  	NecPlusConfig.readConfig();

  }

  public void init(FMLInitializationEvent e){

  }

  public void postInit(FMLPostInitializationEvent e){
  	if (config.hasChanged()) {
  		config.save();
  	}
  }

  @SubscribeEvent
  public static void registerBlocks(RegistryEvent.Register<Block> event) {
  	for(Block b : NecBlock.getBlockList()) {
  		event.getRegistry().register(b);
  	}
  }

  @SubscribeEvent
  public static void registerItems(RegistryEvent.Register<Item> event) {
  	// Regular Items
  	for(Item i : NecItem.getItemList()) {
  		event.getRegistry().register(i);
  	}

  	// Item Blocks
  	for(ItemBlock i : NecBlock.getItemBlockList()) {
  		event.getRegistry().register(i);
  	}
  }
}
