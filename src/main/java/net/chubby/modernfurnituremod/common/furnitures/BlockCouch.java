package net.chubby.modernfurnituremod.common.furnitures;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import net.chubby.modernfurnituremod.common.util.FurnitureHorizontalBlock;
import net.chubby.modernfurnituremod.common.util.VoxelShapeHelper;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.ArrayList;
import java.util.List;

public class BlockCouch extends FurnitureHorizontalBlock {
    public final ImmutableMap<BlockState, VoxelShape> SHAPES;

    public BlockCouch(Properties properties) {
        super(properties);
        this.registerDefaultState(this.getStateDefinition().any().setValue(DIRECTION, Direction.NORTH));
        SHAPES = this.generateShapes(this.getStateDefinition().getPossibleStates());
    }

    private ImmutableMap<BlockState, VoxelShape> generateShapes(ImmutableList<BlockState> states)
    {
        final VoxelShape[] BASE_SEAT=VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(0,9,0,16,11,16),Direction.SOUTH));
        final VoxelShape[] RIGHT_LEG=VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(0,0,14,16,11,16),Direction.SOUTH));
        final VoxelShape[] LEFT_LEG=VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(0,0,1,16,11,2),Direction.SOUTH));
        final VoxelShape[] FRONT_LEG=VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(-2,0,0,0,11,16),Direction.SOUTH));
        final VoxelShape[] BACK_REST=VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(-15.99162, 7.01254, 0,17.99162, 23.01254, 16),Direction.SOUTH));

        ImmutableMap.Builder<BlockState, VoxelShape> builder = new ImmutableMap.Builder<>();
        for(BlockState state : states)
        {
            Direction direction = state.getValue(DIRECTION);
            List<VoxelShape> shapes = new ArrayList<>();
            shapes.add(BASE_SEAT[direction.get2DDataValue()]);
            shapes.add(BACK_REST[direction.get2DDataValue()]);
            shapes.add(LEFT_LEG[direction.get2DDataValue()]);
            shapes.add(FRONT_LEG[direction.get2DDataValue()]);
            shapes.add(RIGHT_LEG[direction.get2DDataValue()]);
            builder.put(state, VoxelShapeHelper.combineAll(shapes));
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
}
