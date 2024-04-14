/*---------------------------------------------------
Name: Jin Carballosa
Student ID: 4000320178
COP 2800 – Java Programming
Spring 2024 – Tu 5:30 PM – 8:50 PM
Assignment #4
Plagiarism Statement
I certify that this assignment is my own work and that I have not
copied in part or whole or otherwise plagiarized the work of other
students, persons, Generative Pre-trained Generators (GPTs) or any other AI tools.
I understand that students involved in academic dishonesty will face
disciplinary sanctions in accordance with the College's Student Rights
and Responsibilities Handbook (https://www.mdc.edu/rightsandresponsibilities)
01234567890123456789012345678901234567890123456789012345678901234567890123456789
----------------------------------------------------------*/

import java.util.Date;
import java.util.Random;

public class Starship{
    private String starshipID;
    private int energyReserves;
    private double velocity;
    private Date launchDate;
    private String missionObjective;
    private double maxDistance;
    private int crewSize;
    private String destination;

    public Starship(){
        this.starshipID = "Voyager Infinity - " + generateRandomNumber();
        this.energyReserves = 0;
        this.velocity = 0;
        this.launchDate = new Date();
        this.missionObjective = "explore";
        this.maxDistance = 400000;
        this.crewSize = 2;
        this.destination = "moon";
    }

    public Starship(int initialEnergyReserve){
        this();
        setEnergyReserves(initialEnergyReserve);
    }

    public Starship(int initialEnergyReserve, double initialVelocity){
        this(initialEnergyReserve);
        setVelocity(initialVelocity);
    }

    public String getMissionObjective() {
        return missionObjective;
    }

    public void setMissionObjective(String missionObjective) {
        this.missionObjective = missionObjective;
    }

    public double getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(double maxDistance) {
        if (maxDistance >= 0) {
            this.maxDistance = maxDistance;
        } else {
            System.out.println("Distance cannot be negative. Please choose a number above 0");
        }
    }

    public int getCrewSize() {
        return crewSize;
    }

    public void setCrewSize(int crewSize) {
        if (crewSize >= 2 && crewSize <= 10) {
            this.crewSize = crewSize;
        } else {
            System.out.println("Crew member size must be between 2 and 10");
        }
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getEnergyReserves(){
        return energyReserves;
    }

    public void setEnergyReserves(int energyReserves){
        if (energyReserves < 0){
            throw new IllegalArgumentException("Energy Reserves cannot be negative.");
        }
        this.energyReserves = energyReserves;
    }

    public double getVelocity(){
        return velocity;
    }

    public void setVelocity(double velocity){
        this.velocity = velocity;
    }
    
    public Date getLaunchDate(){
        return launchDate;
    }

    public String getStarshipID(){
        return starshipID;
    }

    public void setStarshipID(String starshipID) {
        this.starshipID = starshipID;
    }


    public void boostVelocity(double amount){
        this.velocity += amount;
    }

    public void rechargeEnergy(int amount){
        if (amount < 0){
            throw new IllegalArgumentException("Energy Reserves cannot be negative.");
        }
        this.energyReserves += amount;
    }

    public int generateRandomNumber(){
        Random random = new Random();
        return random.nextInt(9000) + 1000;
    }
}