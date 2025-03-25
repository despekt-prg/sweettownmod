package cz.despektprg.sweettownmod.blocks;

import cz.despektprg.sweettownmod.SweetTownMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block LICORICE_WOOD = registerBlock("licorice_wood",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block LICORICE_WOOD_PLANKS = registerBlock("licorice_wood_planks",
            new Block(AbstractBlock.Settings.create().strength(2f)
                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block LICORICE_WOOD_LEAVES = registerBlock("licorice_wood_leaves",
            new Block(AbstractBlock.Settings.create().strength(0.5f)
                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block CANDY_BLOCK = registerBlock("candy_block",
            new Block(AbstractBlock.Settings.create().strength(1f)
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    public static final Block CANDY_BLOCK_POLISHED = registerBlock("candy_block_polished",
            new Block(AbstractBlock.Settings.create().strength(1f)
                    .sounds(BlockSoundGroup.AMETHYST_CLUSTER)));

    public static final Block LICORICE_WOOD_STAIRS = registerBlock("licorice_wood_stairs",
            new StairsBlock(ModBlocks.LICORICE_WOOD.getDefaultState(), AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD)));

    public static final Block CANDY_BLOCK_STAIRS = registerBlock("candy_stairs",
            new StairsBlock(ModBlocks.CANDY_BLOCK.getDefaultState(), AbstractBlock.Settings.create().strength(1f).sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block CANDY_BLOCK_SLAB = registerBlock("candy_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1f).sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    public static final Block LICORICE_WOOD_BUTTON = registerBlock("licorice_wood_button",
            new ButtonBlock( BlockSetType.OAK, 1 ,AbstractBlock.Settings.create().strength(2f).requiresTool().noCollision()));
    public static final Block LICORICE_WOOD_PRESSURE_PLATE = registerBlock("licorice_wood_pressure_plate",
            new PressurePlateBlock( BlockSetType.OAK, AbstractBlock.Settings.create().strength(2f).requiresTool()));

    public static final Block LICORICE_WOOD_FENCE = registerBlock("licorice_wood_fence",
            new FenceBlock( WoodType.OAK, AbstractBlock.Settings.create().strength(2f).requiresTool()) );
    public static final Block LICORICE_WOOD_FENCE_GATE = registerBlock("licorice_wood_fence_gate",
            new FenceGateBlock( AbstractBlock.Settings.create().strength(2f).requiresTool()));

    public static final Block LICORICE_WOOD_DOOR = registerBlock("licorice_wood_door",
            new DoorBlock( WoodType.OAK, AbstractBlock.Settings.create().strength(2f).requiresTool()) );
    public static final Block LICORICE_WOOD_TRAPDOOR = registerBlock("licorice_wood_trapdoor",
            new TrapdoorBlock( AbstractBlock.Settings.create().strength(2f).requiresTool()));

    public static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(SweetTownMod.MOD_ID, name), block);
    }

    public static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(SweetTownMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        SweetTownMod.LOGGER.info("Registering Mod blocks for " + SweetTownMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.LICORICE_WOOD);
            entries.add(ModBlocks.LICORICE_WOOD_PLANKS);
            entries.add(ModBlocks.CANDY_BLOCK);
            entries.add(ModBlocks.CANDY_BLOCK_POLISHED);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
            entries.add(ModBlocks.LICORICE_WOOD_LEAVES);
        });
         }
}
