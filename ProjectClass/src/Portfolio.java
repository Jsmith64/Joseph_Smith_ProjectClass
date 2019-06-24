import java.util.ArrayList;
import java.util.Arrays;

public class Portfolio { 
	
	ArrayList<Project> portfolio = new ArrayList<>();
	
	public void add(Project project) {
		portfolio.add(project);
	}
	
	public void remove(Project project) {
		portfolio.remove(project);
	}
	
	public double getPortfolioCost() {
		Double sum = 0.0;
		Project temp = new Project();
		for(int i = 0; i < portfolio.size(); i++) {
			temp = portfolio.get(i);
			sum += temp.getCost();			
		}
//		System.out.println("" + sum);
		return sum;
	}
	
//	public String toString(Project project) {
//		
//	}
}