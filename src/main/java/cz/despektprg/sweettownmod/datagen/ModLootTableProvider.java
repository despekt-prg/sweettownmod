package cz.despektprg.sweettownmod.datagen;

import cz.despektprg.sweettownmod.blocks.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {

    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.LICORICE_WOOD);
        addDrop(ModBlocks.LICORICE_WOOD_PLANKS);
        addDrop(ModBlocks.LICORICE_WOOD_LEAVES);
        addDrop(ModBlocks.CANDY_BLOCK);
        addDrop(ModBlocks.CANDY_BLOCK_POLISHED);
    }
}
