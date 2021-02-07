package models;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "TransitionEntity")
@Table(name = "transitions")
public class Transition {
    Integer transition_id;
    Integer incomes_card_id;
    Integer outcomes_card_id;
    Date transition_date;
    String  transition_type;//transaction payment
    Long  transition_amount;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "transition_id")
    public Integer getTransition_id() {
        return transition_id;
    }

    public void setTransition_id(Integer transition_id) {
        this.transition_id = transition_id;
    }

    @Column(name = "transition_date")
    public Date getTransition_date() {
        return transition_date;
    }

    public void setTransition_date(Date history_date) {
        this.transition_date = history_date;
    }

    @Column(name = "incomes_card_id")
    public Integer getIncomes_card_id() {
        return incomes_card_id;
    }

    public void setIncomes_card_id(Integer card_id_from) {
        this.incomes_card_id = card_id_from;
    }

    @Column(name = "outcomes_card_id")
    public Integer getOutcomes_card_id() {
        return outcomes_card_id;
    }

    public void setOutcomes_card_id(Integer card_id_to) {
        this.outcomes_card_id = card_id_to;
    }

    @Column(name = "transition_type")
    public String getTransition_type() {
        return transition_type;
    }

    public void setTransition_type(String history_type) {
        this.transition_type = history_type;
    }

    @Column(name = "transition_amount")
    public Long getTransition_amount() {
        return transition_amount;
    }

    public void setTransition_amount(Long amount) {
        this.transition_amount = amount;
    }
}
