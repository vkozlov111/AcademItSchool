package ru.academits.vkozlov111.classes;

public class Range {
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

    public double getLength() {
        return this.to - this.from;
    }

    public boolean isInside(double number) {
        return ((number >= this.from) && (number <= this.to));
    }

    private double getMaxFromArray(double array[]) {

        double maximum = array[0];

        for (double e : array) {
            if (maximum < e) {
                maximum = e;
            }
        }
        return maximum;
    }

    private double getMinFromArray(double array[]) {

        double minimum = array[0];

        for (double e : array) {
            if (minimum > e) {
                minimum = e;
            }
        }
        return minimum;
    }

    public Range getIntersection(Range range) {

        double intersectionFrom;
        double intersectionTo;
        double firstFrom = this.from;
        double firstTo = this.to;
        double secondFrom = range.from;
        double secondTo = range.to;

        if ((firstFrom > secondTo) || (firstTo < secondFrom)) {
            return null;
        } else {
            if (firstFrom < secondFrom) {
                intersectionFrom = secondFrom;
            } else {
                intersectionFrom = firstFrom;
            }

            if (firstTo > secondTo) {
                intersectionTo = secondTo;
            } else {
                intersectionTo = firstTo;
            }
        }
        return new Range(intersectionFrom, intersectionTo);
    }

    /*public Range[] getCombinationOfRanges(Range range) {

        double[] array = {this.from, this.to, range.from, range.to};

        double firstFrom = this.from;
        double firstTo = this.to;
        double secondFrom = range.from;
        double secondTo = range.to;

        if ((secondTo < firstFrom) && (secondFrom > firstTo)) {

        }

        double combinationFrom = getMinFromArray(array);
        double combinationTo = getMaxFromArray(array);

        //return new Range(combinationFrom, combinationTo);

    }*/

}
