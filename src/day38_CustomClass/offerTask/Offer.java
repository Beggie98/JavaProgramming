package day38_CustomClass.offerTask;

public class Offer {
    public String state;
    public boolean hasBenefit;
    public double salary;
    public boolean workFromHome;
    public String jobTitle;

    public void setInfo(String state, boolean hasBenefit, double salary, boolean workFromHome, String jobTitle) {
        this.state = state;
        this.hasBenefit = hasBenefit;
        this.salary = salary;
        this.workFromHome = workFromHome;
        this.jobTitle = jobTitle;
    }

    public String toString() {
        return "Offer{" +
                "state='" + state + '\'' +
                ", hasBenefit=" + hasBenefit +
                ", salary=" + salary +
                ", workFromHome=" + workFromHome +
                ", jobTitle='" + jobTitle + '\'' +
                '}';
    }
}
/*
 Attributes:
	       state, hasBenifit(boolean), salary, WFH(boolean), JobTitle

	    Actions:
	        SetInfo, toString
 */