package lesson6;

public class Surgeon extends Doctor {
    Surgeon(String doctorType, String name) {
        this.setDoctorType(doctorType);
        this.setName(name);
    }

    @Override
    void cure() {
        super.cure();
        System.out.println("+лечение хирурга");
    }
}
