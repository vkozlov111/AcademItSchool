package ru.academits.vkozlov111.Range;

class Range {
    private double from;
    private double to;

    public Range(double from, double to) {
        this.from = from;
        this.to = to;
    }

    public double getIntervalLength() {
        return this.to - this.from;
    }

    public boolean isInside(double isInsideNumber) {
        return ((isInsideNumber >= this.from) && (isInsideNumber <= this.to));
    }
}
