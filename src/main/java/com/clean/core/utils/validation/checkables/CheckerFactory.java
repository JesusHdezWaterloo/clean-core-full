package com.clean.core.utils.validation.checkables;

import java.util.List;

/**
 *
 * @author Jorge
 * @author Jesús Hernández Barrios (jhernandezb96@gmail.com)
 */
public class CheckerFactory {

    public static Checkable buildNotNullCheckable(Object source) {
        return new NotNullCheckable(source);
    }

    public static Checkable buildNeverCheckable(Object source) {
        return new NeverCheckable(source);
    }

    public static Checkable buildStringNotEmptyCheckable(String source) {
        return new StringNotEmptyCheckable(source);
    }

    public static Checkable buildLengthExactCheckable(String source, int length) {
        return new LengthExactCheckable(source, length);
    }

    public static Checkable buildListNotEmptyCheckable(List source) {
        return new ListNotEmptyCheckable(source);
    }

    public static Checkable buildGreaterThanCeroCheckable(int source) {
        return new GreaterThanCeroIntegerCheckable(source);
    }

    public static Checkable buildGreaterThanCeroCheckable(long source) {
        return new GreaterThanCeroLongCheckable(source);
    }

    public static Checkable buildGreaterThanCeroCheckable(float source) {
        return new GreaterThanCeroFloatCheckable(source);
    }

    public static Checkable buildGreaterThanCeroCheckable(double source) {
        return new GreaterThanCeroDoubleCheckable(source);
    }

    public static Checkable buildRangeCheckable(int source, int low, int hight) {
        return new RangeIntegerCheckable(source, low, hight);
    }

    public static Checkable buildRangeCheckable(long source, long low, long hight) {
        return new RangeLongCheckable(source, low, hight);
    }

    public static Checkable buildRangeCheckable(float source, float low, float hight) {
        return new RangeFloatCheckable(source, low, hight);
    }

    public static Checkable buildRangeCheckable(double source, double low, double hight) {
        return new RangeDoubleCheckable(source, low, hight);
    }
}
