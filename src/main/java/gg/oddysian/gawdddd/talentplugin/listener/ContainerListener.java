package gg.oddysian.gawdddd.talentplugin.listener;

import net.minecraft.client.Minecraft;
import net.minecraft.util.Util;
import net.minecraft.util.text.StringTextComponent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.PlayerContainerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class ContainerListener {
    public ContainerListener() {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void onContainerOpen(PlayerContainerEvent.Open event) {
        String player = Minecraft.getInstance().player.getScoreboardName();
        Minecraft.getInstance().player.sendMessage(new StringTextComponent("Hello " + player), Util.DUMMY_UUID);
        System.out.println("Container open");
    }
}