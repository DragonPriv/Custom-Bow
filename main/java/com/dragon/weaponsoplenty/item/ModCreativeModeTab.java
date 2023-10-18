package com.dragon.weaponsoplenty.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab WEAPONSOPLENTY_TAB = new CreativeModeTab("weaponsoplenty") {

        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.GREATSWORD_NETHERITE.get());
        }
    };
}
