package org.example;

import java.util.HashSet;
import java.util.Set;

public class User {

    private int id;

    private String userName;

    private String email;

    private String password;

    private String phoneNumber;

    private String address;

    private Set<Role> roles = new HashSet<>();

    public Set<ERole> getRolesAsString() {
        Set<ERole> rolesAsString = new HashSet<>();
        for (Role role : roles) {
            rolesAsString.add(role.getName());
        }
        return rolesAsString;
    }

    public void addRole(Role role) {
        roles.add(role);
    }

    public void removeRole(Role role) {
        roles.remove(role);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}