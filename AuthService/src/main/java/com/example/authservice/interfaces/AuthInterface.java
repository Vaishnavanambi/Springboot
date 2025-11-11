package com.example.authservice.interfaces;

import com.example.authservice.transferobject.UserDetail;

public interface AuthInterface {
    void saveUser(final UserDetail userDetail) throws Exception;
}
