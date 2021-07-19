package mz.org.fgh.sifmoz.backend.patientVisitDetails

import mz.org.fgh.sifmoz.backend.episode.Episode
import mz.org.fgh.sifmoz.backend.packaging.Pack
import mz.org.fgh.sifmoz.backend.prescription.Prescription

class PatientVisitDetails {


    static belongsTo = [pack: Pack,patientVisit:PatientVisitDetails,episode: Episode]


    static constraints = {
    }
}