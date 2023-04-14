package day41_CustomClass_Constructors.OfferTask;

public class Offer {
    public String state, jobTitle;
    public boolean hasBenefit, workFromHome;
    public double salary;

    public Offer(String state, String jobTitle, boolean hasBenefit, boolean workFromHome, double salary) {
        this.state = state;
        this.jobTitle = jobTitle;
        this.hasBenefit = hasBenefit;
        this.workFromHome = workFromHome;
        this.salary = salary;
    }

    public String toString() {
        return "Offer{" +
                "state='" + state + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", hasBenefit=" + hasBenefit +
                ", workFromHome=" + workFromHome +
                ", salary=" + salary +
                '}';
    }
}
