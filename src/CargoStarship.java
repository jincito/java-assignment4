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

public class CargoStarship extends Starship {
    private double cargoCapacity;
    private double currentCargo;
    private boolean pressurizedCargoModule;

    public CargoStarship() {
        super();
        setStarshipID("Voyager Carrier - " + generateRandomNumber());
        setMaxDistance(400000);
        setMissionObjective("explore");
        setCrewSize(4);
        this.cargoCapacity = 0;
        this.currentCargo  = 0;
        this.pressurizedCargoModule = true;
    }

    public CargoStarship(double initialCargoCapacity) {
        this();
        setCargoCapacity(initialCargoCapacity);
    }

    public CargoStarship(double initialCargoCapacity, double initialCurentCargo) {
        this(initialCargoCapacity);
        setCurrentCargo(initialCurentCargo);
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(double cargoCapacity) {
        if (cargoCapacity >= 0 && cargoCapacity <= 10000) {
            this.cargoCapacity = cargoCapacity;
        } else {
            System.out.println("Cargo capacity must be between 0 and 10000 tons");
        }
    }

    public double getCurrentCargo() {
        return currentCargo;
    }

    public void setCurrentCargo(double currentCargo) {
        if (currentCargo >= 0 && currentCargo <= cargoCapacity) {
            this.currentCargo = currentCargo;
        } else {
            System.out.println("Current cargo must be between 0 and Cargo Capacity(default 10000)");
        }
    }

    public boolean getPressurizedCargoModule() {
        return pressurizedCargoModule;
    }

    public void setPressurizedCargoModule(boolean pressurizedCargoModule) {
        this.pressurizedCargoModule = pressurizedCargoModule;
    }

    @Override
    public void setCrewSize(int crewSize) {
        if (crewSize >= 2 && crewSize <= 4) {
            super.setCrewSize(crewSize);
        } else {
            throw new IllegalArgumentException("Crew member size must be between 2 and 4 for Cargo Starship");
        }
    }

    @Override
    public void boostVelocity(double amount) {
        double newVelocity = getVelocity() + amount;
        if (newVelocity >= 0 && newVelocity <= 100) {
            setVelocity(newVelocity);
        } else {
            throw new IllegalArgumentException("Velocity amount must be between 0 and " + (100 - getVelocity()));
        }
    }

    @Override
    public void rechargeEnergy(int amount) {
        if (amount < 0 || (getEnergyReserves() + amount) > 100) {
            throw new IllegalArgumentException("Energy amount must be between 0 and " + (100 - getEnergyReserves()));
        }
        super.rechargeEnergy(amount);
    }
}
