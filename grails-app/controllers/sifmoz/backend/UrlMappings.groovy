package sifmoz.backend

class UrlMappings {

    static mappings = {
        delete "/api/$controller/$id(.$format)?"(action:"delete")
        get "/api/$controller(.$format)?"(action:"index")
        get "/api/$controller/$id(.$format)?"(action:"show")
        post "/api/$controller(.$format)?"(action:"save")
        put "/api/$controller/$id(.$format)?"(action:"update")
        patch "/api/$controller/$id(.$format)?"(action:"patch")
        patch "/api/inventory/close/$id(.$format)?"(controller:'inventory', action:'close')
        post "/api/patient/search(.$format)?"(controller:'patient', action:'search')
        get "/api/patient/searchByParam/$searchString/$clinicId(.$format)?"(controller:'patient', action:'searchByParam')
        get "/api/dashBoard/getRegisteredPatientByDispenseType/$year/$clinicId/$serviceCode(.$format)?"(controller:'dashBoard', action:'getRegisteredPatientByDispenseType')
        get "/api/dashBoard/getPatientsFirstDispenseByGender/$year/$clinicId/$serviceCode(.$format)?"(controller:'dashBoard', action:'getPatientsFirstDispenseByGender')
        get "/api/dashBoard/getPatientsFirstDispenseByAge/$year/$clinicId/$serviceCode(.$format)?"(controller:'dashBoard', action:'getPatientsFirstDispenseByAge')
        get "/api/dashBoard/getActivePatientPercentage/$year/$clinicId/$serviceCode(.$format)?"(controller:'dashBoard', action:'getActivePatientPercentage')
        get "/api/dashBoard/getDispenseByAge/$year/$clinicId/$serviceCode(.$format)?"(controller:'dashBoard', action:'getDispenseByAge')
        get "/api/dashBoard/getDispensesByGender/$year/$clinicId/$serviceCode(.$format)?"(controller:'dashBoard', action:'getDispensesByGender')
        get "/api/dashBoard/getStockAlert/$clinicId/$serviceCode(.$format)?"(controller:'dashBoard', action:'getStockAlert')
        get "/api/dashBoard/getDashboardServiceButton/$year/$clinicId(.$format)?"(controller:'dashBoard', action:'getDashboardServiceButton')
        get "/api/patient/openmrsSession/$interoperabilityId/$username/$password(.$format)?"(controller:'patient', action:'getOpenMRSSession')
        "/api/patientVisitDetails/getLastByEpisodeId/$episodeId(.$format)?"(controller:'patientVisitDetails', action:'getLastByEpisodeId')
        get "/api/patient/openmrsSearch/$interoperabilityId/$nid/$username/$password(.$format)?"(controller:'patient', action:'getOpenMRSPatient')
        get "/api/patient/clinic/$clinicId(.$format)?"(controller:'patient', action:'getByClinicId')
        get "/api/stockEntrance/clinic/$clinicId(.$format)?"(controller:'stockEntrance', action:'getByClinicId')
        get "/api/inventory/clinic/$clinicId(.$format)?"(controller:'inventory', action:'getByClinicId')
        get "/api/patientServiceIdentifier/clinic/$clinicId(.$format)?"(controller:'patientServiceIdentifier', action:'getByClinicId')
        get "/api/patientServiceIdentifier/patient/$patientId(.$format)?"(controller:'patientServiceIdentifier', action:'getByPatientId')
        //        get "/patientServiceIdentifier/service/$serviceId(.$format)?"(controller:'patientServiceIdentifier', action:'getByServiceId')
        get "/api/episode/clinic/$clinicId(.$format)?"(controller:'episode', action:'getByClinicId')
        get "/api/episode/identifier/$identifierId(.$format)?"(controller:'episode', action:'getByIdentifierId')
        get "/api/episode/getLastWithVisitByIndentifier/$identifierId/$clinicId(.$format)?"(controller:'episode', action:'getLastWithVisitByIndentifier')
        get "/api/doctor/clinic/$clinicId(.$format)?"(controller:'doctor', action:'getByClinicId')
        get "/api/patientVisit/clinic/$clinicId(.$format)?"(controller:'patientVisit', action:'getAllByClinicId')
        get "/api/patientVisitDetails/clinic/$clinicId(.$format)?"(controller:'patientVisitDetails', action:'getAllByClinicId')
        get "/api/patientVisitDetails/clinic/$clinicId(.$format)?"(controller:'patientVisitDetails', action:'getAllByClinicId')
        get "/api/patientVisitDetails/getAllofPrecription/$prescriptionId(.$format)?"(controller:'patientVisitDetails', action:'getAllofPrecription')
        get "/api/prescription/clinic/$clinicId(.$format)?"(controller:'prescription', action:'getAllByClinicId')
        get "/api/pregnancyScreening/patientVisit/$patientVisitId(.$format)?"(controller:'pregnancyScreening', action:'getAllByPatientVisit')
        get "/api/prescription/visits/$pvdsId(.$format)?"(controller:'prescription', action:'getByVisitId')
        get "/api/pack/clinic/$clinicId(.$format)?"(controller:'pack', action:'getAllByClinicId')
        get "/api/pack/patientVisitDetails/$patientVisitDetailsId(.$format)?"(controller:'pack', action:'getAllByPatientVisitDetailsId')
        get "/api/packagedDrug/pack/$packId(.$format)?"(controller:'packagedDrug', action:'getAllByPackId')
        get "/api/prescribedDrug/prescription/$prescriptionId(.$format)?"(controller:'prescribedDrug', action:'getAllByPrescriptionId')
        get "/api/prescriptionDetail/prescription/$prescriptionId(.$format)?"(controller:'prescriptionDetail', action:'getAllByPrescriptionId')
        get "/api/patientVisit/patient/$patientId(.$format)?"(controller:'patientVisit', action:'getByPatientId')
        get "/api/groupInfo/clinic/$clinicId(.$format)?"(controller:'groupInfo', action:'getByClinicId')
        get "/api/groupInfo/validadePatient/$patientId/$serviceCode(.$format)?"(controller:'groupInfo', action:'validadePatient')
        get "/api/patientVisit/lastofPatient/$patientId(.$format)?"(controller:'patientVisit', action:'getLastVisitOfPatient')
        get "/api/pack/prescription/$prescriptionId(.$format)?"(controller:'pack', action:'getAllByPrescriptionId')
        get "/api/patient/reportActiveByServiceCode/"(controller:'patient', action:'getReportActiveByServiceCode')
        get "/api/migrationLog/printReport/"(controller:'migration', action:'printReport')
        post "/api/$controller/initReportProcess(.$format)?"(action:'initReportProcess')
        get "/api/$controller/printReport/$reportId(.$format)?"(action:'getProcessedData')
        get "/api/$controller/printReport/$reportId/$fileType(.$format)?"(action:'printReport')
        get "/api/$controller/getProcessingStatus/$reportId(.$format)?"(action:'getProcessingStatus')
        get "/api/$controller/printReport/$reportId(.$format)?"(action:'printReport')
        get "/api/$controller/migrationStatus(.$format)?"(action:"migrationStatus")
        get "/api/$controller/migrationStatusDetails/$stage(.$format)?"(action:"migrationStatusDetails")
        post "/api/$controller/initMigration(.$format)?"(action:"initMigration")
        delete "/api/$controller/delete/$reportId(.$format)?"(action:'deleteByReportId')

        get "/api/$controller/getPatientNid/$nid(.$format)?"(action:'getDetailsByNid')
     //   get "/systemConfigs/$key(.$format)?"(action:'getByKey')
        get "/api/clinic/district/$districtId(.$format)?"(controller:'clinic', action:'searchClinicsByDistrictId')
        get "/api/clinic/province/$provinceCode(.$format)?"(controller:'clinic', action:'searchClinicsByProvinceCode')
        get "/api/groupMemberPrescription/member/$memberId(.$format)?"(controller:'groupMemberPrescription', action:'getByMemberId')

        post "/api/secrUserRole/(.$format)?"(controller:'secUserRole', action:'save')
       // "/"(controller: 'application', action:'index')
        //"/"(controller: 'application', action:'index')
        "/"(view:"/login/auth")
        "500"(view: '/error')
        "404"(view: '/notFound')
    }
}
