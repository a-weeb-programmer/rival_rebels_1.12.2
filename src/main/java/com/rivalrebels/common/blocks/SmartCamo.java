package com.rivalrebels.common.blocks;

import com.rivalrebels.common.init.RRBlocks;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class SmartCamo extends RRBlock{
    public SmartCamo(String name, Material material) {
        super(name, material);
    }

    @Override
    public void onBlockAdded(World world, BlockPos pos, IBlockState state) {
        int x = pos.getX();
        int y = pos.getY();
        int z = pos.getZ();
        if (world.getBlockState(new BlockPos(pos.getX() + 1, pos.getY(), pos.getZ())) == Blocks.SNOW_LAYER.getDefaultState() || world.getBlockState(new BlockPos(pos.getX() - 1, pos.getY(), pos.getZ())) == Blocks.SNOW_LAYER.getDefaultState() || world.getBlockState(new BlockPos(pos.getX(), pos.getY(), pos.getZ() - 1)) == Blocks.SNOW_LAYER.getDefaultState() || world.getBlockState(new BlockPos(pos.getX(), pos.getY(), pos.getZ() + 1)) == Blocks.SNOW_LAYER.getDefaultState())
        {
            world.setBlockState(pos, RRBlocks.grey_camo.getDefaultState());
        }
        else
        {
            if (world.getBlockState(new BlockPos(x, y - 1, z)) == Blocks.GRASS.getDefaultState() || world.getBlockState(new BlockPos(x, y - 1, z)) == Blocks.DIRT.getDefaultState())
            {
                world.setBlockState(new BlockPos(x, y, z), RRBlocks.green_camo.getDefaultState());
            }
            else
            {
                if (world.getBlockState(new BlockPos(x, y - 1, z)) == Blocks.SAND.getDefaultState() || world.getBlockState(new BlockPos(x, y - 1, z)) == Blocks.SANDSTONE.getDefaultState())
                {
                    world.setBlockState(pos, RRBlocks.brown_camo.getDefaultState());
                }
                else
                {
                    if (world.getBlockState(new BlockPos(x, y - 1, z)) == Blocks.STONE.getDefaultState() || world.getBlockState(new BlockPos(x, y - 1, z)) == Blocks.GRAVEL.getDefaultState() || world.getBlockState(new BlockPos(x, y - 1, z)) == Blocks.BEDROCK.getDefaultState() || world.getBlockState(new BlockPos(x, y - 1, z)) == Blocks.COBBLESTONE.getDefaultState())
                    {
                        world.setBlockState(pos, RRBlocks.grey_camo.getDefaultState());
                    }
                    else
                    {
                        if (world.getBlockState(new BlockPos(x, y - 1, z)) == RRBlocks.brown_camo.getDefaultState() || world.getBlockState(new BlockPos(x + 1, y, z)) == RRBlocks.brown_camo.getDefaultState() || world.getBlockState(new BlockPos(x - 1, y, z)) == RRBlocks.brown_camo.getDefaultState() || world.getBlockState(new BlockPos(x, y, z + 1)) == RRBlocks.brown_camo.getDefaultState() || world.getBlockState(new BlockPos(x, y, z - 1)) == RRBlocks.brown_camo.getDefaultState() || world.getBlockState(new BlockPos(x, y + 1, z)) == RRBlocks.brown_camo.getDefaultState())
                        {
                            world.setBlockState(pos, RRBlocks.brown_camo.getDefaultState());
                        }
                        else
                        {
                            if (world.getBlockState(new BlockPos(x, y - 1, z)) == RRBlocks.grey_camo.getDefaultState() || world.getBlockState(new BlockPos(x + 1, y, z)) == RRBlocks.grey_camo.getDefaultState() || world.getBlockState(new BlockPos(x - 1, y, z)) == RRBlocks.grey_camo.getDefaultState() || world.getBlockState(new BlockPos(x, y, z + 1)) == RRBlocks.grey_camo.getDefaultState() || world.getBlockState(new BlockPos(x, y, z - 1)) == RRBlocks.grey_camo.getDefaultState() || world.getBlockState(new BlockPos(x, y + 1, z)) == RRBlocks.grey_camo.getDefaultState())
                            {
                                world.setBlockState(pos, RRBlocks.grey_camo.getDefaultState());
                            }
                            else
                            {
                                world.setBlockState(pos, RRBlocks.green_camo.getDefaultState());
                            }
                        }
                    }
                }
            }
        }
    }
}
