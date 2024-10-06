class ComplexObject {
    private Shape shape;
    private Color color;

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void showDetails() {
        shape.draw();
        color.fill();
    }
}