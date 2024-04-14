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

public class TestStarship{
    public static void main(String[] args){
        Starship starship = new Starship(50000, 500);
        CargoStarship cargoStarship = new CargoStarship(10000, 5000);
        ResearchStarship researchStarship = new ResearchStarship();
        starship.boostVelocity(100);
        starship.rechargeEnergy(10000);
        cargoStarship.boostVelocity(100);
        cargoStarship.rechargeEnergy(100);
        cargoStarship.setCrewSize(3);
        cargoStarship.setMissionObjective("scavenge supplies");
        researchStarship.boostVelocity(50);
        researchStarship.rechargeEnergy(50);
        researchStarship.setNumberOfScientists(4);
        researchStarship.setMissionObjective("collect samples");

        System.out.println("GENERATING SPACE VOYAGE...");
        System.out.println("Starship Deployment Date: " + starship.getLaunchDate());
        System.out.println("Starship ID: " + starship.getStarshipID());
        System.out.println("Mission objective: " + starship.getMissionObjective());
        System.out.println("Crew Size: " + starship.getCrewSize());
        System.out.println("Energy Reserves: " + starship.getEnergyReserves());
        System.out.println("Velocity: " + starship.getVelocity());
        System.out.println("Max Distance: " + starship.getMaxDistance());
        System.out.println("Destination: " + starship.getDestination());
        System.out.println("---------------");
        System.out.println("Cargo Starship Deployment Date: " + cargoStarship.getLaunchDate());
        System.out.println("Cargo Starship ID: " + cargoStarship.getStarshipID());
        System.out.println("Mission Objective: " + cargoStarship.getMissionObjective());
        System.out.println("Crew Size: " + cargoStarship.getCrewSize());
        System.out.println("Energy Reserves: " + cargoStarship.getEnergyReserves());
        System.out.println("Velocity: " + cargoStarship.getVelocity());
        System.out.println("Cargo Capacity: " + cargoStarship.getCargoCapacity());
        System.out.println("Current cargo: " + cargoStarship.getCurrentCargo());
        System.out.println("Pressurized Cargo Module: " + cargoStarship.getPressurizedCargoModule());
        System.out.println("---------------");
        System.out.println("Research Starship Deployment Date: " + researchStarship.getLaunchDate());
        System.out.println("Research Starship ID: " + researchStarship.getStarshipID());
        System.out.println("Mission Objective: " + researchStarship.getMissionObjective());
        System.out.println("Scientist Crew Size: " + researchStarship.getNumberOfScientists());
        System.out.println("Research objective: " + researchStarship.getResearchField());
        System.out.println("Energy Reserves: " + researchStarship.getEnergyReserves());
        System.out.println("Velocity: " + researchStarship.getVelocity());
    }
}