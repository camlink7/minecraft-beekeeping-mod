package net.camlink7.beekeepingmod.item.custom;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import org.jetbrains.annotations.Nullable;

public class BeeswaxItem extends Item {
    public BeeswaxItem(Properties properties){
        super(properties);
    }

    @Override
    public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
        return 2400; // 2400 ticks, 1.5 x coal, ~12 items
    }
}
