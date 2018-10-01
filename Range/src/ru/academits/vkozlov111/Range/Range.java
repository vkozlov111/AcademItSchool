package ru.academits.vkozlov111.Range;

class Range {
    private double from;
    private double to;

    public Range(double from, double to) {
        if (from > to) {
            System.out.println("'from' не может быть меньше 'to'");
        } else {
            this.from = from;
            this.to = to;
        }
    }

    public double getFrom() {
        return this.from;
    }

    public double getTo() {
        return this.to;
    }

    public double getIntervalLength() {
        return this.to - this.from;
    }

    public boolean isInside(double isInsideNumber) {
        return ((isInsideNumber >= this.from) && (isInsideNumber <= this.to));
    }

    public Range getIntersection(Range inputRange) {
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

    public Range[] getCombinationOfRanges(Range inputRange) {
        Range combinationOfRanges[] = new Range[2];

        if (this.to < inputRange.from) {
            combinationOfRanges[0] = this;
            combinationOfRanges[1] = inputRange;
        } else if ((this.to >= inputRange.from) && (this.to <= inputRange.to)) {
            combinationOfRanges[0] = new Range(this.from, inputRange.to);
            combinationOfRanges[1] = null;
        } else if ((this.to >= inputRange.from) && (this.to <= inputRange.to)) {
            combinationOfRanges[0] = new Range(this.from, inputRange.to);
            combinationOfRanges[1] = null;

        }
        return combinationOfRanges;
    }

}
