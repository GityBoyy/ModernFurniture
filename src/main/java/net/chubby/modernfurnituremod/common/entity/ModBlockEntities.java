package net.chubby.modernfurnituremod.common.entity;

import net.chubby.modernfurnituremod.ModernFurniture;
import net.chubby.modernfurnituremod.common.blocks.ModBlocks;
import net.chubby.modernfurnituremod.common.furnitures.blockentities.containers.CabinetBlockEntity;
import net.chubby.modernfurnituremod.common.furnitures.blockentities.containers.DoubleDoorCabinetBlockEntity;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, ModernFurniture.MODID);

    public static final RegistryObject<BlockEntityType<CabinetBlockEntity>> CABINET_BLOCK_ENTITY=
            ENTITIES.register("cabinet_be", () ->
                    BlockEntityType.Builder.of(CabinetBlockEntity::new,
                            ModBlocks.OAK_SINGLE_DOOR_CABINET.get()).build(null));
    public static final RegistryObject<BlockEntityType<DoubleDoorCabinetBlockEntity>> DB_CABINET_BLOCK_ENTITY=
            ENTITIES.register("db_cabinet_be", () ->
                    BlockEntityType.Builder.of(DoubleDoorCabinetBlockEntity::new,
                            new Block[]{ModBlocks.OAK_DOUBLE_DOOR_CABINET.get(),ModBlocks.MANGROVE_DOUBLE_DOOR_CABINET.get(),ModBlocks.CHERRY_DOUBLE_DOOR_CABINET.get(),ModBlocks.CRIMSON_STEM_DOUBLE_DOOR_CABINET.get()}).build(null));

    public static void register(IEventBus eventBus){
        ENTITIES.register(eventBus);
    }

}
