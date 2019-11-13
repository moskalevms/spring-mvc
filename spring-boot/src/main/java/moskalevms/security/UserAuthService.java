package moskalevms.security;

import moskalevms.persistence.entity.Roles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import moskalevms.persistence.UserRepository;

import java.util.Collections;

@Service
@Transactional(readOnly = true)
public class UserAuthService implements UserDetailsService {

    private final UserRepository userRepository;

    private Roles roles;

    @Autowired
    public UserAuthService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepository.getUserByUsername(username)
                .map(user -> new org.springframework.security.core.userdetails.User(
                        user.getUsername(),
                        user.getPassword(),
                        Collections.singletonList(new SimpleGrantedAuthority("ROLE" + roles.getUsername()))
                ))
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));
    }
}
