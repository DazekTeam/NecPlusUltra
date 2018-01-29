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
package dazek.necplusultra.item;

import dazek.necplusultra.item.fluxitems.ItemRFBattery;
import java.util.ArrayList;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 *
 * @author zekromaster
 */
public class NecItem {
    @GameRegistry.ObjectHolder("necplusultra:compressed_pickaxe_wood")
    public static CompressedPickaxe WOODEN_COMPRESSED_PICKAXE;
       
    @GameRegistry.ObjectHolder("necplusultra:compressed_pickaxe_stone")
    public static CompressedPickaxe STONE_COMPRESSED_PICKAXE;
    
    @GameRegistry.ObjectHolder("necplusultra:compressed_pickaxe_iron")
    public static CompressedPickaxe IRON_COMPRESSED_PICKAXE;
    
    @GameRegistry.ObjectHolder("necplusultra:compressed_pickaxe_gold")
    public static CompressedPickaxe GOLD_COMPRESSED_PICKAXE;
    
    @GameRegistry.ObjectHolder("necplusultra:compressed_pickaxe_diamond")
    public static CompressedPickaxe DIAMOND_COMPRESSED_PICKAXE;
    
    @GameRegistry.ObjectHolder("necplusultra:rf_battery")
    public static ItemRFBattery RF_BATTERY;

    // Relisting them here for ease of iterating
    public ArrayList<IDazekItem> getItemList(){
        ArrayList<IDazekItem> items = new ArrayList<>();
        
        //Compressed Pickaxes
        items.add(WOODEN_COMPRESSED_PICKAXE);
        items.add(STONE_COMPRESSED_PICKAXE);
        items.add(IRON_COMPRESSED_PICKAXE);
        items.add(GOLD_COMPRESSED_PICKAXE);
        items.add(DIAMOND_COMPRESSED_PICKAXE);
        items.add(RF_BATTERY);
        
        //Returning
        return items;
    }
    
    public void registerRecipes(){
        getItemList().forEach((i) -> {
            i.registerRecipeOfThis();
        });
    }
}
