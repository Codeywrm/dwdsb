package net.codewyrm.dwdsb.mixin;
import net.minecraft.client.gui.screen.ingame.ForgingScreen;
import net.minecraft.client.gui.screen.ingame.SmithingScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.SmithingScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;

import java.util.List;

@Mixin(SmithingScreen.class)
public abstract class SmithingScreenChanger extends ForgingScreen<SmithingScreenHandler> {
	@Unique
	private static final Identifier EMPTY_SLOT_UNREFINED_DISC_CORE = new Identifier("dwdsb:item/empty_slot_unrefined_disc_core");
	@Unique
	private static final Identifier EMPTY_SLOT_ANCIENT_WHISTLE = new Identifier("dwdsb:item/empty_slot_ancient_whistle");
	@Shadow @Final private static Identifier EMPTY_SLOT_SMITHING_TEMPLATE_ARMOR_TRIM_TEXTURE;
	@Shadow @Final private static Identifier EMPTY_SLOT_SMITHING_TEMPLATE_NETHERITE_UPGRADE_TEXTURE;
	@Shadow @Final private static final List<Identifier> EMPTY_SLOT_TEXTURES = List.of(
			EMPTY_SLOT_SMITHING_TEMPLATE_ARMOR_TRIM_TEXTURE,
			EMPTY_SLOT_SMITHING_TEMPLATE_NETHERITE_UPGRADE_TEXTURE,
			EMPTY_SLOT_UNREFINED_DISC_CORE,
			EMPTY_SLOT_ANCIENT_WHISTLE
	);

	public SmithingScreenChanger(SmithingScreenHandler handler, PlayerInventory playerInventory, Text title, Identifier texture) {
		super(handler, playerInventory, title, texture);
	}
}