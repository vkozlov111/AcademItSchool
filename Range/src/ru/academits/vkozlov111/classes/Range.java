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

    private static double[] getSortedArray(double[] a) {

        for (int i = 0; i < a.length - 1; i++) {

            double minimum = a[i];
            int indexMinimum = i;

            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < minimum) {
                    minimum = a[j];
                    indexMinimum = j;
                }
            }
            a[indexMinimum] = a[i];
            a[i] = minimum;
        }
        return a;
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

    public Range[] getCombinationOfRanges(Range range) {

        double firstFrom = this.from;
        double firstTo = this.to;
        double secondFrom = range.from;
        double secondTo = range.to;

        double[] newArray = {firstFrom, firstTo, secondFrom, secondTo};
        double[] sortedArray = getSortedArray(newArray);
        //Range[] arrayRange = new Range[2];

  /*
        if ((secondTo < firstFrom) || (secondFrom > firstTo)) {
            Range[] arrayRange = {new Range(sortedArray[0], sortedArray[1]), new Range(sortedArray[2], sortedArray[3])};
        } else {
            Range[] arrayRange = {new Range(sortedArray[0], sortedArray[3])};
        }
*/
        //Range[] arrayRange = {new Range(sortedArray[0], sortedArray[3])};

        //return Range[] arrayRange = {new Range(sortedArray[0], sortedArray[3])};
        //return {(new Range(1, 2)), (new Range(1, 2))};


    }

}
