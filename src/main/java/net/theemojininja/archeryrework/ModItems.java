package net.theemojininja.archeryrework;

import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;

import java.util.function.Function;

public class ModItems
{

    public static final Item REINFORCED_STRING = register(ModItemIds.REINFORCED_STRING, Item::new, new Item.Properties());
    public static final Item REINFORCED_LEATHER = register(ModItemIds.REINFORCED_LEATHER, Item::new, new Item.Properties());

    public static Item register(ResourceKey<Item> itemKey,
                                Function<Item.Properties, Item> itemFactory,
                                Item.Properties settings)
    {
        // Create new Item object
        Item item = itemFactory.apply(settings.setId(itemKey));

        // Register the Item object
        Registry.register(BuiltInRegistries.ITEM, itemKey, item);

        // Return Item object
        return item;
    }

    public static void initialize()
    {
        // Add item to creative menu
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.INGREDIENTS)
                .register((creativeTab) -> creativeTab.accept(ModItems.REINFORCED_STRING));
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.INGREDIENTS)
                .register((creativeTab) -> creativeTab.accept(ModItems.REINFORCED_LEATHER));
    }
}
