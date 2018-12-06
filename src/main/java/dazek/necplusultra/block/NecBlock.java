// Copyright (c) 2018 Dazek
//
// GNU GENERAL PUBLIC LICENSE
//    Version 3, 29 June 2007
//
// This program is free software: you can redistribute it and/or modify
// it under the terms of the GNU General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.
//
// You should have received a copy of the GNU General Public License
// along with this program.  If not, see <http://www.gnu.org/licenses/>.



package dazek.necplusultra.block;

import java.util.Map;
import java.util.HashMap;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.ArrayList;

import dazek.necplusultra.block.containers.HyperFurnace;

public class NecBlock {
  @GameRegistry.ObjectHolder("necplusultra:hyper_furnace")
  public static HyperFurnace HYPER_FURNACE;

  private static HashMap<String, Block> blockMap;
  private static HashMap<String, ItemBlock> itemBlockMap;

  // Add new blocks here
  public static void createBlocks(){
  	if (blockMap != null)
  		return;

  	blockMap = new HashMap<>();

  	blockMap.put("hyper_furnace", new HyperFurnace("hyper_furnace"));
  }

  public static HashMap<String, Block> getBlockMap(){
  	if (blockMap == null) {
  		createBlocks();
  	}

  	return blockMap;
  }

  public static HashMap<String, ItemBlock> getItemBlockMap(){
  	if (itemBlockMap == null) {
  		itemBlockMap = new HashMap<>();

  		for (Map.Entry<String, Block> e : getBlockMap().entrySet()) {
        String s = e.getKey();
        Block b = e.getValue();
  			ItemBlock itemBlock = new ItemBlock(b);
  			if (b.getRegistryName() != null)
  				itemBlock.setRegistryName(b.getRegistryName());

  			itemBlockMap.put(s, itemBlock);
  		}
  	}

  	return itemBlockMap;
  }

  public static ArrayList<Block> getBlockList(){
    return new ArrayList<>(getBlockMap().values());
  }

  public static ArrayList<ItemBlock> getItemBlockList(){
    return new ArrayList<>(getItemBlockMap().values());
  }
}
