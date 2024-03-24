package net.camlink7.beekeepingmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab BEEKEEPING_TAB = new CreativeModeTab("beekeepingtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.BEE_SMOKER.get());
        }
    };
}
