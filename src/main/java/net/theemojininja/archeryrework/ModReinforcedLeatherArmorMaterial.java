package net.theemojininja.archeryrework;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.EquipmentAsset;
import net.minecraft.world.item.equipment.EquipmentAssets;

import java.util.Map;

public class ModReinforcedLeatherArmorMaterial {
    public static final int BASE_DURABILITY = 12;
    public static final ResourceKey<EquipmentAsset> REINFORCED_LEATHER_ARMOR_MATERIAL_KEY = ResourceKey.create(EquipmentAssets.ROOT_ID, Identifier.fromNamespaceAndPath(ArcheryRework.MOD_ID, "reinforced_leather"));
    public static final TagKey<Item> REPAIRS_REINFORCED_LEATHER_ARMOR = TagKey.create(BuiltInRegistries.ITEM.key(), Identifier.fromNamespaceAndPath(ArcheryRework.MOD_ID, "repairs_reinforced_leather_armor"));

    public static final ArmorMaterial INSTANCE = new ArmorMaterial(
            BASE_DURABILITY,
            Map.of(
                    ArmorType.HELMET, 2,
                    ArmorType.CHESTPLATE, 5,
                    ArmorType.LEGGINGS, 4,
                    ArmorType.BOOTS, 1
            ),
            5,
            SoundEvents.ARMOR_EQUIP_CHAIN,
            0.0F,
            0.0F,
            REPAIRS_REINFORCED_LEATHER_ARMOR,
            REINFORCED_LEATHER_ARMOR_MATERIAL_KEY
    );
}
