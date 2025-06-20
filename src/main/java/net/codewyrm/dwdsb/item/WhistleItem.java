package net.codewyrm.dwdsb.item;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;

import java.util.Arrays;
import java.util.Random;

import static net.codewyrm.dwdsb.registry.ItemRegistry.*;
import static net.minecraft.item.Items.GOAT_HORN;

public class WhistleItem extends Item {
    private final SoundEvent JINGLE;
    private final Integer COOLDOWN;


    public WhistleItem(Settings settings, SoundEvent jingle, Integer cooldown) {
        super(settings);
        this.JINGLE = jingle;
        this.COOLDOWN = cooldown;
    }

    public ActionResult use(World world, PlayerEntity user, Hand hand) {
        world.playSoundFromEntity(user, user, JINGLE, SoundCategory.RECORDS, 2.0f, 1.0f);
        world.emitGameEvent(GameEvent.INSTRUMENT_PLAY, user.getPos(), GameEvent.Emitter.of(user));

        if (!world.isClient) {
            ServerWorld serverWorld = (ServerWorld) world;
            Random random = new Random();
            int NOTE_COUNT = random.nextInt(4);
            for (double i = 0; i < NOTE_COUNT + 4; i++) {
                serverWorld.spawnParticles(
                        ParticleTypes.NOTE,
                        user.getX() + (Math.random() - 0.5) * 2,
                        user.getY() + (Math.random() - 0.5) * 2 + 1,
                        user.getZ() + (Math.random() - 0.5) * 2,
                        1,
                        i / 10.0, 0, 0,
                        1.0
                );
            }
        }

        for (Item item : Arrays.asList(
                ANCIENT_WHISTLE,
                AMETHYST_WHISTLE,
                GOLD_WHISTLE,
                DIAMOND_WHISTLE,
                EMERALD_WHISTLE,
                GOAT_HORN
                ))
            user.getItemCooldownManager().set(new ItemStack(item), COOLDOWN * 20);

        return ActionResult.SUCCESS_SERVER;
    }
}