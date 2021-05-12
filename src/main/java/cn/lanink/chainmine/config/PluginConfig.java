package cn.lanink.chainmine.config;

import cn.nukkit.utils.Config;
import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

/**
 * @author lt_name
 */
@Setter
@Getter
public class PluginConfig {
    
    private final Config config;
    
    private boolean scanNearby;
    private boolean createModeEnable;
    private int maxLinkageCount;
    
    public PluginConfig(@NotNull Config config) {
        this.config = config;
        
        this.scanNearby = config.getBoolean("scanNearby", true);
        this.createModeEnable = config.getBoolean("createModeEnable", false);
        this.maxLinkageCount = config.getInt("maxLinkageCount", 32);
    }
    
    public void save() {
        this.config.set("scanNearby", this.isScanNearby());
        this.config.set("createModeEnable", this.isCreateModeEnable());
        this.config.set("maxLinkageCount", this.getMaxLinkageCount());
        
        this.config.save();
    }
    
}
