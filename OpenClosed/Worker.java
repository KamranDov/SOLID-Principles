package OpenClosed;

import java.util.ArrayList;

public class Worker extends ZooPark {
    private String name;
    private String surname;
    private String birthDate;
    private int age;
    private int workerID;
    private double Salaray;

    public static ArrayList<Worker> workers = new ArrayList<>();
    
    public boolean workerList(Worker worker) {
        return workers.add(worker);
    }

    public static String workerNumbers(String workerNums) {
        return workerNums;
    }

    public Worker() {
    }

    public Worker(String name, String surname, String birthDate, int age, int workerID, double salaray) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.age = age;
        this.workerID = workerID;
        this.Salaray = salaray;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWorkerID() {
        return workerID;
    }

    public void setWorkerID(int workerID) {
        this.workerID = workerID;
    }

    public double getSalaray() {
        return Salaray;
    }

    public void setSalaray(double salaray) {
        Salaray = salaray;
    }


}
