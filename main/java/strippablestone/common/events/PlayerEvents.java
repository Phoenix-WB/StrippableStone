package strippablestone.common.events;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import strippablestone.StrippableStone;

@EventBusSubscriber(modid = StrippableStone.MOD_ID, bus = Bus.FORGE)
public class PlayerEvents {
	@SubscribeEvent
	public static void handleStripping(PlayerInteractEvent.RightClickBlock event) {
		ItemStack pickaxe = event.getItemStack();
		PlayerEntity player = event.getPlayer();
		BlockPos blockpos = event.getHitVec().getBlockPos();
		if (pickaxe.getItem() instanceof PickaxeItem) {
			BlockState clickedBlock = event.getWorld().getBlockState(blockpos);
			if(clickedBlock.getBlock() == Blocks.STONE)
			{
				event.getWorld().setBlockAndUpdate(blockpos, Blocks.COBBLESTONE.defaultBlockState());
				player.level.playSound(player, blockpos, SoundEvents.STONE_PLACE, SoundCategory.BLOCKS, 1.0F, 1.0F);
				if (player != null) {
					pickaxe.hurtAndBreak(1, player, (p_150686_) -> {
						p_150686_.broadcastBreakEvent(event.getHand());
					});
				}
			}
			if(clickedBlock.getBlock() == Blocks.STONE_BRICKS)
			{
				event.getWorld().setBlockAndUpdate(blockpos, Blocks.STONE.defaultBlockState());
				player.level.playSound(player, blockpos, SoundEvents.STONE_PLACE, SoundCategory.BLOCKS, 1.0F, 1.0F);
				if (player != null) {
					pickaxe.hurtAndBreak(1, player, (p_150686_) -> {
						p_150686_.broadcastBreakEvent(event.getHand());
					});
				}
			}
			if(clickedBlock.getBlock() == Blocks.POLISHED_GRANITE)
			{
				event.getWorld().setBlockAndUpdate(blockpos, Blocks.GRANITE.defaultBlockState());
				player.level.playSound(player, blockpos, SoundEvents.STONE_PLACE, SoundCategory.BLOCKS, 1.0F, 1.0F);
				if (player != null) {
					pickaxe.hurtAndBreak(1, player, (p_150686_) -> {
						p_150686_.broadcastBreakEvent(event.getHand());
					});
				}
			}
			if(clickedBlock.getBlock() == Blocks.POLISHED_ANDESITE)
			{
				event.getWorld().setBlockAndUpdate(blockpos, Blocks.ANDESITE.defaultBlockState());
				player.level.playSound(player, blockpos, SoundEvents.STONE_PLACE, SoundCategory.BLOCKS, 1.0F, 1.0F);
				if (player != null) {
					pickaxe.hurtAndBreak(1, player, (p_150686_) -> {
						p_150686_.broadcastBreakEvent(event.getHand());
					});
				}
			}
			if(clickedBlock.getBlock() == Blocks.POLISHED_DIORITE)
			{
				event.getWorld().setBlockAndUpdate(blockpos, Blocks.DIORITE.defaultBlockState());
				player.level.playSound(player, blockpos, SoundEvents.STONE_PLACE, SoundCategory.BLOCKS, 1.0F, 1.0F);
				if (player != null) {
					pickaxe.hurtAndBreak(1, player, (p_150686_) -> {
						p_150686_.broadcastBreakEvent(event.getHand());
					});
				}
			}
		}
	}
}
