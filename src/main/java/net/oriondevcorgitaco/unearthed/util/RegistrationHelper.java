package net.oriondevcorgitaco.unearthed.util;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.oriondevcorgitaco.unearthed.Unearthed;

public class RegistrationHelper {

    public static ConfiguredFeature<?, ?> newConfiguredFeature(String registryName, ConfiguredFeature<?, ?> configuredFeature) {
        if(!BuiltinRegistries.CONFIGURED_FEATURE.getIds().contains(new Identifier(Unearthed.MOD_ID, registryName)))
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(Unearthed.MOD_ID, registryName), configuredFeature);
        return configuredFeature;
    }

    public static <T extends FeatureConfig, G extends Feature<T>> G registerFeature(String registryName, G feature) {
        if (!Registry.FEATURE.getIds().contains(new Identifier(Unearthed.MOD_ID, registryName)))
            Registry.register(Registry.FEATURE, new Identifier(Unearthed.MOD_ID, registryName), feature);
        return feature;
    }
}
