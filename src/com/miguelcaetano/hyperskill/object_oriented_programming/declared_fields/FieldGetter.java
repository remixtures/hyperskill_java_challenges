package com.miguelcaetano.hyperskill.object_oriented_programming.declared_fields;

class FieldGetter {

    public int getNumberOfFieldsClassDeclares(Class<?> clazz) {
        return clazz.getDeclaredFields().length;

    }
}
