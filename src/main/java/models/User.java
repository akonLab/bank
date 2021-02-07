
package models;

import javax.persistence.*;

@Entity(name = "UserEntity")
//@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer user_id;

    String user_name;
    String user_password;
    String user_phone;

    public User() {
    }

    public User(String user_name, String user_password, String user_phone) {
        setUser_name(user_name);
        setUser_password(user_password);
        setUser_phone(user_phone);
    }

    public User(Integer user_id, String user_name, String user_password, String user_phone) {
        setUser_id(user_id);
        setUser_name(user_name);
        setUser_password(user_password);
        setUser_phone(user_phone);
    }

    //   @Column(name = "user_id")
    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    //    @Column(name = "user_name")
    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    //    @Column(name = "user_password")
    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_age) {
        this.user_password = user_age;
    }

    //    @Column(name = "user_phone")
    public String getUser_phone() {
        return user_phone;
    }

    public void setUser_phone(String user_phone) {
        this.user_phone = user_phone;
    }
}
