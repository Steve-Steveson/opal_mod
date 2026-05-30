package net.steveson.opalbeauty.mixin;

import net.minecraft.core.Holder;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.armortrim.ArmorTrim;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.steveson.opalbeauty.item.ModArmorMaterials;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Map;

@Mixin(ArmorTrim.class)
public class TrimMaterialMixin {

    @Shadow
    private final Holder<TrimMaterial> material;

    public TrimMaterialMixin(Holder<TrimMaterial> material) {
        this.material = material;
    }

    @Inject(method = "getColorPaletteSuffix", at = @At(value = "HEAD"), cancellable = true)
    private void getColorPaletteSuffix(ArmorMaterial pArmorMaterial, CallbackInfoReturnable<String> cir) {
//        System.out.println("QQQQQQQQQQQQQQQQQQQQQQQQQQQQQQ");
        if (pArmorMaterial instanceof ModArmorMaterials) {
            String armorMatName = pArmorMaterial.getName();
            String[] armorMatNameSplit = armorMatName.split(":");

            String trimName = this.material.value().assetName();

            if (armorMatNameSplit.length == 2 && armorMatNameSplit[1].equalsIgnoreCase(trimName)) {
                cir.setReturnValue(trimName + "_darker");
            }
//            System.out.println("the armor is " + pArmorMaterial.getName());
//            System.out.println("the armor is " + ((ModArmorMaterials) pArmorMaterial).name());
////            System.out.println(this.material);
////            System.out.println(this.material.value());
//            System.out.println("the trim is " + this.material.value().assetName());
        }

    }
}
