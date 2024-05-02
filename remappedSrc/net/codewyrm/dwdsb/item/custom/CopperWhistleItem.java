package net.codewyrm.dwdsb.item.custom;

import net.minecraft.entity.player.ItemCooldownManager;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsage;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;
import java.util.stream.Stream;

import static net.codewyrm.dwdsb.registry.ModItems.*;

public class CopperWhistleItem extends Item {
    private final SoundEvent jingle;
    public CopperWhistleItem(Item.Settings settings, SoundEvent jingle) {
        super(settings);
        this.jingle = jingle;
    }
    @Override
    public UseAction getUseAction(ItemStack stack) {return UseAction.TOOT_HORN;}

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        world.playSoundFromEntity(null, user, this.jingle, SoundCategory.RECORDS, 3f, 1f);
        world.emitGameEvent(GameEvent.INSTRUMENT_PLAY, user.getPos(), GameEvent.Emitter.of(user));
        final var cooldownManager = user.getItemCooldownManager();
        Stream.of(
                ANCIENT_WHISTLE,
                AMETHYST_WHISTLE,
                GOLD_WHISTLE,
                DIAMOND_WHISTLE,
                EMERALD_WHISTLE
        ).forEach(modItem -> cooldownManager.set(modItem, 400));
        return ItemUsage.consumeHeldItem(world, user, hand);
    }
}