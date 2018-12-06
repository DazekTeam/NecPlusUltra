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

import net.minecraft.block.Block;
import dazek.necplusultra.NecPlusUltra;
import net.minecraft.creativetab.CreativeTabs;

public interface IBlockDazek {
  public Block setUnlocalizedName(String unlocalizedName);
  public Block setRegistryName(String unlocalizedName);
  public Block setCreativeTab(CreativeTabs creativeTab);

  public default IBlockDazek init(String unlocalizedName){
    this.setUnlocalizedName(NecPlusUltra.MODID + "." + unlocalizedName);
    this.setRegistryName(unlocalizedName);
    this.setCreativeTab(NecPlusUltra.necTab);
    return this;
  }
}
