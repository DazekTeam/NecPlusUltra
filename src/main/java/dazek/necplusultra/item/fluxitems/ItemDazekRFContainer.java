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
package dazek.necplusultra.item.fluxitems;

import cofh.redstoneflux.impl.ItemEnergyContainer;
import dazek.necplusultra.NecPlusUltra;
import dazek.necplusultra.item.IDazekItem;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 *
 * @author Daem
 * 
 * Used to create items that use rf as durability
 */
public abstract class ItemDazekRFContainer extends ItemEnergyContainer implements IDazekItem{
    public ItemDazekRFContainer(int capacity, String unlocalizedName){
        super(capacity);
        
        this.setUnlocalizedName(NecPlusUltra.MODID + "." + unlocalizedName);
        this.setCreativeTab(NecPlusUltra.necTab);
        this.setRegistryName(unlocalizedName);
        this.setMaxStackSize(1);
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn){
        tooltip.add(getEnergyStored(stack) + "/" + getMaxEnergyStored(stack) + " RF");
    }
    
    @Override
    public double getDurabilityForDisplay(ItemStack stack){
        // I dunno why this needs a 1 -, but it works
        return 1 - (double)getEnergyStored(stack) / (double)getMaxEnergyStored(stack);
    }
    
    @Override
    public int getRGBDurabilityForDisplay(ItemStack stack){
        return 16711680; // FF0000
    }
    
    @Override
    public boolean showDurabilityBar(ItemStack stack){
        return true;
    }
}
