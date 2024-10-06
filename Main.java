public class Main {
    public static void main(String[] args) {
        ConfigManager configManager = ConfigManager.getInstance();
        System.out.println("Current Config: " + configManager.getConfigSetting());

        AbstractFactory shapeColorFactory = new ShapeColorFactory();
        Shape shape = shapeColorFactory.createShape();
        Color color = shapeColorFactory.createColor();

        ComplexObject complexObject = new ComplexObjectBuilder()
            .addShape()
            .addColor()
            .build();

        complexObject.showDetails();

        ConcretePrototypeShape prototypeShape = new ConcretePrototypeShape(shape);
        Shape clonedShape = (Shape) prototypeShape.clone();

        System.out.println("Cloned Shape:");
        clonedShape.draw();
    }
}