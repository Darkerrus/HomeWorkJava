package com.company;

public class Human {
    private String name;
    Head head;
    Hand hand;
    Leg leg;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getHead() {
        return head.getValue_head();
    }

    public String getHand() {
        return hand.getValue_hand();
    }

    public String getLeg() {
        return leg.getValue_leg();
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    String ToString() {
        return "Имя человека: " + getName() + ". Голова человека: " + getHead() + ". Руки человека: " + getHand() + ". Ноги человека: " + getLeg();
    }
}
class Head {
    private String value_head;

    public void setValue_head(String value_head) {
        this.value_head = value_head;
    }

    public String getValue_head() {
        return value_head;
    }
}

class Hand {
    private String value_hand;

    public void setValue_hand(String value_hand) {
        this.value_hand = value_hand;
    }

    public String getValue_hand() {
        return value_hand;
    }
}

class Leg {
    private String value_leg;

    public void setValue_leg(String value_leg) {
        this.value_leg = value_leg;
    }

    public String getValue_leg() {
        return value_leg;
    }
}
