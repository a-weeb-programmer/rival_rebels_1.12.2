package com.rivalrebels.common.init;

import com.rivalrebels.ModInfo;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;

public class RRSounds {
    public static SoundEvent gulp;
    public static SoundEvent toyguy;
    public static SoundEvent plasma_explosion;
    public static SoundEvent plasma_prime;
    public static SoundEvent plasma_fire;
    public static SoundEvent generic_explosion;
    public static SoundEvent explosives_place;
    public static SoundEvent weird_noise;
    public static SoundEvent quicksand;
    public static SoundEvent glass_break;
    public static SoundEvent knife_throw;
    public static SoundEvent gas_fizz;

    public static void init() {
        gulp = new SoundEvent(new ResourceLocation(ModInfo.modid, "gulp")).setRegistryName("gulp");
        toyguy = new SoundEvent(new ResourceLocation(ModInfo.modid, "toyguy_song")).setRegistryName("toyguy_song");
        plasma_explosion = new SoundEvent(new ResourceLocation(ModInfo.modid, "plasma_explosion")).setRegistryName("plasma_explosion");
        plasma_prime = new SoundEvent(new ResourceLocation(ModInfo.modid, "plasma_prime")).setRegistryName("plasma_prime");
        plasma_fire = new SoundEvent(new ResourceLocation(ModInfo.modid, "plasma_fire")).setRegistryName("plasma_fire");
        generic_explosion = new SoundEvent(new ResourceLocation(ModInfo.modid, "generic_explosion")).setRegistryName("generic_explosion");
        explosives_place = new SoundEvent(new ResourceLocation(ModInfo.modid, "explosives_place")).setRegistryName("explosives_place");
        weird_noise = new SoundEvent(new ResourceLocation(ModInfo.modid, "weird_noise")).setRegistryName("weird_noise");
        quicksand = new SoundEvent(new ResourceLocation(ModInfo.modid, "quicksand")).setRegistryName("quicksand");
        glass_break = new SoundEvent(new ResourceLocation(ModInfo.modid, "glass_break")).setRegistryName("glass_break");
        knife_throw = new SoundEvent(new ResourceLocation(ModInfo.modid, "knife_throw")).setRegistryName("knife_throw");
        gas_fizz = new SoundEvent(new ResourceLocation(ModInfo.modid, "gas_fizz")).setRegistryName("gas_fizz");
    }
}
