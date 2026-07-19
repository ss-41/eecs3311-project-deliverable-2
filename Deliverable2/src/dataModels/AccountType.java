package dataModels;

public class AccountType {
	
	private int typeID; 
	private String typeName;
	private double hourlyRate;

    public AccountType(int typeID, String typeName, double hourlyRate) {
        this.typeID = typeID;
        this.typeName = typeName;
        this.hourlyRate = hourlyRate;
    }

    public int getTypeID() {
        return typeID;
    }

    public String getTypeName() {
        return typeName;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

}
