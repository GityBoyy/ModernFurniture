package net.chubby.modernfurnituremod.common.furnitures.blockentities.containers;


import net.chubby.modernfurnituremod.common.entity.ModBlockEntities;
import net.chubby.modernfurnituremod.common.furnitures.BlockSingleDoorCabinet;
import net.chubby.modernfurnituremod.common.util.BasicLootBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ChestMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class CabinetBlockEntity extends BasicLootBlockEntity
{
    protected CabinetBlockEntity(BlockEntityType<?> type, BlockPos pos, BlockState state)
    {
        super(type, pos, state);
    }

    public CabinetBlockEntity(BlockPos pos, BlockState state)
    {
        super(ModBlockEntities.CABINET_BLOCK_ENTITY.get(), pos, state);
    }

    @Override
    public int getContainerSize()
    {
        return 27;
    }

    @Override
    protected Component getDefaultName()
    {
        return Component.translatable("container.modernfurniture.cabinet");
    }

    @Override
    protected AbstractContainerMenu createMenu(int windowId, Inventory playerInventory)
    {
        return new ChestMenu(MenuType.GENERIC_9x3, windowId, playerInventory, this, 3);
    }

    @Override
    public void onOpen(Level level, BlockPos pos, BlockState state)
    {
        this.setDoorState(state, true);
    }

    @Override
    public void onClose(Level level, BlockPos pos, BlockState state)
    {
        this.setDoorState(state, false);
    }

    private void setDoorState(BlockState state, boolean open)
    {
        Level level = this.getLevel();
        if(level != null)
        {
            level.setBlock(this.getBlockPos(), state.setValue(BlockSingleDoorCabinet.OPEN, open), 3);
        }
    }

}