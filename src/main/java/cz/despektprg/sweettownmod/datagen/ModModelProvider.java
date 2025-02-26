package cz.despektprg.sweettownmod.datagen;

import cz.despektprg.sweettownmod.blocks.ModBlocks;
import cz.despektprg.sweettownmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LICORICE_WOOD);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LICORICE_WOOD_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LICORICE_WOOD_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CANDY_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CANDY_BLOCK_POLISHED);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator)  {
        itemModelGenerator.register(ModItems.SPICE, Models.GENERATED);
        itemModelGenerator.register(ModItems.GINGERBREAD_MAN, Models.GENERATED);
        itemModelGenerator.register(ModItems.LICORICE_TREE_SAPLING, Models.GENERATED);
        itemModelGenerator.register(ModItems.CANDY, Models.GENERATED);
    }
}
