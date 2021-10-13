package gg.oddysian.gawdddd.talentplugin.command;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.command.CommandSource;
import net.minecraft.command.Commands;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.util.text.StringTextComponent;

public class HelloCommand {
    public HelloCommand(CommandDispatcher<CommandSource> dispatcher) {
        dispatcher.register(Commands.literal("hello").executes((command) -> {
            return hello(command.getSource());
        }));
    }

    private int hello(CommandSource source) throws CommandSyntaxException {
        ServerPlayerEntity player = source.asPlayer();
        source.sendFeedback(new StringTextComponent("Hello " + player), true);
        return 1;
    }
}
