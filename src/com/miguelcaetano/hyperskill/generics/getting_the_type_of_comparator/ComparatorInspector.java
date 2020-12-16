package com.miguelcaetano.hyperskill.generics.getting_the_type_of_comparator;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * Class to work with
 */
class ComparatorInspector {

    /**
     * Return Type variable that corresponds to the type parameterizing Comparator.
     *
     * @param clazz {@link Class} object, should be non null
     * @return {@link Type} object or null if Comparable does not have type parameter
     */
    public static <T extends Comparable<?>> Type getComparatorType(Class<T> clazz) {
        if (clazz.getGenericInterfaces().length == 0) {
            return null;
        }
        Type[] types = clazz.getGenericInterfaces();
        for (Type type : types) {
            if (type instanceof ParameterizedType
                    && ((ParameterizedType) type).getRawType() == Comparable.class) {
                return ((ParameterizedType) type).getActualTypeArguments()[0];
            }
        }
        return null;
    }
}