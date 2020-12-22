package com.miguelcaetano.hyperskill.object_oriented_programming.serializable_user;

import java.io.Serializable;

class User implements Serializable {

    private static final long serialVersionUID = 1100512523510398592L;
    private String name;
    private transient String password;

}
