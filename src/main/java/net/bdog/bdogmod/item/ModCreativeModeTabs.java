package net.bdog.bdogmod.item;

import net.bdog.bdogmod.BdogMod;
import net.bdog.bdogmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs
{
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
        DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BdogMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> BDOGMOD_TAB = CREATIVE_MODE_TABS.register("bdogmod_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.POLISHED_HAMADIUM.get()))
                    .title(Component.translatable("creativetab.bdogmod_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.FLAWED_HAMADIUM.get());
                        output.accept(ModItems.POLISHED_HAMADIUM.get());
                        output.accept(ModBlocks.STEEL_BLOCK.get());
                    })
                    .build());


    public static void register(IEventBus eventBus)
    {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
