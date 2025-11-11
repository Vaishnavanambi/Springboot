package com.example.authservice.services;

import com.example.authservice.dao.UserCredentialDAO;
import com.example.authservice.interfaces.AuthInterface;
import com.example.authservice.po.UserCredentialPO;
import com.example.authservice.transferobject.UserDetail;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AuthService implements AuthInterface {
    private final UserCredentialDAO userCredentialDAO;
    private final PasswordEncoder passwordEncoder;

    @Override
    public void saveUser(final UserDetail userDetail) throws Exception{
        Optional<UserCredentialPO> userCredentialPO = userCredentialDAO.findByUserName(userDetail.getName());
        if(userCredentialPO.isPresent()) throw new Exception("Username already exists");
        UserCredentialPO user = UserCredentialPO.builder().userName(userDetail.getName()).password(passwordEncoder.encode(userDetail.getPassword()))
                .email(userDetail.getEmail()).mobile(userDetail.getMobile()).build();
        userCredentialDAO.save(user);
    }

}
