package net.ssgssp.clearwarpplugin;

import net.ssgssp.clearwarpplugin.executor.WarpClearExecutor;
import org.bukkit.plugin.java.JavaPlugin;

public final class ClearWarpPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("插件已加载");
        this.getCommand("warpclear").setExecutor(new WarpClearExecutor());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("插件已卸载");
    }
}
