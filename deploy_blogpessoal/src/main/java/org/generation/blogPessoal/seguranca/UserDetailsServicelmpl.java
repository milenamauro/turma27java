package org.generation.blogPessoal.seguranca;

import java.util.Optional;

import org.generation.blogPessoal.model.Usuario;
import org.generation.blogPessoal.repository.UsuarioRepositoryTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServicelmpl implements UserDetailsService {
	
        @Autowired
	   private UsuarioRepositoryTest userRepository;
        
        
        @Override
		public UserDetails loadUserByUsername (String userName) {
        	Optional<Usuario> user = userRepository.findByUsuario(userName);
        	user.orElseThrow(() -> new UsernameNotFoundException(userName +"not found."));
        	
        	return user.map(UserDetailslmpl ::  new).get();
        	
        }
	
}
