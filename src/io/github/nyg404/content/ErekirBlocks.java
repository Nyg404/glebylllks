package io.github.nyg404.content;

import arc.graphics.Color;
import mindustry.content.Fx;
import mindustry.content.Items;
import mindustry.type.Category;
import mindustry.type.ItemStack;
import mindustry.world.Block;
import mindustry.world.blocks.defense.Wall;
import mindustry.world.meta.BuildVisibility;

public class ErekirBlocks {

    // === Старые бериллиевые стены (оставил без изменений) ===
    public static Block berylliumWallT1, berylliumWallT2, berylliumWallT3,
            berylliumWallT4, berylliumWallT5, berylliumWallT6;

    // === Новые вольфрамовые + карбидные стены (точно по твоему списку) ===
    public static Block
            reinforcedTungstenWallTir1,      // tir1
            hugeWallTungstenTir3,            // tir3 (ты писал два имени на тир2-3, взял это)
            greatWallTungstenTir2,           // tir2
            hugeReinforcedWallMadeTungstenTir4,
            giantWallTungstenTir5,
            giantReinforcedWallMadeTungstenTir6;
    public static Block
            reinforcedCarbideWallTie1,           // тир 1
            largeReinforcedCarbideWallTir2,      // тир 2
            hugeWallOfCarbideTir3,               // тир 3
            hugeReinforcedWallMadeCarbideTir4,   // тир 4
            giantWallCarbideTir5,                // тир 5
            giantReinforcedCarbideWallTir6;
    public static void load() {

        // ──────── Старые бериллиевые (не трогал) ────────
        berylliumWallT1 = new Wall("beryllium-wall-t1"){{
            requirements(Category.defense, BuildVisibility.shown,
                    ItemStack.with(Items.beryllium, 10, Items.tungsten, 2));
            size = 1;
            health = 630;
            buildTime = 10f;
        }};

        berylliumWallT2 = new Wall("beryllium-wall-t2"){{
            requirements(Category.defense, BuildVisibility.shown,
                    ItemStack.with(Items.beryllium, 30, Items.tungsten, 10));
            size = 2;
            health = 2294;
            buildTime = 28f;
        }};

        berylliumWallT3 = new Wall("beryllium-wall-t3"){{
            requirements(Category.defense, BuildVisibility.shown,
                    ItemStack.with(Items.beryllium, 54, Items.tungsten, 30));
            size = 3;
            health = 2900;
            buildTime = 30f;
        }};

        berylliumWallT4 = new Wall("beryllium-wall-t4"){{
            requirements(Category.defense, BuildVisibility.shown,
                    ItemStack.with(Items.beryllium, 90, Items.tungsten, 60));
            size = 3;
            health = 3500;
            buildTime = 36f;
        }};

        berylliumWallT5 = new Wall("beryllium-wall-t5"){{
            requirements(Category.defense, BuildVisibility.shown,
                    ItemStack.with(Items.beryllium, 140, Items.tungsten, 100));
            size = 4;
            health = 3900;
            buildTime = 40f;
        }};

        berylliumWallT6 = new Wall("beryllium-wall-t6"){{
            requirements(Category.defense, BuildVisibility.shown,
                    ItemStack.with(Items.beryllium, 200, Items.tungsten, 160));
            size = 4;
            health = 4100;
            buildTime = 49f;
        }};

        // ──────── Новые вольфрамовые + карбидные стены ────────
        reinforcedTungstenWallTir1 = new Wall("reinforced-tungsten-wall-tir1"){{
            requirements(Category.defense, BuildVisibility.shown,
                    ItemStack.with(Items.tungsten, 10, Items.carbide, 2));
            size = 1;
            health = 700;
            buildTime = 21f;  // 2,1 сек
        }};

        // тир2 и тир3 у тебя были перепутаны по названиям — оставил как ты написал
        greatWallTungstenTir2 = new Wall("great-wall-tungsten-tir2"){{
            requirements(Category.defense, BuildVisibility.shown,
                    ItemStack.with(Items.tungsten, 60, Items.carbide, 30));
            size = 2;
            health = 3100;
            buildTime = 40f;  // 4,0 сек
        }};

        hugeWallTungstenTir3 = new Wall("huge-wall-tungsten-tir3"){{
            requirements(Category.defense, BuildVisibility.shown,
                    ItemStack.with(Items.tungsten, 30, Items.carbide, 10));
            size = 3;
            health = 2500;
            buildTime = 35f;  // 3,5 сек
        }};

        hugeReinforcedWallMadeTungstenTir4 = new Wall("huge-reinforced-wall-made-tungsten-tir4"){{
            requirements(Category.defense, BuildVisibility.shown,
                    ItemStack.with(Items.tungsten, 80, Items.carbide, 60));
            size = 3;
            health = 3900;
            buildTime = 49f;  // 4,9 сек
        }};

        giantWallTungstenTir5 = new Wall("giant-wall-tungsten-tir5"){{
            requirements(Category.defense, BuildVisibility.shown,
                    ItemStack.with(Items.tungsten, 100, Items.carbide, 80));
            size = 4;
            health = 4300;
            buildTime = 54f;  // 5,4 сек
        }};

        giantReinforcedWallMadeTungstenTir6 = new Wall("giant-reinforced-wall-made-tungsten-tir6"){{
            requirements(Category.defense, BuildVisibility.shown,
                    ItemStack.with(Items.tungsten, 150, Items.carbide, 100));
            size = 4;
            health = 4900;
            buildTime = 60f;  // 6,0 сек
        }};
        // Тир 1 — укреплённая карбидовая стена
        reinforcedCarbideWallTie1 = new Wall("reinforced-carbide-wall-tie1"){{
            requirements(Category.defense, BuildVisibility.shown,
                    ItemStack.with(Items.carbide, 8, Items.surgeAlloy, 3));
            size = 1;
            health = 790;
            buildTime = 36f;
            lightningChance = 0.8f;
            lightningDamage = 22f;
            lightningLength = 17;
            lightningColor = Color.valueOf("fffc5e"); // ← жёлтый теперь
        }};

// Тир 2
        largeReinforcedCarbideWallTir2 = new Wall("large-reinforced-carbide-wall-tir2"){{
            requirements(Category.defense, BuildVisibility.shown,
                    ItemStack.with(Items.carbide, 19, Items.surgeAlloy, 9));
            size = 2;
            health = 2800;
            buildTime = 40f;
            lightningChance = 0.8f;
            lightningDamage = 28f;
            lightningLength = 20;
            lightningColor = Color.valueOf("fffc5e"); // жёлтый
        }};

// Тир 3
        hugeWallOfCarbideTir3 = new Wall("huge-wall-of-carbide-tir3"){{
            requirements(Category.defense, BuildVisibility.shown,
                    ItemStack.with(Items.carbide, 26, Items.surgeAlloy, 17));
            size = 3;
            health = 3090;
            buildTime = 49f;
            lightningChance = 0.8f;
            lightningDamage = 34f;
            lightningLength = 23;
            lightningColor = Color.valueOf("fffcff5e"); // жёлтый
        }};

// Тир 4
        hugeReinforcedWallMadeCarbideTir4 = new Wall("huge-reinforced-wall-made-carbide-tir4"){{
            requirements(Category.defense, BuildVisibility.shown,
                    ItemStack.with(Items.carbide, 35, Items.surgeAlloy, 20));
            size = 3;
            health = 4100;
            buildTime = 59f;
            lightningChance = 0.8f;
            lightningDamage = 40f;
            lightningLength = 26;
            lightningColor = Color.valueOf("fffc5e"); // жёлтый
        }};

// Тир 5
        giantWallCarbideTir5 = new Wall("giant-wall-carbide-tir5"){{
            requirements(Category.defense, BuildVisibility.shown,
                    ItemStack.with(Items.carbide, 40, Items.surgeAlloy, 34));
            size = 4;
            health = 4900;
            buildTime = 60f;
            lightningChance = 0.8f;
            lightningDamage = 46f;
            lightningLength = 28;
            lightningColor = Color.valueOf("fffc5e"); // жёлтый
        }};

// Тир 6
        giantReinforcedCarbideWallTir6 = new Wall("giant-reinforced-carbide-wall-tir6"){{
            requirements(Category.defense, BuildVisibility.shown,
                    ItemStack.with(Items.carbide, 61, Items.surgeAlloy, 40));
            size = 4;
            health = 5500;
            buildTime = 68f;
            lightningChance = 0.8f;
            lightningDamage = 52f;
            lightningLength = 30;
            lightningColor = Color.valueOf("fffc5e"); // жёлтый
        }};
    }
}