package mz.org.fgh.sifmoz.backend.patientVisit

import grails.gorm.services.Service
import grails.gorm.transactions.Transactional
import mz.org.fgh.sifmoz.backend.clinic.Clinic
import mz.org.fgh.sifmoz.backend.packaging.Pack

@Transactional
@Service(PatientVisit)
abstract class PatientVisitService implements IPatientVisitService{

    @Override
    List<PatientVisit> getAllByClinicId(String clinicId, int offset, int max) {
        return PatientVisit.findAllByClinic(Clinic.findById(clinicId),[offset: offset, max: max])
    }
}
