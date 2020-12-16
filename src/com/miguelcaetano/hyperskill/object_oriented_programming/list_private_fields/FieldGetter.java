package com.miguelcaetano.hyperskill.object_oriented_programming.list_private_fields;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FieldGetter {

    public List<String> getPrivateFields(Object object) {
        // Add implementation here
        List<String> privateFields = new ArrayList<>();
        for (Field field : object.getClass().getDeclaredFields()) {
            if (Modifier.isPrivate(field.getModifiers())) {
                privateFields.add(field.getName());
            }
        }

        Collections.sort(privateFields);
        return privateFields;
    }
}
