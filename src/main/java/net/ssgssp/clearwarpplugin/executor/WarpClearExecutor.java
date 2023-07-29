package net.ssgssp.clearwarpplugin.executor;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class WarpClearExecutor implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(label.equalsIgnoreCase("warpclear")){
            if(sender instanceof Player){
                Player player = (Player) sender;
                CommandSender sender1 = Bukkit.getConsoleSender();
                String playername = player.getName();
                String str1 = "tc warp PLAYER set 0 all";
                String str2 = "tc warp PLAYER set 0 TEMP";
                String str3 = "tc warp PLAYER set 0 PERM";
                String stringA = str1.replace("PLAYER",playername);
                String stringB = str2.replace("PLAYER",playername);
                String stringC = str3.replace("PLAYER",playername);
                Bukkit.dispatchCommand(sender1,stringA);
                Bukkit.dispatchCommand(sender1,stringB);
                Bukkit.dispatchCommand(sender1,stringC);
                sender.sendMessage(ChatColor.GREEN + "清除成功");
            }
            else{
                sender.sendMessage(ChatColor.YELLOW + "只有玩家能使用此指令");
            }
            return true;
        }
        return false;
    }
}
