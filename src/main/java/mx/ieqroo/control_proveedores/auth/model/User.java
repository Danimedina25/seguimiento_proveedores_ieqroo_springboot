package mx.ieqroo.control_proveedores.auth.model;

import jakarta.persistence.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "users")
public class User implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name", length = 100)
    private String name;

    @Column(name = "email", unique = true, length = 100)
    private String email;

    @Column(name = "password", length = 255)
    private String password;

    @Column(name = "role_id")
    private Integer roleId;

    @Column(name = "area_id")
    private Integer areaId;

    @Column(name = "puesto", length = 100)
    private String puesto;

    @Column(name = "nivel", nullable = false, length = 255)
    private String nivel;

    // ================= Métodos de UserDetails ================= //

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(); // Aquí podrías mapear roles si lo deseas
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return email; // Usamos el email como username
    }

    @Override
    public boolean isAccountNonExpired() {
        return true; // Lógica opcional
    }

    @Override
    public boolean isAccountNonLocked() {
        return true; // Lógica opcional
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true; // Lógica opcional
    }

    @Override
    public boolean isEnabled() {
        return true; // Puedes controlar si el usuario está activo
    }

    // ================= Getters y Setters ================= //

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
}
