
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.snowcatmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.snowcatmod.block.HeheBlock;
import net.mcreator.snowcatmod.SnowcatmodMod;

public class SnowcatmodModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, SnowcatmodMod.MODID);
	public static final RegistryObject<Block> HEHE = REGISTRY.register("hehe", () -> new HeheBlock());
}
