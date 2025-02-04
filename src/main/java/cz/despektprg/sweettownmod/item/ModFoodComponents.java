package cz.despektprg.sweettownmod.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
    public static final FoodComponent GINGERBREAD_MAN = new FoodComponent.Builder().nutrition(4)
            .saturationModifier(0.2f).statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH), 0.05f).build();
}
