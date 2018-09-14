package dazek.necplusultra.block;

import dazek.necplusultra.NecPlusUltra;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class TestBlock extends BlockDazekBase {
    public TestBlock(String unlocalizedName) {
        super(unlocalizedName, Material.ROCK, MapColor.BLACK);
    }
}
