package com.miguelcaetano.hyperskill.object_oriented_programming.list_public_fields;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

/**
 Get list of public fields the object declares (inherited fields should be skipped).
 */

class FieldGetter {

    public String[] getPublicFields(Object object) {
        // Add implementation here
        List<String> publicFields = new ArrayList<>();
        for (Field field : object.getClass().getDeclaredFields()) {
            if (Modifier.isPublic(field.getModifiers())) {
                publicFields.add(field.getName());
            }
        }
        return publicFields.toArray(publicFields.toArray(new String[0]));
    }
}
