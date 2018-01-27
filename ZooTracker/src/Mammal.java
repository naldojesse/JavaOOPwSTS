
public class Mammal {
	private int energyLevel = 100;
	public int displayEnergy() {
		System.out.println("Energy level is at: " + energyLevel);
		return energyLevel;
	}
	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	public int getEnergyLevel() {
		return energyLevel;
	}
}
