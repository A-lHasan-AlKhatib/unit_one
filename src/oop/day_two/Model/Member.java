package oop.day_two.Model;

import oop.day_two.Model.enums.Role;

import java.util.Arrays;

public class Member {
    private String name, gender, nationality, image;
    private Role[] roles;

    public Member(String name, String gender, String nationality, String image, Role[] roles) {
        this.name = name;
        this.gender = gender;
        this.nationality = nationality;
        this.image = image;
        this.roles = roles;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Role[] getRoles() {
        return roles;
    }

    public void setRoles(Role[] roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "\nMember : " +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", nationality='" + nationality + '\'' +
                ", image='" + image + '\'' +
                ", roles=" + Arrays.toString(roles);
    }
}