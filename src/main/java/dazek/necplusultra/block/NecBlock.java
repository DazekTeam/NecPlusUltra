package dazek.necplusultra.block;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.ArrayList;

public class NecBlock {

    @GameRegistry.ObjectHolder("necplusultra:test_block")
    public static TestBlock TEST_BLOCK; // TODO: ADD TEXTURE

    private static ArrayList<Block> blockList;
    private static ArrayList<ItemBlock> itemBlockList;

    // Add new blocks here
    public static void createBlocks(){
        if (blockList != null)
            return;

        blockList = new ArrayList<>();

        blockList.add(new TestBlock("test_block"));
    }

    public static ArrayList<Block> getBlockList(){
        if (blockList == null){
            createBlocks();
        }

        return blockList;
    }

    public static ArrayList<ItemBlock> getItemBlockList(){
        if (itemBlockList == null){
            itemBlockList = new ArrayList<>();

            for (Block b : getBlockList()){
                ItemBlock itemBlock = new ItemBlock(b);
                if (b.getRegistryName() != null)
                    itemBlock.setRegistryName(b.getRegistryName());

                itemBlockList.add(itemBlock);
            }
        }

        return itemBlockList;
    }
}
