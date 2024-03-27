package net.camlink7.beekeepingmod.block;

import net.camlink7.beekeepingmod.BeekeepingMod;
import net.camlink7.beekeepingmod.block.custom.LangstrothBeehiveBlock;
import net.camlink7.beekeepingmod.item.ModCreativeModeTab;
import net.camlink7.beekeepingmod.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, BeekeepingMod.MOD_ID);

    /* Blocks */
    /*public static final RegistryObject<LangstrothBeehiveBlock> LANGSTROTH_BLOCK = registerBlock("langstroth_beehive",
            () -> new LangstrothBeehiveBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(6f)), ModCreativeModeTab.BEEKEEPING_TAB);*/


    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
