package com.example.backend_university.request_response;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Set;

public class SignupRequest {
    @NotBlank(message = "Это поле должно быть заполнено")
    private String firstName;
    @NotBlank(message = "Это поле должно быть заполнено")
    private String lastName;
    @NotBlank(message = "Это поле должно быть заполнено")
    @Email(message = "Неправильная почта")
    private String email;
    @Size(min = 3, max = 9, message = "Пароль должен содержать от 3 до 9 символов")
    private String password;
    private Set<String> roles;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<String> getRoles() {
        return roles;
    }

    public void setRoles(Set<String> roles) {
        this.roles = roles;
    }
}
