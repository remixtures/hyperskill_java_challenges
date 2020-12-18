package com.miguelcaetano.hyperskill.functional_programming.creating_a_closure;

import java.util.function.UnaryOperator;

class PrefixSuffixOperator {

    public static final String PREFIX = "__pref__";
    public static final String SUFFIX = "__suff__";

    public static UnaryOperator<String> operator = word -> {
        return PREFIX + word.trim() + SUFFIX;
    };
}
