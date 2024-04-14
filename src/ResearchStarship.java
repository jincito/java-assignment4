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

public class ResearchStarship extends Starship {
    private String researchField;
    private int numberOfScientists;

    public ResearchStarship() {
        super();
        setStarshipID("Voyager Nerd - " + generateRandomNumber());
        this.researchField = "asteroid mining";
        this.numberOfScientists = 2;
    }

    public String getResearchField() {
        return researchField;
    }

    public void setResearchField(String researchField) {
        this.researchField = researchField;
    }

    public int getNumberOfScientists() {
        return numberOfScientists;
    }

    public void setNumberOfScientists(int numberOfScientists) {
        if (numberOfScientists >= 2 && numberOfScientists <= 4) {
            this.numberOfScientists = numberOfScientists;
        } else {
            throw new IllegalArgumentException("Number of scientists must be between 2 and 4");
        }
    }

    @Override
    public void boostVelocity(double amount) {
        double newVelocity = getVelocity() + amount;
        if (newVelocity >= 0 && newVelocity <= 50) {
            setVelocity(newVelocity);
        } else {
            throw new IllegalArgumentException("Velocity amount must be between 0 and " + (50 - getVelocity()));
        }
    }

    @Override
    public void rechargeEnergy(int amount) {
        if (amount < 0 || (getEnergyReserves() + amount) > 50) {
            throw new IllegalArgumentException("Energy amount must be between 0 and " + (50 - getEnergyReserves()));
        }
        super.rechargeEnergy(amount);
    }
}
