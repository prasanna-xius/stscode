package com.myscope.demo.restapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.google.gson.JsonIOException;
import com.myscope.demo.restapi.PatientBean;
import com.myscope.demo.restapi.PatientRow;

@Repository
public class PatientRegDAO implements PatientRegistration {
	
	@Autowired
	JdbcTemplate jtemplate; 
	
	//************************Registration module ********************************
	@Override
	public List<PatientBean> findAllUsers() {
		// TODO Auto-generated method stub
		final String getQuery = "SELECT * FROM PATIENT_REGISTER";
		List<PatientBean> list = jtemplate.query(getQuery, new PatientRow());
		return list;
	}

	@Override
	public List<PatientBean> findPatientbymobile(String mobile) {
		// TODO Auto-generated method stub
		final String getQuery = "SELECT * FROM PATIENT_REGISTER WHERE MOBILE_NO=?";
		List<PatientBean> list = jtemplate.query(getQuery, new PatientRow(), mobile);
		return list;
	}

	@Override
	public int insertPatient(PatientBean pb) {
		// TODO Auto-generated method stub
		int resp = 0;
		try {
		final String addQuery = "INSERT INTO patient_register(first_name,last_name,mobile_no,email) VALUES(?,?,?,?)";
		resp = jtemplate.update(addQuery, new Object[] {pb.getFirst_name(), pb.getLast_name() ,pb.getMobile(), pb.getEmail()});
		

		} catch (Exception e) {
			e.printStackTrace();
		}
		return resp;
	}

	@Override
	public int updatePatient(PatientBean pb) {
		// TODO Auto-generated method stub
		int resp = 0;
		try {
		final String updateQuery = "UPDATE PATIENT_REGISTER SET FIRST_NAME=?,last_name = ?,email = ? WHERE MOBILE_NO=?";
		 resp = jtemplate.update(updateQuery, new Object[] {pb.getFirst_name(),pb.getLast_name(),pb.getEmail(), pb.getMobile()});
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resp;
	}

	@Override
	public int deletePatient(PatientBean pb) {
		// TODO Auto-generated method stub
		final String updateQuery = "DELETE FROM PATIENT_REGISTER WHERE MOBILE_NO=?";
		int resp = jtemplate.update(updateQuery, new Object[] {pb.getMobile()});
		
		return resp;
	}

	
	//**************************Patient Profile******************************************
		@Override
		public List<PatientProfileBean> allfields() {
			// TODO Auto-generated method stub
			final String getQuery = "SELECT * FROM PATIENT_PROFILE";
			List<PatientProfileBean> list = jtemplate.query(getQuery, new PatientProfileRow());
			return list;
		}

		@Override
		public List<PatientProfileBean> findProfilebymobile(String mobile) {
			// TODO Auto-generated method stub
			final String getQuery = "SELECT * FROM PATIENT_PROFILE WHERE MOBILE_NO=?";
			List<PatientProfileBean> list = jtemplate.query(getQuery, new PatientProfileRow(), mobile);
			return list;
		}

		@Override
		public int insertProfile(PatientProfileBean pb) {
			// TODO Auto-generated method stub
			int resp = 0;
			try {
			final String addQuery = "INSERT INTO patient_profile(first_name,last_name,gender,dob,age,weight,height,bmi,blood_group,doctor_name,pharmacist_name,languages_known,education,marital_status,mobile_no,email,family_income) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			resp = jtemplate.update(addQuery, new Object[] {pb.getFirst_name(), pb.getLast_name(),pb.getGender(),pb.getDob(),pb.getAge(),pb.getHeight(),pb.getWeight(),pb.getBmi(),pb.getBlood_group(),pb.getDoctor_name(),pb.getPharmacist_name(),pb.getLanguages_known(),pb.getEducation(),pb.getMarrital_status(),pb.getMobile_no(),pb.getEmail(),pb.getFamily_income()});
			} catch (Exception e) {
				e.printStackTrace();
			}
			return resp;
		}
		

		@Override
		public int updateProfile(PatientProfileBean pb) {
			// TODO Auto-generated method stub
			int resp = 0;
			try {

			final String updateQuery = "UPDATE PATIENT_PROFILE SET first_name=?,last_name=?,gender=?,dob=?,age=?,weight=?,height=?,bmi=?,blood_group=?,doctor_name=?,pharmacist_name=?,languages_known=?,education=?,marital_status=?,email=?,family_income=? WHERE MOBILE_NO=?";
			 resp = jtemplate.update(updateQuery, new Object[] {pb.getFirst_name(), pb.getLast_name(),pb.getGender(),pb.getDob(),pb.getAge(),pb.getHeight(),pb.getWeight(),pb.getBmi(),pb.getBlood_group(),pb.getDoctor_name(),pb.getPharmacist_name(),pb.getLanguages_known(),pb.getEducation(),pb.getMarrital_status(),pb.getEmail(),pb.getFamily_income(),pb.getMobile_no()});
			} catch (Exception e) {
				e.printStackTrace();
			}
			return resp;
		}

		@Override
		public int deleteProfile(PatientProfileBean pb) {
			// TODO Auto-generated method stub
			final String updateQuery = "DELETE FROM PATIENT_PROFILE WHERE MOBILE_NO=?";
			int resp = jtemplate.update(updateQuery, new Object[] {pb.getMobile_no()});
			
			return resp;
		}

	
	
	//***********************Disease List***********************************
	@Override
	public List<DiseaseBean> findDisease() {
		final String getQuery = "SELECT * FROM DISEASE_HISTORY";
		List<DiseaseBean> list = jtemplate.query(getQuery, new DiseaseRow());
		return list;
	}

	@Override
	public List<DiseaseBean> finddiseasebyid(String mobile_no) {
		// TODO Auto-generated method stub
		final String getQuery = "SELECT * FROM DISEASE_HISTORY WHERE MOBILE_NO=?";
		List<DiseaseBean> list = jtemplate.query(getQuery, new DiseaseRow(), mobile_no);
		return list;
	}

	@Override
	public int insertDisease(DiseaseBean db) {
		final String addQuery = "INSERT INTO disease_history(mobile_no,known_condition,disease_status,disease_duration,when_started,when_ended,disease_note,disease_save_on) VALUES(?,?,?,?,?,?,?,?)";
		int resp = jtemplate.update(addQuery, new Object[] {db.getMobile_no(),db.getKnown_condition(),db.getDisease_status(),db.getDisease_duration(),db.getWhen_started(),db.getWhen_ended(),db.getDisease_note(),db.getDisease_save_on()});
		return resp;
	}

	@Override
	public int updateDisease(DiseaseBean db) {
		// TODO Auto-generated method stub
		final String updateQuery = "UPDATE DISEASE_HISTORY SET Known_condition = ?,Disease_status = ?,disease_duration = ?, when_started = ?, when_ended= ?,disease_note = ?,mobile_no = ?,disease_updated_on = ? WHERE disease_id=?";
		int resp = jtemplate.update(updateQuery, new Object[] {db.getKnown_condition() ,db.getDisease_status(),db.getDisease_duration(),db.getWhen_started(),db.getWhen_ended(),db.getDisease_note(),db.getMobile_no(),db.getDisease_updated_on(),db.getId()});
		return resp;
	}

	@Override
	public int deleteDisease(DiseaseBean db) {
		// TODO Auto-generated method stub
		final String updateQuery = "DELETE FROM DISEASE_HISTORY WHERE disease_id=?";
		int resp = jtemplate.update(updateQuery, new Object[] {db.getMobile_no()});
		return resp;
	}

	//****************************Family module***************************************
	@Override
	public List<FamilyBean> allfamily() {
		// TODO Auto-generated method stub
		final String getQuery = "SELECT * FROM FAMILY_HISTORY";
		List<FamilyBean> list = jtemplate.query(getQuery, new FamilyRow());
		return list;
	
	}

	@Override
	public List<FamilyBean> familybyid(String mobile_no) {
		// TODO Auto-generated method stub
		final String getQuery = "SELECT * FROM FAMILY_HISTORY WHERE MOBILE_NO=?";
		List<FamilyBean> list = jtemplate.query(getQuery, new FamilyRow(), mobile_no);
		return list;
	
	}

	@Override
	public int insertFamily(FamilyBean db) {
		// TODO Auto-generated method stub
		int resp = 0;
		try {
		final String addQuery = "INSERT INTO family_history(family_condition,relationship,family_note,mobile_no,family_saved_on) VALUES(?,?,?,?,?)";
		resp = jtemplate.update(addQuery, new Object[] {db.getFamily_condition(),db.getRelationship(),db.getFamily_note(),db.getMobile_no(),db.getFamily_save_on()});
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resp;
	}

	@Override
	public int updateFamily(FamilyBean fb) {
		// TODO Auto-generated method stub
		final String updateQuery = "UPDATE FAMILY_HISTORY SET family_condition = ?,relationship = ?,family_note = ?,mobile_no = ?,family_updated_on = ? WHERE family_id=?";
		int resp = jtemplate.update(updateQuery, new Object[] {fb.getFamily_condition(),fb.getRelationship(),fb.getFamily_note(),fb.getMobile_no(),fb.getFamily_updated_on(),fb.getFamilyid()});
		return resp;
	}

	@Override
	public int deleteFamily(FamilyBean db) {
		// TODO Auto-generated method stub
		final String updateQuery = "DELETE FROM FAMILY_HISTORY WHERE family_id=?";
		int resp = jtemplate.update(updateQuery, new Object[] {db.getFamilyid()});
		return resp;
	}

	//*********************Diet Module****************************
		@Override
		public List<HabitsBean> findDiet() {
			// TODO Auto-generated method stub
			final String getQuery = "SELECT * FROM PATIENT_DIET";
			List<HabitsBean> list = jtemplate.query(getQuery, new DietRow());
			return list;
		}

		@Override
		public List<HabitsBean> findDietbyid(String mobile_no) {
			// TODO Auto-generated method stub
			final String getQuery = "SELECT * FROM PATIENT_DIET WHERE MOBILE_NO=?";
			List<HabitsBean> list1 = jtemplate.query(getQuery, new DietRow(), mobile_no);
			return list1;
		}

		@Override
		public int insertDiet(HabitsBean db) {
			// TODO Auto-generated method stub
			int resp = 0;
			try {
			final String addQuery = "INSERT INTO patient_diet(diet,mobile_no,diet_saved_on , spl_diet_notes) VALUES(?,?,?,?)";
			resp = jtemplate.update(addQuery, new Object[] {db.getDiet(),db.getMobile_no(), db.getSpl_diet_notes(),db.getDiet_saved_on()});
			} catch (Exception e) {
				e.printStackTrace();
			}
			return resp;
		}
		@Override
		public int updateDiet(HabitsBean pb) {
			// TODO Auto-generated method stub
			int resp = 0;
			try {
			final String updateQuery = "UPDATE patient_diet SET DIET=?, spl_diet_notes = ?, diet_updated_on = ? WHERE MOBILE_NO=?";
			 resp = jtemplate.update(updateQuery, new Object[] {pb.getDiet(), pb.getSpl_diet_notes() ,pb.getDiet_updated_on(), pb.getMobile_no()});
			} catch (Exception e) {
				e.printStackTrace();
			}
			return resp;	
			}

		
	

	


	//***************************Social Habit module **********************************
	@Override
	public List<HabitsBean> findSocialHabit() {
		// TODO Auto-generated method stub
		final String getQuery = "SELECT * FROM SOCIAL_HISTORY";
		List<HabitsBean> list = jtemplate.query(getQuery, new SocialHistoryRow());
		return list;
	}

	@Override
	public List<HabitsBean> findHabitbyid(String mobile_no) {
		// TODO Auto-generated method stub
		final String getQuery = "SELECT * FROM SOCIAL_HISTORY WHERE MOBILE_NO=?";
		List<HabitsBean> list = jtemplate.query(getQuery, new SocialHistoryRow(), mobile_no);
		return list;
	}

	@Override
	public int insertHabit(HabitsBean obj) {
		// TODO Auto-generated method stub
		int resp = 0;
		try {
		final String addQuery = "INSERT INTO social_history(smoking,smoking_duration,tobacco,alcohol,alcohol_duration,mobile_no,social_saved_on) VALUES(?,?,?,?,?,?,?)";
		resp = jtemplate.update(addQuery, new Object[] {obj.getSmoking(),obj.getSmoking_duration(),obj.getTobacco(),obj.getAlcohol(),obj.getAlcohol_duration(),obj.getMobile_no(),obj.getSocial_saved_on()});
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resp;
	}

	@Override
	public int updateHabit(HabitsBean pb) {
		// TODO Auto-generated method stub
		final String updateQuery = "UPDATE social_history SET smoking=?,smoking_duration=?,tobacco=?,alcohol=?,alcohol_duration=?,social_updated_on= ? WHERE MOBILE_NO=?";
		int resp = jtemplate.update(updateQuery, new Object[] {pb.getSmoking(), pb.getSmoking_duration(),pb.getTobacco(),pb.getAlcohol(),pb.getAlcohol_duration(),pb.getSocial_updated_on(),pb.getMobile_no()});
		return resp;
	}
	//***************AdverseDrug module*************
	
	
	@Override
	public List<HabitsBean> findadversebyid(String mobile_no) {
		// TODO Auto-generated method stub
		final String getQuery = "SELECT * FROM PATIENT_ADVERSE_DRUG WHERE MOBILE_NO=?";
		List<HabitsBean> list = jtemplate.query(getQuery, new AdverseDrugRow(), mobile_no);
		return list;	
		}


	@Override
	public int insertadverseDrug(HabitsBean obj) {
		// TODO Auto-generated method stub
		int resp = 0;
		try {
		final String addQuery = "INSERT INTO PATIENT_ADVERSE_DRUG(drugname,reaction,date_of_start,treatment_taken,mobile_no,adverse_save_on) VALUES(?,?,?,?,?,?)";
		resp = jtemplate.update(addQuery, new Object[] {obj.getDrugname(),obj.getReaction(),obj.getDate_of_start(),obj.getTreatment_taken(),obj.getMobile_no(),obj.getAdverse_save_on()});
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resp;
	}
	
	@Override
	public int updateadverseDrug(HabitsBean pb) {
		// TODO Auto-generated method stub
		int resp = 0;
		try {
		final String updateQuery = "UPDATE PATIENT_ADVERSE_DRUG SET drugname=?,reaction=?,date_of_start=?,treatment_taken=?,mobile_no =?,adverse_updated_on=? WHERE adverse_id=?";
		resp = jtemplate.update(updateQuery, new Object[] {pb.getDrugname(), pb.getReaction(),pb.getDate_of_start(),pb.getTreatment_taken(),pb.getMobile_no(),pb.getAdverse_updated_on(),pb.getAdverse_id()});
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resp;
	}
	
	//***************Surgery History module*************
	@Override
	public List<SurgeryBean> findAll_Surgery() {
		// TODO Auto-generated method stub
		final String getQuery = "SELECT * FROM t_surgery";
		List<SurgeryBean> list = jtemplate.query(getQuery, new SurgeryRm());
		return list;
	}
	


	@Override
	public List<SurgeryBean> findMyScopebyid(String mobile_no){
		// TODO Auto-generated method stub
		final String getQuery = "SELECT *FROM t_surgery WHERE mobile_no=?";
		List<SurgeryBean> list = jtemplate.query(getQuery, new SurgeryRm(),mobile_no);
		return list;
	}

	@Override
	public int insertMyscope_Surgery(SurgeryBean my) {
		// TODO Auto-generated method stub
		
		final String addQuery = "INSERT INTO t_surgery(surgeryname,surgerydate,surgerynotes,surgerylocation,surgeryhospital,mobile_no,surgeryprovider,surgery_saved_on) VALUES(?,?,?,?,?,?,?,?)";
		int resp = jtemplate.update(addQuery, new Object[] {my.getSurgeryname(),my.getSurgerydate(),my.getSurgerynotes(),
				my.getSurgerylocation(),my.getSurgeryhospital(),my.getMobile_no(),my.getSurgeryprovider(),my.getSurgery_saved_on()});
		
		return resp;
		
	}

	@Override
	public int updateMyscope_Surgery(SurgeryBean my) {
		// TODO Auto-generated method stub
		final String updateQuery = "UPDATE t_surgery SET surgeryname = ?,surgerydate= ?,surgerynotes = ?,surgerylocation= ?,surgeryhospital = ?,mobile_no = ?,surgeryprovider = ?, surgery_updated_on = ? WHERE surgery_id=?";
		int resp = jtemplate.update(updateQuery, new Object[] {my.getSurgeryname(),my.getSurgerydate(),
				my.getSurgerynotes(),my.getSurgerylocation(),my.getSurgeryhospital(),my.getMobile_no(),my.getSurgeryprovider(),my.getSurgery_updated_on(),my.getSurgery_id()});
		
		return resp;
		
		
		
		}
	
	
	//Immunization module
	
	@Override
	public List<ImmunBean> findAll_Immun() {
		// TODO Auto-generated method stub
		final String getQuery = "SELECT * FROM t_immun";
		List<ImmunBean> list = jtemplate.query(getQuery, new ImmunizationRm());
		return list;
	}
	


	@Override
	public List<ImmunBean> findImmunebyid(String mobile_no){
		// TODO Auto-generated method stub
		final String getQuery = "SELECT * FROM t_immun WHERE mobile_no=?";
		List<ImmunBean> list = jtemplate.query(getQuery, new ImmunizationRm(),mobile_no);
		return list;
	}

	@Override
	public int insertMyscope_Immun(ImmunBean my) {
		// TODO Auto-generated method stub
		
		final String addQuery = "INSERT INTO t_immun(immuname,immuevent,immunotes,immubrand,immudate,mobile_no,immun_saved_on) VALUES(?,?,?,?,?,?,?)";
		int resp = jtemplate.update(addQuery, new Object[] {my.getImmuname(),my.getImmuevent(),my.getImmunotes(),
				my.getImmubrand(),my.getImmudate(),my.getMobile_no(),my.getImmun_saved_on()});
		
		return resp;
		
	}

	@Override
	public int updateMyscope_Immun(ImmunBean my) {
		// TODO Auto-generated method stub
		final String updateQuery = "UPDATE t_immun SET immuname = ?,immuevent= ?,immubrand = ?,immunotes= ?,immudate = ?,mobile_no = ?, immun_updated_on=? WHERE immun_id=?";
		int resp = jtemplate.update(updateQuery, new Object[] {my.getImmuname(),my.getImmuevent(),
				my.getImmubrand(),my.getImmunotes(),my.getImmudate(),my.getMobile_no(),my.getImmun_updated_on(),my.getImmun_id()});
		
		return resp;
		
		
		
		}
	
	//Medication
	
	@Override
	public List<MedicationBean> findAll_Medication() {
		// TODO Auto-generated method stub
		final String getQuery = "SELECT * FROM t_medication";
		List<MedicationBean> list = jtemplate.query(getQuery, new MedicationRm());
		return list;
	}
	


	@Override
	public List<MedicationBean> findMedicationbyid(String mobile_no){
		// TODO Auto-generated method stub
		final String getQuery = "SELECT *FROM t_medication WHERE mobile_no=?";
		List<MedicationBean> list = jtemplate.query(getQuery, new MedicationRm(),mobile_no);
		return list;
	}

	@Override
	public int insertMyscope_Medication(MedicationBean my) {
		// TODO Auto-generated method stub
		
		final String addQuery = "INSERT INTO t_medication(medicationname,startdate,enddate,medicationnotes,isprescribed,formulation,mobile_no,strength,how_often_taken,doseunit,reason,medication_saved_on) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
		int resp = jtemplate.update(addQuery, new Object[] {my.getMedicationname(),my.getStartdate(),my.getEnddate(),
				my.getMedicationnotes(),my.getIsprescribed(),my.getFormulation(),my.getMobile_no(),my.getStrength(),my.getHow_often_taken(),my.getDoseunit(),my.getReason(),my.getMedication_saved_on()});
		
		return resp;
		
	}

	@Override
	public int updateMyscope_Medication(MedicationBean my) {
		// TODO Auto-generated method stub
		final String updateQuery = "UPDATE t_medication SET medicationname = ?,startdate= ?,enddate= ?,medicationnotes = ?,isprescribed= ?,formulation = ?,mobile_no = ?,strength=?,how_often_taken = ? ,doseunit = ?,reason = ?,medication_updated_on=? WHERE medication_id=?";
		int resp = jtemplate.update(updateQuery, new Object[] {my.getMedicationname(),my.getStartdate(),my.getEnddate(),
				my.getMedicationnotes(),my.getIsprescribed(),my.getFormulation(),my.getMobile_no(),my.getStrength(),my.getHow_often_taken(),my.getDoseunit(),my.getReason(),my.getMedication_updated_on(),my.getMedication_id()});
		
		return resp;
		
		
		
		}
	
	// Allergy module
	@Override
	public List<MyScopeBean> findAll() {
		// TODO Auto-generated method stub
		final String getQuery = "SELECT * FROM t_allergy";
		List<MyScopeBean> list = jtemplate.query(getQuery, new MyScopeRm());
		return list;
	}
	


	@Override
	public List<MyScopeBean> findAllergybyid(String mobile_no){
		// TODO Auto-generated method stub
		final String getQuery = "SELECT *FROM t_allergy WHERE mobile_no=?";
		List<MyScopeBean> list = jtemplate.query(getQuery, new MyScopeRm(),mobile_no);
		return list;
	}
	
	

	@Override
	public int insertMyscope(MyScopeBean my) {
		// TODO Auto-generated method stub
		
		final String addQuery = "INSERT INTO t_allergy(name,reaction,notes,spnrdata,treatment,date,mobile_no,allergy_saved_on) VALUES(?,?,?,?,?,?,?,?)";
		int resp = jtemplate.update(addQuery, new Object[] {my.getName(),my.getReaction(),my.getNotes(),
				my.getSpnrdata(),my.getTreatment(),my.getDate(),my.getMobile_no(),my.getAllergy_saved_on()});
		
		return resp;
		
	}

	@Override
	public int updateMyscope(MyScopeBean my) {
		// TODO Auto-generated method stub
		final String updateQuery = "UPDATE t_allergy SET name = ?,date= ?,notes = ?,spnrdata= ?,treatment = ?,mobile_no = ?,reaction = ?,allergy_updated_on=? WHERE allergy_id=?";
		int resp = jtemplate.update(updateQuery, new Object[] {my.getName(),my.getDate(),my.getNotes(),
				my.getSpnrdata(),my.getTreatment(),my.getMobile_no(),my.getReaction(),my.getAllergy_updated_on(),my.getAllergy_id()});
		
	
		return resp;
		
		
		
		}
	
	
	/**********************
	 * 
	 * PRESCRIPTION MODULE
	 * 
	 * 
	 *********************/
	
	
	
	@Override
	public List<PrescriptionManualBean> findAllPrescriptions() {
		// TODO Auto-generated method stub
		final String getQuery = "SELECT * FROM PRESCRIPTION_MANUAL";
		List<PrescriptionManualBean> list = jtemplate.query(getQuery, new PrescriptionManualRow());
		return list;
	}
	
	@Override
	public List<PrescriptionManualBean> findPrescriptionbymobile(String mobile_no) {
		// TODO Auto-generated method stub
		final String getQuery = "SELECT * FROM PRESCRIPTION_MANUAL WHERE MOBILE_NO=?";
		List<PrescriptionManualBean> list = jtemplate.query(getQuery, new PrescriptionManualRow(),mobile_no);
		return list;
	}


	@Override
	public List<PrescriptionManualBean> findPrescriptionbyid(String mobile_no,String model_name) {
		// TODO Auto-generated method stub
		final String getQuery = "SELECT * FROM PRESCRIPTION_MANUAL WHERE MOBILE_NO=? AND MODEL_NAME = ?";
		List<PrescriptionManualBean> list = jtemplate.query(getQuery, new PrescriptionManualRow(), mobile_no,model_name);
		return list;
	}
	
	@Override
	public List<PrescriptionManualBean> findPrescriptionbyPId(int prescription_id) {
		// TODO Auto-generated method stub
		final String getQuery = "SELECT * FROM PRESCRIPTION_MANUAL WHERE PRESCRIPTION_ID=?";
		List<PrescriptionManualBean> list = jtemplate.query(getQuery, new PrescriptionManualRow(), prescription_id);
		return list;
	}


	@Override
	public int insertPrescription(PrescriptionManualBean pb) {
		// TODO Auto-generated method stub
		int resp = 0;
		try {
		final String addQuery = "INSERT INTO prescription_manual(is_prescribed,prescription_note,mobile_no,doctor_name,hospital_name,medical_condition,model_name,manual_saved_on) VALUES(?,?,?,?,?,?,?,?)";
		resp = jtemplate.update(addQuery, new Object[] {pb.getIs_prescribed(),pb.getPrescription_note(),pb.getMobile_no(),
														pb.getDoctor_name(),pb.getHospital_name(),pb.getMedical_condition(),pb.getModel_name(),pb.getManual_saved_on()});
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resp;
	}

	@Override
	public int updatePrescription(PrescriptionManualBean pb) {
//		// TODO Auto-generated method stub
		final String updateQuery = "UPDATE PRESCRIPTION_MANUAL WHERE MOBILE_NO=?";
		int resp = jtemplate.update(updateQuery, new Object[] {pb.getMobile_no()});
		return resp;
	}

	@Override
	public int deletePrescription(PrescriptionManualBean pb) {
		// TODO Auto-generated method stub
		final String updateQuery = "DELETE FROM PRESCRIPTION_MANUAL WHERE MOBILE_NO=?";
		int resp = jtemplate.update(updateQuery, new Object[] {pb.getMobile_no()});
		return resp;
	}

	
	//********************Drug module*****************************
	@Override
	public List<PrescriptionDurgBean> findAllDrugs() {
		// TODO Auto-generated method stub
		final String getQuery = "SELECT * FROM PRESCRIPTION_DRUG";
		List<PrescriptionDurgBean> list = jtemplate.query(getQuery, new DrugRowMapper());
		return list;
	}

	@Override
	public List<PrescriptionDurgBean> findDrugbyid(int prescription_id) {
		// TODO Auto-generated method stub
		final String getQuery = "SELECT * FROM PRESCRIPTION_DRUG WHERE prescription_id=?";
		List<PrescriptionDurgBean> list = jtemplate.query(getQuery, new DrugRowMapper(),prescription_id);
		return list;
	}

	
	@Override
	public List<PrescriptionDurgBean> findPrescriptionbydrugId(int drug_id) {
		// TODO Auto-generated method stub
		final String getQuery = "SELECT * FROM PRESCRIPTION_DRUG WHERE drug_id=?";
		List<PrescriptionDurgBean> list = jtemplate.query(getQuery, new DrugRowMapper(), drug_id);
		return list;
	}
	
	@Override
	public int insertDrug(PrescriptionDurgBean pb) {
		// TODO Auto-generated method stub
		int resp = 0;
		try {
		final String addQuery = "INSERT INTO PRESCRIPTION_DRUG(formulation,dose_unit,dose_strength,brand_name,drug_name,start_date,stop_date,how_often_taken,prescription_id,time,drug_saved_on) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
		resp = jtemplate.update(addQuery, new Object[] {pb.getFormulation(),pb.getDose_unit(),pb.getDose_strength()
				,pb.getBrand_name(),pb.getDrug_name(),pb.getStart_date(),pb.getStop_date(),pb.getHow_often_taken(),pb.getPrescription_id(),pb.getTime(),pb.getDrug_saved_on()});
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resp;
	}

	@Override
	public int updateDrug(PrescriptionDurgBean pb) {
		// TODO Auto-generated method stub
		final String updateQuery = "UPDATE PRESCRIPTION_DRUG SET formulation = ?,dose_unit = ?, dose_strength = ?,brand_name=?,drug_name=?,start_date =?, stop_date=?,how_often_taken = ?, time=?,drug_updated_on=? WHERE DRUG_ID=?";
		int resp = jtemplate.update(updateQuery, new Object[] {pb.getFormulation(),pb.getDose_unit(),pb.getDose_strength()
				,pb.getBrand_name(),pb.getDrug_name(),pb.getStart_date(),pb.getStop_date(),pb.getHow_often_taken(),pb.getTime(),pb.getDrug_updated_on(),pb.getdrug_id()});
		return resp;
	}

	@Override
	public int deleteDrug(PrescriptionDurgBean pb) {
		// TODO Auto-generated method stub
		final String updateQuery = "DELETE FROM PRESCRIPTION_DRUG WHERE DRUG_ID=?";
		int resp = jtemplate.update(updateQuery, new Object[] {pb.getdrug_id()});
		return resp;
	}


	
	//*************Prescription upload module**********************
	
	

	@Override
	public List<PrescriptionUploadBean> alluploadedprescriptions() {
		// TODO Auto-generated method stub
				final String getQuery = "SELECT * FROM PRESCRIPTION_UPLOAD";
				List<PrescriptionUploadBean> list = jtemplate.query(getQuery, new PUploadRow());
				return list;
	}

	@Override
	public List<PrescriptionUploadBean> uploadprescriptionbyid(String mobile_no) {
		// TODO Auto-generated method stub
		final String getQuery = "SELECT * FROM PRESCRIPTION_UPLOAD WHERE MOBILE_NO=?";
		List<PrescriptionUploadBean> list = jtemplate.query(getQuery, new PUploadRow(), mobile_no);
		return list;
	}
	

	@Override
	public List<PrescriptionUploadBean> uploadprescriptionbymodelname(String mobile_no, String model_name) {
		// TODO Auto-generated method stub
		final String getQuery = "SELECT * FROM PRESCRIPTION_UPLOAD WHERE MOBILE_NO=? AND MODEL_NAME=?";
		List<PrescriptionUploadBean> list = jtemplate.query(getQuery, new PUploadRow(), mobile_no,model_name);
		return list;
	}



	@Override
	public int uploadPrescription(PrescriptionUploadBean pb) {
		// TODO Auto-generated method stub
		int resp = 0;
		try {
			System.out.println("file sie::::::"+pb.getP_upload().getBytes().length);
			if(pb.getP_upload().getBytes().length>0) {
		final String addQuery = "INSERT INTO PRESCRIPTION_UPLOAD(mobile_no,p_upload,upload_saved_on,upload_type,model_name) VALUES(?,?,?,?,?)";
		resp = jtemplate.update(addQuery, new Object[] {pb.getMobile_no(),pb.getP_upload().getBytes(),pb.getUpload_saved_on(),pb.getUpload_type(),pb.getModel_name()});
			}else {
				System.out.println("no file");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resp;
	}

	@Override
	public int removeuploadedPrescription(PrescriptionUploadBean pb) {
		// TODO Auto-generated method stub
		final String updateQuery = "DELETE FROM PRESCRIPTION_UPLOAD WHERE p_uploadid=?";
		int resp = jtemplate.update(updateQuery, new Object[] {pb.getP_uploadid()});
		return resp;
	}

	
	
	//*********************Services Module****************************
		@Override
		public List<HabitsBean> findServices() {
			// TODO Auto-generated method stub
			final String getQuery = "SELECT * FROM services_table";
			List<HabitsBean> list = jtemplate.query(getQuery, new ServicesRow());
			return list;
		}
		@Override
		public List<HabitsBean> findServicesbyid(String mobile_no) {
			// TODO Auto-generated method stub
			final String getQuery = "SELECT * FROM services_table WHERE MOBILE_NO=?";
			List<HabitsBean> list1 = jtemplate.query(getQuery, new ServicesRow(), mobile_no);
			return list1;
		}
		@Override
		public int insertServices(HabitsBean obj) {
			// TODO Auto-generated method stub
			int resp = 0;
			try {
			final String addQuery = "INSERT INTO services_table (patient_counselling, adverse_drug_monitering, drug_interaction, prescription_audit, Post_dicharge_package,mobile_no,services_saved_on) VALUES(?,?,?,?,?,?,?)";
			resp = jtemplate.update(addQuery, new Object[] {obj.getPatient_counselling(),obj.getAdverse_drug_monitering(),obj.getDrug_interaction(),obj.getPrescription_audit(),obj.getPost_dicharge_package(), obj.getMobile_no(),obj.getServices_saved_on()});
			} catch (Exception e) {
				e.printStackTrace();
			}
			return resp;
		}
		@Override
		public int updateServices(HabitsBean obj) {
			// TODO Auto-generated method stub
			int resp = 0;
			try {
			final String updateQuery = "UPDATE services_table SET patient_counselling=?, adverse_drug_monitering=?, drug_interaction =?, prescription_audit=?,Post_dicharge_package=?,services_updated_on=? WHERE MOBILE_NO=?";
			resp = jtemplate.update(updateQuery, new Object[] {obj.getPatient_counselling(), obj.getAdverse_drug_monitering(), obj.getDrug_interaction(), obj.getPrescription_audit() , obj.getPost_dicharge_package() ,obj.getServices_updated_on(), obj.getMobile_no()});
			
			} catch (Exception e) {
				e.printStackTrace();
			}
			return resp;	
			}
		
//************************************************************************
		//Self monitoroing module
//************************************************************************
		
		
		//*********************Blood  Glucose Module****************************
		@Override
		public List<GlucoseBean> findGlucose() {
			final String getQuery = "SELECT * FROM GLUCOSE_TABLE";
			List<GlucoseBean> list = jtemplate.query(getQuery, new GlucoseRow());
			return list;
		}
		public List<GlucoseBean> findglucosebyid(String mobile_no) {
			// TODO Auto-generated method stub
			final String getQuery = "SELECT * FROM glucose_table WHERE MOBILE_NO=?";
			List<GlucoseBean> list1 = jtemplate.query(getQuery, new GlucoseRow(), mobile_no);
			return list1;
		}

		public int insertGlucose(GlucoseBean obj) {
			// TODO Auto-generated method stub
			int resp = 0;
			try {
			final String addQuery = "INSERT INTO glucose_table (date_of_test, test, test_result, glucose_notes, glucose_save_on, mobile_no) VALUES(?,?,?,?,?,?)";
			resp = jtemplate.update(addQuery, new Object[] {obj.getDate_of_test(),obj.getTest(),obj.getTest_result(),obj.getGlucose_notes(), obj.getGlucose_save_on() , obj.getMobile_no()});
			} catch (Exception e) {
				e.printStackTrace();
			}
			return resp;
		}

		public int updateGlucose(GlucoseBean obj) {
			// TODO Auto-generated method stub
			int resp = 0;
			try {
			final String updateQuery = "UPDATE glucose_table SET date_of_test=?, test=?, test_result =?, glucose_notes=? , glucose_update_on=? WHERE glucose_id=?";
			resp = jtemplate.update(updateQuery, new Object[] { obj.getDate_of_test(),obj.getTest(), obj.getTest_result(), obj.getGlucose_notes() , obj.getGlucose_update_on(),obj.getGlucose_id() });
			} catch (Exception e) {
				e.printStackTrace();
			}
			return resp;
		}
		
		//*********************  Pressure Module****************************
		@Override
		public List<PressureBean> findPressure() {
			final String getQuery = "SELECT * FROM pressure_table";
			List<PressureBean> list = jtemplate.query(getQuery, new PressureRow());
			return list;
		}

		public List<PressureBean> findpressurebyid(String mobile_no) {
			// TODO Auto-generated method stub
			final String getQuery = "SELECT * FROM pressure_table WHERE MOBILE_NO=?";
			List<PressureBean> list1 = jtemplate.query(getQuery, new PressureRow(), mobile_no);
			return list1;
		}
		
		public int insertPressure(PressureBean obj) {
			// TODO Auto-generated method stub
			int resp = 0;
			try {
			final String addQuery = "INSERT INTO pressure_table (date_of_pressure, systolic, pulse,diastrlic, heart_rate,irregular_heart_beat, pressure_notes,  pressure_save_on,  mobile_no) VALUES(?,?,?,?,?,?,?,?,? )";
			resp = jtemplate.update(addQuery, new Object[] {obj.getDate_of_pressure(), obj.getSystolic()  , obj.getPulse(), obj.getDiastrlic() , obj.getHeart_rate() , obj.getIrregular_heart_beat() ,obj.getPressure_notes() , obj.getPressure_save_on() ,  obj.getMobile_no()});
			} catch (Exception e) {
				e.printStackTrace();
			}
			return resp;
		}
		

		public int updatePressure(PressureBean obj) {
			// TODO Auto-generated method stub
			int resp = 0;
			try {
			final String updateQuery = "UPDATE pressure_table SET date_of_pressure=?, systolic=?, pulse =? , diastrlic=?, heart_rate =?, irregular_heart_beat =?, pressure_notes=? , pressure_update_on =?  WHERE pressure_id=?";
			resp = jtemplate.update(updateQuery, new Object[] {obj.getDate_of_pressure() , obj.getSystolic() ,  obj.getPulse(), obj.getDiastrlic()  , obj.getHeart_rate() , obj.getIrregular_heart_beat()  ,obj.getPressure_notes(),obj.getPressure_update_on() , obj.getPressure_id()});
			
			} catch (Exception e) {
				e.printStackTrace();
			}
			return resp;
		}

		//*********************Cholestrol Module****************************
		
		
		@Override
		public List<CholestrolBean> findCholestrol() {
			final String getQuery = "SELECT * FROM cholestrol_table";
			List<CholestrolBean> list = jtemplate.query(getQuery, new CholestrolRow());
			return list;
		}
		
		public List<CholestrolBean> findcholestrolbyid(String mobile_no) {
			// TODO Auto-generated method stub
			final String getQuery = "SELECT * FROM cholestrol_table WHERE MOBILE_NO=?";
			List<CholestrolBean> list1 = jtemplate.query(getQuery, new CholestrolRow(), mobile_no);
			return list1;
		}
		
		public int insertCholestrol(CholestrolBean obj) {
			// TODO Auto-generated method stub
			int resp = 0;
			try {
			final String addQuery = "INSERT INTO cholestrol_table (date_of_cholestrol, ldl, hdl ,trigly, total_cholestrol,other_test, cholestrol_notes, cholestrol_save_on, mobile_no) VALUES(?,?,?,?,?,?,?,?,? )";
			resp = jtemplate.update(addQuery, new Object[] {obj.getDate_of_cholestrol() , obj.getLdl() , obj.getHdl() , obj.getTrigly() , obj.getTotal_cholestrol() , obj.getOther_test(), obj.getCholestrol_notes() ,  obj.getCholestrol_save_on() , obj.getMobile_no()});
			} catch (Exception e) {
				e.printStackTrace();
			}
			return resp; 
		}

	

		public int updateCholestrol(CholestrolBean obj) {
			// TODO Auto-generated method stub
			int resp = 0;
			try {
			final String updateQuery = "UPDATE cholestrol_table SET date_of_cholestrol=?, ldl=?, hdl =? , trigly=?, total_cholestrol =?, other_test =?, cholestrol_notes=? , cholestrol_update_on =? WHERE cholestrol_id =?";
			resp = jtemplate.update(updateQuery, new Object[] { obj.getDate_of_cholestrol() , obj.getLdl() , obj.getHdl() , obj.getTrigly() , obj.getTotal_cholestrol() , obj.getOther_test(), obj.getCholestrol_notes(),obj.getCholestrol_update_on() , obj.getCholestrol_id()});
			
			} catch (Exception e) {
				e.printStackTrace();
			}
			return resp;
		}

	
		//*********************bmi Module****************************
		
		@Override
		public List<BmiBean> findBmi() {
			final String getQuery = "SELECT * FROM bmi_table";
			List<BmiBean> list = jtemplate.query(getQuery, new BmiRow());
			return list;
		}
		
		
		
		public List<BmiBean> findbmibyid(String mobile_no) {
			// TODO Auto-generated method stub
			final String getQuery = "SELECT * FROM bmi_table WHERE MOBILE_NO=?";
			List<BmiBean> list1 = jtemplate.query(getQuery, new BmiRow(), mobile_no);
			return list1;
		}

		public int insertBmi(BmiBean obj) {
			// TODO Auto-generated method stub
			int resp = 0;
			try {
			final String addQuery = "INSERT INTO bmi_table (date_of_bmi, weight, height ,bmi_notes, bmi , bmi_save_on , mobile_no) VALUES(?,?,?,?,?,?,? )";
			resp = jtemplate.update(addQuery, new Object[] {obj.getDate_of_bmi() , obj.getWeight() , obj.getHeight() , obj.getBmi_notes() , obj.getBmi() , obj.getBmi_save_on() , obj.getMobile_no()});
			} catch (Exception e) {
				e.printStackTrace();
			}
			return resp;
		}

		public int updateBmi(BmiBean obj) {
			// TODO Auto-generated method stub
			int resp = 0;
			try {
			final String updateQuery = "UPDATE bmi_table SET date_of_bmi=?, weight=?, height =? , bmi_notes=?, bmi =?, bmi_update_on =? WHERE bmi_id=?";
			resp = jtemplate.update(updateQuery, new Object[] { obj.getDate_of_bmi() , obj.getWeight() , obj.getHeight() ,obj.getBmi_notes()  ,obj.getBmi() , obj.getBmi_update_on()  , obj.getBmi_id()});
			
			} catch (Exception e) {
				e.printStackTrace();
			}
			return resp;
		}

//**********************************************************************************************************************
				//***********************Medical-Documents module******************************
//**********************************************************************************************************************
				

				//**********Dental-Records sub-module******************
				@Override
				public List<Document_dentalBean> dentalprescriptions() {
					final String getQuery = "SELECT * FROM DOCUMENT_DENTAL_RECORDS";
					List<Document_dentalBean> list = jtemplate.query(getQuery, new Document_dentalRow());
					return list;
				}

				@Override
				public List<Document_dentalBean> dentalprescriptionbyid(String mobile_no) {
					final String getQuery = "SELECT * FROM DOCUMENT_DENTAL_RECORDS WHERE MOBILE_NO=?";
					List<Document_dentalBean> list = jtemplate.query(getQuery, new Document_dentalRow(), mobile_no);
					return list;
				}

				@Override
				public int dentalPrescription(Document_dentalBean pb) {
					int resp = 0;
					try {
					final String addQuery = "INSERT INTO DOCUMENT_DENTAL_RECORDS(mobile_no,document_dental_file,document_dental_saved_on,document_dental_type) VALUES(?,?,?,?)";
					resp = jtemplate.update(addQuery, new Object[] {pb.getMobile_no(),pb.getDocument_dental_file().getBytes(),pb.getDocument_dental_saved_on(),pb.getDocument_dental_type()});
					} catch (Exception e) {
						e.printStackTrace();
					}
					return resp;
				}

				@Override
				public int removedentalPrescription(Document_dentalBean pb) {
					final String updateQuery = "DELETE FROM DOCUMENT_DENTAL_RECORDS WHERE document_dental_id=?";
					int resp = jtemplate.update(updateQuery, new Object[] {pb.getDocument_dental_id()});
					return resp;
				}

				
				//**********Diet sub-module******************
				@Override
				public List<Document_dietBean> dietprescriptions() {
					final String getQuery = "SELECT * FROM DOCUMENT_DIET";
					List<Document_dietBean> list = jtemplate.query(getQuery, new Document_dietRow());
					return list;
				}

				@Override
				public List<Document_dietBean> dietprescriptionbyid(String mobile_no) {
					final String getQuery = "SELECT * FROM DOCUMENT_DIET WHERE MOBILE_NO=?";
					List<Document_dietBean> list = jtemplate.query(getQuery, new Document_dietRow(), mobile_no);
					return list;
				}

				@Override
				public int dietPrescription(Document_dietBean pb) {
					int resp = 0;
					try {
					final String addQuery = "INSERT INTO DOCUMENT_DIET(mobile_no,document_diet_file,document_diet_saved_on,document_diet_type) VALUES(?,?,?,?)";
					resp = jtemplate.update(addQuery, new Object[] {pb.getMobile_no(),pb.getDocument_diet_file().getBytes(),pb.getDocument_diet_saved_on(),pb.getDocument_diet_type()});
					} catch (Exception e) {
						e.printStackTrace();
					}
					return resp;
				}

				@Override
				public int removedietPrescription(Document_dietBean pb) {
					final String updateQuery = "DELETE FROM DOCUMENT_DIET WHERE document_diet_id=?";
					int resp = jtemplate.update(updateQuery, new Object[] {pb.getDocument_diet_id()});
					return resp;
				}

				
				//**********Discharge-Summary sub-module******************
				@Override
				public List<Document_dischargeBean> dischargeprescriptions() {
					final String getQuery = "SELECT * FROM DOCUMENT_DISCHARGE_SUMMARY";
					List<Document_dischargeBean> list = jtemplate.query(getQuery, new Document_dischargeRow());
					return list;
				}

				@Override
				public List<Document_dischargeBean> dischargeprescriptionbyid(String mobile_no) {
					final String getQuery = "SELECT * FROM DOCUMENT_DISCHARGE_SUMMARY WHERE MOBILE_NO=?";
					List<Document_dischargeBean> list = jtemplate.query(getQuery, new Document_dischargeRow(), mobile_no);
					return list;
				}

				@Override
				public int dischargePrescription(Document_dischargeBean pb) {
					int resp = 0;
					try {
					final String addQuery = "INSERT INTO DOCUMENT_DISCHARGE_SUMMARY(mobile_no,document_discharge_file,document_discharge_saved_on,document_discharge_type) VALUES(?,?,?,?)";
					resp = jtemplate.update(addQuery, new Object[] {pb.getMobile_no(),pb.getDocument_discharge_file().getBytes(),pb.getDocument_discharge_saved_on(),pb.getDocument_discharge_type()});
					} catch (Exception e) {
						e.printStackTrace();
					}
					return resp;
				}

				@Override
				public int removedischargePrescription(Document_dischargeBean pb) {
					final String updateQuery = "DELETE FROM DOCUMENT_DISCHARGE_SUMMARY WHERE document_discharge_id=?";
					int resp = jtemplate.update(updateQuery, new Object[] {pb.getDocument_discharge_id()});
					return resp;
				}

				//**********Education sub-module******************
				@Override
				public List<Document_educationBean> educationprescriptions() {
					final String getQuery = "SELECT * FROM DOCUMENT_EDUCATION";
					List<Document_educationBean> list = jtemplate.query(getQuery, new Document_educationRow());
					return list;
				}

				@Override
				public List<Document_educationBean> educationprescriptionbyid(String mobile_no) {
					final String getQuery = "SELECT * FROM DOCUMENT_EDUCATION WHERE MOBILE_NO=?";
					List<Document_educationBean> list = jtemplate.query(getQuery, new Document_educationRow(), mobile_no);
					return list;
				}

				@Override
				public int educationPrescription(Document_educationBean pb) {
					int resp = 0;
					try {
					final String addQuery = "INSERT INTO DOCUMENT_EDUCATION(mobile_no,document_education_file,document_education_saved_on,document_education_type) VALUES(?,?,?,?)";
					resp = jtemplate.update(addQuery, new Object[] {pb.getMobile_no(),pb.getDocument_education_file().getBytes(),pb.getDocument_education_saved_on(),pb.getDocument_education_type()});
					} catch (Exception e) {
						e.printStackTrace();
					}
					return resp;
				}

				@Override
				public int removeeducationPrescription(Document_educationBean pb) {
					final String updateQuery = "DELETE FROM DOCUMENT_EDUCATION WHERE document_education_id=?";
					int resp = jtemplate.update(updateQuery, new Object[] {pb.getDocument_education_id()});
					return resp;
				}

				//**********Immunization sub-module******************
				@Override
				public List<Document_immunBean> immunprescriptions() {
					final String getQuery = "SELECT * FROM DOCUMENT_IMMUNIZATION";
					List<Document_immunBean> list = jtemplate.query(getQuery, new Document_immunRow());
					return list;
				}

				@Override
				public List<Document_immunBean> uploadimmunbyid(String mobile_no) {
					final String getQuery = "SELECT * FROM DOCUMENT_IMMUNIZATION WHERE MOBILE_NO=?";
					List<Document_immunBean> list = jtemplate.query(getQuery, new Document_immunRow(), mobile_no);
					return list;
				}

				@Override
				public int immunPrescription(Document_immunBean pb) {
					int resp = 0;
					try {
					final String addQuery = "INSERT INTO DOCUMENT_IMMUNIZATION(mobile_no,document_immunization_file,document_immunization_saved_on,document_immunization_type) VALUES(?,?,?,?)";
					resp = jtemplate.update(addQuery, new Object[] {pb.getMobile_no(),pb.getDocument_immunization_file().getBytes(),pb.getDocument_immunization_saved_on(),pb.getDocument_immunization_type()});
					} catch (Exception e) {
						e.printStackTrace();
					}
					return resp;
				}

				@Override
				public int removeimmunPrescription(Document_immunBean pb) {
					final String updateQuery = "DELETE FROM DOCUMENT_IMMUNIZATION WHERE document_immunization_id=?";
					int resp = jtemplate.update(updateQuery, new Object[] {pb.getDocument_immunization_id()});
					return resp;
				
				}

				//**********patient-Insurance sub-module******************
				@Override
				public List<Document_insuranceBean> insuranceprescriptions() {
					final String getQuery = "SELECT * FROM DOCUMENT_MEDICAL_INSURANCE";
					List<Document_insuranceBean> list = jtemplate.query(getQuery, new Document_insuranceRow());
					return list;
				}

				@Override
				public List<Document_insuranceBean> uploadinsurancebyid(String mobile_no) {
					final String getQuery = "SELECT * FROM DOCUMENT_MEDICAL_INSURANCE WHERE MOBILE_NO=?";
					List<Document_insuranceBean> list = jtemplate.query(getQuery, new Document_insuranceRow(), mobile_no);
					return list;
				}

				@Override
				public int insurancePrescription(Document_insuranceBean pb) {
					int resp = 0;
					try {
					final String addQuery = "INSERT INTO DOCUMENT_MEDICAL_INSURANCE(mobile_no,document_insurance_file,document_insurance_saved_on,document_insurance_type) VALUES(?,?,?,?)";
					resp = jtemplate.update(addQuery, new Object[] {pb.getMobile_no(),pb.getDocument_insurance_file().getBytes(),pb.getDocument_insurance_saved_on(),pb.getDocument_insurance_type()});
					} catch (Exception e) {
						e.printStackTrace();
					}
					return resp;
				}

				@Override
				public int removeinsurancePrescription(Document_insuranceBean pb) {
					final String updateQuery = "DELETE FROM DOCUMENT_MEDICAL_INSURANCE WHERE document_insurance_id=?";
					int resp = jtemplate.update(updateQuery, new Object[] {pb.getDocument_insurance_id()});
					return resp;
				}

				//**********Documents-others sub-module******************
				@Override
				public List<Document_otherBean> otherprescriptions() {
					final String getQuery = "SELECT * FROM DOCUMENT_OTHER";
					List<Document_otherBean> list = jtemplate.query(getQuery, new Document_otherRow());
					return list;
				}

				@Override
				public List<Document_otherBean> uploadotherbyid(String mobile_no) {
					final String getQuery = "SELECT * FROM DOCUMENT_OTHER WHERE MOBILE_NO=?";
					List<Document_otherBean> list = jtemplate.query(getQuery, new Document_otherRow(), mobile_no);
					return list;
				}

				@Override
				public int otherPrescription(Document_otherBean pb) {
					int resp = 0;
					try {
					final String addQuery = "INSERT INTO DOCUMENT_OTHER(mobile_no,document_other_file,document_other_saved_on,document_other_type) VALUES(?,?,?,?)";
					resp = jtemplate.update(addQuery, new Object[] {pb.getMobile_no(),pb.getDocument_other_file().getBytes(),pb.getDocument_other_saved_on(),pb.getDocument_other_type()});
					} catch (Exception e) {
						e.printStackTrace();
					}
					return resp;
				}

				@Override
				public int removeotherPrescription(Document_otherBean pb) {
					final String updateQuery = "DELETE FROM DOCUMENT_OTHER WHERE document_other_id=?";
					int resp = jtemplate.update(updateQuery, new Object[] {pb.getDocument_other_id()});
					return resp;
				}

				
				
				/**************************************************************
				 * 
				 * Lab module
				 * 
				 * **************************************************************
				 *  
				*/
				
				//**********************Blood reports sub module*********************************
				
				@Override
				public List<Lab_bloodBean> allbloodreports() {
					final String getQuery = "SELECT * FROM Lab_bloodreport";
					List<Lab_bloodBean> list = jtemplate.query(getQuery, new Lab_bloodRow());
					return list;
				}

				@Override
				public List<Lab_bloodBean> bloodreportsbyid(String mobile_no) {
					final String getQuery = "SELECT * FROM Lab_bloodreport WHERE MOBILE_NO=?";
					List<Lab_bloodBean> list = jtemplate.query(getQuery, new Lab_bloodRow(), mobile_no);
					return list;
				}

				@Override
				public int uploadbloodreport(Lab_bloodBean pb) {
					int resp = 0;
					try {
					final String addQuery = "INSERT INTO Lab_bloodreport(mobile_no,lab_blood_file,lab_blood_saved,lab_blood_type) VALUES(?,?,?,?)";
					resp = jtemplate.update(addQuery, new Object[] {pb.getMobile_no(),pb.getLab_blood_file().getBytes(),pb.getLab_blood_saved(),pb.getLab_blood_type()});
					} catch (Exception e) {
						e.printStackTrace();
					}
					return resp;
				}

				@Override
				public int removebloodreport(Lab_bloodBean pb) {
					final String updateQuery = "DELETE FROM Lab_bloodreport WHERE lab_blood_id=?";
					int resp = jtemplate.update(updateQuery, new Object[] {pb.getLab_blood_id()});
					return resp;
				}

				//**********************Colonoscopy sub module*********************************
				@Override
				public List<Lab_colonoscopyBean> allcolonoscopyreports() {
					final String getQuery = "SELECT * FROM Lab_colonoscopy";
					List<Lab_colonoscopyBean> list = jtemplate.query(getQuery, new Lab_colonoscopyRow());
					return list;
				}

				@Override
				public List<Lab_colonoscopyBean> colonoscopyreportsbyid(String mobile_no) {
					final String getQuery = "SELECT * FROM Lab_colonoscopy WHERE MOBILE_NO=?";
					List<Lab_colonoscopyBean> list = jtemplate.query(getQuery, new Lab_colonoscopyRow(), mobile_no);
					return list;
				}

				@Override
				public int uploadcolonoscopyreport(Lab_colonoscopyBean pb) {
					int resp = 0;
					try {
					final String addQuery = "INSERT INTO Lab_colonoscopy(mobile_no,lab_colonoscopy_file,lab_colonoscopy_saved,lab_colonoscopy_type) VALUES(?,?,?,?)";
					resp = jtemplate.update(addQuery, new Object[] {pb.getMobile_no(),pb.getLab_colonoscopy_file().getBytes(),pb.getLab_colonoscopy_saved(),pb.getLab_colonoscopy_type()});
					} catch (Exception e) {
						e.printStackTrace();
					}
					return resp;
				}

				@Override
				public int removecolonoscopyreport(Lab_colonoscopyBean pb) {
					final String updateQuery = "DELETE FROM Lab_colonoscopy WHERE lab_colonoscopy_id=?";
					int resp = jtemplate.update(updateQuery, new Object[] {pb.getLab_colonoscopy_id()});
					return resp;
				}

				//**********************CTScan sub module*********************************
				@Override
				public List<Lab_ctscanBean> ctscanreports() {
					final String getQuery = "SELECT * FROM Lab_ctscan";
					List<Lab_ctscanBean> list = jtemplate.query(getQuery, new Lab_ctscanRow());
					return list;
				}

				@Override
				public List<Lab_ctscanBean> ctscanreportbyid(String mobile_no) {
					final String getQuery = "SELECT * FROM Lab_ctscan WHERE MOBILE_NO=?";
					List<Lab_ctscanBean> list = jtemplate.query(getQuery, new Lab_ctscanRow(), mobile_no);
					return list;
				}

				@Override
				public int uploadctscanreport(Lab_ctscanBean pb) {
					int resp = 0;
					try {
					final String addQuery = "INSERT INTO Lab_ctscan(mobile_no,lab_ctscan_file,lab_ctscan_saved,lab_ctscan_type) VALUES(?,?,?,?)";
					resp = jtemplate.update(addQuery, new Object[] {pb.getMobile_no(),pb.getLab_ctscan_file().getBytes(),pb.getLab_ctscan_saved(),pb.getLab_ctscan_type()});
					} catch (Exception e) {
						e.printStackTrace();
					}
					return resp;
				}

				@Override
				public int removedctscanreport(Lab_ctscanBean pb) {
					final String updateQuery = "DELETE FROM Lab_ctscan WHERE lab_ctscan_id=?";
					int resp = jtemplate.update(updateQuery, new Object[] {pb.getLab_ctscan_id()});
					return resp;
				}

				//**********************ECG sub module*********************************
				@Override
				public List<Lab_ecgBean> ecgreports() {
					final String getQuery = "SELECT * FROM Lab_ecg";
					List<Lab_ecgBean> list = jtemplate.query(getQuery, new Lab_ecgRow());
					return list;
				}
				@Override
				public List<Lab_ecgBean> ecgreportbyid(String mobile_no) {
					final String getQuery = "SELECT * FROM Lab_ecg WHERE MOBILE_NO=?";
					List<Lab_ecgBean> list = jtemplate.query(getQuery, new Lab_ecgRow(), mobile_no);
					return list;
				}

				@Override
				public int uploadecg(Lab_ecgBean pb) {
					int resp = 0;
					try {
					final String addQuery = "INSERT INTO Lab_ecg(mobile_no,lab_ecg_file,lab_ecg_saved,lab_ecg_type) VALUES(?,?,?,?)";
					resp = jtemplate.update(addQuery, new Object[] {pb.getMobile_no(),pb.getLab_ecg_file().getBytes(),pb.getLab_ecg_saved(),pb.getLab_ecg_type()});
					} catch (Exception e) {
						e.printStackTrace();
					}
					return resp;
				}

				@Override
				public int removeecg(Lab_ecgBean pb) {
					final String updateQuery = "DELETE FROM Lab_ecg WHERE lab_ecg_id=?";
					int resp = jtemplate.update(updateQuery, new Object[] {pb.getLab_ecg_id()});
					return resp;
				}

				//**********************ECHO sub module*********************************
				@Override
				public List<Lab_echoBean> echoreports() {
					final String getQuery = "SELECT * FROM Lab_echo";
					List<Lab_echoBean> list = jtemplate.query(getQuery, new Lab_echoRow());
					return list;
				}

				@Override
				public List<Lab_echoBean> echoreportbyid(String mobile_no) {
					final String getQuery = "SELECT * FROM Lab_echo WHERE MOBILE_NO=?";
					List<Lab_echoBean> list = jtemplate.query(getQuery, new Lab_echoRow(), mobile_no);
					return list;
				}

				@Override
				public int uploadecho(Lab_echoBean pb) {
					int resp = 0;
					try {
					final String addQuery = "INSERT INTO Lab_echo(mobile_no,lab_echo_file,lab_echo_saved,lab_echo_type) VALUES(?,?,?,?)";
					resp = jtemplate.update(addQuery, new Object[] {pb.getMobile_no(),pb.getLab_echo_file().getBytes(),pb.getLab_echo_saved(),pb.getLab_echo_type()});
					} catch (Exception e) {
						e.printStackTrace();
					}
					return resp;
				}

				@Override
				public int removeecho(Lab_echoBean pb) {
					// TODO Auto-generated method stub
					final String updateQuery = "DELETE FROM Lab_echo WHERE lab_echo_id=?";
					int resp = jtemplate.update(updateQuery, new Object[] {pb.getLab_echo_id()});
					return resp;
				}

				//**********************MRI sub module*********************************
				@Override
				public List<Lab_mriBean> mrireports() {
					final String getQuery = "SELECT * FROM Lab_mri";
					List<Lab_mriBean> list = jtemplate.query(getQuery, new Lab_mriRow());
					return list;
				}

				@Override
				public List<Lab_mriBean> mrireportsbyid(String mobile_no) {
					final String getQuery = "SELECT * FROM Lab_mri WHERE MOBILE_NO=?";
					List<Lab_mriBean> list = jtemplate.query(getQuery, new Lab_mriRow(), mobile_no);
					return list;
				}

				@Override
				public int uploadmrireport(Lab_mriBean pb) {
					int resp = 0;
					try {
					final String addQuery = "INSERT INTO Lab_mri(mobile_no,lab_mri_file,lab_mri_saved,lab_mri_type) VALUES(?,?,?,?)";
					resp = jtemplate.update(addQuery, new Object[] {pb.getMobile_no(),pb.getLab_mri_file().getBytes(),pb.getLab_mri_saved(),pb.getLab_mri_type()});
					} catch (Exception e) {
						e.printStackTrace();
					}
					return resp;
				}

				@Override
				public int removemrireport(Lab_mriBean pb) {
					// TODO Auto-generated method stub
					final String updateQuery = "DELETE FROM Lab_mri WHERE lab_mri_id=?";
					int resp = jtemplate.update(updateQuery, new Object[] {pb.getLab_mri_id()});
					return resp;
				}
				
				//**********************OTHER sub module*********************************

				@Override
				public List<Lab_otherBean> otherreports() {
					final String getQuery = "SELECT * FROM Lab_others";
					List<Lab_otherBean> list = jtemplate.query(getQuery, new Lab_otherRow());
					return list;
				}

				@Override
				public List<Lab_otherBean> otherreportsbyid(String mobile_no) {
					final String getQuery = "SELECT * FROM Lab_others WHERE MOBILE_NO=?";
					List<Lab_otherBean> list = jtemplate.query(getQuery, new Lab_otherRow(), mobile_no);
					return list;
				}

				@Override
				public int uploadother(Lab_otherBean pb) {
					int resp = 0;
					try {
					final String addQuery = "INSERT INTO Lab_others(mobile_no,lab_others_file,lab_others_saved,lab_others_type) VALUES(?,?,?,?)";
					resp = jtemplate.update(addQuery, new Object[] {pb.getMobile_no(),pb.getLab_others_file().getBytes(),pb.getLab_others_saved(),pb.getLab_others_type()});
					} catch (Exception e) {
						e.printStackTrace();
					}
					return resp;
				}

				@Override
				public int removeother(Lab_otherBean pb) {
					// TODO Auto-generated method stub
					final String updateQuery = "DELETE FROM Lab_others WHERE lab_others_id=?";
					int resp = jtemplate.update(updateQuery, new Object[] {pb.getLab_others_id()});
					return resp;
				}

				//**********************STRESS sub module*********************************

				@Override
				public List<Lab_stressBean> stressreports() {
					final String getQuery = "SELECT * FROM Lab_stresstest";
					List<Lab_stressBean> list = jtemplate.query(getQuery, new Lab_stressRow());
					return list;
				}

				@Override
				public List<Lab_stressBean> stressreportsbyid(String mobile_no) {
					final String getQuery = "SELECT * FROM Lab_stresstest WHERE MOBILE_NO=?";
					List<Lab_stressBean> list = jtemplate.query(getQuery, new Lab_stressRow(), mobile_no);
					return list;
				}

				@Override
				public int uploadstress(Lab_stressBean pb) {
					int resp = 0;
					try {
					final String addQuery = "INSERT INTO Lab_stresstest(mobile_no,lab_stresstest_file,lab_stresstest_saved,lab_stresstest_type) VALUES(?,?,?,?)";
					resp = jtemplate.update(addQuery, new Object[] {pb.getMobile_no(),pb.getLab_stresstest_file().getBytes(),pb.getLab_stresstest_saved(),pb.getLab_stresstest_type()});
					} catch (Exception e) {
						e.printStackTrace();
					}
					return resp;
				}

				@Override
				public int removestresstest(Lab_stressBean pb) {
					// TODO Auto-generated method stub
					final String updateQuery = "DELETE FROM Lab_stresstest WHERE lab_stresstest_id=?";
					int resp = jtemplate.update(updateQuery, new Object[] {pb.getLab_stresstest_id()});
					return resp;
				}

				//**********************ULTRA SOUND sub module*********************************

				@Override
				public List<Lab_ultrasoundBean> ultrasoundreports() {
					final String getQuery = "SELECT * FROM Lab_ultrasound";
					List<Lab_ultrasoundBean> list = jtemplate.query(getQuery, new Lab_ultrasoundRow());
					return list;
				}

				@Override
				public List<Lab_ultrasoundBean> ultrasoundreportsbyid(String mobile_no) {
					final String getQuery = "SELECT * FROM Lab_ultrasound WHERE MOBILE_NO=?";
					List<Lab_ultrasoundBean> list = jtemplate.query(getQuery, new Lab_ultrasoundRow(), mobile_no);
					return list;
				}

				@Override
				public int uploadultrasound(Lab_ultrasoundBean pb) {
					int resp = 0;
					try {
					final String addQuery = "INSERT INTO Lab_ultrasound(mobile_no,lab_ultrasound_file,lab_ultrasound_saved,lab_ultrasound_type) VALUES(?,?,?,?)";
					resp = jtemplate.update(addQuery, new Object[] {pb.getMobile_no(),pb.getLab_ultrasound_file().getBytes(),pb.getLab_ultrasound_saved(),pb.getLab_ultrasound_type()});
					} catch (Exception e) {
						e.printStackTrace();
					}
					return resp;
				}

				@Override
				public int removeultrasound(Lab_ultrasoundBean pb) {
					final String updateQuery = "DELETE FROM Lab_ultrasound WHERE lab_ultrasound_id=?";
					int resp = jtemplate.update(updateQuery, new Object[] {pb.getLab_ultrasound_id()});
					return resp;
				}

				//**********************URINE sub module*********************************

				@Override
				public List<Lab_urineBean> urinereports() {
					final String getQuery = "SELECT * FROM Lab_urine_report";
					List<Lab_urineBean> list = jtemplate.query(getQuery, new Lab_urineRow());
					return list;
				}

				@Override
				public List<Lab_urineBean> urinereportsbyid(String mobile_no) {
					final String getQuery = "SELECT * FROM Lab_urine_report WHERE MOBILE_NO=?";
					List<Lab_urineBean> list = jtemplate.query(getQuery, new Lab_urineRow(), mobile_no);
					return list;
				}

				@Override
				public int uploadurine(Lab_urineBean pb) {
					int resp = 0;
					try {
					final String addQuery = "INSERT INTO Lab_urine_report(mobile_no,lab_urine_report_file,lab_urine_report_saved,lab_urine_report_type) VALUES(?,?,?,?)";
					resp = jtemplate.update(addQuery, new Object[] {pb.getMobile_no(),pb.getLab_urine_report_file().getBytes(),pb.getLab_urine_report_saved(),pb.getLab_urine_report_type()});
					} catch (Exception e) {
						e.printStackTrace();
					}
					return resp;
				}

				@Override
				public int removeurine(Lab_urineBean pb) {
					final String updateQuery = "DELETE FROM Lab_urine_report WHERE lab_urine_report_id=?";
					int resp = jtemplate.update(updateQuery, new Object[] {pb.getLab_urine_report_id()});
					return resp;
				}
				
				//**********************XRAY sub module*********************************


				@Override
				public List<Lab_xrayBean> xrayreports() {
					final String getQuery = "SELECT * FROM Lab_xray";
					List<Lab_xrayBean> list = jtemplate.query(getQuery, new Lab_xrayRow());
					return list;
				}

				@Override
				public List<Lab_xrayBean> xrayreportbyid(String mobile_no) {
					final String getQuery = "SELECT * FROM Lab_xray WHERE MOBILE_NO=?";
					List<Lab_xrayBean> list = jtemplate.query(getQuery, new Lab_xrayRow(), mobile_no);
					return list;
				}

				@Override
				public int uploadxray(Lab_xrayBean pb) {
					int resp = 0;
					try {
					final String addQuery = "INSERT INTO Lab_xray(mobile_no,lab_xray_file,lab_xray_saved,lab_xray_title,lab_xray_type) VALUES(?,?,?,?)";
					resp = jtemplate.update(addQuery, new Object[] {pb.getMobile_no(),pb.getLab_xray_file().getBytes(),pb.getLab_xray_saved(),pb.getLab_xray_title(),pb.getLab_xray_type()});
					} catch (Exception e) {
						e.printStackTrace();
					}
					return resp;
				}

				@Override
				public int removexray(Lab_xrayBean pb) {
					final String updateQuery = "DELETE FROM Lab_xray WHERE lab_xray_id=?";
					int resp = jtemplate.update(updateQuery, new Object[] {pb.getLab_xray_id()});
					return resp;
				}

	
	
//*********************Emotional State Module****************************
				
				@Override
				public List<EmotionalBean> findEmotional_status() {
					final String getQuery = "SELECT * FROM EMOTIONAL_STATUS_TABLE";
					List<EmotionalBean> list = jtemplate.query(getQuery, new EmotionalRow());
					return list;
				}
				
				
				public List<EmotionalBean> findemotional_statusbyid(String mobile_no) {
					final String getQuery = "SELECT * FROM emotional_status_table WHERE MOBILE_NO=?";
					List<EmotionalBean> list1 = jtemplate.query(getQuery, new EmotionalRow(), mobile_no);
					return list1;
				}

				public int insertEmotional_status(EmotionalBean obj) {
					// TODO Auto-generated method stub
					int resp = 0;
					try {
					final String addQuery = "INSERT INTO emotional_status_table ( score_of_wellness , emotional_status , duration , any_emotional_trauma , reason_of_trauma , emotional_saved_on , mobile_no) VALUES(?,?,?,?,?,?,? )";
					resp = jtemplate.update(addQuery, new Object[] {obj.getScore_of_wellness() , obj.getEmotional_status() , obj.getDuration() , obj.getAny_emotional_trauma() , obj.getReason_of_trauma()  , obj.getEmotional_saved_on() ,obj.getMobile_no()});
					} catch (Exception e) {
						e.printStackTrace();
					}
					return resp;
				}

				public int updateEmotional_status(EmotionalBean obj) {
					// TODO Auto-generated method stub
					int resp = 0;
					try {
					final String updateQuery = "UPDATE emotional_status_table SET score_of_wellness=?, emotional_status=?, duration =? , any_emotional_trauma=?, reason_of_trauma =?    , emotional_updated_on =? WHERE emotional_id =?";
					resp = jtemplate.update(updateQuery, new Object[] { obj.getScore_of_wellness() , obj.getEmotional_status() , obj.getDuration() , obj.getAny_emotional_trauma() , obj.getReason_of_trauma() , obj.getEmotional_updated_on() ,obj.getEmotional_id()});
					
					} catch (Exception e) {
						e.printStackTrace();
					}
					return resp;
				}

				
				//***********************
					//Education blog
				//***********************
				
				
				@Override
				public List<EducationBean> educationlistimages() {
					// TODO Auto-generated method stub
					final String getQuery = "SELECT * FROM EDUCATION_IMAGE";
					List<EducationBean> list = jtemplate.query(getQuery, new Education_imagerow());
					return list;
				}

				@Override
				public int uploadeducationimage(EducationBean pb) {
					// TODO Auto-generated method stub
					int resp = 0;
					try {
					
					final String addQuery = "INSERT INTO EDUCATION_IMAGE(education_imagetitle,education_image,education_imagesubtype) VALUES(?,?,?)";
					resp = jtemplate.update(addQuery, new Object[] {pb.getEducation_imagetitle(),pb.getEducation_image().getBytes(),pb.getEducation_imagesubtype()});
					
				
					} catch (Exception e) {
						e.printStackTrace();
					}
					return resp;
				}

				@Override
				public int removeeducationimage(EducationBean pb) {
					final String updateQuery = "DELETE FROM EDUCATION_IMAGE WHERE education_imagesno=?";
					int resp = jtemplate.update(updateQuery, new Object[] {pb.getEducation_imagesno()});
					return resp;
				}

				@Override
				public List<EducationBean> educationlistpdf() {
					// TODO Auto-generated method stub
					final String getQuery = "SELECT * FROM EDUCATION_PDF";
					List<EducationBean> list = jtemplate.query(getQuery, new EductionpdfRow());
					return list;
				}

				@Override
				public int uploadeducationpdf(EducationBean pb) {
					int resp = 0;
					try {
					
					final String addQuery = "INSERT INTO EDUCATION_PDF(education_pdftitle,education_pdf,education_pdfsubtype) VALUES(?,?,?)";
					resp = jtemplate.update(addQuery, new Object[] {pb.getEducation_pdftitle(),pb.getEducation_pdf().getBytes(),pb.getEducation_pdfsubtype()});
					
					} catch (Exception e) {
						e.printStackTrace();
					}
					return resp;
				}

				@Override
				public int removeeducationpdf(EducationBean pb) {
					final String updateQuery = "DELETE FROM EDUCATION_PDF WHERE education_pdfsno=?";
					int resp = jtemplate.update(updateQuery, new Object[] {pb.getEducation_pdfsno()});
					return resp;
				}

				@Override
				public List<EducationBean> educationlistweblinks() {
					// TODO Auto-generated method stub
					final String getQuery = "SELECT * FROM EDUCATION_WEBSITELINKS";
					List<EducationBean> list = jtemplate.query(getQuery, new EducationwebRow());
					return list;
				}

				@Override
				public int uploadeducationweblinks(EducationBean pb) {
					// TODO Auto-generated method stub
					int resp = 0;
					try {
					
					final String addQuery = "INSERT INTO EDUCATION_WEBSITELINKS(education_weblink,education_webtitle,education_websubtype) VALUES(?,?,?)";
					resp = jtemplate.update(addQuery, new Object[] {pb.getEducation_weblink(),pb.getEducation_webtitle().getBytes(),pb.getEducation_websubtype()});
					
					} catch (Exception e) {
						e.printStackTrace();
					}
					return resp;
				}

				@Override
				public int removeeducationweblinks(EducationBean pb) {
					final String updateQuery = "DELETE FROM EDUCATION_WEBSITELINKS WHERE education_websno=?";
					int resp = jtemplate.update(updateQuery, new Object[] {pb.getEducation_websno()});
					return resp;
				}

				@Override
				public List<EducationBean> educationlistimagesbymodelname(String education_imagesubtype) {
					// TODO Auto-generated method stub
					final String getQuery = "SELECT * FROM EDUCATION_IMAGE WHERE education_imagesubtype=?";
					List<EducationBean> list = jtemplate.query(getQuery, new Education_imagerow(), education_imagesubtype);
					return list;
				}

				@Override
				public List<EducationBean> educationlistpdfbysubtype(String education_pdfsubtype) {
					// TODO Auto-generated method stub
					final String getQuery = "SELECT * FROM EDUCATION_PDF WHERE education_pdfsubtype=?";
					List<EducationBean> list = jtemplate.query(getQuery, new EductionpdfRow(), education_pdfsubtype);
					return list;
				}

				@Override
				public List<EducationBean> educationlistweblinksbysubtype(String education_websubtype) {
					// TODO Auto-generated method stub
					final String getQuery = "SELECT * FROM EDUCATION_WEBSITELINKS WHERE education_websubtype=?";
					List<EducationBean> list = jtemplate.query(getQuery, new EducationwebRow(), education_websubtype);
					return list;
				}

	
	
	

}
