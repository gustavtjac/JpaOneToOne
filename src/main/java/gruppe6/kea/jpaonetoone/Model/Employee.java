package gruppe6.kea.jpaonetoone.Model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Employee {

    @OneToOne
    @JoinColumn(name = "useridfk",referencedColumnName = "userID",nullable = false)

    private User user;

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private LocalDateTime born;
    private Gender gender;
    private boolean vegetarian;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public LocalDateTime getBorn() {
        return born;
    }

    public void setBorn(LocalDateTime born) {
        this.born = born;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
