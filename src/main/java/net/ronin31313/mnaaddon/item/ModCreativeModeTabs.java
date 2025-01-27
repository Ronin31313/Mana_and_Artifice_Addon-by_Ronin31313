package net.ronin31313.mnaaddon.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.ronin31313.mnaaddon.MnaAddon;
import net.ronin31313.mnaaddon.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MnaAddon.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TEST_TAB = CREATIVE_MODE_TABS.register("test_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.TESTITEM.get()))
                    .title(Component.translatable("creativetab.test_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.TESTITEM.get());
                        output.accept(ModItems.NEW_TESTITEM.get());

                        output.accept(ModBlocks.TEST_BLOCK.get());
                        output.accept(ModBlocks.NEW_TEST_BLOCK.get());

                        output.accept(Items.ACACIA_BOAT);
                    })
                    .build());


    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
