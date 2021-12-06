package com.phoenixwb.strippablestone.common.events;

import com.phoenixwb.strippablestone.StrippableStone;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@EventBusSubscriber(modid = StrippableStone.MOD_ID, bus = Bus.FORGE)
public class PlayerEvents {
	@SubscribeEvent
	public static void handleStripping(PlayerInteractEvent.RightClickBlock event) {
		ItemStack pickaxe = event.getItemStack();
		Player player = event.getPlayer();
		BlockPos blockpos = event.getHitVec().getBlockPos();
		if (pickaxe.getItem() instanceof PickaxeItem) {
			BlockState clickedBlock = event.getWorld().getBlockState(blockpos);
			if (clickedBlock.getBlock() == Blocks.STONE) {
				event.getWorld().setBlockAndUpdate(blockpos, Blocks.COBBLESTONE.defaultBlockState());
				player.level.playSound(player, blockpos, SoundEvents.STONE_PLACE, SoundSource.BLOCKS, 1.0F, 1.0F);
				if (player != null) {
					pickaxe.hurtAndBreak(1, player, (p_150686_) -> {
						p_150686_.broadcastBreakEvent(event.getHand());
					});
				}
			}
			if (clickedBlock.getBlock() == Blocks.STONE_BRICKS) {
				event.getWorld().setBlockAndUpdate(blockpos, Blocks.STONE.defaultBlockState());
				player.level.playSound(player, blockpos, SoundEvents.STONE_PLACE, SoundSource.BLOCKS, 1.0F, 1.0F);
				if (player != null) {
					pickaxe.hurtAndBreak(1, player, (p_150686_) -> {
						p_150686_.broadcastBreakEvent(event.getHand());
					});
				}
			}
			if (clickedBlock.getBlock() == Blocks.POLISHED_GRANITE) {
				event.getWorld().setBlockAndUpdate(blockpos, Blocks.GRANITE.defaultBlockState());
				player.level.playSound(player, blockpos, SoundEvents.STONE_PLACE, SoundSource.BLOCKS, 1.0F, 1.0F);
				if (player != null) {
					pickaxe.hurtAndBreak(1, player, (p_150686_) -> {
						p_150686_.broadcastBreakEvent(event.getHand());
					});
				}
			}
			if (clickedBlock.getBlock() == Blocks.POLISHED_ANDESITE) {
				event.getWorld().setBlockAndUpdate(blockpos, Blocks.ANDESITE.defaultBlockState());
				player.level.playSound(player, blockpos, SoundEvents.STONE_PLACE, SoundSource.BLOCKS, 1.0F, 1.0F);
				if (player != null) {
					pickaxe.hurtAndBreak(1, player, (p_150686_) -> {
						p_150686_.broadcastBreakEvent(event.getHand());
					});
				}
			}
			if (clickedBlock.getBlock() == Blocks.POLISHED_DIORITE) {
				event.getWorld().setBlockAndUpdate(blockpos, Blocks.DIORITE.defaultBlockState());
				player.level.playSound(player, blockpos, SoundEvents.STONE_PLACE, SoundSource.BLOCKS, 1.0F, 1.0F);
				if (player != null) {
					pickaxe.hurtAndBreak(1, player, (p_150686_) -> {
						p_150686_.broadcastBreakEvent(event.getHand());
					});
				}
			}
			if (clickedBlock.getBlock() == Blocks.POLISHED_BASALT) {
				event.getWorld().setBlockAndUpdate(blockpos, Blocks.BASALT.defaultBlockState()
						.setValue(RotatedPillarBlock.AXIS, clickedBlock.getValue(RotatedPillarBlock.AXIS)));
				player.level.playSound(player, blockpos, SoundEvents.STONE_PLACE, SoundSource.BLOCKS, 1.0F, 1.0F);
				if (player != null) {
					pickaxe.hurtAndBreak(1, player, (p_150686_) -> {
						p_150686_.broadcastBreakEvent(event.getHand());
					});
				}
			}
			if (clickedBlock.getBlock() == Blocks.POLISHED_BLACKSTONE) {
				event.getWorld().setBlockAndUpdate(blockpos, Blocks.BLACKSTONE.defaultBlockState());
				player.level.playSound(player, blockpos, SoundEvents.STONE_PLACE, SoundSource.BLOCKS, 1.0F, 1.0F);
				if (player != null) {
					pickaxe.hurtAndBreak(1, player, (p_150686_) -> {
						p_150686_.broadcastBreakEvent(event.getHand());
					});
				}
			}
			if (clickedBlock.getBlock() == Blocks.POLISHED_DEEPSLATE) {
				event.getWorld().setBlockAndUpdate(blockpos, Blocks.DEEPSLATE.defaultBlockState());
				player.level.playSound(player, blockpos, SoundEvents.STONE_PLACE, SoundSource.BLOCKS, 1.0F, 1.0F);
				if (player != null) {
					pickaxe.hurtAndBreak(1, player, (p_150686_) -> {
						p_150686_.broadcastBreakEvent(event.getHand());
					});
				}
			}
			if (clickedBlock.getBlock() == Blocks.DEEPSLATE_BRICKS) {
				event.getWorld().setBlockAndUpdate(blockpos, Blocks.POLISHED_DEEPSLATE.defaultBlockState());
				player.level.playSound(player, blockpos, SoundEvents.STONE_PLACE, SoundSource.BLOCKS, 1.0F, 1.0F);
				if (player != null) {
					pickaxe.hurtAndBreak(1, player, (p_150686_) -> {
						p_150686_.broadcastBreakEvent(event.getHand());
					});
				}
			}
			if (clickedBlock.getBlock() == Blocks.POLISHED_BLACKSTONE_BRICKS) {
				event.getWorld().setBlockAndUpdate(blockpos, Blocks.POLISHED_BLACKSTONE.defaultBlockState());
				player.level.playSound(player, blockpos, SoundEvents.STONE_PLACE, SoundSource.BLOCKS, 1.0F, 1.0F);
				if (player != null) {
					pickaxe.hurtAndBreak(1, player, (p_150686_) -> {
						p_150686_.broadcastBreakEvent(event.getHand());
					});
				}
			}
			if (clickedBlock.getBlock() == Blocks.END_STONE_BRICKS) {
				event.getWorld().setBlockAndUpdate(blockpos, Blocks.END_STONE.defaultBlockState());
				player.level.playSound(player, blockpos, SoundEvents.STONE_PLACE, SoundSource.BLOCKS, 1.0F, 1.0F);
				if (player != null) {
					pickaxe.hurtAndBreak(1, player, (p_150686_) -> {
						p_150686_.broadcastBreakEvent(event.getHand());
					});
				}
			}
			if (clickedBlock.getBlock() == Blocks.QUARTZ_BRICKS) {
				event.getWorld().setBlockAndUpdate(blockpos, Blocks.QUARTZ_BLOCK.defaultBlockState());
				player.level.playSound(player, blockpos, SoundEvents.STONE_PLACE, SoundSource.BLOCKS, 1.0F, 1.0F);
				if (player != null) {
					pickaxe.hurtAndBreak(1, player, (p_150686_) -> {
						p_150686_.broadcastBreakEvent(event.getHand());
					});
				}
			}
		}
	}
}