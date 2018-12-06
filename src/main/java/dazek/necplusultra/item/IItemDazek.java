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

package dazek.necplusultra.item;

import net.minecraft.creativetab.CreativeTabs;
import dazek.necplusultra.NecPlusUltra;
import net.minecraft.item.Item;

public interface IItemDazek {

  public Item setUnlocalizedName(String unlocalizedName);
  public Item setCreativeTab(CreativeTabs creativeTab);
  public Item setRegistryName(String registryName);

  public default IItemDazek init(String unlocalizedName){
  	this.setUnlocalizedName(NecPlusUltra.MODID + "." + unlocalizedName);
  	this.setCreativeTab(NecPlusUltra.necTab);
  	this.setRegistryName(unlocalizedName);
    return this;
  }
}
