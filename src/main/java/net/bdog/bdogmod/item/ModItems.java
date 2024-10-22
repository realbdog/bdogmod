package net.bdog.bdogmod.item;

import net.bdog.bdogmod.BdogMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BdogMod.MOD_ID);

    public static final RegistryObject<Item> FLAWED_HAMADIUM = ITEMS.register("flawed_hamadium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POLISHED_HAMADIUM = ITEMS.register("polished_hamadium",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
