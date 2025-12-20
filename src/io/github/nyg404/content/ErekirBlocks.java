package io.github.nyg404.content;

import arc.graphics.Color;
import mindustry.content.Items;
import mindustry.type.Category;
import mindustry.type.Item;
import mindustry.type.ItemStack;
import mindustry.world.Block;
import mindustry.world.blocks.defense.AutoDoor;
import mindustry.world.blocks.defense.Door;
import mindustry.world.blocks.defense.ShieldWall;
import mindustry.world.blocks.defense.Wall;
import mindustry.world.meta.BuildVisibility;

public class ErekirBlocks {

        // === Старые бериллиевые стены ===
        public static Block berylliumWallT1, berylliumWallT2, berylliumWallT3,
                        berylliumWallT4, berylliumWallT5, berylliumWallT6;

        // === Новые вольфрамовые, карбидные стены ===
        public static Block reinforcedTungstenWallTir1,
                        hugeWallTungstenTir3,
                        greatWallTungstenTir2,
                        hugeReinforcedWallMadeTungstenTir4,
                        giantWallTungstenTir5,
                        giantReinforcedWallMadeTungstenTir6;
        public static Block reinforcedCarbideWallTie1,
                        largeReinforcedCarbideWallTir2,
                        hugeWallOfCarbideTir3,
                        hugeReinforcedWallMadeCarbideTir4,
                        giantWallCarbideTir5,
                        giantReinforcedCarbideWallTir6;
        public static Block scrapWallTir1, scrapWallTir2, scrapWallTir3;
        public static Block door, door1, door2;

        public static void load() {

               
                berylliumWallT1 = new Wall("beryllium-wall-t1") {
                        {
                                requirements(Category.defense, BuildVisibility.shown,
                                                ItemStack.with(Items.beryllium, 10, Items.tungsten, 2));
                                size = 1;
                                health = 630;
                                buildTime = 10f;
                        }
                };

                berylliumWallT2 = new Wall("beryllium-wall-t2") {
                        {
                                requirements(Category.defense, BuildVisibility.shown,
                                                ItemStack.with(Items.beryllium, 30, Items.tungsten, 10));
                                size = 2;
                                health = 2294;
                                buildTime = 28f;
                        }
                };

                berylliumWallT3 = new Wall("beryllium-wall-t3") {
                        {
                                requirements(Category.defense, BuildVisibility.shown,
                                                ItemStack.with(Items.beryllium, 54));
                                size = 3;
                                health = 2900;
                                buildTime = 30f;
                        }
                };

                berylliumWallT4 = new Wall("beryllium-wall-t4") {
                        {
                                requirements(Category.defense, BuildVisibility.shown,
                                                ItemStack.with(Items.beryllium, 90, Items.tungsten, 60));
                                size = 3;
                                health = 3500;
                                buildTime = 36f;
                        }
                };

                berylliumWallT5 = new Wall("beryllium-wall-t5") {
                        {
                                requirements(Category.defense, BuildVisibility.shown,
                                                ItemStack.with(Items.beryllium, 140));
                                size = 4;
                                health = 3900;
                                buildTime = 40f;
                        }
                };

                berylliumWallT6 = new Wall("beryllium-wall-t6") {
                        {
                                requirements(Category.defense, BuildVisibility.shown,
                                                ItemStack.with(Items.beryllium, 200, Items.tungsten, 150));
                                size = 4;
                                health = 4100;
                                buildTime = 49f;
                        }
                };

                // ──────── Вольфрамовые стены ────────
                reinforcedTungstenWallTir1 = new Wall("reinforced-tungsten-wall-tir1") {
                        {
                                requirements(Category.defense, BuildVisibility.shown,
                                                ItemStack.with(Items.tungsten, 10, Items.surgeAlloy, 2));
                                size = 1;
                                health = 700;
                                buildTime = 21f;
                                lightningChance = 0.1f;
                                lightningDamage = 15f;
                                lightningLength = 10;
                                lightningColor = Color.valueOf("a0a0a0");
                        }
                };

                greatWallTungstenTir2 = new Wall("great-wall-tungsten-tir2") {
                        {
                                requirements(Category.defense, BuildVisibility.shown,
                                                ItemStack.with(Items.tungsten, 30, Items.surgeAlloy, 10));
                                size = 2;
                                health = 2500;
                                buildTime = 35f;
                        }
                };

                hugeWallTungstenTir3 = new Wall("huge-wall-tungsten-tir3") {
                        {
                                requirements(Category.defense, BuildVisibility.shown,
                                                ItemStack.with(Items.tungsten, 60));
                                size = 3;
                                health = 3100;
                                buildTime = 40f;
                        }
                };

                hugeReinforcedWallMadeTungstenTir4 = new Wall("huge-reinforced-wall-made-tungsten-tir4") {
                        {
                                requirements(Category.defense, BuildVisibility.shown,
                                                ItemStack.with(Items.tungsten, 80, Items.surgeAlloy, 60));
                                size = 3;
                                health = 3900;
                                buildTime = 49f;
                                lightningChance = 0.1f;
                                lightningDamage = 20f;
                                lightningLength = 15;
                                lightningColor = Color.valueOf("a0a0a0");
                        }
                };

                giantWallTungstenTir5 = new Wall("giant-wall-tungsten-tir5") {
                        {
                                requirements(Category.defense, BuildVisibility.shown,
                                                ItemStack.with(Items.tungsten, 100));
                                size = 4;
                                health = 4300;
                                buildTime = 54f;
                        }
                };

                giantReinforcedWallMadeTungstenTir6 = new Wall("giant-reinforced-wall-made-tungsten-tir6") {
                        {
                                requirements(Category.defense, BuildVisibility.shown,
                                                ItemStack.with(Items.tungsten, 150, Items.surgeAlloy, 100));
                                size = 4;
                                health = 4900;
                                buildTime = 60f;
                                lightningChance = 0.1f;
                                lightningDamage = 25f;
                                lightningLength = 18;
                                lightningColor = Color.valueOf("a0a0a0");
                        }
                };

                // ──────── Карбидные стены ────────
                reinforcedCarbideWallTie1 = new Wall("reinforced-carbide-wall-tie1") {
                        {
                                requirements(Category.defense, BuildVisibility.shown,
                                                ItemStack.with(Items.carbide, 8, Items.surgeAlloy, 3));
                                size = 1;
                                health = 790;
                                buildTime = 36f;
                                lightningChance = 0.3f;
                                lightningDamage = 22f;
                                lightningLength = 17;
                                lightningColor = Color.valueOf("fffc5e");
                        }
                };

                largeReinforcedCarbideWallTir2 = new Wall("large-reinforced-carbide-wall-tir2") {
                        {
                                requirements(Category.defense, BuildVisibility.shown,
                                                ItemStack.with(Items.carbide, 19, Items.surgeAlloy, 9));
                                size = 2;
                                health = 2800;
                                buildTime = 40f;
                        }
                };

                hugeWallOfCarbideTir3 = new Wall("huge-wall-of-carbide-tir3") {
                        {
                                requirements(Category.defense, BuildVisibility.shown,
                                                ItemStack.with(Items.carbide, 26));
                                size = 3;
                                health = 3090;
                                buildTime = 49f;
                        }
                };

                hugeReinforcedWallMadeCarbideTir4 = new Wall("huge-reinforced-wall-made-carbide-tir4") {
                        {
                                requirements(Category.defense, BuildVisibility.shown,
                                                ItemStack.with(Items.carbide, 35, Items.surgeAlloy, 20));
                                size = 3;
                                health = 4100;
                                buildTime = 59f;
                                lightningChance = 0.3f;
                                lightningDamage = 40f;
                                lightningLength = 26;
                                lightningColor = Color.valueOf("fffc5e");
                        }
                };

                giantWallCarbideTir5 = new Wall("giant-wall-carbide-tir5") {
                        {
                                requirements(Category.defense, BuildVisibility.shown,
                                                ItemStack.with(Items.carbide, 40));
                                size = 4;
                                health = 4900;
                                buildTime = 60f;
                        }
                };

                giantReinforcedCarbideWallTir6 = new Wall("giant-reinforced-carbide-wall-tir6") {
                        {
                                requirements(Category.defense, BuildVisibility.shown,
                                                ItemStack.with(Items.carbide, 61, Items.surgeAlloy, 40));
                                size = 4;
                                health = 5500;
                                buildTime = 68f;
                                lightningChance = 0.3f;
                                lightningDamage = 52f;
                                lightningLength = 30;
                                lightningColor = Color.valueOf("fffc5e");
                        }
                };


                door = new AutoDoor("tungsten-wall-tir1") {
                        {
                                requirements(Category.defense, ItemStack.with(Items.tungsten, 6, Items.silicon, 4));
                                buildTime = 7f;
                                health = 620;
                                update = true;
                        }
                };
                door1 = new AutoDoor("wall-tungsten-tir3") {
                        {
                                requirements(Category.defense, ItemStack.with(Items.tungsten, 10, Items.silicon, 7));
                                buildTime = 9f;
                                size = 3;
                                health = 2300;
                                update = true;
                        }
                };
                door2 = new AutoDoor("tungsten-tir6") {
                        {
                                requirements(Category.defense, ItemStack.with(Items.tungsten, 20, Items.silicon, 10));
                                health = 2800;
                                size = 4;
                                update = true;
                                buildTime = 10f;

                        }

                };

            scrapWallTir1= new ShieldWall("scrap-wall-tir1") {
                {
                    requirements(Category.defense, BuildVisibility.shown,
                            ItemStack.with(Items.beryllium, 8, Items.phaseFabric, 16, Items.surgeAlloy, 8));
                    consumePower(1f / 60f);
                    size = 1;
                    health = 4090;
                    buildTime = 40f;

                    armor = 21f;
                    chanceDeflect = 2;

                    outputsPower = false;
                    hasPower = true;
                    consumesPower = true;
                    conductivePower = true;
                }
            };
            scrapWallTir2= new ShieldWall("scrap-wall-tir3") {
                {
                    requirements(Category.defense, BuildVisibility.shown,
                            ItemStack.with(Items.beryllium, 19, Items.phaseFabric, 40, Items.surgeAlloy, 19));
                    consumePower(10f / 60f);
                    size = 3;
                    health = 4500;
                    buildTime = 61f;

                    armor = 1200f;
                    chanceDeflect = 16;

                    outputsPower = false;
                    hasPower = true;
                    consumesPower = true;
                    conductivePower = true;
                }
            };
            scrapWallTir3= new ShieldWall("scrap-wall-tir4") {
                {
                    requirements(Category.defense, BuildVisibility.shown,
                            ItemStack.with(Items.beryllium, 60, Items.phaseFabric, 80, Items.surgeAlloy, 60));
                    consumePower(30f / 60f);
                    size = 4;
                    health = 5000;
                    buildTime = 80f;

                    armor = 2000f;
                    chanceDeflect = 20;

                    outputsPower = false;
                    hasPower = true;
                    consumesPower = true;
                    conductivePower = true;
                }
            };

        }
}