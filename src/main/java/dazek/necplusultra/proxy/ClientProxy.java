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

import dazek.necplusultra.item.NecItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

/**
 *
 * @author zekromaster
 */

@Mod.EventBusSubscriber(Side.CLIENT)
public class ClientProxy extends CommonProxy {
    
    @Override
    public void preInit(FMLPreInitializationEvent e) {
        super.preInit(e);
    }

    @Override
    public void init(FMLInitializationEvent e) {
        super.init(e);
    }
    
     @Override
    public void postInit(FMLPostInitializationEvent e) {
        super.postInit(e);
    }
    
    private static void registerModel(Item i)
    {
            ModelResourceLocation location = new ModelResourceLocation(i.getRegistryName(),"inventory");
            ModelLoader.setCustomModelResourceLocation(i, 0, location );
            System.out.println("Registered model for " + i.getRegistryName() + ". It is in " + location);
    }
    
    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
        // Compressed Pickaxes
        registerModel(NecItem.WOODEN_COMPRESSED_PICKAXE);
        registerModel(NecItem.STONE_COMPRESSED_PICKAXE);
        registerModel(NecItem.IRON_COMPRESSED_PICKAXE);
        registerModel(NecItem.GOLD_COMPRESSED_PICKAXE);
        registerModel(NecItem.DIAMOND_COMPRESSED_PICKAXE);
    }
}
