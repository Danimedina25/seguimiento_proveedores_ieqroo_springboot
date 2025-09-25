package mx.ieqroo.control_proveedores.auth.service;

import mx.ieqroo.control_proveedores.auth.dto.LoginRequest;
import mx.ieqroo.control_proveedores.auth.dto.LoginResponse;
import mx.ieqroo.control_proveedores.auth.model.User;
import mx.ieqroo.control_proveedores.auth.repository.UserRepository;
import mx.ieqroo.control_proveedores.shared.utils.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public LoginResponse login(LoginRequest loginRequest) {
        User user = userRepository.findByEmail(loginRequest.getEmail())
                .orElseThrow(() -> new UsernameNotFoundException("Usuario no encontrado"));

        if (!passwordEncoder.matches(loginRequest.getPassword(), user.getPassword())) {
            throw new BadCredentialsException("Contraseña incorrecta");
        }

        String token = jwtUtil.generateToken(user);

        return new LoginResponse(
                user.getId().toString(),
                user.getName(),
                user.getEmail(),
                user.getPuesto(),
                token
        );
    }
}

