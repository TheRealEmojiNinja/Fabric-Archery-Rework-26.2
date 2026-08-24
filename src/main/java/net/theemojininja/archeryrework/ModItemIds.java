package net.theemojininja.archeryrework;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BowItem;
import net.minecraft.world.item.Item;

public class ModItemIds
{

    public static final ResourceKey<Item> REINFORCED_STRING = create("reinforced_string");
    public static final ResourceKey<Item> REINFORCED_LEATHER = create("reinforced_leather");
    public static final ResourceKey<Item> STONE_BOW = create("stone_bow");

    // Helper method to create a resource key given its name
    public static ResourceKey<Item> create(String name)
    {
        return ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(ArcheryRework.MOD_ID, name));
    }
}
