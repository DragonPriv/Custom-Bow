package com.dragon.weaponsoplenty.trait;

import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class FlamedSwordItem extends SwordItem {


    public FlamedSwordItem(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, pProperties);
    }



    @Override
    public boolean hurtEnemy(ItemStack pStack, LivingEntity pTarget, LivingEntity pAttacker) {
        pTarget.setSecondsOnFire(5);
        pTarget.knockback(1,pAttacker.getX()-pTarget.getX(),pAttacker.getZ()-pTarget.getZ());        return super.hurtEnemy(pStack, pTarget, pAttacker);
    }
}
