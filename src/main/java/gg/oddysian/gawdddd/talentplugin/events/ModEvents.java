package gg.oddysian.gawdddd.talentplugin.events;

import gg.oddysian.gawdddd.talentplugin.Talentplugin;
import gg.oddysian.gawdddd.talentplugin.command.HelloCommand;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.server.command.ConfigCommand;

@Mod.EventBusSubscriber(modid = Talentplugin.MOD_ID) //New command registration
public class ModEvents {
    @SubscribeEvent
    public void onCommandRegister(RegisterCommandsEvent event) {
        new HelloCommand(event.getDispatcher());

        ConfigCommand.register(event.getDispatcher());
    }
}