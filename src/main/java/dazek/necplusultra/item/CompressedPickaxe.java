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

import dazek.necplusultra.NecPlusConfig;
import dazek.necplusultra.NecPlusUltra;
import net.minecraft.item.ItemPickaxe;


/**
 *
 * @author zekromaster
 */
public class CompressedPickaxe extends ItemPickaxe implements IDazekItem {
    
    public CompressedPickaxe(ToolMaterial t, String unlocalizedName){
        super(t);
        this.setUnlocalizedName(NecPlusUltra.MODID + "." + unlocalizedName);
        this.setMaxDamage(t.getMaxUses() * NecPlusConfig.pickStrength);
        this.setCreativeTab(NecPlusUltra.necTab);
        this.setRegistryName(unlocalizedName);
    }
    
    @Override
    public void registerRecipeOfThis(){
        // RECIPES FOR THIS ONE ARE REGISTERED THROUGH JSON.
    }
}
