package dazek.necplusultra.block;

import dazek.necplusultra.NecPlusUltra;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;


public class BlockDazekBase extends Block {
    public BlockDazekBase(String unlocalizedName, Material blockMaterialIn, MapColor blockMapColorIn) {
        super(blockMaterialIn, blockMapColorIn);
        this.setUnlocalizedName(NecPlusUltra.MODID + "." + unlocalizedName);
        this.setRegistryName(unlocalizedName);
        this.setCreativeTab(NecPlusUltra.necTab);

    }
}
