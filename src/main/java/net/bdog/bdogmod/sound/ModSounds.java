package net.bdog.bdogmod.sound;

import net.bdog.bdogmod.BdogMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, BdogMod.MOD_ID);

    public static final RegistryObject<SoundEvent> STEEL_BLOCK_BREAK = registerSoundEvent("steel_block_break");
    public static final RegistryObject<SoundEvent> STEEL_BLOCK_WALK = registerSoundEvent("steel_block_walk");
    public static final RegistryObject<SoundEvent> STEEL_BLOCK_PLACE = registerSoundEvent("steel_block_place");
    public static final RegistryObject<SoundEvent> STEEL_BLOCK_HIT = registerSoundEvent("steel_block_hit");

    public static final ForgeSoundType STEEL_BLOCK_SOUNDS = new ForgeSoundType(1f, 1f, ModSounds.STEEL_BLOCK_BREAK
            , ModSounds.STEEL_BLOCK_WALK, ModSounds.STEEL_BLOCK_PLACE,
            ModSounds.STEEL_BLOCK_HIT, ModSounds.STEEL_BLOCK_BREAK);


    private static RegistryObject<SoundEvent> registerSoundEvent(String name) {
        ResourceLocation id = new ResourceLocation(BdogMod.MOD_ID, name);
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(id));
    }

    public static void register (IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }

}
