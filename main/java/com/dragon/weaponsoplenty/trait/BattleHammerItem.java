package com.dragon.weaponsoplenty.trait;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class BattleHammerItem extends SwordItem {

    public BattleHammerItem(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, pProperties);
    }

    @Override
    public boolean hurtEnemy(ItemStack pStack, LivingEntity pTarget, LivingEntity pAttacker) {
        pTarget.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 200, 2));
        pTarget.knockback(2F, pAttacker.getX() - pTarget.getX(), pAttacker.getZ() - pTarget.getZ());
        return super.hurtEnemy(pStack, pTarget, pAttacker);
    }
}
