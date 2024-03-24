package net.camlink7.beekeepingmod.sound;

import net.camlink7.beekeepingmod.BeekeepingMod;
import net.minecraft.client.resources.sounds.Sound;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.resources.Resource;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, BeekeepingMod.MOD_ID);

    // Define sound registers here
    public static final RegistryObject<SoundEvent> BEE_SMOKER_PUFF_SOUND = registerSoundEvent("bee_smoker_puff_sound");

    private static RegistryObject<SoundEvent> registerSoundEvent(String name){
        ResourceLocation id = new ResourceLocation(BeekeepingMod.MOD_ID, name);
        return SOUND_EVENTS.register(name, () -> new SoundEvent(id));
    }

    public static void register(IEventBus eventBus){
        SOUND_EVENTS.register(eventBus);
    }
}
