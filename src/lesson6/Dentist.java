package lesson6;

public class Dentist extends Doctor {
    Dentist(String doctorType, String name) {
        this.setDoctorType(doctorType);
        this.setName(name);
    }

    @Override
    void cure() {
        super.cure();
        System.out.println("+лечение стоматолога");
    }
}
