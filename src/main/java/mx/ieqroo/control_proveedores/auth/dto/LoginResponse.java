package mx.ieqroo.control_proveedores.auth.dto;

public class LoginResponse {
    private String userId;
    private String name;
    private String email;
    private String role;
    private String puesto;
    private String token;

    public LoginResponse(String userId, String name, String email, /*String role,*/ String puesto, String token) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        //this.role = role;
        this.puesto = puesto;
        this.token = token;
    }

    // Getters y setters


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
