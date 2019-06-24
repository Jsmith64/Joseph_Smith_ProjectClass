

public class Project {
    private String name;
    private String description;
    private Double initialCost;

    public String elevatorPitch(){
        String tempName = this.name;
        String tempDescription = this.description;
        String tempInitialCost = toString(this.initialCost);
        if(tempName == null && tempDescription == null && tempInitialCost ==  null){
            return "There are no values for this object.";
        }
        if(tempName == null){
            tempName = "No name specified";
        }
        if(tempDescription == null){
            tempDescription = "No description given.";
        }
//        if(this.initialCost == null){
//            tempInitialCost = "No initial cost given";
//        }
        String pitch = tempName + " (" + tempInitialCost + "): " + tempDescription;
        return pitch;
    }
    private String toString(Double value){
        String convert = "" + value;
        return convert;
    }

    public Project(){
 
    }

    public Project(String name){
        this.name = name;
    }

    public Project(String name, String description){
        this.name = name;
        this.description = description;
    }
    
    public Project(String name, String description, Double initialCost) {
    	this.name = name;
    	this.description = description;
    	this.initialCost = initialCost;
    }
    public Project(String name, Double initialCost) {
    	this.name = name;
    	this.initialCost = initialCost;
    }
    
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public Double getCost(){
        return initialCost;
    }

    public void setCost(Double cost){
        initialCost = cost;
    }
}
