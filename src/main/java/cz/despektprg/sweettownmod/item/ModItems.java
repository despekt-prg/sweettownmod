package cz.despektprg.sweettownmod.item;

import cz.despektprg.sweettownmod.SweetTownMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item GINGERBREAD_MAN = registerItem("gingerbread_man", new Item(new Item.Settings()));
    public static final Item SPICE = registerItem("spice", new Item(new Item.Settings()));
    public static final Item LICORICE_TREE_SAPLING = registerItem("licorice_tree_sapling", new Item(new Item.Settings()));

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(SweetTownMod.MOD_ID, name), item);

    }

    public static void registerModItems() {
        SweetTownMod.LOGGER.info("Registering items for " + SweetTownMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(GINGERBREAD_MAN);
            entries.add(SPICE);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
            entries.add(LICORICE_TREE_SAPLING);
        });
    }
}
