package net.chubby.modernfurnituremod.common.tabs;

import net.chubby.modernfurnituremod.ModernFurniture;
import net.chubby.modernfurnituremod.common.blocks.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ModernFurniture.MODID);

    public static final RegistryObject<CreativeModeTab> FURNITURE_TAB = CREATIVE_MODE_TABS.register("furniture_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.OAK_SINGLE_DOOR_CABINET.get()))
                    .title(Component.translatable("creativetab.furniture_tab"))
                    .displayItems((pParameters, pOutput) -> {
                       pOutput.accept(ModBlocks.OAK_SINGLE_DOOR_CABINET.get());
                       pOutput.accept(ModBlocks.ACACIA_SINGLE_DOOR_CABINET.get());
                       pOutput.accept(ModBlocks.BIRCH_SINGLE_DOOR_CABINET.get());
                       pOutput.accept(ModBlocks.CHERRY_SINGLE_DOOR_CABINET.get());
                       pOutput.accept(ModBlocks.MANGROVE_SINGLE_DOOR_CABINET.get());
                       pOutput.accept(ModBlocks.SPRUCE_SINGLE_DOOR_CABINET.get());
                       pOutput.accept(ModBlocks.DARK_OAK_SINGLE_DOOR_CABINET.get());
                       pOutput.accept(ModBlocks.CRIMSON_STEM_SINGLE_DOOR_CABINET.get());
                       pOutput.accept(ModBlocks.WARPED_STEM_SINGLE_DOOR_CABINET.get());

                       pOutput.accept(ModBlocks.OAK_DOUBLE_DOOR_CABINET.get());
                       pOutput.accept(ModBlocks.ACACIA_DOUBLE_DOOR_CABINET.get());
                       pOutput.accept(ModBlocks.BIRCH_DOUBLE_DOOR_CABINET.get());
                       pOutput.accept(ModBlocks.CHERRY_DOUBLE_DOOR_CABINET.get());
                       pOutput.accept(ModBlocks.MANGROVE_DOUBLE_DOOR_CABINET.get());
                       pOutput.accept(ModBlocks.DARK_OAK_DOUBLE_DOOR_CABINET.get());
                       pOutput.accept(ModBlocks.CRIMSON_STEM_DOUBLE_DOOR_CABINET.get());
                       pOutput.accept(ModBlocks.WARPED_STEM_DOUBLE_DOOR_CABINET.get());

                       pOutput.accept(ModBlocks.OAK_TABLE.get());
                       pOutput.accept(ModBlocks.ACACIA_TABLE.get());
                       pOutput.accept(ModBlocks.BIRCH_TABLE.get());
                       pOutput.accept(ModBlocks.MANGROVE_TABLE.get());
                       pOutput.accept(ModBlocks.SPRUCE_TABLE.get());
                       pOutput.accept(ModBlocks.DARK_OAK_TABLE.get());
                       pOutput.accept(ModBlocks.CRIMSON_STEM_TABLE.get());
                       pOutput.accept(ModBlocks.WARPED_STEM_TABLE.get());

                       pOutput.accept(ModBlocks.COUCH.get());
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
