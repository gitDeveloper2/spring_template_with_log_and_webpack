package ke.co.mspace.ClientManager.security;
import ke.co.mspace.ClientManager.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import java.util.Collections;
import java.util.Optional;

@Service
public class UserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService {
    @Autowired
    UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<ke.co.mspace.ClientManager.models.User> fetchedUser=userRepository.findByUsername(username);
        if(fetchedUser.isPresent())
          return new User(
                fetchedUser.get().getUsername(),
                fetchedUser.get().getPassword(),
                Collections.emptyList()
                );
        else throw new UsernameNotFoundException("User not found");
    }
}
