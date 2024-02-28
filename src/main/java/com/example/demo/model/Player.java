package com.example.demo.model;

public class Player {
    private String firstName;
    private String lastName;
    private int age;
    private String position;
    private int stamina;
    private int maxSpeed;
    private int acceleration;
    private int sprintSpeed;
    private int agility;
    private int balance;
    private int reactions;
    private int ballControl;
    private int dribbling;
    private int composure;
    private int interceptions;
    private int overall;
    private int potential;
    private int height;
    private int weight;
    private String foot;
    private String weakFoot;
    private String skillMoves;



    private String country;




    public Player() {
    }

    public Player(String firstName, String lastName, int age, String position, int stamina, int maxSpeed, int acceleration, int sprintSpeed, int agility, int balance, int reactions, int ballControl, int dribbling, int composure, int interceptions, int overall, int potential, int height, int weight, String foot, String weakFoot, String skillMoves, String country) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.position = position;
        this.stamina = stamina;
        this.maxSpeed = maxSpeed;
        this.acceleration = acceleration;
        this.sprintSpeed = sprintSpeed;
        this.agility = agility;
        this.balance = balance;
        this.reactions = reactions;
        this.ballControl = ballControl;
        this.dribbling = dribbling;
        this.composure = composure;
        this.interceptions = interceptions;
        this.overall = overall;
        this.potential = potential;
        this.height = height;
        this.weight = weight;
        this.foot = foot;
        this.weakFoot = weakFoot;
        this.skillMoves = skillMoves;
        this.country = country;
    }

    public Player(int numer,String firstName, String lastName) {
    }

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(int acceleration) {
        this.acceleration = acceleration;
    }

    public int getSprintSpeed() {
        return sprintSpeed;
    }

    public void setSprintSpeed(int sprintSpeed) {
        this.sprintSpeed = sprintSpeed;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getReactions() {
        return reactions;
    }

    public void setReactions(int reactions) {
        this.reactions = reactions;
    }

    public int getBallControl() {
        return ballControl;
    }

    public void setBallControl(int ballControl) {
        this.ballControl = ballControl;
    }

    public int getDribbling() {
        return dribbling;
    }

    public void setDribbling(int dribbling) {
        this.dribbling = dribbling;
    }

    public int getComposure() {
        return composure;
    }

    public void setComposure(int composure) {
        this.composure = composure;
    }

    public int getInterceptions() {
        return interceptions;
    }

    public void setInterceptions(int interceptions) {
        this.interceptions = interceptions;
    }

    public int getOverall() {
        return overall;
    }

    public void setOverall(int overall) {
        this.overall = overall;
    }

    public int getPotential() {
        return potential;
    }

    public void setPotential(int potential) {
        this.potential = potential;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getFoot() {
        return foot;
    }

    public void setFoot(String foot) {
        this.foot = foot;
    }

    public String getWeakFoot() {
        return weakFoot;
    }

    public void setWeakFoot(String weakFoot) {
        this.weakFoot = weakFoot;
    }

    public String getSkillMoves() {
        return skillMoves;
    }

    public void setSkillMoves(String skillMoves) {
        this.skillMoves = skillMoves;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}

