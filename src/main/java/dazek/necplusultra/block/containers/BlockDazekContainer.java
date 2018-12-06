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



package dazek.necplusultra.block.containers;

import dazek.necplusultra.block.IBlockDazek;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;


public abstract class BlockDazekContainer extends BlockContainer implements IBlockDazek {

  public BlockDazekContainer(String unlocalizedName, Material blockMaterialIn, MapColor blockMapColorIn){
      super(blockMaterialIn, blockMapColorIn);
      this.init(unlocalizedName);
      setTickRandomly(false);
  }

  @Override
  public boolean hasTileEntity(IBlockState state){
    return true;
  }
}
