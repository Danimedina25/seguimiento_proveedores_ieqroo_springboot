package mx.ieqroo.control_proveedores.auth.controller;

import mx.ieqroo.control_proveedores.auth.dto.LoginRequest;
import mx.ieqroo.control_proveedores.auth.dto.LoginResponse;
import mx.ieqroo.control_proveedores.auth.service.AuthService;
import mx.ieqroo.control_proveedores.shared.dto.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/control-proveedores/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/login")
    public ResponseEntity<ApiResponse<LoginResponse>> login(@RequestBody LoginRequest request) {
        LoginResponse response = authService.login(request);
        return ResponseEntity.ok(
                new ApiResponse<>(true, "Login exitoso", response, null)
        );
    }
}

