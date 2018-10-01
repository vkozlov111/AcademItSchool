package ru.academits.vkozlov111.Range;

class Range {
    private double from;
    private double to;

    Range(double from, double to) {
        if (from > to) {
            System.out.println("'from' не может быть меньше 'to'");
        } else {
            this.from = from;
            this.to = to;
        }
    }

    double getFrom() {
        return this.from;
    }

    double getTo() {
        return this.to;
    }

    public double getIntervalLength() {
        return this.to - this.from;
    }

    public boolean isInside(double isInsideNumber) {
        return ((isInsideNumber >= this.from) && (isInsideNumber <= this.to));
    }

    Range getIntersection(Range inputRange) {
        Range intersectionOfRanges = new Range(from, to);

        if ((this.from > inputRange.to) || (this.to < inputRange.from)) {
            return null;
        } else {
            if (this.from < inputRange.from) {
                intersectionOfRanges.from = inputRange.from;
            } else {
                intersectionOfRanges.from = this.from;
            }

            if (this.to > inputRange.to) {
                intersectionOfRanges.to = inputRange.to;
            } else {
                intersectionOfRanges.to = this.to;
            }
        }
        return intersectionOfRanges;
    }
}
