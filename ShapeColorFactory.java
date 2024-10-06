class ShapeColorFactory implements AbstractFactory {
    @Override
    public Shape createShape() {
        return new ConfigurableShapeFactory().createShape();
    }

    @Override
    public Color createColor() {
        String configSetting = ConfigManager.getInstance().getConfigSetting();
        if (configSetting.equals("Circle")) {
            return new Red();
        } else {
            return new Blue();
        }
    }
}