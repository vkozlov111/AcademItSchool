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

    /*public Range getIntersection(Range range1, Range range2) {
        Range range3 = new Range();

        if (range1.from <= range2.from)  {
        range3.from = range2.from}
        else if ((range1.from >= range2.from) && (range1.from <= range2.to)) {
        range3.from = range1.from}
        else if (range1.from >= range2.to) {
        range3.from = null}

        }


        return range3;
    }
    */


}

