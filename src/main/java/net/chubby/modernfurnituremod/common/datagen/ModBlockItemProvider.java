package net.chubby.modernfurnituremod.common.datagen;

import net.chubby.modernfurnituremod.ModernFurniture;
import net.chubby.modernfurnituremod.common.blocks.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockItemProvider extends BlockStateProvider {


    public ModBlockItemProvider(PackOutput output,  ExistingFileHelper exFileHelper) {
        super(output, ModernFurniture.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockItem(ModBlocks.ACACIA_SINGLE_DOOR_CABINET);
        blockItem(ModBlocks.CRIMSON_STEM_SINGLE_DOOR_CABINET);
        blockItem(ModBlocks.CHERRY_SINGLE_DOOR_CABINET);
        blockItem(ModBlocks.BIRCH_SINGLE_DOOR_CABINET);
        blockItem(ModBlocks.OAK_SINGLE_DOOR_CABINET);
        blockItem(ModBlocks.WARPED_STEM_SINGLE_DOOR_CABINET);
        blockItem(ModBlocks.MANGROVE_SINGLE_DOOR_CABINET);
        blockItem(ModBlocks.SPRUCE_SINGLE_DOOR_CABINET);
        blockItem(ModBlocks.ACACIA_DOUBLE_DOOR_CABINET);
        blockItem(ModBlocks.CRIMSON_STEM_DOUBLE_DOOR_CABINET);
        blockItem(ModBlocks.CHERRY_DOUBLE_DOOR_CABINET);
        blockItem(ModBlocks.BIRCH_DOUBLE_DOOR_CABINET);
        blockItem(ModBlocks.OAK_DOUBLE_DOOR_CABINET);
        blockItem(ModBlocks.WARPED_STEM_DOUBLE_DOOR_CABINET);
        blockItem(ModBlocks.DARK_OAK_DOUBLE_DOOR_CABINET);
        blockItem(ModBlocks.MANGROVE_DOUBLE_DOOR_CABINET);
        blockItem(ModBlocks.SPRUCE_DOUBLE_DOOR_CABINET);
        blockItem(ModBlocks.OAK_TABLE);
        blockItem(ModBlocks.SPRUCE_TABLE);
        blockItem(ModBlocks.BIRCH_TABLE);
        blockItem(ModBlocks.ACACIA_TABLE);
        blockItem(ModBlocks.DARK_OAK_TABLE);
        blockItem(ModBlocks.MANGROVE_TABLE);
        blockItem(ModBlocks.CRIMSON_STEM_TABLE);
        blockItem(ModBlocks.WARPED_STEM_TABLE);

        blockItem(ModBlocks.OAK_CHAIR);
    }

    private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile(ModernFurniture.MODID +
                ":block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }


}
