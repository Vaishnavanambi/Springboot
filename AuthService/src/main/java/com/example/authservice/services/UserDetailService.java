package com.example.authservice.services;

import com.example.authservice.dao.UserCredentialDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserDetailService implements UserDetailsService {

    private final UserCredentialDAO userCredentialDAO;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if(userCredentialDAO.findByUserName(username).isPresent()) return userCredentialDAO.findByUserName(username).get();
        else throw new UsernameNotFoundException(username);
    }
}
