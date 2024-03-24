package net.camlink7.beekeepingmod.item.custom;

import net.minecraft.client.particle.SmokeParticle;
import net.minecraft.client.particle.TextureSheetParticle;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.chat.Component;
import net.minecraft.util.ParticleUtils;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.biome.AmbientParticleSettings;
import net.minecraft.world.level.block.BeehiveBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BeehiveBlockEntity;

public class BeeSmokerItem extends Item {
    public BeeSmokerItem(Properties properties){
        super(properties);
    }

    /*@Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        if (!level.isClientSide() && (hand == InteractionHand.MAIN_HAND || hand == InteractionHand.OFF_HAND)){
            player.sendSystemMessage(Component.literal("Used bee smoker"));
            player.getCooldowns().addCooldown(this, 20);
            player.experienceProgress += 1;
        }


        return super.use(level, player, hand);
    }*/

    @Override
    public InteractionResult useOn(UseOnContext useOnContext) {
        BlockPos positionClicked = useOnContext.getClickedPos();
        Player player = useOnContext.getPlayer();

        Block blockedUsedOn = useOnContext.getLevel().getBlockState(positionClicked).getBlock();

        // If used on a beehive
        if (blockedUsedOn instanceof BeehiveBlock){

            // Spawn smoke particles for the next x amount of seconds
            int numberOfParticles = 20;

            for (int i = 0; i < numberOfParticles; i++){
                useOnContext.getLevel().addParticle(ParticleTypes.SMOKE,
                        positionClicked.getX(), positionClicked.getY() + 1, positionClicked.getZ(),
                        0.2D, 0.2D, 0.2D);
            }

            player.getCooldowns().addCooldown(this, 20 * 5);
        }

        return super.useOn(useOnContext);
    }


}
