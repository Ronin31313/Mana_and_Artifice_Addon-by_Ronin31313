package net.ronin31313.mnaaddon.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.ronin31313.mnaaddon.MnaAddon;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MnaAddon.MOD_ID);

    public static final RegistryObject<Item> TESTITEM = ITEMS.register("testitem",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> NEW_TESTITEM = ITEMS.register("new_testitem",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
