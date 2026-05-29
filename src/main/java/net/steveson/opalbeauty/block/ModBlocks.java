package net.steveson.opalbeauty.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.steveson.opalbeauty.BeautifulOpalMod;
import net.steveson.opalbeauty.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, BeautifulOpalMod.MOD_ID);


    public static final RegistryObject<Block> OPAL_ORE = registerBlock("opal_ore",
            ()-> new Block(BlockBehaviour.Properties.copy(Blocks.LAPIS_ORE)));
    public static final RegistryObject<Block> DEEPSLATE_OPAL_ORE = registerBlock("deepslate_opal_ore",
            ()-> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_LAPIS_ORE)));
    public static final RegistryObject<Block> END_OPAL_ORE = registerBlock("end_opal_ore",
            ()-> new Block(BlockBehaviour.Properties.copy(Blocks.LAPIS_ORE)));

    public static final RegistryObject<Block> OPAL_BLOCK = registerBlock("opal_block",
            ()-> new Block(BlockBehaviour.Properties.copy(Blocks.LAPIS_BLOCK)));
    public static final RegistryObject<Block> OPAL_STAIRS = registerBlock("opal_stairs",
            ()-> new StairBlock(()-> ModBlocks.OPAL_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(ModBlocks.OPAL_BLOCK.get())));
    public static final RegistryObject<Block> OPAL_SLAB = registerBlock("opal_slab",
            ()-> new SlabBlock(BlockBehaviour.Properties.copy(ModBlocks.OPAL_BLOCK.get())));




    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, ()-> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
