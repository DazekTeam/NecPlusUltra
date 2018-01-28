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

import dazek.necplusultra.item.CompressedPickaxe;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import static net.minecraft.item.Item.ToolMaterial.*;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 *
 * @author zekromaster
 */

@Mod.EventBusSubscriber
public class CommonProxy {
    public void preInit(FMLPreInitializationEvent e){
        
    }
    
    public void init(FMLInitializationEvent e){
        
    }
    
    public void postInit(FMLPostInitializationEvent e){
        
    }
    
    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
    }
    
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        
        // Compressed Pickaxes
        event.getRegistry().register(new CompressedPickaxe(WOOD, "compressed_pickaxe_wood"));
        event.getRegistry().register(new CompressedPickaxe(STONE, "compressed_pickaxe_stone"));
        event.getRegistry().register(new CompressedPickaxe(IRON, "compressed_pickaxe_iron"));
        event.getRegistry().register(new CompressedPickaxe(GOLD, "compressed_pickaxe_gold"));
        event.getRegistry().register(new CompressedPickaxe(DIAMOND, "compressed_pickaxe_diamond"));
    }
}
