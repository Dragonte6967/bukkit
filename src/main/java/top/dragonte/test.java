package top.dragonte;

import org.bukkit.plugin.java.JavaPlugin;

public final class test extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("插件加载成功");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
