package lesson6;

public class Doctor {
    private String doctorType;
    private String name;

    @Override
    public String toString() {
        return "Doctor{" +
                "doctorType='" + doctorType + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    void cure() {
        System.out.println("Общий метод лечения");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDoctorType() {
        return doctorType;
    }

    public void setDoctorType(String doctorType) {
        this.doctorType = doctorType;
    }
}