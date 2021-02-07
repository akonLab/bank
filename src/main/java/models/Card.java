package models;

import javax.persistence.*;

@Entity(name = "CardEntity")
@Table(name = "cards")
public class Card {
    Integer card_id;
    Integer user_id;
    Integer card_number;
    Integer card_amount;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "card_id")
    public Integer getCard_id() {
        return card_id;
    }

    public void setCard_id(Integer card_id) {
        this.card_id = card_id;
    }
    @Column(name = "user_id")
    public Integer getUser_id() {
        return user_id;
    }
    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    @Column(name = "card_number")
    public Integer getCard_number() {
        return card_number;
    }
    public void setCard_number(Integer card_number) {
        this.card_number = card_number;
    }

    @Column(name = "card_amount")
    public Integer getCard_amount() {
        return card_amount;
    }
    public void setCard_amount(Integer card_amount) {
        this.card_amount = card_amount;
    }
}
