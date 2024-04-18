package net.chubby.modernfurnituremod.common.blocks;

import net.chubby.modernfurnituremod.ModernFurniture;
import net.chubby.modernfurnituremod.common.furnitures.*;
import net.chubby.modernfurnituremod.common.items.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, ModernFurniture.MODID);

    public static final RegistryObject<Block> OAK_CHAIR = registerBlock("oak_chair",
            ()->new BlockChair(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> COUCH = registerBlock("couch",
            ()->new BlockCouch(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> OAK_TABLE = registerBlock("oak_table", ()->new BlockStudyTable(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> SPRUCE_TABLE = registerBlock("spruce_table", ()->new BlockStudyTable(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS)));
    public static final RegistryObject<Block> BIRCH_TABLE = registerBlock("birch_table", ()->new BlockStudyTable(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS)));
    public static final RegistryObject<Block> ACACIA_TABLE = registerBlock("acacia_table", ()->new BlockStudyTable(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS)));
    public static final RegistryObject<Block> DARK_OAK_TABLE = registerBlock("dark_oak_table", ()->new BlockStudyTable(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS)));
    public static final RegistryObject<Block> MANGROVE_TABLE = registerBlock("mangrove_table", ()->new BlockStudyTable(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS)));
    public static final RegistryObject<Block> CRIMSON_STEM_TABLE = registerBlock("crimson_stem_table", ()->new BlockStudyTable(BlockBehaviour.Properties.copy(Blocks.CRIMSON_STEM)));
    public static final RegistryObject<Block> WARPED_STEM_TABLE = registerBlock("warped_stem_table", ()->new BlockStudyTable(BlockBehaviour.Properties.copy(Blocks.WARPED_STEM)));
    public static final RegistryObject<Block> OAK_SINGLE_DOOR_CABINET = registerBlock("oak_single_door_cabinet",()->new BlockSingleDoorCabinet(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> SPRUCE_SINGLE_DOOR_CABINET = registerBlock("spruce_single_door_cabinet",()->new BlockSingleDoorCabinet(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS)));
    public static final RegistryObject<Block> BIRCH_SINGLE_DOOR_CABINET = registerBlock("birch_single_door_cabinet",()->new BlockSingleDoorCabinet(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS)));
    public static final RegistryObject<Block> ACACIA_SINGLE_DOOR_CABINET = registerBlock("acacia_single_door_cabinet",()->new BlockSingleDoorCabinet(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS)));
    public static final RegistryObject<Block> DARK_OAK_SINGLE_DOOR_CABINET = registerBlock("dark_oak_single_door_cabinet",()->new BlockSingleDoorCabinet(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS)));
    public static final RegistryObject<Block> CRIMSON_STEM_SINGLE_DOOR_CABINET = registerBlock("crimson_stem_single_door_cabinet",()->new BlockSingleDoorCabinet(BlockBehaviour.Properties.copy(Blocks.CRIMSON_STEM)));
    public static final RegistryObject<Block> WARPED_STEM_SINGLE_DOOR_CABINET = registerBlock("warped_stem_single_door_cabinet",()->new BlockSingleDoorCabinet(BlockBehaviour.Properties.copy(Blocks.WARPED_STEM)));
    public static final RegistryObject<Block> MANGROVE_SINGLE_DOOR_CABINET = registerBlock("mangrove_single_door_cabinet",()->new BlockSingleDoorCabinet(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS)));
    public static final RegistryObject<Block> CHERRY_SINGLE_DOOR_CABINET = registerBlock("cherry_single_door_cabinet",()->new BlockSingleDoorCabinet(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS)));
    public static final RegistryObject<Block> OAK_DOUBLE_DOOR_CABINET = registerBlock("oak_double_door_cabinet",()->new BlockDoubleDoorCabinet(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> SPRUCE_DOUBLE_DOOR_CABINET = registerBlock("spruce_double_door_cabinet",()->new BlockDoubleDoorCabinet(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS)));
    public static final RegistryObject<Block> BIRCH_DOUBLE_DOOR_CABINET = registerBlock("birch_double_door_cabinet",()->new BlockDoubleDoorCabinet(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS)));
    public static final RegistryObject<Block> ACACIA_DOUBLE_DOOR_CABINET = registerBlock("acacia_double_door_cabinet",()->new BlockDoubleDoorCabinet(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS)));
    public static final RegistryObject<Block> DARK_OAK_DOUBLE_DOOR_CABINET = registerBlock("dark_oak_double_door_cabinet",()->new BlockDoubleDoorCabinet(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS)));
    public static final RegistryObject<Block> CRIMSON_STEM_DOUBLE_DOOR_CABINET = registerBlock("crimson_stem_double_door_cabinet",()->new BlockDoubleDoorCabinet(BlockBehaviour.Properties.copy(Blocks.CRIMSON_STEM)));
    public static final RegistryObject<Block> WARPED_STEM_DOUBLE_DOOR_CABINET = registerBlock("warped_stem_double_door_cabinet",()->new BlockDoubleDoorCabinet(BlockBehaviour.Properties.copy(Blocks.WARPED_STEM)));
    public static final RegistryObject<Block> MANGROVE_DOUBLE_DOOR_CABINET = registerBlock("mangrove_double_door_cabinet",()->new BlockDoubleDoorCabinet(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS)));
    public static final RegistryObject<Block> CHERRY_DOUBLE_DOOR_CABINET = registerBlock("cherry_double_door_cabinet",()->new BlockDoubleDoorCabinet(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }


    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
