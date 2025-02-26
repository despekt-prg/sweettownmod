package cz.despektprg.sweettownmod;

import cz.despektprg.sweettownmod.blocks.ModBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class SweetTownModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LICORICE_WOOD_LEAVES, RenderLayer.getCutout());
    }
}
