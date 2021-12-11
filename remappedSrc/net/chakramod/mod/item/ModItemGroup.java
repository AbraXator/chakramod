package net.chakramod.mod.item;

import net.chakramod.mod.ChakraMod;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup MALACHIT = FabricItemGroupBuilder.build(new Identifier("chakramod", "malachit"),
        () -> new ItemStack(ModItems.MALACHIT));
}
