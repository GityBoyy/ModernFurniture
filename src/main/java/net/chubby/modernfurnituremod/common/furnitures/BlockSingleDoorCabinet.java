package net.chubby.modernfurnituremod.common.furnitures;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import net.chubby.modernfurnituremod.common.furnitures.blockentities.containers.CabinetBlockEntity;
import net.chubby.modernfurnituremod.common.util.BasicLootBlockEntity;
import net.chubby.modernfurnituremod.common.util.FurnitureHorizontalBlock;
import net.chubby.modernfurnituremod.common.util.VoxelShapeHelper;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class BlockSingleDoorCabinet extends FurnitureHorizontalBlock implements EntityBlock {

    private ImmutableMap<BlockState,VoxelShape> SHAPES;
    public static BooleanProperty OPEN = BooleanProperty.create("open");
    public BlockSingleDoorCabinet(Properties properties) {
        super(properties);
        this.registerDefaultState(this.getStateDefinition().any().setValue(DIRECTION, Direction.NORTH).setValue(OPEN,false));
        SHAPES = this.generateShapes(this.getStateDefinition().getPossibleStates());
    }

    private ImmutableMap<BlockState, VoxelShape> generateShapes(ImmutableList<BlockState> states)
    {
        final VoxelShape[] WALL1 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(0,0,15,16,14,16),Direction.SOUTH));
        final VoxelShape[] WALL2 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(0,0,0,1,14,15),Direction.SOUTH));
        final VoxelShape[] WALL3 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(15,0,0,16,14,15),Direction.SOUTH));
        final VoxelShape[] WALL4 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(0,0,-1,16,14,0),Direction.SOUTH));
        final VoxelShape[] WALL5 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(1,0,0,15,1,15),Direction.SOUTH));
        final VoxelShape[] WALL6 = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(1,13,0,15,14,15),Direction.SOUTH));
        final VoxelShape[] DOOR_OPEN = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(15,0,15,16,14,31),Direction.SOUTH));
        ImmutableMap.Builder<BlockState, VoxelShape> builder = new ImmutableMap.Builder<>();
        for(BlockState state : states) {
            Direction direction = state.getValue(DIRECTION);
            List<VoxelShape> shapes = new ArrayList<>();
            if(state.getValue(OPEN)){
                shapes.add(DOOR_OPEN[direction.get2DDataValue()]);
                shapes.add(WALL2[direction.get2DDataValue()]);
                shapes.add(WALL3[direction.get2DDataValue()]);
                shapes.add(WALL4[direction.get2DDataValue()]);
                shapes.add(WALL5[direction.get2DDataValue()]);
                shapes.add(WALL6[direction.get2DDataValue()]);
            }
            else{
                shapes.add(WALL1[direction.get2DDataValue()]);
                shapes.add(WALL2[direction.get2DDataValue()]);
                shapes.add(WALL3[direction.get2DDataValue()]);
                shapes.add(WALL4[direction.get2DDataValue()]);
                shapes.add(WALL5[direction.get2DDataValue()]);
                shapes.add(WALL6[direction.get2DDataValue()]);
            }



            builder.put(state,VoxelShapeHelper.combineAll(shapes));
        }
        return builder.build();

    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter reader, BlockPos pos, CollisionContext context)
    {
        return SHAPES.get(state);
    }

    @Override
    public VoxelShape getOcclusionShape(BlockState state, BlockGetter reader, BlockPos pos)
    {
        return SHAPES.get(state);
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hitResult) {
        if(state.getValue(DIRECTION).getOpposite() == hitResult.getDirection())
        {
            if(!level.isClientSide()){
                if(level.getBlockEntity(pos) instanceof CabinetBlockEntity blockEntity)
                {
                    player.openMenu(blockEntity);
                }
            }
            return InteractionResult.SUCCESS;
        }
        return InteractionResult.PASS;


    }

    @Override
    public void animateTick(BlockState state, Level level, BlockPos pos, RandomSource random)
    {
        if(level.getBlockEntity(pos) instanceof BasicLootBlockEntity blockEntity)
        {
            blockEntity.updateOpenerCount();
        }
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder)
    {
        super.createBlockStateDefinition(builder);
        builder.add(OPEN);
    }


    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState) {
        return new CabinetBlockEntity(blockPos,blockState);
    }
}
