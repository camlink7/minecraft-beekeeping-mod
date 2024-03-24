package net.camlink7.beekeepingmod.item;

import net.camlink7.beekeepingmod.BeekeepingMod;
import net.camlink7.beekeepingmod.item.custom.BeeSmokerItem;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BeekeepingMod.MOD_ID);

    // Items
    public static final RegistryObject<Item> BEE_SMOKER = ITEMS.register("bee_smoker",
            () -> new BeeSmokerItem(new Item.Properties()
                    .tab(ModCreativeModeTab.BEEKEEPING_TAB)
                    .stacksTo(1)
                    .setNoRepair()));

    // Food
    public static final RegistryObject<Item> STICKY_BUN = ITEMS.register("sticky_bun",
            () -> new Item(new Item.Properties()
                    .tab(ModCreativeModeTab.BEEKEEPING_TAB)
                    .stacksTo(64)
                    .food(Foods.STICKY_BUN)));

    // Build Foods
    public static class Foods {
        public static final FoodProperties STICKY_BUN = new FoodProperties.Builder()
                .nutrition(6)
                .saturationMod(1f)
                .alwaysEat()
                .build();
    }

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
