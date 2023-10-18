package com.dragon.weaponsoplenty.api;

import com.dragon.weaponsoplenty.WeaponsOPlenty;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.RangedAttribute;

import java.util.UUID;



public class APIAttributes
{
    public static final Attribute ATTACK_REACH = new RangedAttribute("attribute." + WeaponsOPlenty.MOD_ID + ".attack_reach", 5.0d, 0.0d, 1024.0d);
    public static final UUID ATTACH_REACH_MODIFIER = UUID.fromString("7cc9a781-fdde-4e1b-85fe-acb912fc0430");
}
