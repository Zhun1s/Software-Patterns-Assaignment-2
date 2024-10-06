class ConfigurableShapeFactory extends ShapeFactory {
    @Override
    public Shape createShape() {
        String configSetting = ConfigManager.getInstance().getConfigSetting();
        if (configSetting.equals("Circle")) {
            return new Circle();
        } else {
            return new Square();
        }
    }
}