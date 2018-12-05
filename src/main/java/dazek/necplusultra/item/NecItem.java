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

import dazek.necplusultra.item.fluxitems.ItemEnergyDrink;
import dazek.necplusultra.item.fluxitems.ItemRFBattery;
import java.util.ArrayList;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import static net.minecraft.item.Item.ToolMaterial.*;

/**
 *
 * @author Dazek Team
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

  @GameRegistry.ObjectHolder("necplusultra:energy_drink")
  public static ItemEnergyDrink ENERGY_DRINK;

  private static ArrayList<Item> itemList;

  // Add new items here
  public static void createItems(){
  	if (itemList != null)
  		return;

  	itemList = new ArrayList<>();

  	// Compressed Pickaxes
  	itemList.add(new CompressedPickaxe(WOOD, "compressed_pickaxe_wood"));
  	itemList.add(new CompressedPickaxe(STONE, "compressed_pickaxe_stone"));
  	itemList.add(new CompressedPickaxe(IRON, "compressed_pickaxe_iron"));
  	itemList.add(new CompressedPickaxe(GOLD, "compressed_pickaxe_gold"));
  	itemList.add(new CompressedPickaxe(DIAMOND, "compressed_pickaxe_diamond"));

  	// RF Items
  	itemList.add(new ItemRFBattery("rf_battery"));
  	itemList.add(new ItemEnergyDrink("energy_drink"));

  }

  // Relisting them here for ease of iterating
  public static ArrayList<Item> getItemList(){
  	if (itemList == null) {
  		createItems();
  	}
  	//Returning
  	return itemList;
  }
}
