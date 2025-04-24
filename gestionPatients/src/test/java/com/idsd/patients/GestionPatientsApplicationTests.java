package com.idsd.patients;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.idsd.patients.entities.Patient;
import com.idsd.patients.repos.PatientRepository;

@SpringBootTest
class GestionPatientsApplicationTests {

    @Autowired
    private PatientRepository patientRepository;

    @Test
    public void testCreatePatient() {
        Patient prod = new Patient("John Doe", new Date(), true, 75);
        patientRepository.save(prod);
    }

    @Test
    public void testListPatients() {
        List<Patient> patients = patientRepository.findAll();
        for (Patient p : patients) {
            System.out.println(p.getNom());
        }
    }

    @Test
    public void testSearchPatientById() {
        // Hardcoded ID for demo purposes — make sure this ID exists
        Long id = 1L;
        patientRepository.findById(id).ifPresentOrElse(
            p -> System.out.println(p.getNom()),
            () -> System.out.println("Patient not found")
        );
    }

    @Test
    public void testSearchPatientsByName() {
        List<Patient> patients = patientRepository.chercherPatients("john");
        for (Patient p : patients) {
            System.out.println(p.getNom());
        }
    }
    
    @Test
    public void testUpdatePatient()
    {
    Patient p = patientRepository.findById(1L).get();
    p.setNom("moulouk");
    patientRepository.save(p);
    }
    @Test
    public void testdeletepatient()
    {
 patientRepository.deleteById((long) 2);
  
    }
}
