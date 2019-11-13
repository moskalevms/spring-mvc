package moskalevms.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "roles")
public class Roles {

    @Column
    private String username;

    @Column
    private String authority;

    @ManyToMany
    @JoinColumn(name = "id")
    private User user;

    public Roles(){

    }

    public Roles(String username, String authority, User user) {
        this.username = username;
        this.authority = authority;
        this.user = user;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
