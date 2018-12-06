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

import java.util.List;
import java.util.HashMap;
import dazek.necplusultra.item.fluxitems.RFBattery;
import dazek.necplusultra.item.toolitems.CompressedPickaxe;
import dazek.necplusultra.item.fluxitems.EnergyDrink;
import java.util.ArrayList;

import net.minecraft.item.Item;

import static net.minecraft.item.Item.ToolMaterial.*;

public class NecItem {

  private static HashMap<String, Item> itemMap;

  // Add new items here
  public static void createItems(){
  	if (itemMap != null)
  		return;

  	itemMap = new HashMap<>();

  	// Compressed Pickaxes
  	itemMap.put("compressed_pickaxe_wood", new CompressedPickaxe(WOOD, "compressed_pickaxe_wood"));
  	itemMap.put("compressed_pickaxe_stone", new CompressedPickaxe(STONE, "compressed_pickaxe_stone"));
  	itemMap.put("compressed_pickaxe_iron", new CompressedPickaxe(IRON, "compressed_pickaxe_iron"));
  	itemMap.put("compressed_pickaxe_gold", new CompressedPickaxe(GOLD, "compressed_pickaxe_gold"));
  	itemMap.put("compressed_pickaxe_diamond", new CompressedPickaxe(DIAMOND, "compressed_pickaxe_diamond"));

  	// RF Items
  	itemMap.put("rf_battery", new RFBattery("rf_battery"));
  	itemMap.put("energy_drink", new EnergyDrink("energy_drink"));
  }

  // Relisting them here for ease of iterating
  public static HashMap<String, Item> getItemMap(){
  	if (itemMap == null) {
  		createItems();
  	}
  	//Returning
  	return itemMap;
  }

  public static List<Item> getItemList(){
    return new ArrayList<Item>(getItemMap().values());
  }
}
