package com.InfinityRaider.AgriCraft.init;

import com.InfinityRaider.AgriCraft.blocks.BlockModPlant;
import com.InfinityRaider.AgriCraft.reference.Names;
import com.InfinityRaider.AgriCraft.utility.LogHelper;
import com.InfinityRaider.AgriCraft.utility.RegisterHelper;

public class Crops {
    public static BlockModPlant potato;
    public static BlockModPlant carrot;
    public static BlockModPlant melon;
    public static BlockModPlant pumpkin;
    public static BlockModPlant sugarcane;
    public static BlockModPlant dandelion;
    public static BlockModPlant poppy;
    public static BlockModPlant orchid;
    public static BlockModPlant allium;
    public static BlockModPlant tulipRed;
    public static BlockModPlant tulipOrange;
    public static BlockModPlant tulipWhite;
    public static BlockModPlant tulipPink;
    public static BlockModPlant daisy;

    public static void init() {
        potato = new BlockModPlant(net.minecraft.init.Items.potato);
        carrot = new BlockModPlant(net.minecraft.init.Items.carrot);
        melon = new BlockModPlant(net.minecraft.init.Items.melon);
        pumpkin = new BlockModPlant(net.minecraft.item.Item.getItemFromBlock(net.minecraft.init.Blocks.pumpkin));
        sugarcane = new BlockModPlant(net.minecraft.init.Items.reeds);
        dandelion = new BlockModPlant(net.minecraft.init.Items.dye, 11);
        poppy = new BlockModPlant(net.minecraft.init.Items.dye, 1);
        orchid = new BlockModPlant(net.minecraft.init.Items.dye, 12);
        allium = new BlockModPlant(net.minecraft.init.Items.dye, 13);
        tulipRed = new BlockModPlant(net.minecraft.init.Items.dye, 1, 2);
        tulipOrange = new BlockModPlant(net.minecraft.init.Items.dye, 14, 2);
        tulipWhite = new BlockModPlant(net.minecraft.init.Items.dye, 7, 2);
        tulipPink = new BlockModPlant(net.minecraft.init.Items.dye, 9, 2);
        daisy = new BlockModPlant(net.minecraft.init.Items.dye, 7, 2);

        RegisterHelper.registerBlock(potato, Names.cropPotato);
        RegisterHelper.registerBlock(carrot, Names.cropCarrot);
        RegisterHelper.registerBlock(melon, Names.cropMelon);
        RegisterHelper.registerBlock(pumpkin, Names.cropPumpkin);
        RegisterHelper.registerBlock(sugarcane, Names.cropSugarcane);
        RegisterHelper.registerBlock(dandelion, Names.cropDandelion);
        RegisterHelper.registerBlock(poppy, Names.cropPoppy);
        RegisterHelper.registerBlock(orchid, Names.cropOrchid);
        RegisterHelper.registerBlock(allium, Names.cropAllium);
        RegisterHelper.registerBlock(tulipRed, Names.cropTulipRed);
        RegisterHelper.registerBlock(tulipOrange, Names.cropTulipOrange);
        RegisterHelper.registerBlock(tulipWhite, Names.cropTulipWhite);
        RegisterHelper.registerBlock(tulipPink, Names.cropTulipPink);
        RegisterHelper.registerBlock(daisy, Names.cropDaisy);

        LogHelper.info("Crops registered");
    }
}
