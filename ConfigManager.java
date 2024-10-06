public class ConfigManager {
    private static ConfigManager instance;
    private String configSetting;

    private ConfigManager() {
        // Load configuration settings
        configSetting = "Default Config";
    }

    public static ConfigManager getInstance() {
        if (instance == null) {
            instance = new ConfigManager();
        }
        return instance;
    }

    public String getConfigSetting() {
        return configSetting;
    }
}
