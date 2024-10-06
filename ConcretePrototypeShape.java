class ConcretePrototypeShape implements Prototype {
    private Shape shape;

    public ConcretePrototypeShape(Shape shape) {
        this.shape = shape;
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototypeShape(shape);
    }

    public Shape getShape() {
        return shape;
    }
}