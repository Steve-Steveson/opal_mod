package net.steveson.opalbeauty.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.steveson.opalbeauty.BeautifulOpalMod;
import net.steveson.opalbeauty.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(BeautifulOpalMod.MOD_ID);


    public static final DeferredBlock<Block> OPAL_ORE = registerBlock("opal_ore",
            ()-> new Block(BlockBehaviour.Properties.ofLegacyCopy(Blocks.LAPIS_ORE)));
    public static final DeferredBlock<Block> DEEPSLATE_OPAL_ORE = registerBlock("deepslate_opal_ore",
            ()-> new Block(BlockBehaviour.Properties.ofLegacyCopy(Blocks.DEEPSLATE_LAPIS_ORE)));
    public static final DeferredBlock<Block> END_OPAL_ORE = registerBlock("end_opal_ore",
            ()-> new Block(BlockBehaviour.Properties.ofLegacyCopy(Blocks.DEEPSLATE_LAPIS_ORE)));

    public static final DeferredBlock<Block> OPAL_BLOCK = registerBlock("opal_block",
            ()-> new Block(BlockBehaviour.Properties.ofLegacyCopy(Blocks.LAPIS_BLOCK)));
    public static final DeferredBlock<StairBlock> OPAL_STAIRS = registerBlock("opal_stairs",
            ()-> new StairBlock( ModBlocks.OPAL_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofLegacyCopy(ModBlocks.OPAL_BLOCK.get())));
    public static final DeferredBlock<SlabBlock> OPAL_SLAB = registerBlock("opal_slab",
            ()-> new SlabBlock(BlockBehaviour.Properties.ofLegacyCopy(ModBlocks.OPAL_BLOCK.get())));


    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, ()-> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
