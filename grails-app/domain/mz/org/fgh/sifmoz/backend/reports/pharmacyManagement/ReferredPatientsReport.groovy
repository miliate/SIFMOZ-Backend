package mz.org.fgh.sifmoz.backend.reports.pharmacyManagement

class ReferredPatientsReport {

    Long id //ReportId
    String reportId
    String pharmacyId
    String provinceId
    String districtId
    String periodType
    String period
    Date startDate
    Date endDate
    String nid
    String name
    String age
    String lastPrescriptionDate
    String therapeuticalRegimen
    String dispenseType
    Date nexPickUpDate
    Date referrenceDate
    String referralPharmacy

    static constraints = {
        id generator: "uuid"
        pharmacyId nullable: true
        provinceId nullable: true
        districtId nullable: true
        periodType nullable: false , inList: ['MONTH','QUARTER','SEMESTER','ANNUAL']
        startDate nullable: true
        endDate nullable: true

    }
}