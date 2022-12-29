package OpenClosed;

import java.util.ArrayList;

public class ZooPark {

    private String zooName = "SMILEY ZOO";
    private String territorialArea = "10 HA";
    private String zooChief = null;
    private String zooGuide = null;
    private double ticketPrice;
    private int constructionDate = 1973;

    public ZooPark() {
    }

    public ZooPark(String zooName, int constructionDate, String territorialArea, String zooChief, String zooGuide,
                   double ticketPrice) {
        this.zooName = zooName;
        this.constructionDate = constructionDate;
        this.territorialArea = territorialArea;
        this.zooChief = zooChief;
        this.zooGuide = zooGuide;
        this.ticketPrice = ticketPrice;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public String getZooChief() {
        return zooChief;
    }

    public void setZooChief(String zooChief) {
        this.zooChief = zooChief;
    }

    public String getZooGuide() {
        return zooGuide;
    }

    public void setZooGuide(String zooGuide) {
        this.zooGuide = zooGuide;
    }

    public String getZooName() {
        return zooName;
    }

    public void setZooName(String zooName) {
        this.zooName = zooName;
    }

    public int getConstructionDate() {
        return constructionDate;
    }

    public void setConstructionDate(int constructionDate) {
        this.constructionDate = constructionDate;
    }

    public String getTerritorialArea() {
        return territorialArea;
    }

    public void setTerritorialArea(String territorialArea) {
        this.territorialArea = territorialArea;
    }
}
