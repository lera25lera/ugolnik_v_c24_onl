package lesson6;

public class Therapist extends Doctor {

    Therapist(String doctorType, String name) {
        this.setDoctorType(doctorType);
        this.setName(name);
    }

    @Override
    void cure() {
        super.cure();
        System.out.println("+лечение терапевта");
    }

    public void reabilitation(Patient patient){
        switch (patient.getPlan()){
            case 1: {patient.setDoctor(Clinica.surgeon); Clinica.surgeon.cure(); break;}
            case 2: {patient.setDoctor(Clinica.dentist); Clinica.dentist.cure(); break;}
            default: {patient.setDoctor(Clinica.therapist); Clinica.therapist.cure(); break;}
        }
    }
}
