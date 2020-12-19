package com.miguelcaetano.hyperskill.object_oriented_programming.annotated_fields;

import java.lang.reflect.*;
import java.util.ArrayList;

/**
 Get an array of fields the object declares that contain annotations (inherited fields should be skipped).
 */
public class AnnotationsUtil {

    public static String[] getFieldsContainingAnnotations(Object object) {
        // Add implementation here
        Class itemClass = object.getClass();
        ArrayList<String> fieldNames = new ArrayList<>();

        for (Field field : itemClass.getDeclaredFields()) {
            if (field.getDeclaredAnnotations().length > 0) {
                fieldNames.add(field.getName());
            }
        }
        return fieldNames.toArray(new String[0]);
    }

}
