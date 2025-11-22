package io.github.nyg404.content;

import mindustry.content.Items;
import mindustry.type.Category;
import mindustry.type.ItemStack;
import mindustry.world.Block;
import mindustry.world.blocks.defense.Wall;
import mindustry.world.meta.BuildVisibility;
// Я такой крутой, писал секунды в тиках.... 4.9 Тиков))
public class ErekirBlocks {
    public static Block berylliumWallT1, berylliumWallT2, berylliumWallT3, berylliumWallT4, berylliumWallT5, berylliumWallT6;

    public static void load(){

        berylliumWallT1 = new Wall("beryllium-wall-t1"){{
            requirements(Category.defense, BuildVisibility.shown,
                    ItemStack.with(Items.beryllium, 10, Items.tungsten, 2)
            );
            size = 1;
            health = 630;
            buildTime = 10f;

        }};

        berylliumWallT2 = new Wall("beryllium-wall-t2"){{
            requirements(Category.defense, BuildVisibility.shown,
                    ItemStack.with(Items.beryllium, 30, Items.tungsten, 10)
            );
            size = 2;
            health = 2294;
            buildTime = 28f;  // 2.8s

        }};

        berylliumWallT3 = new Wall("beryllium-wall-t3"){{
            requirements(Category.defense, BuildVisibility.shown,
                    ItemStack.with(Items.beryllium, 54, Items.tungsten, 30)
            );
            size = 3;
            health = 2900;
            buildTime = 30f;  // 3.0s
        }};

        berylliumWallT4 = new Wall("beryllium-wall-t4"){{
            requirements(Category.defense, BuildVisibility.shown,
                    ItemStack.with(Items.beryllium, 90, Items.tungsten, 60)
            );
            size = 3;
            health = 3500;
            buildTime = 36f;  // 3.6s
        }};

        berylliumWallT5 = new Wall("beryllium-wall-t5"){{
            requirements(Category.defense, BuildVisibility.shown,
                    ItemStack.with(Items.beryllium, 140, Items.tungsten, 100)
            );
            size = 4;
            health = 3900;
            buildTime = 40f;  // 4.0s
        }};

        berylliumWallT6 = new Wall("beryllium-wall-t6"){{
            requirements(Category.defense, BuildVisibility.shown,
                    ItemStack.with(Items.beryllium, 200, Items.tungsten, 160)
            );
            size = 4;
            health = 4100;
            buildTime = 49f;  // 4.9s
        }};
    }
}
