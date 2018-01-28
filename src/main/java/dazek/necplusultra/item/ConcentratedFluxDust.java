/*
 * Copyright (C) 2018 Dazek
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

import dazek.necplusultra.NecPlusUltra;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import cofh.redstoneflux.impl.ItemEnergyContainer;
import dazek.necplusultra.NecPlusConfig;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 *
 * @author Daem
 */
public class ConcentratedFluxDust extends ItemEnergyContainer implements IDazekItem{

    public ConcentratedFluxDust(String unlocalizedName){
        super(NecPlusConfig.concentratedFluxMaxRF);
        
        this.setUnlocalizedName(NecPlusUltra.MODID + "." + unlocalizedName);
        this.setCreativeTab(NecPlusUltra.necTab);
        this.setRegistryName(unlocalizedName);
    }
    
    @Override
    public int receiveEnergy(ItemStack container, int maxReceive, boolean simulate) {
        return 0;
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn)
    {
        tooltip.add("RF " + getEnergyStored(stack) + "/" + getMaxEnergyStored(stack));
    }
    
    @Override
    public void registerRecipeOfThis() {
        // THIS SHOULDN'T HAVE RECIPES
    }
}
