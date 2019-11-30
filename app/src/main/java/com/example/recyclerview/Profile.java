package com.example.recyclerview;

public class Profile {
    String name;
    String email;
    String profilepic;
    boolean permission;

    public Profile(String name, String email, String profilepic, boolean permission) {
        this.name = name;
        this.email = email;
        this.profilepic = profilepic;
        this.permission = permission;
    }

    public Profile() {
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

    public String getProfilepic() {
        return profilepic;
    }

    public void setProfilepic(String profilepic) {
        this.profilepic = profilepic;
    }

    public boolean getPermission() {
        return permission;
    }

    public void setPermission(boolean permission) {
        this.permission = permission;
    }
}
