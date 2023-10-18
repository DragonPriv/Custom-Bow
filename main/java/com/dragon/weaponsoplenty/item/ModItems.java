package com.dragon.weaponsoplenty.item;

import com.dragon.weaponsoplenty.WeaponsOPlenty;
import com.dragon.weaponsoplenty.trait.BattleHammerItem;
import com.dragon.weaponsoplenty.trait.FlamedSwordItem;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, WeaponsOPlenty.MOD_ID);

    //Craftables
    public static final RegistryObject<Item> HANDLE = ITEMS.register("handle",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.WEAPONSOPLENTY_TAB)));
    public static final RegistryObject<Item> EXPLOSIVE_CHARGE = ITEMS.register("explosive_charge",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.WEAPONSOPLENTY_TAB)));

    //Greatswords
    public static final RegistryObject<Item> GREATSWORD_WOOD = ITEMS.register("greatsword_wood",
            () -> new SwordItem(Tiers.WOOD, 2, 3f, new Item.Properties().tab(ModCreativeModeTab.WEAPONSOPLENTY_TAB)));
    public static final RegistryObject<Item> GREATSWORD_STONE = ITEMS.register("greatsword_stone",
            () -> new SwordItem(Tiers.STONE, 2, 3f, new Item.Properties().tab(ModCreativeModeTab.WEAPONSOPLENTY_TAB)));
    public static final RegistryObject<Item> GREATSWORD_IRON = ITEMS.register("greatsword_iron",
            () -> new SwordItem(Tiers.IRON, 2, 3f, new Item.Properties().tab(ModCreativeModeTab.WEAPONSOPLENTY_TAB)));
    public static final RegistryObject<Item> GREATSWORD_GOLD = ITEMS.register("greatsword_gold",
            () -> new SwordItem(Tiers.GOLD, 2, 3f, new Item.Properties().tab(ModCreativeModeTab.WEAPONSOPLENTY_TAB)));
    public static final RegistryObject<Item> GREATSWORD_DIAMOND = ITEMS.register("greatsword_diamond",
            () -> new SwordItem(Tiers.DIAMOND, 2, 3f, new Item.Properties().tab(ModCreativeModeTab.WEAPONSOPLENTY_TAB)));
    public static final RegistryObject<Item> GREATSWORD_NETHERITE = ITEMS.register("greatsword_netherite",
            () -> new FlamedSwordItem(Tiers.NETHERITE, 2, 3f, new Item.Properties().tab(ModCreativeModeTab.WEAPONSOPLENTY_TAB)));

    //Longswords
    public static final RegistryObject<Item> LONGSWORD_WOOD = ITEMS.register("longsword_wood",
            () -> new SwordItem(Tiers.WOOD, 2, 3f, new Item.Properties().tab(ModCreativeModeTab.WEAPONSOPLENTY_TAB)));
    public static final RegistryObject<Item> LONGSWORD_STONE = ITEMS.register("longsword_stone",
            () -> new SwordItem(Tiers.STONE, 2, 3f, new Item.Properties().tab(ModCreativeModeTab.WEAPONSOPLENTY_TAB)));
    public static final RegistryObject<Item> LONGSWORD_IRON = ITEMS.register("longsword_iron",
            () -> new SwordItem(Tiers.IRON, 2, 3f, new Item.Properties().tab(ModCreativeModeTab.WEAPONSOPLENTY_TAB)));
    public static final RegistryObject<Item> LONGSWORD_GOLD = ITEMS.register("longsword_gold",
            () -> new SwordItem(Tiers.GOLD, 2, 3f, new Item.Properties().tab(ModCreativeModeTab.WEAPONSOPLENTY_TAB)));
    public static final RegistryObject<Item> LONGSWORD_DIAMOND = ITEMS.register("longsword_diamond",
            () -> new SwordItem(Tiers.DIAMOND, 2, 3f, new Item.Properties().tab(ModCreativeModeTab.WEAPONSOPLENTY_TAB)));
    public static final RegistryObject<Item> LONGSWORD_NETHERITE = ITEMS.register("longsword_netherite",
            () -> new SwordItem(Tiers.NETHERITE, 2, 3f, new Item.Properties().tab(ModCreativeModeTab.WEAPONSOPLENTY_TAB)));

    //Katanas
    public static final RegistryObject<Item> KATANA_WOOD = ITEMS.register("katana_wood",
            () -> new SwordItem(Tiers.WOOD, 2, 3f, new Item.Properties().tab(ModCreativeModeTab.WEAPONSOPLENTY_TAB)));
    public static final RegistryObject<Item> KATANA_STONE = ITEMS.register("katana_stone",
            () -> new SwordItem(Tiers.STONE, 2, 3f, new Item.Properties().tab(ModCreativeModeTab.WEAPONSOPLENTY_TAB)));
    public static final RegistryObject<Item> KATANA_IRON = ITEMS.register("katana_iron",
            () -> new SwordItem(Tiers.IRON, 2, 3f, new Item.Properties().tab(ModCreativeModeTab.WEAPONSOPLENTY_TAB)));
    public static final RegistryObject<Item> KATANA_GOLD = ITEMS.register("katana_gold",
            () -> new SwordItem(Tiers.GOLD, 2, 3f, new Item.Properties().tab(ModCreativeModeTab.WEAPONSOPLENTY_TAB)));
    public static final RegistryObject<Item> KATANA_DIAMOND = ITEMS.register("katana_diamond",
            () -> new SwordItem(Tiers.DIAMOND, 2, 3f, new Item.Properties().tab(ModCreativeModeTab.WEAPONSOPLENTY_TAB)));
    public static final RegistryObject<Item> KATANA_NETHERITE = ITEMS.register("katana_netherite",
            () -> new SwordItem(Tiers.NETHERITE, 2, 3f, new Item.Properties().tab(ModCreativeModeTab.WEAPONSOPLENTY_TAB)));

    //Sabers
    public static final RegistryObject<Item> SABER_WOOD = ITEMS.register("saber_wood",
            () -> new SwordItem(Tiers.WOOD, 2, 3f, new Item.Properties().tab(ModCreativeModeTab.WEAPONSOPLENTY_TAB)));
    public static final RegistryObject<Item> SABER_STONE = ITEMS.register("saber_stone",
            () -> new SwordItem(Tiers.STONE, 2, 3f, new Item.Properties().tab(ModCreativeModeTab.WEAPONSOPLENTY_TAB)));
    public static final RegistryObject<Item> SABER_IRON = ITEMS.register("saber_iron",
            () -> new SwordItem(Tiers.IRON, 2, 3f, new Item.Properties().tab(ModCreativeModeTab.WEAPONSOPLENTY_TAB)));
    public static final RegistryObject<Item> SABER_GOLD = ITEMS.register("saber_gold",
            () -> new SwordItem(Tiers.GOLD, 2, 3f, new Item.Properties().tab(ModCreativeModeTab.WEAPONSOPLENTY_TAB)));
    public static final RegistryObject<Item> SABER_DIAMOND = ITEMS.register("saber_diamond",
            () -> new SwordItem(Tiers.DIAMOND, 2, 3f, new Item.Properties().tab(ModCreativeModeTab.WEAPONSOPLENTY_TAB)));
    public static final RegistryObject<Item> SABER_NETHERITE = ITEMS.register("saber_netherite",
            () -> new SwordItem(Tiers.NETHERITE, 2, 3f, new Item.Properties().tab(ModCreativeModeTab.WEAPONSOPLENTY_TAB)));

    //Rapiers
    public static final RegistryObject<Item> RAPIER_WOOD = ITEMS.register("rapier_wood",
            () -> new SwordItem(Tiers.WOOD, 2, 3f, new Item.Properties().tab(ModCreativeModeTab.WEAPONSOPLENTY_TAB)));
    public static final RegistryObject<Item> RAPIER_STONE = ITEMS.register("rapier_stone",
            () -> new SwordItem(Tiers.STONE, 2, 3f, new Item.Properties().tab(ModCreativeModeTab.WEAPONSOPLENTY_TAB)));
    public static final RegistryObject<Item> RAPIER_IRON = ITEMS.register("rapier_iron",
            () -> new SwordItem(Tiers.IRON, 2, 3f, new Item.Properties().tab(ModCreativeModeTab.WEAPONSOPLENTY_TAB)));
    public static final RegistryObject<Item> RAPIER_GOLD = ITEMS.register("rapier_gold",
            () -> new SwordItem(Tiers.GOLD, 2, 3f, new Item.Properties().tab(ModCreativeModeTab.WEAPONSOPLENTY_TAB)));
    public static final RegistryObject<Item> RAPIER_DIAMOND = ITEMS.register("rapier_diamond",
            () -> new SwordItem(Tiers.DIAMOND, 2, 3f, new Item.Properties().tab(ModCreativeModeTab.WEAPONSOPLENTY_TAB)));
    public static final RegistryObject<Item> RAPIER_NETHERITE = ITEMS.register("rapier_netherite",
            () -> new SwordItem(Tiers.NETHERITE, 2, 3f, new Item.Properties().tab(ModCreativeModeTab.WEAPONSOPLENTY_TAB)));

    //Quarterstaff
    public static final RegistryObject<Item> QUARTERSTAFF_WOOD = ITEMS.register("quarterstaff_wood",
            () -> new SwordItem(Tiers.WOOD, 2, 3f, new Item.Properties().tab(ModCreativeModeTab.WEAPONSOPLENTY_TAB)));
    public static final RegistryObject<Item> QUARTERSTAFF_STONE = ITEMS.register("quarterstaff_stone",
            () -> new SwordItem(Tiers.STONE, 2, 3f, new Item.Properties().tab(ModCreativeModeTab.WEAPONSOPLENTY_TAB)));
    public static final RegistryObject<Item> QUARTERSTAFF_IRON = ITEMS.register("quarterstaff_iron",
            () -> new SwordItem(Tiers.IRON, 2, 3f, new Item.Properties().tab(ModCreativeModeTab.WEAPONSOPLENTY_TAB)));
    public static final RegistryObject<Item> QUARTERSTAFF_GOLD = ITEMS.register("quarterstaff_gold",
            () -> new SwordItem(Tiers.GOLD, 2, 3f, new Item.Properties().tab(ModCreativeModeTab.WEAPONSOPLENTY_TAB)));
    public static final RegistryObject<Item> QUARTERSTAFF_DIAMOND = ITEMS.register("quarterstaff_diamond",
            () -> new SwordItem(Tiers.DIAMOND, 2, 3f, new Item.Properties().tab(ModCreativeModeTab.WEAPONSOPLENTY_TAB)));
    public static final RegistryObject<Item> QUARTERSTAFF_NETHERITE = ITEMS.register("quarterstaff_netherite",
            () -> new SwordItem(Tiers.NETHERITE, 2, 3f, new Item.Properties().tab(ModCreativeModeTab.WEAPONSOPLENTY_TAB)));

    //Clubs
    public static final RegistryObject<Item> CLUB_WOOD = ITEMS.register("club_wood",
            () -> new SwordItem(Tiers.WOOD, 2, 3f, new Item.Properties().tab(ModCreativeModeTab.WEAPONSOPLENTY_TAB)));
    public static final RegistryObject<Item> CLUB_STUDDED = ITEMS.register("club_studded",
            () -> new SwordItem(Tiers.IRON, 2, 3f, new Item.Properties().tab(ModCreativeModeTab.WEAPONSOPLENTY_TAB)));

    //Cestus
    public static final RegistryObject<Item> CESTUS = ITEMS.register("cestus",
            () -> new SwordItem(Tiers.WOOD, 2, 3f, new Item.Properties().tab(ModCreativeModeTab.WEAPONSOPLENTY_TAB)));
    public static final RegistryObject<Item> CESTUS_STUDDED = ITEMS.register("cestus_studded",
            () -> new SwordItem(Tiers.IRON, 2, 3f, new Item.Properties().tab(ModCreativeModeTab.WEAPONSOPLENTY_TAB)));

    //Lances
    public static final RegistryObject<Item> LANCE_WOOD = ITEMS.register("lance_wood",
            () -> new SwordItem(Tiers.WOOD, 2, 3f, new Item.Properties().tab(ModCreativeModeTab.WEAPONSOPLENTY_TAB)));
    public static final RegistryObject<Item> LANCE_STONE = ITEMS.register("lance_stone",
            () -> new SwordItem(Tiers.STONE, 2, 3f, new Item.Properties().tab(ModCreativeModeTab.WEAPONSOPLENTY_TAB)));
    public static final RegistryObject<Item> LANCE_IRON = ITEMS.register("lance_iron",
            () -> new SwordItem(Tiers.IRON, 2, 3f, new Item.Properties().tab(ModCreativeModeTab.WEAPONSOPLENTY_TAB)));
    public static final RegistryObject<Item> LANCE_GOLD = ITEMS.register("lance_gold",
            () -> new SwordItem(Tiers.GOLD, 2, 3f, new Item.Properties().tab(ModCreativeModeTab.WEAPONSOPLENTY_TAB)));
    public static final RegistryObject<Item> LANCE_DIAMOND = ITEMS.register("lance_diamond",
            () -> new SwordItem(Tiers.DIAMOND, 2, 3f, new Item.Properties().tab(ModCreativeModeTab.WEAPONSOPLENTY_TAB)));
    public static final RegistryObject<Item> LANCE_NETHERITE = ITEMS.register("lance_netherite",
            () -> new SwordItem(Tiers.NETHERITE, 2, 3f, new Item.Properties().tab(ModCreativeModeTab.WEAPONSOPLENTY_TAB)));

    //Pikes
    public static final RegistryObject<Item> PIKE_WOOD = ITEMS.register("pike_wood",
            () -> new SwordItem(Tiers.WOOD, 2, 3f, new Item.Properties().tab(ModCreativeModeTab.WEAPONSOPLENTY_TAB)));
    public static final RegistryObject<Item> PIKE_STONE = ITEMS.register("pike_stone",
            () -> new SwordItem(Tiers.STONE, 2, 3f, new Item.Properties().tab(ModCreativeModeTab.WEAPONSOPLENTY_TAB)));
    public static final RegistryObject<Item> PIKE_IRON = ITEMS.register("pike_iron",
            () -> new SwordItem(Tiers.IRON, 2, 3f, new Item.Properties().tab(ModCreativeModeTab.WEAPONSOPLENTY_TAB)));
    public static final RegistryObject<Item> PIKE_GOLD = ITEMS.register("pike_gold",
            () -> new SwordItem(Tiers.GOLD, 2, 3f, new Item.Properties().tab(ModCreativeModeTab.WEAPONSOPLENTY_TAB)));
    public static final RegistryObject<Item> PIKE_DIAMOND = ITEMS.register("pike_diamond",
            () -> new SwordItem(Tiers.DIAMOND, 2, 3f, new Item.Properties().tab(ModCreativeModeTab.WEAPONSOPLENTY_TAB)));
    public static final RegistryObject<Item> PIKE_NETHERITE = ITEMS.register("pike_netherite",
            () -> new SwordItem(Tiers.NETHERITE, 2, 3f, new Item.Properties().tab(ModCreativeModeTab.WEAPONSOPLENTY_TAB)));

    //Spears
    public static final RegistryObject<Item> SPEAR_WOOD = ITEMS.register("spear_wood",
            () -> new SwordItem(Tiers.WOOD, 2, 3f, new Item.Properties().tab(ModCreativeModeTab.WEAPONSOPLENTY_TAB)));
    public static final RegistryObject<Item> SPEAR_STONE = ITEMS.register("spear_stone",
            () -> new SwordItem(Tiers.STONE, 2, 3f, new Item.Properties().tab(ModCreativeModeTab.WEAPONSOPLENTY_TAB)));
    public static final RegistryObject<Item> SPEAR_IRON = ITEMS.register("spear_iron",
            () -> new SwordItem(Tiers.IRON, 2, 3f, new Item.Properties().tab(ModCreativeModeTab.WEAPONSOPLENTY_TAB)));
    public static final RegistryObject<Item> SPEAR_GOLD = ITEMS.register("spear_gold",
            () -> new SwordItem(Tiers.GOLD, 2, 3f, new Item.Properties().tab(ModCreativeModeTab.WEAPONSOPLENTY_TAB)));
    public static final RegistryObject<Item> SPEAR_DIAMOND = ITEMS.register("spear_diamond",
            () -> new SwordItem(Tiers.DIAMOND, 2, 3f, new Item.Properties().tab(ModCreativeModeTab.WEAPONSOPLENTY_TAB)));
    public static final RegistryObject<Item> SPEAR_NETHERITE = ITEMS.register("spear_netherite",
            () -> new SwordItem(Tiers.NETHERITE, 2, 3f, new Item.Properties().tab(ModCreativeModeTab.WEAPONSOPLENTY_TAB)));

    //Halberd
    public static final RegistryObject<Item> HALBERD_WOOD = ITEMS.register("halberd_wood",
            () -> new SwordItem(Tiers.WOOD, 2, 3f, new Item.Properties().tab(ModCreativeModeTab.WEAPONSOPLENTY_TAB)));
    public static final RegistryObject<Item> HALBERD_STONE = ITEMS.register("halberd_stone",
            () -> new SwordItem(Tiers.STONE, 2, 3f, new Item.Properties().tab(ModCreativeModeTab.WEAPONSOPLENTY_TAB)));
    public static final RegistryObject<Item> HALBERD_IRON = ITEMS.register("halberd_iron",
            () -> new SwordItem(Tiers.IRON, 2, 3f, new Item.Properties().tab(ModCreativeModeTab.WEAPONSOPLENTY_TAB)));
    public static final RegistryObject<Item> HALBERD_GOLD = ITEMS.register("halberd_gold",
            () -> new SwordItem(Tiers.GOLD, 2, 3f, new Item.Properties().tab(ModCreativeModeTab.WEAPONSOPLENTY_TAB)));
    public static final RegistryObject<Item> HALBERD_DIAMOND = ITEMS.register("halberd_diamond",
            () -> new SwordItem(Tiers.DIAMOND, 2, 3f, new Item.Properties().tab(ModCreativeModeTab.WEAPONSOPLENTY_TAB)));
    public static final RegistryObject<Item> HALBERD_NETHERITE = ITEMS.register("halberd_netherite",
            () -> new SwordItem(Tiers.NETHERITE, 2, 3f, new Item.Properties().tab(ModCreativeModeTab.WEAPONSOPLENTY_TAB)));

    //Warhammer
    public static final RegistryObject<Item> HAMMER_WOOD = ITEMS.register("hammer_wood",
            () -> new BattleHammerItem(Tiers.WOOD, 2, 3f, new Item.Properties().tab(ModCreativeModeTab.WEAPONSOPLENTY_TAB)));
    public static final RegistryObject<Item> HAMMER_STONE = ITEMS.register("hammer_stone",
            () -> new BattleHammerItem(Tiers.STONE, 2, 3f, new Item.Properties().tab(ModCreativeModeTab.WEAPONSOPLENTY_TAB)));
    public static final RegistryObject<Item> HAMMER_IRON = ITEMS.register("hammer_iron",
            () -> new BattleHammerItem(Tiers.IRON, 2, 3f, new Item.Properties().tab(ModCreativeModeTab.WEAPONSOPLENTY_TAB)));
    public static final RegistryObject<Item> HAMMER_GOLD = ITEMS.register("hammer_gold",
            () -> new BattleHammerItem(Tiers.GOLD, 2, 3f, new Item.Properties().tab(ModCreativeModeTab.WEAPONSOPLENTY_TAB)));
    public static final RegistryObject<Item> HAMMER_DIAMOND = ITEMS.register("hammer_diamond",
            () -> new BattleHammerItem(Tiers.DIAMOND, 2, 3f, new Item.Properties().tab(ModCreativeModeTab.WEAPONSOPLENTY_TAB)));
    public static final RegistryObject<Item> HAMMER_NETHERITE = ITEMS.register("hammer_netherite",
            () -> new BattleHammerItem(Tiers.NETHERITE, 2, 3f, new Item.Properties().tab(ModCreativeModeTab.WEAPONSOPLENTY_TAB)));

    //Battle Hammer
    public static final RegistryObject<Item> WARHAMMER_WOOD = ITEMS.register("warhammer_wood",
            () -> new SwordItem(Tiers.WOOD, 2, 3f, new Item.Properties().tab(ModCreativeModeTab.WEAPONSOPLENTY_TAB)));
    public static final RegistryObject<Item> WARHAMMER_STONE = ITEMS.register("warhammer_stone",
            () -> new SwordItem(Tiers.STONE, 2, 3f, new Item.Properties().tab(ModCreativeModeTab.WEAPONSOPLENTY_TAB)));
    public static final RegistryObject<Item> WARHAMMER_IRON = ITEMS.register("warhammer_iron",
            () -> new SwordItem(Tiers.IRON, 2, 3f, new Item.Properties().tab(ModCreativeModeTab.WEAPONSOPLENTY_TAB)));
    public static final RegistryObject<Item> WARHAMMER_GOLD = ITEMS.register("warhammer_gold",
            () -> new SwordItem(Tiers.GOLD, 2, 3f, new Item.Properties().tab(ModCreativeModeTab.WEAPONSOPLENTY_TAB)));
    public static final RegistryObject<Item> WARHAMMER_DIAMOND = ITEMS.register("warhammer_diamond",
            () -> new SwordItem(Tiers.DIAMOND, 2, 3f, new Item.Properties().tab(ModCreativeModeTab.WEAPONSOPLENTY_TAB)));
    public static final RegistryObject<Item> WARHAMMER_NETHERITE = ITEMS.register("warhammer_netherite",
            () -> new SwordItem(Tiers.NETHERITE, 2, 3f, new Item.Properties().tab(ModCreativeModeTab.WEAPONSOPLENTY_TAB)));

    //Glaive
    public static final RegistryObject<Item> GLAIVE_WOOD = ITEMS.register("glaive_wood",
            () -> new SwordItem(Tiers.WOOD, 2, 3f, new Item.Properties().tab(ModCreativeModeTab.WEAPONSOPLENTY_TAB)));
    public static final RegistryObject<Item> GLAIVE_STONE = ITEMS.register("glaive_stone",
            () -> new SwordItem(Tiers.STONE, 2, 3f, new Item.Properties().tab(ModCreativeModeTab.WEAPONSOPLENTY_TAB)));
    public static final RegistryObject<Item> GLAIVE_IRON = ITEMS.register("glaive_iron",
            () -> new SwordItem(Tiers.IRON, 2, 3f, new Item.Properties().tab(ModCreativeModeTab.WEAPONSOPLENTY_TAB)));
    public static final RegistryObject<Item> GLAIVE_GOLD = ITEMS.register("glaive_gold",
            () -> new SwordItem(Tiers.GOLD, 2, 3f, new Item.Properties().tab(ModCreativeModeTab.WEAPONSOPLENTY_TAB)));
    public static final RegistryObject<Item> GLAIVE_DIAMOND = ITEMS.register("glaive_diamond",
            () -> new SwordItem(Tiers.DIAMOND, 2, 3f, new Item.Properties().tab(ModCreativeModeTab.WEAPONSOPLENTY_TAB)));
    public static final RegistryObject<Item> GLAIVE_NETHERITE = ITEMS.register("glaive_netherite",
            () -> new SwordItem(Tiers.NETHERITE, 2, 3f, new Item.Properties().tab(ModCreativeModeTab.WEAPONSOPLENTY_TAB)));

    //Battleaxe
    public static final RegistryObject<Item> BATTLEAXE_WOOD = ITEMS.register("battleaxe_wood",
            () -> new SwordItem(Tiers.WOOD, 2, 3f, new Item.Properties().tab(ModCreativeModeTab.WEAPONSOPLENTY_TAB)));
    public static final RegistryObject<Item> BATTLEAXE_STONE = ITEMS.register("battleaxe_stone",
            () -> new SwordItem(Tiers.STONE, 2, 3f, new Item.Properties().tab(ModCreativeModeTab.WEAPONSOPLENTY_TAB)));
    public static final RegistryObject<Item> BATTLEAXE_IRON = ITEMS.register("battleaxe_iron",
            () -> new SwordItem(Tiers.IRON, 2, 3f, new Item.Properties().tab(ModCreativeModeTab.WEAPONSOPLENTY_TAB)));
    public static final RegistryObject<Item> BATTLEAXE_GOLD = ITEMS.register("battleaxe_gold",
            () -> new SwordItem(Tiers.GOLD, 2, 3f, new Item.Properties().tab(ModCreativeModeTab.WEAPONSOPLENTY_TAB)));
    public static final RegistryObject<Item> BATTLEAXE_DIAMOND = ITEMS.register("battleaxe_diamond",
            () -> new SwordItem(Tiers.DIAMOND, 2, 3f, new Item.Properties().tab(ModCreativeModeTab.WEAPONSOPLENTY_TAB)));
    public static final RegistryObject<Item> BATTLEAXE_NETHERITE = ITEMS.register("battleaxe_netherite",
            () -> new SwordItem(Tiers.NETHERITE, 2, 3f, new Item.Properties().tab(ModCreativeModeTab.WEAPONSOPLENTY_TAB)));

    //Longbow
    public static final RegistryObject<Item> LONGBOW_WOOD = ITEMS.register("longbow_wood",
            () -> new BowItem(new Item.Properties().tab(ModCreativeModeTab.WEAPONSOPLENTY_TAB).durability(500)));
    public static final RegistryObject<Item> LONGBOW_IRON = ITEMS.register("longbow_iron",
            () -> new BowItem(new Item.Properties().tab(ModCreativeModeTab.WEAPONSOPLENTY_TAB).durability(450)));

    //Crossbow
    public static final RegistryObject<Item> HEAVY_CROSSBOW_IRON = ITEMS.register("heavy_crossbow_iron",
            () -> new CrossbowItem(new Item.Properties().tab(ModCreativeModeTab.WEAPONSOPLENTY_TAB).durability(500)));
@SuppressWarnings("unused")
    public static void  register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}
