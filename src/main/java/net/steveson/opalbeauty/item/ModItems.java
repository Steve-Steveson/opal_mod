package net.steveson.opalbeauty.item;

import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.steveson.opalbeauty.BeautifulOpalMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BeautifulOpalMod.MOD_ID);


    public static final RegistryObject<Item> OPAL = ITEMS.register("opal",
            ()-> new Item(new Item.Properties()));

    public static final RegistryObject<Item> OPAL_SWORD = ITEMS.register("opal_sword",
            ()-> new SwordItem(ModToolTiers.OPAL, 5, -2.2f,  new Item.Properties()));
    public static final RegistryObject<Item> OPAL_PICKAXE = ITEMS.register("opal_pickaxe",
            ()-> new PickaxeItem(ModToolTiers.OPAL, 3, -2.5f,  new Item.Properties()));
    public static final RegistryObject<Item> OPAL_AXE = ITEMS.register("opal_axe",
            ()-> new AxeItem(ModToolTiers.OPAL, 5, -2.5f,  new Item.Properties()));
    public static final RegistryObject<Item> OPAL_SHOVEL = ITEMS.register("opal_shovel",
            ()-> new ShovelItem(ModToolTiers.OPAL, 3, -2.5f,  new Item.Properties()));
    public static final RegistryObject<Item> OPAL_HOE = ITEMS.register("opal_hoe",
            ()-> new HoeItem(ModToolTiers.OPAL, -3, 1f,  new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
