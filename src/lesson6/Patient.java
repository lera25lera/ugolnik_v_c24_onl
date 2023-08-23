package lesson6;

public class Patient {
    private String name;
    private Integer plan;
    private Doctor doctor;


    Patient() {
    }

    public Patient(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPlan() {
        return plan;
    }

    public void setPlan(Integer plan) {
        this.plan = plan;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", plan=" + plan +
                ", doctor=" + doctor +
                '}';
    }
}
