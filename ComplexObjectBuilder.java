class ComplexObjectBuilder {
    private ComplexObject complexObject = new ComplexObject();

    public ComplexObjectBuilder addShape() {
        complexObject.setShape(new ConfigurableShapeFactory().createShape());
        return this;
    }

    public ComplexObjectBuilder addColor() {
        complexObject.setColor(new ShapeColorFactory().createColor());
        return this;
    }

    public ComplexObject build() {
        return complexObject;
    }
}