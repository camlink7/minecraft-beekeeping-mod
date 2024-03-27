package net.camlink7.beekeepingmod.block.entity;

import net.camlink7.beekeepingmod.BeekeepingMod;
import net.camlink7.beekeepingmod.block.ModBlocks;
import net.minecraft.world.level.block.entity.BeehiveBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, BeekeepingMod.MOD_ID);

   /* public static final RegistryObject<BlockEntityType<LangstrothBeehiveBlockEntity>> LANGSTROTH_BEEHIVE_ENTITY =
                BLOCK_ENTITIES.register("langstroth_beehive_entity", () ->
                        BlockEntityType.Builder.of(LangstrothBeehiveBlockEntity::new,
                                ModBlocks.LANGSTROTH_BLOCK.get()).build(null));*/

    public static void register(IEventBus eventBus){
        BLOCK_ENTITIES.register(eventBus);
    }
}
