package com.myscope.demo.restapi;

import java.util.List;

import com.myscope.demo.restapi.PatientBean;

public interface PatientRegistration {
	
	
	//Registration Table
	List<PatientBean> findAllUsers();
	List<PatientBean> findPatientbymobile(String mobile);
	int insertPatient(PatientBean emp);
	int updatePatient(PatientBean emp);
	int deletePatient(PatientBean emp);
	
	
	//Patient Profile
	List<PatientProfileBean> allfields();
	List<PatientProfileBean> findProfilebymobile(String mobile);
	int insertProfile(PatientProfileBean emp);
	int updateProfile(PatientProfileBean emp);
	int deleteProfile(PatientProfileBean emp);
	
	
	//Disease History Table
	List<DiseaseBean> findDisease();
	List<DiseaseBean> finddiseasebyid(String mobile);
	int insertDisease(DiseaseBean disease);
	int updateDisease(DiseaseBean disease);
	int deleteDisease(DiseaseBean disease);
	

	//Family History Table
	List<FamilyBean> allfamily();
	List<FamilyBean> familybyid(String mobile_no);
	int insertFamily(FamilyBean disease);
	int updateFamily(FamilyBean disease);
	int deleteFamily(FamilyBean disease);
	

	//Diet  Table
	List<HabitsBean> findDiet();
	List<HabitsBean> findDietbyid(String mobile_no);
	int insertDiet(HabitsBean disease);
	int updateDiet(HabitsBean disease);


	//Social History Table
	List<HabitsBean> findSocialHabit();
	List<HabitsBean> findHabitbyid(String mobile_no);
	int insertHabit(HabitsBean disease);
	int updateHabit(HabitsBean disease);
	
	
	//Surgery History
	List<SurgeryBean> findAll_Surgery();
	List<SurgeryBean> findMyScopebyid(String mobile_no);
	
	int insertMyscope_Surgery(SurgeryBean obj);
	int updateMyscope_Surgery(SurgeryBean obj);
	
	//Allergy
	
	List<MyScopeBean> findAll();
	//List<MyScopeBean> findMyScopebycity(String city);
	
	List<MyScopeBean> findAllergybyid(String mobile_no);
	
	
	int insertMyscope(MyScopeBean obj);
	int updateMyscope(MyScopeBean obj);
	
	//Medication History
	
	List<MedicationBean> findAll_Medication();
	List<MedicationBean> findMedicationbyid(String mobile_no);
	
	int insertMyscope_Medication(MedicationBean obj);
	int updateMyscope_Medication(MedicationBean obj);
	
	
	//Immunization History
	
	List<ImmunBean> findAll_Immun();
	//List<MyScopeBean> findMyScopebycity(String city);
	//List<MyScopeBean> findMyScopebyname(String name);
	List<ImmunBean> findImmunebyid(String mobile_no);
	
	int insertMyscope_Immun(ImmunBean obj);;
	int updateMyscope_Immun(ImmunBean obj);
	
	
	//Adverse drug Table
	List<HabitsBean> findadversebyid(String mobile_no);

	int insertadverseDrug(HabitsBean disease);
	int updateadverseDrug(HabitsBean disease);

	/*********************
	 * 
	 * Services MODULE
	 * 
	 * ********************/
	
	//Services  Table
	List<HabitsBean> findServices();
	List<HabitsBean> findServicesbyid(String mobile_no);
	int insertServices(HabitsBean disease);
	int updateServices(HabitsBean disease);
	
	
	/*********************
	 * 
	 * PRESCRIPTION MODULE
	 * 
	 * ********************/
	//Doctor List
	List<PrescriptionManualBean> findAllPrescriptions();
	List<PrescriptionManualBean> findPrescriptionbymobile(String mobile_no);
	List<PrescriptionManualBean> findPrescriptionbyid(String mobile_no,String model_name);
	List<PrescriptionManualBean> findPrescriptionbyPId(int prescription_id);
	int insertPrescription(PrescriptionManualBean pb);
	int updatePrescription(PrescriptionManualBean pb);
	int deletePrescription(PrescriptionManualBean pb);
	
	
	//Durg List
	List<PrescriptionDurgBean> findAllDrugs();
	List<PrescriptionDurgBean> findDrugbyid(int id);
	List<PrescriptionDurgBean> findPrescriptionbydrugId(int drug_id);
	int insertDrug(PrescriptionDurgBean pb);
	int updateDrug(PrescriptionDurgBean pb);
	int deleteDrug(PrescriptionDurgBean pb);
	
	//Prescription upload List
		List<PrescriptionUploadBean> alluploadedprescriptions();
		List<PrescriptionUploadBean> uploadprescriptionbyid(String mobile_no);
		List<PrescriptionUploadBean> uploadprescriptionbymodelname(String mobile_no,String model_name);
		int uploadPrescription(PrescriptionUploadBean pb);
		int removeuploadedPrescription(PrescriptionUploadBean pb);
		
		
		/*********************
		 * 
		 * 
		 * Self monitoroing modules
		 * 
		 * ********************/
		
		//Glucose  Table
				List<GlucoseBean> findGlucose();
					List<GlucoseBean> findglucosebyid(String mobile_no);
					int insertGlucose(GlucoseBean obj);
					int updateGlucose(GlucoseBean obj);
					
				//Pressure  Table
					List<PressureBean> findPressure();
							List<PressureBean> findpressurebyid(String mobile_no);
							int insertPressure(PressureBean obj);
							int updatePressure(PressureBean obj);
							
				//Cholestrol  Table
							List<CholestrolBean> findCholestrol();
							List<CholestrolBean> findcholestrolbyid(String mobile_no);
							int insertCholestrol(CholestrolBean obj);
							int updateCholestrol(CholestrolBean obj);
				
				//bmi  Table
							List<BmiBean> findBmi();
							List<BmiBean> findbmibyid(String mobile_no);
							int insertBmi(BmiBean obj);
							int updateBmi(BmiBean obj);
							
							//emotional state  Table
							List<EmotionalBean> findEmotional_status();
							List<EmotionalBean> findemotional_statusbyid(String mobile_no);
							int insertEmotional_status(EmotionalBean obj);
							int updateEmotional_status(EmotionalBean obj);
					
							/***********************
							 * 
							 * Medical Documents
							 * 
							 * **********************/
					
					//Document-dental
					List<Document_dentalBean> dentalprescriptions();
					List<Document_dentalBean> dentalprescriptionbyid(String mobile_no);
					int dentalPrescription(Document_dentalBean pb);
					int removedentalPrescription(Document_dentalBean pb);	
					
					//Document-diet
					List<Document_dietBean> dietprescriptions();
					List<Document_dietBean> dietprescriptionbyid(String mobile_no);
					int dietPrescription(Document_dietBean pb);
					int removedietPrescription(Document_dietBean pb);
					
					//Document-discharge
					List<Document_dischargeBean> dischargeprescriptions();
					List<Document_dischargeBean> dischargeprescriptionbyid(String mobile_no);
					int dischargePrescription(Document_dischargeBean pb);
					int removedischargePrescription(Document_dischargeBean pb);
					
					//Document-education
					List<Document_educationBean> educationprescriptions();
					List<Document_educationBean> educationprescriptionbyid(String mobile_no);
					int educationPrescription(Document_educationBean pb);
					int removeeducationPrescription(Document_educationBean pb);
					
					//Document-immunization
					List<Document_immunBean> immunprescriptions();
					List<Document_immunBean> uploadimmunbyid(String mobile_no);
					int immunPrescription(Document_immunBean pb);
					int removeimmunPrescription(Document_immunBean pb);
					
					//Document-insurance
					List<Document_insuranceBean> insuranceprescriptions();
					List<Document_insuranceBean> uploadinsurancebyid(String mobile_no);
					int insurancePrescription(Document_insuranceBean pb);
					int removeinsurancePrescription(Document_insuranceBean pb);
					
					//Document-others
					List<Document_otherBean> otherprescriptions();
					List<Document_otherBean> uploadotherbyid(String mobile_no);
					int otherPrescription(Document_otherBean pb);
					int removeotherPrescription(Document_otherBean pb);
					
					/***********************
					 * 
					 * LAB REPORTS MODULE
					 * 
					 * **********************/
				
					//Blood-Bean sub module
					List<Lab_bloodBean> allbloodreports();
					List<Lab_bloodBean> bloodreportsbyid(String mobile_no);
					int uploadbloodreport(Lab_bloodBean pb);
					int removebloodreport(Lab_bloodBean pb);	
					
					//Colonoscopy sub module
					List<Lab_colonoscopyBean> allcolonoscopyreports();
					List<Lab_colonoscopyBean>colonoscopyreportsbyid(String mobile_no);
					int uploadcolonoscopyreport(Lab_colonoscopyBean pb);
					int removecolonoscopyreport(Lab_colonoscopyBean pb);
					
					//CT scan report sub module
					List<Lab_ctscanBean> ctscanreports();
					List<Lab_ctscanBean> ctscanreportbyid(String mobile_no);
					int uploadctscanreport(Lab_ctscanBean pb);
					int removedctscanreport(Lab_ctscanBean pb);
					
					//ECG reports sub module
					List<Lab_ecgBean> ecgreports();
					List<Lab_ecgBean> ecgreportbyid(String mobile_no);
					int uploadecg(Lab_ecgBean pb);
					int removeecg(Lab_ecgBean pb);
					
					//ECHO reports sub module
					List<Lab_echoBean> echoreports();
					List<Lab_echoBean> echoreportbyid(String mobile_no);
					int uploadecho(Lab_echoBean pb);
					int removeecho(Lab_echoBean pb);
					
					//MRI report sub module
					List<Lab_mriBean> mrireports();
					List<Lab_mriBean> mrireportsbyid(String mobile_no);
					int uploadmrireport(Lab_mriBean pb);
					int removemrireport(Lab_mriBean pb);
					
					//Others report sub module
					List<Lab_otherBean> otherreports();
					List<Lab_otherBean> otherreportsbyid(String mobile_no);
					int uploadother(Lab_otherBean pb);
					int removeother(Lab_otherBean pb);
					
					//Stress-test sub module
					List<Lab_stressBean> stressreports();
					List<Lab_stressBean> stressreportsbyid(String mobile_no);
					int uploadstress(Lab_stressBean pb);
					int removestresstest(Lab_stressBean pb);	
					
					//Ultrasound sub module
					List<Lab_ultrasoundBean> ultrasoundreports();
					List<Lab_ultrasoundBean> ultrasoundreportsbyid(String mobile_no);
					int uploadultrasound(Lab_ultrasoundBean pb);
					int removeultrasound(Lab_ultrasoundBean pb);
					
					//Upload sub module
					List<Lab_urineBean> urinereports();
					List<Lab_urineBean> urinereportsbyid(String mobile_no);
					int uploadurine(Lab_urineBean pb);
					int removeurine(Lab_urineBean pb);
					
					//Xray sub module
					List<Lab_xrayBean> xrayreports();
					List<Lab_xrayBean> xrayreportbyid(String mobile_no);
					int uploadxray(Lab_xrayBean pb);
					int removexray(Lab_xrayBean pb);

					
					/***********************
					 * 
					 * EDUCATION MODULE
					 * 
					 * **********************/
					
					//education image
				
					List<EducationBean> educationlistimages();
					List<EducationBean> educationlistimagesbymodelname(String education_imagesubtype);
					int uploadeducationimage(EducationBean pb);
					int removeeducationimage(EducationBean pb);
					
					//education pdf
					
					List<EducationBean> educationlistpdf();
					List<EducationBean> educationlistpdfbysubtype(String education_pdfsubtype);
					int uploadeducationpdf(EducationBean pb);
					int removeeducationpdf(EducationBean pb);
					
					//education weblinks
					
					List<EducationBean> educationlistweblinks();
					List<EducationBean> educationlistweblinksbysubtype(String education_websubtype);
					int uploadeducationweblinks(EducationBean pb);
					int removeeducationweblinks(EducationBean pb);


					
}
