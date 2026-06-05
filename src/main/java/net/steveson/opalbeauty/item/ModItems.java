package net.steveson.opalbeauty.item;

import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.steveson.opalbeauty.BeautifulOpalMod;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(BeautifulOpalMod.MOD_ID);

    public static final DeferredItem<Item> OPAL = ITEMS.register("opal",
            ()-> new Item(new Item.Properties()));

    public static final DeferredItem<SwordItem> OPAL_SWORD = ITEMS.register("opal_sword",
            ()-> new SwordItem(ModToolTiers.OPAL, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.OPAL, 5, -2.2f))));
    public static final DeferredItem<PickaxeItem> OPAL_PICKAXE = ITEMS.register("opal_pickaxe",
            ()-> new PickaxeItem(ModToolTiers.OPAL, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.OPAL, 3, -2.5f))));
    public static final DeferredItem<AxeItem> OPAL_AXE = ITEMS.register("opal_axe",
            ()-> new AxeItem(ModToolTiers.OPAL, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.OPAL, 5, -2.5f))));
    public static final DeferredItem<ShovelItem> OPAL_SHOVEL = ITEMS.register("opal_shovel",
            ()-> new ShovelItem(ModToolTiers.OPAL, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.OPAL, 3, -2.5f))));
    public static final DeferredItem<HoeItem> OPAL_HOE = ITEMS.register("opal_hoe",
            ()-> new HoeItem(ModToolTiers.OPAL, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.OPAL, -3, 1f))));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
