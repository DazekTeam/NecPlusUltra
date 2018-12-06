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

import dazek.necplusultra.NecPlusConfig;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;

public class EnergyDrink extends ItemDazekRFContainer {

  public EnergyDrink(String unlocalizedName) {
  	super(NecPlusConfig.energyDrinkMaxRF, unlocalizedName);
  }


  @Override
  public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn){
  	ItemStack stack = playerIn.getHeldItem(handIn);

  	if (playerIn.canEat(false) && getFoodAmount(stack) > 0) {
  		playerIn.setActiveHand(handIn);
  		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, stack);
  	}else{
  		return new ActionResult<ItemStack>(EnumActionResult.FAIL, stack);
  	}
  }

  @Override
  public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase entityLiving){
  	if (entityLiving instanceof EntityPlayer) {
  		EntityPlayer player = (EntityPlayer)entityLiving;
  		player.getFoodStats().addStats(getFoodAmount(stack), getSaturationModifier(stack));
  		worldIn.playSound((EntityPlayer)null, player.posX, player.posY, player.posZ, SoundEvents.ENTITY_PLAYER_BURP, SoundCategory.PLAYERS, 0.5F, worldIn.rand.nextFloat() * 0.1F + 0.9F);
  		player.addStat(StatList.getObjectUseStats(this));

  		if (player instanceof EntityPlayerMP)
  		{
  			CriteriaTriggers.CONSUME_ITEM.trigger((EntityPlayerMP)player, stack);
  		}
  	}

  	stack.shrink(1);
  	return stack;
  }

  public double getEnergyRatio(ItemStack stack){
  	return (double)getEnergyStored(stack) / (double)getMaxEnergyStored(stack);
  }

  public int getFoodAmount(ItemStack stack){
  	return (int)((double)NecPlusConfig.energyDrinkMaxHunger * getEnergyRatio(stack));
  }

  public float getSaturationModifier(ItemStack stack){
  	return 2.4f * (float)getEnergyRatio(stack);
  }

  @Override
  public int getMaxItemUseDuration(ItemStack stack){
  	return 32;
  }

  @Override
  public EnumAction getItemUseAction(ItemStack stack){
  	return EnumAction.EAT;
  }

}
