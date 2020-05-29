package com.myscope.demo.restapi;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLConnection;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.method.annotation.StreamingResponseBody;

import com.myscope.demo.restapi.PatientBean;
import com.myscope.demo.restapi.PatientRegDAO;
import com.myscope.demo.restapi.PatientResponse;
import com.myscope.demo.restapi.ImmunBean;
import com.myscope.demo.restapi.ImmunizationResponse;
import com.myscope.demo.restapi.MedicationBean;
import com.myscope.demo.restapi.MedicationResponse;
import com.myscope.demo.restapi.MyScopeBean;
import com.myscope.demo.restapi.MyScopeResponse;
import com.myscope.demo.restapi.SurgeryBean;
import com.myscope.demo.restapi.SurgeryResponse;

@RestController
@RequestMapping("/myscope")
public class PatientRegController {
	

		@Autowired
		PatientRegDAO patient;
		//*************************API calls for Registration******************************
		@RequestMapping(value="/Patientslist", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
		public List<PatientBean> getPatientList(){
			
			List<PatientBean> lst = patient.findAllUsers();
			System.out.println("size::"+lst.size());
			
			PatientResponse wr = new PatientResponse();
			wr.setResult(lst);
			return lst;
		}
		
		@RequestMapping(value="/Patientslist/{mobile_no}", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
		public List<PatientBean> getPatientbyMobile(@PathVariable("mobile_no") String mobile){
			System.out.println("city::"+mobile);
			List<PatientBean> lst = patient.findPatientbymobile(mobile);
			System.out.println("size::"+lst.size());
			PatientResponse wr = new PatientResponse();
			wr.setResult(lst);
			return lst;
		}
		
		@RequestMapping(value="/Patientslist/queryparam", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
		public List<PatientBean> getPatientbyMobileQueryParam(@RequestParam("mobile_no") String mobile){
			System.out.println("Mobile::"+mobile);
			List<PatientBean> lst = patient.findPatientbymobile(mobile);
			System.out.println("size::"+lst.size());
			return lst;
		}
		
		@RequestMapping(value="/Patientslist", method=RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_XML_VALUE)
		public List<PatientBean> getPatientByJsonInput(@RequestBody PatientBean obj){
			System.out.println("Mobile::"+obj.getMobile());
			List<PatientBean> lst = patient.findPatientbymobile(obj.getMobile());
			System.out.println("size::"+lst.size());
			return lst;
		}
		
		@RequestMapping(value="/addRecord", method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
		public ResponseEntity<PatientResponse> addPatientList(@RequestBody PatientBean obj){
			System.out.println("Mobile::"+obj.getMobile()+","+obj.getLast_name());
			int resp = patient.insertPatient(obj);
			System.out.println("status::"+resp);
			PatientResponse wb = new PatientResponse();
			if(resp == 1) {
			wb.setResponse("success");
			return new ResponseEntity<PatientResponse>(wb, HttpStatus.OK);
			}else {
			return new ResponseEntity<PatientResponse>(wb, HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
		
		@RequestMapping(value="/updateRecord", method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
		public ResponseEntity<PatientResponse> updatePatientList(@RequestBody PatientBean obj){
			
			System.out.println("city::"+obj.getFirst_name()+","+obj.getMobile());
			int resp = patient.updatePatient(obj);
			System.out.println("status::"+resp);
			PatientResponse wb = new PatientResponse();
			if(resp == 1) {
			wb.setResponse("success");
			return new ResponseEntity<PatientResponse>(wb, HttpStatus.OK);
			}else {
			return new ResponseEntity<PatientResponse>(wb, HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
		
		@RequestMapping(value="/deleteRecord", method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
		public int deletePatientList(@RequestBody PatientBean obj){
			
			System.out.println("courtry::"+obj.getMobile());
			int resp = patient.deletePatient(obj);
			System.out.println("status::"+resp);
			
			return resp;
		}
		
		//*************************API call for Patient Profile***********************
		
		@RequestMapping(value="/patientdetails", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
		public List<PatientProfileBean> allfields(){
			
			List<PatientProfileBean> lst = patient.allfields();
			System.out.println("size::"+lst.size());
			
			ProfileResponse wr = new ProfileResponse();
			wr.setResult(lst);
			return lst;
		}
		
		@RequestMapping(value="/patientdetails/{mobile_no}", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
		public List<PatientProfileBean> findProfilebymobile(@PathVariable("mobile_no") String mobile){
			System.out.println("city::"+mobile);
			List<PatientProfileBean> lst = patient.findProfilebymobile(mobile);
			System.out.println("size::"+lst.size());
			ProfileResponse wr = new ProfileResponse();
			wr.setResult(lst);
			return lst;
		}
		
		
		@RequestMapping(value="/patientdetails", method=RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_XML_VALUE)
		public List<PatientProfileBean> getProfileByJsonInput(@RequestBody PatientBean obj){
			System.out.println("Mobile::"+obj.getMobile());
			List<PatientProfileBean> lst = patient.findProfilebymobile(obj.getMobile());
			System.out.println("size::"+lst.size());
			return lst;
		}
		
		@RequestMapping(value="/addpatientprofile", method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
		public ResponseEntity<ProfileResponse> addPatientList(@RequestBody PatientProfileBean obj){
			System.out.println("Mobile::"+obj.getMobile_no()+","+obj.getLast_name());
			int resp = patient.insertProfile(obj);
			System.out.println("status::"+resp);
			ProfileResponse wb = new ProfileResponse();
			if(resp == 1) {
			wb.setResponse("success");
			return new ResponseEntity<ProfileResponse>(wb, HttpStatus.OK);
			}else {
			return new ResponseEntity<ProfileResponse>(wb, HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
		
		@RequestMapping(value="/updatepatientprofile", method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
		public ResponseEntity<ProfileResponse> updatePatientList(@RequestBody PatientProfileBean obj){
			
			int resp = patient.updateProfile(obj);
			System.out.println("status::"+resp);
			ProfileResponse wb = new ProfileResponse();
			if(resp == 1) {
			wb.setResponse("success");
			return new ResponseEntity<ProfileResponse>(wb, HttpStatus.OK);
			}else {
			return new ResponseEntity<ProfileResponse>(wb, HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
		
		@RequestMapping(value="/deletepatientprofile", method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
		public int deletePatientList(@RequestBody PatientProfileBean obj){
			
			System.out.println("courtry::"+obj.getMobile_no());
			int resp = patient.deleteProfile(obj);
			System.out.println("status::"+resp);
			
			return resp;
		}
		
		
		
		//*********************API calls for Disease list************************************
		@RequestMapping(value="/diseaselist", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
		public List<DiseaseBean> getDiseaseList(){
			List<DiseaseBean> lst = patient.findDisease();
			System.out.println("size::"+lst.size());
			
			return lst;
		}
		
		@RequestMapping(value="/diseaselist/{mobile_no}", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
		public List<DiseaseBean> getDiseasebyid(@PathVariable("mobile_no") String mobile_no){
			System.out.println("city::"+mobile_no);
			List<DiseaseBean> lst = patient.finddiseasebyid(mobile_no);
			System.out.println("size::"+lst.size());
			return lst;
		}
		
		@RequestMapping(value="/diseaselist/queryparam", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
		public List<DiseaseBean> getdiseasebyQueryParam(@RequestParam("mobile_no") String mobile_no){
			System.out.println("Mobile::"+mobile_no);
			List<DiseaseBean> lst = patient.finddiseasebyid(mobile_no);
			System.out.println("size::"+lst.size());
			return lst;
		}
		
		@RequestMapping(value="/diseaselist", method=RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_XML_VALUE)
		public List<DiseaseBean> getDiseaseByJsonInput(@RequestBody DiseaseBean obj){
			System.out.println("Patient_id::"+obj.getMobile_no());
			List<DiseaseBean> lst = patient.finddiseasebyid(obj.getMobile_no());
			System.out.println("size::"+lst.size());
			return lst;
		}
		
		@RequestMapping(value="/addDiseaseRecord", method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
		public ResponseEntity<DiseaseResponse> addDiseaseList(@RequestBody DiseaseBean obj){
//			System.out.println("Mobile::"+obj.getMobile()+","+obj.getLast_name());
			
			int resp = patient.insertDisease(obj);
			System.out.println("status::"+resp);
			DiseaseResponse wb = new DiseaseResponse();
			if(resp == 1) {
			wb.setResponse("success");
			return new ResponseEntity<DiseaseResponse>(wb, HttpStatus.OK);
			}else {
			return new ResponseEntity<DiseaseResponse>(wb, HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
		
		@RequestMapping(value="/updateDiseaseRecord", method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
		public ResponseEntity<DiseaseResponse> updateDiseaseList(@RequestBody DiseaseBean obj){
			
//			System.out.println("city::"+obj.getFirst_name()+","+obj.getMobile());
			int resp = patient.updateDisease(obj);
			System.out.println("status::"+resp);
			DiseaseResponse wb = new DiseaseResponse();
			if(resp == 1) {
			wb.setResponse("success");
			return new ResponseEntity<DiseaseResponse>(wb, HttpStatus.OK);
			}else {
			return new ResponseEntity<DiseaseResponse>(wb, HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
		
		@RequestMapping(value="/deleteDiseaseRecord", method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
		public int deletePatientList(@RequestBody DiseaseBean obj){
			
//			System.out.println("courtry::"+obj.getMobile());
			int resp = patient.deleteDisease(obj);
			System.out.println("status::"+resp);
			
			return resp;
		}
		
		
		
		//************************API calls for Family History***********************************
		@RequestMapping(value="/familylist", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
		public List<FamilyBean> getFamilyList(){
			
			List<FamilyBean> lst = patient.allfamily();
			System.out.println("size::"+lst.size());
			
//			DiseaseResponse wr = new DiseaseResponse();
//			wr.setResult(lst);
			return lst;
		}
		
		@RequestMapping(value="/familylist/{mobile_no}", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
		public List<FamilyBean> familybyid(@PathVariable("mobile_no") String mobile){
			System.out.println("city::"+mobile);
			List<FamilyBean> lst = patient.familybyid(mobile);
			System.out.println("size::"+lst.size());
//			DiseaseResponse wr = new DiseaseResponse();
//			wr.setResult(lst);
			return lst;
		}
		
		@RequestMapping(value="/familylist/queryparam", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
		public List<FamilyBean> familybyidMobileQueryParam(@RequestParam("mobile_no") String mobile){
			System.out.println("Mobile::"+mobile);
			List<FamilyBean> lst = patient.familybyid(mobile);
			System.out.println("size::"+lst.size());
			return lst;
		}
		
		@RequestMapping(value="/familylist", method=RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_XML_VALUE)
		public List<FamilyBean> getFamilyByJsonInput(@RequestBody PatientBean obj){
			System.out.println("Mobile::"+obj.getMobile());
			List<FamilyBean> lst = patient.familybyid(obj.getMobile());
			System.out.println("size::"+lst.size());
			return lst;
		}
		
		@RequestMapping(value="/addFamily", method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
		public ResponseEntity<FamilyResponse> addFamilyList(@RequestBody FamilyBean obj){
			System.out.println("Mobile::"+obj.getMobile_no());
			int resp = patient.insertFamily(obj);
			System.out.println("status::"+resp);
			FamilyResponse wb = new FamilyResponse();
			if(resp == 1) {
			wb.setResponse("success");
			return new ResponseEntity<FamilyResponse>(wb, HttpStatus.OK);
			}else {
			return new ResponseEntity<FamilyResponse>(wb, HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
		
		@RequestMapping(value="/updateFamily", method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
		public ResponseEntity<FamilyResponse> updateFamily(@RequestBody FamilyBean obj){
			
//			System.out.println("city::"+obj.getFirst_name()+","+obj.getMobile_no());
			int resp = patient.updateFamily(obj);
			System.out.println("status::"+resp);
			FamilyResponse wb = new FamilyResponse();
			if(resp == 1) {
			wb.setResponse("success");
			return new ResponseEntity<FamilyResponse>(wb, HttpStatus.OK);
			}else {
			return new ResponseEntity<FamilyResponse>(wb, HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
		
		@RequestMapping(value="/deleteFamily", method=RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_VALUE)
		public int deleteFamily(@RequestBody FamilyBean obj){
			
			System.out.println("courtry::"+obj.getMobile_no());
			int resp = patient.deleteFamily(obj);
			System.out.println("status::"+resp);
			
			return resp;
		}
		
		
		//*************************API calls for Diet list*************************************
		@RequestMapping(value="/dietlist", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
		public List<HabitsBean> getDietList(){
			
			List<HabitsBean> lst = patient.findDiet();
			System.out.println("size::"+lst.size());
			
			return lst;
		}
		
		@RequestMapping(value="/dietlist/{mobile_no}", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
		public List<HabitsBean> findDietbyid(@PathVariable("mobile_no") String mobile_no){
			System.out.println("city::"+mobile_no);
			List<HabitsBean> lst = patient.findDietbyid(mobile_no);
			System.out.println("size::"+lst.size());
			
			return lst;
		}
		
		@RequestMapping(value="/dietlist/queryparam", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
		public List<HabitsBean> getdietbyQueryParam(@RequestParam("mobile_no") String mobile_no){
			System.out.println("Mobile::"+mobile_no);
			List<HabitsBean> lst = patient.findDietbyid(mobile_no);
			System.out.println("size::"+lst.size());
			return lst;
		}
		
		
		@RequestMapping(value="/adddiet", method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
		public ResponseEntity<HabitResponse> addDietList(@RequestBody HabitsBean obj){
			int resp = patient.insertDiet(obj);
			System.out.println("status::"+resp);
			HabitResponse wb = new HabitResponse();
			if(resp == 1) {
			wb.setResponse("success");
			return new ResponseEntity<HabitResponse>(wb, HttpStatus.OK);
			}else {
			return new ResponseEntity<HabitResponse>(wb, HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
		
		
		@RequestMapping(value="/updateDiet", method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
		public  ResponseEntity<HabitResponse> updateDiet(@RequestBody HabitsBean pb){
			
//			System.out.println("city::"+obj.getFirst_name()+","+obj.getMobile_no());
			int resp = patient.updateDiet(pb);
			System.out.println("status::"+resp);
			HabitResponse wb = new HabitResponse();
			if(resp == 1) {
			wb.setResponse("success");
			return new ResponseEntity<HabitResponse>(wb, HttpStatus.OK);
			}else {
			return new ResponseEntity<HabitResponse>(wb, HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
		//**********************Social History*****************************************
		
		@RequestMapping(value="/habitlist", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
		public List<HabitsBean> getSocialHabit(){
			
			List<HabitsBean> lst = patient.findSocialHabit();
			System.out.println("size::"+lst.size());
			
			HabitResponse wr = new HabitResponse();
			wr.setResult(lst);
			return lst;
		}
		
		@RequestMapping(value="/habitlist/{mobile_no}", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
		public List<HabitsBean> findHabitbyid(@PathVariable("mobile_no") String mobile){
			System.out.println("city::"+mobile);
			List<HabitsBean> lst = patient.findHabitbyid(mobile);
			System.out.println("size::"+lst.size());
			HabitResponse wr = new HabitResponse();
			wr.setResult(lst);
			return lst;
		}
		
		@RequestMapping(value="/habitlist/queryparam", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
		public List<HabitsBean> habitbyidMobileQueryParam(@RequestParam("mobile_no") String mobile){
			System.out.println("Mobile::"+mobile);
			List<HabitsBean> lst = patient.findHabitbyid(mobile);
			System.out.println("size::"+lst.size());
			return lst;
		}
		
		@RequestMapping(value="/habitlist", method=RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_XML_VALUE)
		public List<HabitsBean> getHabitByJsonInput(@RequestBody PatientBean obj){
			System.out.println("Mobile::"+obj.getMobile());
			List<HabitsBean> lst = patient.findHabitbyid(obj.getMobile());
			System.out.println("size::"+lst.size());
			return lst;
		}
		
		@RequestMapping(value="/addHabit", method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
		public ResponseEntity<HabitResponse> addHabit(@RequestBody HabitsBean obj){
			System.out.println("Mobile::"+obj.getMobile_no());
			int resp = patient.insertHabit(obj);
			System.out.println("status::"+resp);
			HabitResponse wb = new HabitResponse();
			if(resp == 1) {
			wb.setResponse("success");
			return new ResponseEntity<HabitResponse>(wb, HttpStatus.OK);
			}else {
			return new ResponseEntity<HabitResponse>(wb, HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
		
		@RequestMapping(value="/updateHabit", method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
		public ResponseEntity<HabitResponse> updateHabit(@RequestBody HabitsBean obj){
			System.out.println("Mobile::"+obj.getMobile_no());
			int resp = patient.updateHabit(obj);
			System.out.println("status::"+resp);
			HabitResponse wb = new HabitResponse();
			if(resp == 1) {
			wb.setResponse("success");
			return new ResponseEntity<HabitResponse>(wb, HttpStatus.OK);
			}else {
			return new ResponseEntity<HabitResponse>(wb, HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
//		
//		@RequestMapping(value="/deleteHabit", method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
//		public int deleteHabit(@RequestBody HabitsBean obj){
//			
//			System.out.println("courtry::"+obj.getMobile_no());
//			int resp = patient.deleteHabit(obj);
//			System.out.println("status::"+resp);
//			
//			return resp;
//		}
		
		
		//**********************Adverse Drugs*****************************************
		
		@RequestMapping(value="/adverselist/{mobile_no}", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
		public List<HabitsBean> findadverse(@PathVariable("mobile_no") String mobile){
			System.out.println("city::"+mobile);
			List<HabitsBean> lst = patient.findadversebyid(mobile);
			System.out.println("size::"+lst.size());
			HabitResponse wr = new HabitResponse();
			wr.setResult(lst);
			return lst;
		}

		@RequestMapping(value="/addadverse", method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
		public ResponseEntity<HabitResponse> addDrug(@RequestBody HabitsBean obj){
			System.out.println("Mobile::"+obj.getMobile_no());
			int resp = patient.insertadverseDrug(obj);
			System.out.println("status::"+resp);
			HabitResponse wb = new HabitResponse();
			if(resp == 1) {
			wb.setResponse("success");
			return new ResponseEntity<HabitResponse>(wb, HttpStatus.OK);
			}else {
			return new ResponseEntity<HabitResponse>(wb, HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
		
		@RequestMapping(value="/updateadversedrug", method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
		public  ResponseEntity<HabitResponse> updateadversedrug(@RequestBody HabitsBean obj){
			
//			System.out.println("city::"+obj.getFirst_name()+","+obj.getMobile_no());
			int resp = patient.updateadverseDrug(obj);
			System.out.println("status::"+resp);
			HabitResponse wb = new HabitResponse();
			if(resp == 1) {
			wb.setResponse("success");
			return new ResponseEntity<HabitResponse>(wb, HttpStatus.OK);
			}else {
			return new ResponseEntity<HabitResponse>(wb, HttpStatus.INTERNAL_SERVER_ERROR);
			}		}
		/******************
		 * 
		 * PRESCRIPTION MODULE
		 * 
		 * *****************/
		 
		
		//**********************Doctor List ******************************************
		@RequestMapping(value="/doctorlist", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
		public List<PrescriptionManualBean> getPrescriptionList(){
			List<PrescriptionManualBean> lst = patient.findAllPrescriptions();
			System.out.println("size::"+lst.size());
			
			PrescriptionResponse wr = new PrescriptionResponse();
			wr.setResult(lst);
			return lst;
		}
		
		@RequestMapping(value="/doctorlist/{mobile_no}", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
		public List<PrescriptionManualBean> findPrescriptionbymobile(@PathVariable("mobile_no") String mobile_no){
			System.out.println("city::"+mobile_no);
			List<PrescriptionManualBean> lst = patient.findPrescriptionbymobile(mobile_no);
			System.out.println("size::"+lst.size());
			PrescriptionResponse wr = new PrescriptionResponse();
			wr.setResult(lst);
			return lst;
		}
		@RequestMapping(value="/doctorlist/{mobile_no}/{model_name}", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
		public List<PrescriptionManualBean> findPrescriptionbyid(@PathVariable("mobile_no") String mobile,@PathVariable("model_name") String model_name){
			System.out.println("city::"+mobile);
			List<PrescriptionManualBean> lst = patient.findPrescriptionbyid(mobile,model_name);
			System.out.println("size::"+lst.size());
			PrescriptionResponse wr = new PrescriptionResponse();
			wr.setResult(lst);
			return lst;
		}
		
		
		@RequestMapping(value="/doctorlist/add/{prescription_id}", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
		public List<PrescriptionManualBean> findPrescriptionbypid(@PathVariable("prescription_id") int prescription_id){
			System.out.println("city::"+prescription_id);
			List<PrescriptionManualBean> lst = patient.findPrescriptionbyPId(prescription_id);
			System.out.println("size::"+lst.size());
			PrescriptionResponse wr = new PrescriptionResponse();
			wr.setResult(lst);
			return lst;
		}
		
//		
//		@RequestMapping(value="/doctorlist/queryparam", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
//		public List<PrescriptionManualBean> findPrescriptionbyidMobileQueryParam(@RequestParam("mobile_no") String mobile){
//			System.out.println("Mobile::"+mobile);
//			List<PrescriptionManualBean> lst = patient.findPrescriptionbyid(mobile);
//			System.out.println("size::"+lst.size());
//			return lst;
//		}
//		
//		@RequestMapping(value="/doctorlist", method=RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_XML_VALUE)
//		public List<PrescriptionManualBean> getPrescriptionbyidByJsonInput(@RequestBody PrescriptionManualBean obj){
//			System.out.println("Mobile::"+obj.getMobile_no());
//			List<PrescriptionManualBean> lst = patient.findPrescriptionbyid(obj.getMobile_no());
//			System.out.println("size::"+lst.size());
//			return lst;
//		}
		
		@RequestMapping(value="/adddoctorlist", method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
		public ResponseEntity<PrescriptionResponse> addPrescription(@RequestBody PrescriptionManualBean obj){
			System.out.println("Mobile::"+obj.getMobile_no());
			int resp = patient.insertPrescription(obj);
			System.out.println("status::"+resp);
			PrescriptionResponse wb = new PrescriptionResponse();
			if(resp == 1) {
			wb.setResponse("success");
			return new ResponseEntity<PrescriptionResponse>(wb, HttpStatus.OK);
			}else {
			return new ResponseEntity<PrescriptionResponse>(wb, HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
		
//		@RequestMapping(value="/updateprescriptionlist", method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
//		public int updateHabit(@RequestBody PrescriptionManualBean obj){
//			
////			System.out.println("city::"+obj.getFirst_name()+","+obj.getMobile_no());
//			int resp = patient.updatePrescription(obj);
//			System.out.println("status::"+resp);
//			return resp;
//		}
		
		@RequestMapping(value="/deletedoctorlist", method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
		public int deleteHabit(@RequestBody PrescriptionManualBean obj){
			
			System.out.println("courtry::"+obj.getMobile_no());
			int resp = patient.deletePrescription(obj);
			System.out.println("status::"+resp);
			
			return resp;
		}
		
		
		
		
		//****************************Drug api calling***************************************
		
		@RequestMapping(value="/druglist", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
		public List<PrescriptionDurgBean> getDrugList(){
			List<PrescriptionDurgBean> lst = patient.findAllDrugs();
			System.out.println("size::"+lst.size());
			
//			PrescriptionResponse wr = new PrescriptionResponse();
//			wr.setResult(lst);
			return lst;
		}
		
		@RequestMapping(value="/druglist/add/{prescription_id}", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
		public List<PrescriptionDurgBean> findDrugsbyprescriptionId(@PathVariable("prescription_id") int prescription_id){
			System.out.println("city::"+prescription_id);
			List<PrescriptionDurgBean> lst = patient.findDrugbyid(prescription_id);
			System.out.println("size::"+lst.size());
//			PrescriptionResponse wr = new PrescriptionResponse();
//			wr.setResult(lst);
			return lst;
		} 
		
		@RequestMapping(value="/druglist/{drug_id}", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
		public List<PrescriptionDurgBean> findPrescriptionbydrugId(@PathVariable("drug_id") int drug_id){
			System.out.println("city::"+drug_id);
			List<PrescriptionDurgBean> lst = patient.findPrescriptionbydrugId(drug_id);
			System.out.println("size::"+lst.size());
//			DrugResponse wr = new DrugResponse();
//			wr.setResult(lst);
			return lst;
		}
		
		@RequestMapping(value="/druglist/queryparam", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
		public List<PrescriptionDurgBean> findDrugbyididQueryParam(@RequestParam("drug_id") int drug_id){
			System.out.println("Mobile::"+drug_id);
			List<PrescriptionDurgBean> lst = patient.findDrugbyid(drug_id);
			System.out.println("size::"+lst.size());
			return lst;
		}
		
//		@RequestMapping(value="/druglist", method=RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_XML_VALUE)
//		public List<PrescriptionDurgBean> getDrugbyidByJsonInput(@RequestBody PrescriptionDurgBean obj){
////			System.out.println("Mobile::"+obj.getMobile_no());
//			List<PrescriptionDurgBean> lst = patient.finddrugbyid(obj.getdrug_id());
//			System.out.println("size::"+lst.size());
//			return lst;
//		}
		
		@RequestMapping(value="/addDruglist", method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
		public ResponseEntity<DrugResponse> addDrug(@RequestBody PrescriptionDurgBean obj){
//			System.out.println("Mobile::"+obj.getMobile_no());
			int resp = patient.insertDrug(obj);
			System.out.println("status::"+resp);
			DrugResponse wb = new DrugResponse();
			if(resp == 1) {
			wb.setResponse("success");
			return new ResponseEntity<DrugResponse>(wb, HttpStatus.OK);
			}else {
			return new ResponseEntity<DrugResponse>(wb, HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
		
		@RequestMapping(value="/updatedruglist", method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
		public ResponseEntity<DrugResponse> updateDrug(@RequestBody PrescriptionDurgBean obj){
			
//			System.out.println("city::"+obj.getFirst_name()+","+obj.getMobile_no());
			int resp = patient.updateDrug(obj);
			System.out.println("status::"+resp);
			DrugResponse wb = new DrugResponse();
			if(resp == 1) {
			wb.setResponse("success");
			return new ResponseEntity<DrugResponse>(wb, HttpStatus.OK);
			}else {
			return new ResponseEntity<DrugResponse>(wb, HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
		
		@RequestMapping(value="/deleteDruglist", method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
		public int deleteDrug(@RequestBody PrescriptionDurgBean obj){
			
//			System.out.println("courtry::"+obj.getMobile_no());
			int resp = patient.deleteDrug(obj);
			System.out.println("status::"+resp);
			
			return resp;
		}
		
		//*******************************API for prescription upload*******************************
		
		@RequestMapping(value="/uploadedlist", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
		public List<PrescriptionUploadBean> alluploadedprescriptions(){
			List<PrescriptionUploadBean> lst = patient.alluploadedprescriptions();
			System.out.println("size::"+lst.size());
			
//			PrescriptionResponse wr = new PrescriptionResponse();
//			wr.setResult(lst);
			return lst;
		}
		
		@RequestMapping(value = "/uploadedlist/{mobile_no}", method = RequestMethod.GET)
		
		public List<PrescriptionUploadBean> uploadprescriptionbyid(@PathVariable("mobile_no") String mobile_no){
			System.out.println("city::"+mobile_no);
			List<PrescriptionUploadBean> lst = patient.uploadprescriptionbyid(mobile_no);
			System.out.println("size::"+lst.size());
//			DrugResponse wr = new DrugResponse();
//			wr.setResult(lst);
			return lst;
		}
		
		
	@RequestMapping(value = "/uploadedlist/{mobile_no}/{model_name}", method = RequestMethod.GET)
		
		public List<PrescriptionUploadBean> uploadprescriptionmodelname(@PathVariable("mobile_no") String mobile_no,@PathVariable("model_name") String model_name){
			System.out.println("city::"+mobile_no);
			List<PrescriptionUploadBean> lst = patient.uploadprescriptionbymodelname(mobile_no, model_name);
			System.out.println("size::"+lst.size());
//			DrugResponse wr = new DrugResponse();
//			wr.setResult(lst);
			return lst;
		}
	
	
		@RequestMapping(value="/uploadedlist/queryparam", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
		public List<PrescriptionUploadBean> findDrugbyididQueryParam(@RequestParam("mobile_no") String mobile_no){
			System.out.println("Mobile::"+mobile_no);
			List<PrescriptionUploadBean> lst = patient.uploadprescriptionbyid(mobile_no);
			System.out.println("size::"+lst.size());
			return lst;
		}
		
		@RequestMapping(value="/preupload", method=RequestMethod.POST)
		
//		public ResponseEntity<PrescriptionResponse> uploadDoc(@RequestBody PrescriptionUploadBean obj){
////			System.out.println("Mobile::"+obj.getMobile_no());
//			int resp = patient.uploadPrescription(obj);
//			System.out.println("status::"+resp);
//			PrescriptionResponse wb = new PrescriptionResponse();
//			if(resp == 1) {
//			wb.setResponse("success");
//			return new ResponseEntity<PrescriptionResponse>(wb, HttpStatus.OK);
//			}else {
//			return new ResponseEntity<PrescriptionResponse>(wb, HttpStatus.INTERNAL_SERVER_ERROR);
//			}
		public int uploadDoc(
				@RequestParam("mobile_no") String number,
		@RequestParam("p_upload") MultipartFile file,@RequestParam("upload_saved_on") String upload_saved_on,@RequestParam("upload_type") String upload_type,@RequestParam("model_name") String model_name){

			PrescriptionUploadBean wb = new PrescriptionUploadBean();
		wb.setMobile_no(number);
		wb.setP_upload(file);
		wb.setUpload_saved_on(upload_saved_on);
		wb.setUpload_type(upload_type);
		wb.setModel_name(model_name);
//		wb.setUpload_title(upload_title);
		//System.out.println("file name::"+file);
		int resp = 0 ;
		resp = patient.uploadPrescription(wb);
		System.out.println("status::"+resp);

		return resp;
		}
		
		
		@RequestMapping(value="/deleteupload", method=RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_VALUE)
		public int deleteDrug(@RequestBody PrescriptionUploadBean obj){
			
//			System.out.println("courtry::"+obj.getMobile_no());
			int resp = patient.removeuploadedPrescription(obj);
			System.out.println("status::"+resp);
			
			return resp;
		}

		
		
		//**************************Allergy,immunization,surgery,medication********************
		
		@RequestMapping(value="/listallergy", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
		
		
		public List<MyScopeBean> getMyscopeList(){
		
		List<MyScopeBean> lst = patient.findAll();
		System.out.println("size::"+lst.size());
		
		return lst;
	}
	
				
	
	
	@RequestMapping(value="addallergyRecords", method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<MyScopeResponse> addPatientList(@RequestBody MyScopeBean obj){
		System.out.println("Add Records Data::"+obj.getMobile_no()+obj.getName() +","+obj.getReaction()
		+","+obj.getNotes()+","+obj.getSpnrdata() +","+obj.getTreatment()+","+obj.getDate());
		int resp = patient.insertMyscope(obj);
		System.out.println("status::"+resp);
		
		MyScopeResponse wb = new MyScopeResponse();
		if(resp == 1) {
		wb.setResponse("success");
		return new ResponseEntity<MyScopeResponse>(wb, HttpStatus.OK);
		}else {
		return new ResponseEntity<MyScopeResponse>(wb, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		//return resp;
	}
	
	
	
	
	@RequestMapping(value="allergyupdate", method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<MyScopeResponse> updateAllergyList(@RequestBody MyScopeBean obj){
		
		System.out.println("Update Records Data::"+obj.getAllergy_id()+","+obj.getName() +","+obj.getReaction()
		+","+obj.getNotes()+","+obj.getSpnrdata() +","+obj.getTreatment()+","+obj.getDate()+","+obj.getMobile_no());
		int resp = patient.updateMyscope(obj);
		
		System.out.println("status::"+resp);
		
		
		
		MyScopeResponse wu = new MyScopeResponse();
		if(resp == 1) {
		wu.setResponse("success");
		return new ResponseEntity<MyScopeResponse>(wu, HttpStatus.OK);
		}else {
		return new ResponseEntity<MyScopeResponse>(wu, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		}
	
	
	
	
	

	@RequestMapping(value="listallergyid/{mobile_no}", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<MyScopeBean> getMyScopeAllergyByid(@PathVariable("mobile_no")String mobile_no){
		
		
		System.out.println("id::"+ mobile_no);
		List<MyScopeBean> lst = patient.findAllergybyid(mobile_no);
		System.out.println("size::"+lst.size());
		
		return lst;
	}
	
								///Immunization History 
	
	
	@RequestMapping(value="listimmun", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)

		public List<ImmunBean> getMyscopeListImmun(){
		
		List<ImmunBean> lst = patient.findAll_Immun();
		System.out.println("size::"+lst.size());
		
		return lst;
	}
	
	
	
	@RequestMapping(value="addimmunRecords", method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ImmunizationResponse> addImmunList(@RequestBody ImmunBean obj){
		System.out.println("Add Records Data::"+obj.getImmuname() +","+obj.getImmuevent()
		+","+obj.getImmunotes()+","+obj.getImmubrand()+","+obj.getImmudate()+","+obj.getMobile_no());
		int resp = patient.insertMyscope_Immun(obj);
		System.out.println("status::"+resp);
		
		ImmunizationResponse wb = new ImmunizationResponse();
		if(resp == 1) {
		wb.setResponse("success");
		return new ResponseEntity<ImmunizationResponse>(wb, HttpStatus.OK);
		}else {
		return new ResponseEntity<ImmunizationResponse>(wb, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		//return resp;
	}
	
	

	

	
	@RequestMapping(value="immuneupdate", method=RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ImmunizationResponse> updateimmuList(@RequestBody ImmunBean obj){
		
		System.out.println("update Records Data::"+obj.getImmuname() +","+obj.getImmuevent()
		+","+obj.getImmunotes()+","+obj.getImmubrand()+","+obj.getImmudate()+","+obj.getMobile_no()+","+obj.getImmun_id());
		int resp = patient.updateMyscope_Immun(obj);
		
		System.out.println("status::"+resp);
		
		ImmunizationResponse wu = new ImmunizationResponse();
		if(resp == 1) {
		wu.setResponse("success");
		return new ResponseEntity<ImmunizationResponse>(wu, HttpStatus.OK);
		}else {
		return new ResponseEntity<ImmunizationResponse>(wu, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		
		}
		
		
	
	
	
	@RequestMapping(value="listimmuid/{mobile_no}", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<ImmunBean> getMyScopeImmuByid(@PathVariable("mobile_no")String mobile_no){
		
		
		System.out.println("id::"+ mobile_no);
		List<ImmunBean> lst = patient.findImmunebyid(mobile_no);
		System.out.println("size::"+lst.size());
		
		return lst;
	}
	
	
									///Surgery History 
	
	
	
	@RequestMapping(value="listsurgery", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)

	public List<SurgeryBean> getMyscopeListSurgery(){
	
	List<SurgeryBean> lst = patient.findAll_Surgery();
	System.out.println("size::"+lst.size());
	
	return lst;
}



@RequestMapping(value="addsurgeryRecords", method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
public ResponseEntity<SurgeryResponse> addSurgeryList(@RequestBody SurgeryBean obj){
	System.out.println("Add Records Data::"+obj.getSurgeryname() +","+obj.getSurgerynotes()
	+","+obj.getSurgerylocation()+","+obj.getSurgeryhospital()+","+obj.getSurgerydate()+","+obj.getMobile_no());
	int resp = patient.insertMyscope_Surgery(obj);
	System.out.println("status::"+resp);
	
	SurgeryResponse sb = new SurgeryResponse();
	if(resp == 1) {
	sb.setResponse("success");
	return new ResponseEntity<SurgeryResponse>(sb, HttpStatus.OK);
	}else {
	return new ResponseEntity<SurgeryResponse>(sb, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	//return resp;
}






@RequestMapping(value="surgeryupdate", method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
public ResponseEntity<SurgeryResponse> updatesurgeryList(@RequestBody SurgeryBean obj){
	
	System.out.println("update Records Data::"+obj.getSurgeryname() +","+obj.getSurgerynotes()
	+","+obj.getSurgerylocation()+","+obj.getSurgeryprovider()+","+obj.getSurgeryhospital()+","+obj.getSurgerydate()+","+","+obj.getMobile_no()+","+obj.getSurgery_id());
	int resp = patient.updateMyscope_Surgery(obj);
	
	System.out.println("status::"+resp);
	
	SurgeryResponse su = new SurgeryResponse();
	if(resp == 1) {
	su.setResponse("success");
	return new ResponseEntity<SurgeryResponse>(su, HttpStatus.OK);
	}else {
	return new ResponseEntity<SurgeryResponse>(su, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	
	}
	
	



@RequestMapping(value="listsurgeryid/{mobile_no}", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
public List<SurgeryBean> getSurgeryByid(@PathVariable("mobile_no")String mobile_no){
	
	
	System.out.println("id::"+ mobile_no);
	List<SurgeryBean> lst = patient.findMyScopebyid(mobile_no);
	System.out.println("size::"+lst.size());
	
	return lst;
}
									///Medication History 



	@RequestMapping(value="listmedication", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	
	public List<MedicationBean> getMyscopeListMedication(){
	
	List<MedicationBean> lst = patient.findAll_Medication();
	System.out.println("size::"+lst.size());
	
	return lst;
	}



	@RequestMapping(value="addmedicationRecords", method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<MedicationResponse> addMedicationList(@RequestBody MedicationBean obj){
		
	System.out.println("Add Records Data::"+obj.getMedicationname() +","+obj.getDoseunit()
	+","+obj.getEnddate()+","+obj.getFormulation()+","+obj.getStartdate()+","+obj.getMobile_no()
	+","+obj.getHow_often_taken()+","+obj.getIsprescribed()+","+obj.getStrength()+
	","+obj.getMedicationnotes()+","+obj.getReason());
	
	int resp = patient.insertMyscope_Medication(obj);
	System.out.println("status::"+resp);

	MedicationResponse mb = new MedicationResponse();
		if(resp == 1) {
		mb.setResponse("success");
		return new ResponseEntity<MedicationResponse>(mb, HttpStatus.OK);
		}else {
		return new ResponseEntity<MedicationResponse>(mb, HttpStatus.INTERNAL_SERVER_ERROR);
	}

//return resp;
}



	@RequestMapping(value="medicationupdate", method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<MedicationResponse> updatemedicationList(@RequestBody MedicationBean obj){
	
	System.out.println("update Records Data::"+obj.getMedicationname() +","+obj.getDoseunit()
	+","+obj.getEnddate()+","+obj.getFormulation()+","+obj.getStartdate()+","+obj.getMobile_no()
	+","+obj.getHow_often_taken()+","+obj.getIsprescribed()+","+obj.getStrength()+
	","+obj.getMedicationnotes()+","+obj.getReason()+","+obj.getMedication_id());
	
	int resp = patient.updateMyscope_Medication(obj);
	
	System.out.println("status::"+resp);
	
	MedicationResponse mu = new MedicationResponse();
	if(resp == 1) {
	mu.setResponse("success");
	return new ResponseEntity<MedicationResponse>(mu, HttpStatus.OK);
	}else {
	return new ResponseEntity<MedicationResponse>(mu, HttpStatus.INTERNAL_SERVER_ERROR);
	}


}





	@RequestMapping(value="listmedicationid/{mobile_no}", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<MedicationBean> getmedicationByid(@PathVariable("mobile_no")String mobile_no){
	
	
	System.out.println("id::"+ mobile_no);
	
	List<MedicationBean> lst = patient.findMedicationbyid(mobile_no);
	System.out.println("size::"+lst.size());
	
	return lst;
	}
	
	//*******************************************
	//**********Services Module******************
	//*******************************************
	
	@RequestMapping(value="/servicelist", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<HabitsBean> getServicesList(){
		
		List<HabitsBean> lst = patient.findServices();
		System.out.println("size::"+lst.size());
		
		return lst;
	}
	
	@RequestMapping(value="/servicelist/{mobile_no}", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<HabitsBean> findServicesbyid(@PathVariable("mobile_no") String mobile_no){
		System.out.println("city::"+mobile_no);
		List<HabitsBean> lst = patient.findServicesbyid(mobile_no);
		System.out.println("size::"+lst.size());
		
		return lst;
	}
	
	@RequestMapping(value="/servicelist/queryparam", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<HabitsBean> getservicesbyQueryParam(@RequestParam("mobile_no") String mobile_no){
		System.out.println("Mobile::"+mobile_no);
		List<HabitsBean> lst = patient.findServicesbyid(mobile_no);
		System.out.println("size::"+lst.size());
		return lst;
	}
	
	@RequestMapping(value="/servicelist", method=RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_XML_VALUE)
	public List<HabitsBean> getServicesByJsonInput(@RequestBody DiseaseBean obj){
		System.out.println("Patient_id::"+obj.getMobile_no());
		List<HabitsBean> lst = patient.findServicesbyid(obj.getMobile_no());
		System.out.println("size::"+lst.size());
		return lst;
	}
	
	@RequestMapping(value="/addservices", method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<HabitResponse> addServicesList(@RequestBody HabitsBean obj){
		int resp = patient.insertServices(obj);
		System.out.println("status::"+resp);
		HabitResponse wb = new HabitResponse();
		if(resp == 1) {
		wb.setResponse("success");
		return new ResponseEntity<HabitResponse>(wb, HttpStatus.OK);
		}else {
		return new ResponseEntity<HabitResponse>(wb, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	@RequestMapping(value="/updateservices", method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<HabitResponse>  updateServices(@RequestBody HabitsBean obj){
		
//		System.out.println("city::"+obj.getFirst_name()+","+obj.getMobile_no());
		int resp = patient.updateServices(obj);
		System.out.println("status::"+resp);
		HabitResponse wb = new HabitResponse();
		if(resp == 1) {
		wb.setResponse("success");
		return new ResponseEntity<HabitResponse>(wb, HttpStatus.OK);
		}else {
		return new ResponseEntity<HabitResponse>(wb, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	/******************
	 * 
	 * SELF MONITORING MODULE
	 * 
	 * *****************/
	
	//**********************Blood Glucose*****************************************
	
		@RequestMapping(value="/glucoselist", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
		public List<GlucoseBean> getGlucoseList(){
			List<GlucoseBean> lst = patient.findGlucose();
			System.out.println("size::"+lst.size());
			
			return lst;
		}
		
		
				@RequestMapping(value="/glucoselist/{mobile_no}", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
				public List<GlucoseBean> findglucose(@PathVariable("mobile_no") String mobile){
					System.out.println("city::"+mobile);
					List<GlucoseBean> lst = patient.findglucosebyid(mobile);
					System.out.println("size::"+lst.size());
					GlucoseResponse wr = new GlucoseResponse();
					wr.setResult(lst);
					return lst;
				}

				@RequestMapping(value="/addglucose", method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
				public ResponseEntity<GlucoseResponse> addGlucose(@RequestBody GlucoseBean obj){
					System.out.println("Mobile::"+obj.getMobile_no());
					int resp = patient.insertGlucose(obj);
					System.out.println("status::"+resp);
					GlucoseResponse wb = new GlucoseResponse();
					if(resp == 1) {
					wb.setResponse("success");
					return new ResponseEntity<GlucoseResponse>(wb, HttpStatus.OK);
					}else {
					return new ResponseEntity<GlucoseResponse>(wb, HttpStatus.INTERNAL_SERVER_ERROR);
					}
				}
				
				@RequestMapping(value="/updateglucose", method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
				public ResponseEntity<GlucoseResponse> updateglucose(@RequestBody GlucoseBean obj){
				//System.out.println("city::"+obj.getFirst_name()+","+obj.getMobile_no());
				int resp = patient.updateGlucose(obj);
				System.out.println("status::"+resp);
				GlucoseResponse wb = new GlucoseResponse();
				if(resp == 1) {
				wb.setResponse("success");
				return new ResponseEntity<GlucoseResponse>(wb, HttpStatus.OK);
				}else {
				return new ResponseEntity<GlucoseResponse>(wb, HttpStatus.INTERNAL_SERVER_ERROR);
				}
			}
			
		
				//**********************Blood Pressure*****************************************
				
				@RequestMapping(value="/pressurelist", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
				public List<PressureBean> getPressureList(){
					List<PressureBean> lst = patient.findPressure();
					System.out.println("size::"+lst.size());
					
					return lst;
				}
				
				@RequestMapping(value="/pressurelist/{mobile_no}", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
				public List<PressureBean> findpressure(@PathVariable("mobile_no") String mobile){
					System.out.println("city::"+mobile);
					List<PressureBean> lst = patient.findpressurebyid(mobile);
					System.out.println("size::"+lst.size());
					PressureResponse wr = new PressureResponse();
					wr.setResult(lst);
					return lst;
				}

				@RequestMapping(value="/addpressure", method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
				public ResponseEntity<PressureResponse> addPressure(@RequestBody PressureBean obj){
					System.out.println("Mobile::"+obj.getMobile_no());
					int resp = patient.insertPressure(obj);
					System.out.println("status::"+resp);
					PressureResponse wb = new PressureResponse();
					if(resp == 1) {
					wb.setResponse("success");
					return new ResponseEntity<PressureResponse>(wb, HttpStatus.OK);
					}else {
					return new ResponseEntity<PressureResponse>(wb, HttpStatus.INTERNAL_SERVER_ERROR);
					}
				}
				
				@RequestMapping(value="/updatepressure", method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
				public ResponseEntity<PressureResponse> updatepressure(@RequestBody PressureBean obj){
				//System.out.println("city::"+obj.getFirst_name()+","+obj.getMobile_no());
				int resp = patient.updatePressure(obj);
				System.out.println("status::"+resp);
				PressureResponse wb = new PressureResponse();
				if(resp == 1) {
				wb.setResponse("success");
				return new ResponseEntity<PressureResponse>(wb, HttpStatus.OK);
				}else {
				return new ResponseEntity<PressureResponse>(wb, HttpStatus.INTERNAL_SERVER_ERROR);
				}
			}
				
	//**********************Cholestrol*****************************************
				
				@RequestMapping(value="/cholestrollist", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
				public List<CholestrolBean> getCholestrolList(){
					List<CholestrolBean> lst = patient.findCholestrol();
					System.out.println("size::"+lst.size());
					
					return lst;
				}
				
				
				@RequestMapping(value="/cholestrollist/{mobile_no}", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
				public List<CholestrolBean> findcholestrol(@PathVariable("mobile_no") String mobile){
					System.out.println("city::"+mobile);
					List<CholestrolBean> lst = patient.findcholestrolbyid(mobile);
					System.out.println("size::"+lst.size());
					CholestrolResponse wr = new CholestrolResponse();
					wr.setResult(lst);
					return lst;
				}

				@RequestMapping(value="/addcholestrol", method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
				public ResponseEntity<CholestrolResponse> addCholestrol(@RequestBody CholestrolBean obj){
					System.out.println("Mobile::"+obj.getMobile_no());
					int resp = patient.insertCholestrol(obj);
					System.out.println("status::"+resp);
					CholestrolResponse wb = new CholestrolResponse();
					if(resp == 1) {
					wb.setResponse("success");
					return new ResponseEntity<CholestrolResponse>(wb, HttpStatus.OK);
					}else {
					return new ResponseEntity<CholestrolResponse>(wb, HttpStatus.INTERNAL_SERVER_ERROR);
					}
				}
				
				@RequestMapping(value="/updatecholestrol", method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
				public ResponseEntity<CholestrolResponse> updateCholestrol(@RequestBody CholestrolBean obj){
				//System.out.println("city::"+obj.getFirst_name()+","+obj.getMobile_no());
				int resp = patient.updateCholestrol(obj);
				System.out.println("status::"+resp);
				System.out.println("status::"+resp);
				CholestrolResponse wb = new CholestrolResponse();
				if(resp == 1) {
				wb.setResponse("success");
				return new ResponseEntity<CholestrolResponse>(wb, HttpStatus.OK);
				}else {
				return new ResponseEntity<CholestrolResponse>(wb, HttpStatus.INTERNAL_SERVER_ERROR);
				}
			}
				
				
	//**********************bmi*****************************************
				
				@RequestMapping(value="/bmilist", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
				public List<BmiBean> getBmiList(){
					List<BmiBean> lst = patient.findBmi();
					System.out.println("size::"+lst.size());
					
					return lst;
				}
				
				
				@RequestMapping(value="/bmilist/{mobile_no}", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
				public List<BmiBean> findbmi(@PathVariable("mobile_no") String mobile){
					System.out.println("city::"+mobile);
					List<BmiBean> lst = patient.findbmibyid(mobile);
					System.out.println("size::"+lst.size());
					BmiResponse wr = new BmiResponse();
					wr.setResult(lst);
					return lst;
				}

				@RequestMapping(value="/addbmi", method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
				public ResponseEntity<BmiResponse> addBmi(@RequestBody BmiBean obj){
					System.out.println("Mobile::"+obj.getMobile_no());
					int resp = patient.insertBmi(obj);
					System.out.println("status::"+resp);
					BmiResponse wb = new BmiResponse();
					if(resp == 1) {
					wb.setResponse("success");
					return new ResponseEntity<BmiResponse>(wb, HttpStatus.OK);
					}else {
					return new ResponseEntity<BmiResponse>(wb, HttpStatus.INTERNAL_SERVER_ERROR);
					}
				}
				
				@RequestMapping(value="/updatebmi", method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
				public ResponseEntity<BmiResponse> updateBmi(@RequestBody BmiBean obj){
				//System.out.println("city::"+obj.getFirst_name()+","+obj.getMobile_no());
				int resp = patient.updateBmi(obj);
				System.out.println("status::"+resp);
				BmiResponse wb = new BmiResponse();
				if(resp == 1) {
				wb.setResponse("success");
				return new ResponseEntity<BmiResponse>(wb, HttpStatus.OK);
				}else {
				return new ResponseEntity<BmiResponse>(wb, HttpStatus.INTERNAL_SERVER_ERROR);
				}
			}
				
			
			/**************************
			 * 
			 * Medical Documents module
			 * 
			 **************************/
			
			//dental sub module
			
			@RequestMapping(value="/docdental", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
			public List<Document_dentalBean> dentalprescriptions(){
				List<Document_dentalBean> lst = patient.dentalprescriptions();
				System.out.println("size::"+lst.size());
				
//				PrescriptionResponse wr = new PrescriptionResponse();
//				wr.setResult(lst);
				return lst;
			}
			
			@RequestMapping(value = "/docdental/{mobile_no}", method = RequestMethod.GET)
			
			public List<Document_dentalBean> dentalbyid (@PathVariable("mobile_no") String mobile_no) {
				System.out.println("city::"+mobile_no);
				List<Document_dentalBean> lst = patient.dentalprescriptionbyid(mobile_no);
				System.out.println("size::"+lst.size());
//				DrugResponse wr = new DrugResponse();
//				wr.setResult(lst);
				return lst;
			}
			
			@RequestMapping(value="/docdental/queryparam", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
			public List<Document_dentalBean> dentalprescriptionbyid(@RequestParam("mobile_no") String mobile_no){
				System.out.println("Mobile::"+mobile_no);
				List<Document_dentalBean> lst = patient.dentalprescriptionbyid(mobile_no);
				System.out.println("size::"+lst.size());
				return lst;
			}
			
			@RequestMapping(value="/docdentalupload", method=RequestMethod.POST)
			public int dentalPrescription(
					@RequestParam("mobile_no") String number,
			@RequestParam("document_dental_file") MultipartFile file,@RequestParam("document_dental_saved_on") String upload_saved_on,@RequestParam("document_dental_type") String document_dental_type){

				Document_dentalBean wb = new Document_dentalBean();
			wb.setMobile_no(number);
			wb.setDocument_dental_file(file);
			wb.setDocument_dental_saved_on(upload_saved_on);
//			wb.setDocument_dental_title(document_dental_title);
			wb.setDocument_dental_type(document_dental_type);
			//System.out.println("file name::"+file);
			int resp = 0 ;

			resp = patient.dentalPrescription(wb);
			System.out.println("status::"+resp);

			return resp;
			}
			
			
			@RequestMapping(value="/docdentaldelete", method=RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_VALUE)
			public int deletedental(@RequestBody Document_dentalBean obj){
				
//				System.out.println("courtry::"+obj.getMobile_no());
				int resp = patient.removedentalPrescription(obj);
				System.out.println("status::"+resp);
				
				return resp;
			}
			
			
			//***************************Diet sub module********************************************************
			
			@RequestMapping(value="/dietdoc", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
			public List<Document_dietBean> dietprescription(){
				List<Document_dietBean> lst = patient.dietprescriptions();
				System.out.println("size::"+lst.size());
				
//				PrescriptionResponse wr = new PrescriptionResponse();
//				wr.setResult(lst);
				return lst;
			}
			
		
			
			@RequestMapping(value = "/dietdoc/{mobile_no}", method = RequestMethod.GET)
			
			public List<Document_dietBean> dietprescriptionbyid(@PathVariable("mobile_no") String mobile_no){
				System.out.println("city::"+mobile_no);
				List<Document_dietBean> lst = patient.dietprescriptionbyid(mobile_no);
				System.out.println("size::"+lst.size());
//				DrugResponse wr = new DrugResponse();
//				wr.setResult(lst);
				return lst;
			}
			
			@RequestMapping(value="/dietdoc/queryparam", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
			public List<Document_dietBean> finddietbyididQueryParam(@RequestParam("mobile_no") String mobile_no){
				System.out.println("Mobile::"+mobile_no);
				List<Document_dietBean> lst = patient.dietprescriptionbyid(mobile_no);
				System.out.println("size::"+lst.size());
				return lst;
			}
			
			@RequestMapping(value="/dietdocupload", method=RequestMethod.POST)
			public int uploadDiet(
					@RequestParam("mobile_no") String number,
			@RequestParam("document_diet_file") MultipartFile file,@RequestParam("document_diet_saved_on") String upload_saved_on,@RequestParam("document_diet_type") String document_diet_type){

				Document_dietBean wb = new Document_dietBean();
			wb.setMobile_no(number);
			wb.setDocument_diet_file(file);
			wb.setDocument_diet_saved_on(upload_saved_on);
			wb.setDocument_diet_type(document_diet_type);
			//System.out.println("file name::"+file);
			int resp = 0 ;

			resp = patient.dietPrescription(wb);
			System.out.println("status::"+resp);

			return resp;
			}
			
			
			@RequestMapping(value="/deletedietdoc", method=RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_VALUE)
			public int removediet(@RequestBody Document_dietBean obj){
				
//				System.out.println("courtry::"+obj.getMobile_no());
				int resp = patient.removedietPrescription(obj);
				System.out.println("status::"+resp);
				
				return resp;
			}
			
			
			//**********Discharge-Summary sub-module******************
			
			@RequestMapping(value="/docdischargelist", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
			public List<Document_dischargeBean> alldischargeprescriptions(){
				List<Document_dischargeBean> lst = patient.dischargeprescriptions();
				System.out.println("size::"+lst.size());
				
//				PrescriptionResponse wr = new PrescriptionResponse();
//				wr.setResult(lst);
				return lst;
			}
			
			@RequestMapping(value = "/docdischargelist/{mobile_no}", method = RequestMethod.GET)
			
			public List<Document_dischargeBean> uploaddischargebyid(@PathVariable("mobile_no") String mobile_no){
				System.out.println("city::"+mobile_no);
				List<Document_dischargeBean> lst = patient.dischargeprescriptionbyid(mobile_no);
				System.out.println("size::"+lst.size());
//				DrugResponse wr = new DrugResponse();
//				wr.setResult(lst);
				return lst;
			}
			
			@RequestMapping(value="/docdischargelist/queryparam", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
			public List<Document_dischargeBean> finddischargeidQueryParam(@RequestParam("mobile_no") String mobile_no){
				System.out.println("Mobile::"+mobile_no);
				List<Document_dischargeBean> lst = patient.dischargeprescriptionbyid(mobile_no);
				System.out.println("size::"+lst.size());
				return lst;
			}
			
			@RequestMapping(value="/docdischargeupload", method=RequestMethod.POST)
			public int uploadDischarge(
					@RequestParam("mobile_no") String number,
			@RequestParam("document_discharge_file") MultipartFile file,@RequestParam("document_discharge_saved_on") String upload_saved_on,@RequestParam("document_discharge_type") String document_discharge_type){

				Document_dischargeBean wb = new Document_dischargeBean();
			wb.setMobile_no(number);
			wb.setDocument_discharge_file(file);
			wb.setDocument_discharge_saved_on(upload_saved_on);
//			wb.setDocument_discharge_title(document_discharge_title);
			wb.setDocument_discharge_type(document_discharge_type);
			//System.out.println("file name::"+file);
			int resp = 0 ;

			resp = patient.dischargePrescription(wb);
			System.out.println("status::"+resp);

			return resp;
			}
			
			
			@RequestMapping(value="/docdeletedischarge", method=RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_VALUE)
			public int deleteDrug(@RequestBody Document_dischargeBean obj){
				
//				System.out.println("courtry::"+obj.getMobile_no());
				int resp = patient.removedischargePrescription(obj);
				System.out.println("status::"+resp);
				
				return resp;
			}
			
			//**********Education sub-module******************

			@RequestMapping(value="/doceducationlist", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
			public List<Document_educationBean> alleducationprescriptions(){
				List<Document_educationBean> lst = patient.educationprescriptions();
				System.out.println("size::"+lst.size());
				
//				PrescriptionResponse wr = new PrescriptionResponse();
//				wr.setResult(lst);
				return lst;
			}
			
			@RequestMapping(value = "/doceducationlist/{mobile_no}", method = RequestMethod.GET)
			
			public List<Document_educationBean> uploadeducationbyid(@PathVariable("mobile_no") String mobile_no){
				System.out.println("city::"+mobile_no);
				List<Document_educationBean> lst = patient.educationprescriptionbyid(mobile_no);
				System.out.println("size::"+lst.size());
//				DrugResponse wr = new DrugResponse();
//				wr.setResult(lst);
				return lst;
			}
			
			@RequestMapping(value="/doceducationlist/queryparam", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
			public List<Document_educationBean> findeducationidQueryParam(@RequestParam("mobile_no") String mobile_no){
				System.out.println("Mobile::"+mobile_no);
				List<Document_educationBean> lst = patient.educationprescriptionbyid(mobile_no);
				System.out.println("size::"+lst.size());
				return lst;
			}
			
			@RequestMapping(value="/doceducationupload", method=RequestMethod.POST)
			public int uploadEducation(
					@RequestParam("mobile_no") String number,
			@RequestParam("document_education_file") MultipartFile file,@RequestParam("document_education_saved_on") String upload_saved_on,@RequestParam("document_education_type") String document_education_type){

				Document_educationBean wb = new Document_educationBean();
			wb.setMobile_no(number);
			wb.setDocument_education_file(file);
			wb.setDocument_education_saved_on(upload_saved_on);
//			wb.setDocument_education_title(document_education_title);
			wb.setDocument_education_type(document_education_type);
			//System.out.println("file name::"+file);
			int resp = 0 ;

			resp = patient.educationPrescription(wb);
			System.out.println("status::"+resp);

			return resp;
			}
			
			
			@RequestMapping(value="/docdeleteEducation", method=RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_VALUE)
			public int deleteEducation(@RequestBody Document_educationBean obj){
				
//				System.out.println("courtry::"+obj.getMobile_no());
				int resp = patient.removeeducationPrescription(obj);
				System.out.println("status::"+resp);
				
				return resp;
			}
			
			//**********Immunization sub-module******************

			@RequestMapping(value="/docimmunlist", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
			public List<Document_immunBean> allimmunprescriptions(){
				List<Document_immunBean> lst = patient.immunprescriptions();
				System.out.println("size::"+lst.size());
				
//				PrescriptionResponse wr = new PrescriptionResponse();
//				wr.setResult(lst);
				return lst;
			}
			
			@RequestMapping(value = "/docimmunlist/{mobile_no}", method = RequestMethod.GET)
			
			public List<Document_immunBean> uploadimmunbyid(@PathVariable("mobile_no") String mobile_no){
				System.out.println("city::"+mobile_no);
				List<Document_immunBean> lst = patient.uploadimmunbyid(mobile_no);
				System.out.println("size::"+lst.size());
//				DrugResponse wr = new DrugResponse();
//				wr.setResult(lst);
				return lst;
			}
			
			@RequestMapping(value="/docimmunlist/queryparam", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
			public List<Document_immunBean> findimmunidQueryParam(@RequestParam("mobile_no") String mobile_no){
				System.out.println("Mobile::"+mobile_no);
				List<Document_immunBean> lst = patient.uploadimmunbyid(mobile_no);
				System.out.println("size::"+lst.size());
				return lst;
			}
			
			@RequestMapping(value="/docimmunupload", method=RequestMethod.POST)
			public int uploadimmun(
					@RequestParam("mobile_no") String number,
			@RequestParam("document_immunization_file") MultipartFile file,@RequestParam("document_immunization_saved_on") String upload_saved_on,@RequestParam("document_immunization_type") String document_immunization_type){

				Document_immunBean wb = new Document_immunBean();
			wb.setMobile_no(number);
			wb.setDocument_immunization_file(file);
			wb.setDocument_immunization_saved_on(upload_saved_on);
//			wb.setDocument_immunization_title(document_immunization_title);
			wb.setDocument_immunization_type(document_immunization_type);
			//System.out.println("file name::"+file);
			int resp = 0 ;

			resp = patient.immunPrescription(wb);
			System.out.println("status::"+resp);

			return resp;
			}
			
			
			@RequestMapping(value="/docdeleteimmun", method=RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_VALUE)
			public int deleteImmun(@RequestBody Document_immunBean obj){
				
//				System.out.println("courtry::"+obj.getMobile_no());
				int resp = patient.removeimmunPrescription(obj);
				System.out.println("status::"+resp);
				return resp;
			}
			
			
			//**********patient-Insurance sub-module******************

			@RequestMapping(value="/docinsurancelist", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
			public List<Document_insuranceBean> allinsuranceprescriptions(){
				List<Document_insuranceBean> lst = patient.insuranceprescriptions();
				System.out.println("size::"+lst.size());
				
//				PrescriptionResponse wr = new PrescriptionResponse();
//				wr.setResult(lst);
				return lst;
			}
			
			@RequestMapping(value = "/docinsurancelist/{mobile_no}", method = RequestMethod.GET)
			
			public List<Document_insuranceBean> uploadinsurancebyid(@PathVariable("mobile_no") String mobile_no){
				System.out.println("city::"+mobile_no);
				List<Document_insuranceBean> lst = patient.uploadinsurancebyid(mobile_no);
				System.out.println("size::"+lst.size());
//				DrugResponse wr = new DrugResponse();
//				wr.setResult(lst);
				return lst;
			}
			
			@RequestMapping(value="/docinsurancelist/queryparam", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
			public List<Document_insuranceBean> findinsuranceidQueryParam(@RequestParam("mobile_no") String mobile_no){
				System.out.println("Mobile::"+mobile_no);
				List<Document_insuranceBean> lst = patient.uploadinsurancebyid(mobile_no);
				System.out.println("size::"+lst.size());
				return lst;
			}
			
			@RequestMapping(value="/docinsuranceupload", method=RequestMethod.POST)
			public int uploadInsurance(
					@RequestParam("mobile_no") String number,
			@RequestParam("document_insurance_file") MultipartFile file,@RequestParam("document_insurance_saved_on") String upload_saved_on,@RequestParam("document_insurance_type") String document_insurance_type){

				Document_insuranceBean wb = new Document_insuranceBean();
			wb.setMobile_no(number);
			wb.setDocument_insurance_file(file);
			wb.setDocument_insurance_saved_on(upload_saved_on);
//			wb.setDocument_insurance_title(document_insurance_title);
			wb.setDocument_insurance_type(document_insurance_type);
			//System.out.println("file name::"+file);
			int resp = 0 ;

			resp = patient.insurancePrescription(wb);
			System.out.println("status::"+resp);

			return resp;
			}
			
			
			@RequestMapping(value="/docdeleteinsurance", method=RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_VALUE)
			public int deleteInsurance(@RequestBody Document_insuranceBean obj){
				
//				System.out.println("courtry::"+obj.getMobile_no());
				int resp = patient.removeinsurancePrescription(obj);
				System.out.println("status::"+resp);
				
				return resp;
			}
			
			//**********Documents-others sub-module******************

			@RequestMapping(value="/otherdoclist", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
			public List<Document_otherBean> allotherprescriptions(){
				List<Document_otherBean> lst = patient.otherprescriptions();
				System.out.println("size::"+lst.size());
				
//				PrescriptionResponse wr = new PrescriptionResponse();
//				wr.setResult(lst);
				return lst;
			}
			
			@RequestMapping(value = "/otherdoclist/{mobile_no}", method = RequestMethod.GET)
			
			public List<Document_otherBean> uploadotherbyid(@PathVariable("mobile_no") String mobile_no){
				System.out.println("city::"+mobile_no);
				List<Document_otherBean> lst = patient.uploadotherbyid(mobile_no);
				System.out.println("size::"+lst.size());
//				DrugResponse wr = new DrugResponse();
//				wr.setResult(lst);
				return lst;
			}
			
			@RequestMapping(value="/otherdoclist/queryparam", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
			public List<Document_otherBean> findotheridQueryParam(@RequestParam("mobile_no") String mobile_no){
				System.out.println("Mobile::"+mobile_no);
				List<Document_otherBean> lst = patient.uploadotherbyid(mobile_no);
				System.out.println("size::"+lst.size());
				return lst;
			}
			
			@RequestMapping(value="/docotherupload", method=RequestMethod.POST)
			public int uploadother(
					@RequestParam("mobile_no") String number,
			@RequestParam("document_other_file") MultipartFile file,@RequestParam("document_other_saved_on") String upload_saved_on,@RequestParam("document_other_type") String document_other_type){

				Document_otherBean wb = new Document_otherBean();
			wb.setMobile_no(number);
			wb.setDocument_other_file(file);
			wb.setDocument_other_saved_on(upload_saved_on);
//			wb.setDocument_other_title(document_other_title);
			wb.setDocument_other_type(document_other_type);
			//System.out.println("file name::"+file);
			int resp = 0 ;

			resp = patient.otherPrescription(wb);
			System.out.println("status::"+resp);

			return resp;
			}
			
			
			@RequestMapping(value="/deleteotherdoc", method=RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_VALUE)
			public int deleteDrug(@RequestBody Document_otherBean obj){
				
//				System.out.println("courtry::"+obj.getMobile_no());
				int resp = patient.removeotherPrescription(obj);
				System.out.println("status::"+resp);
				
				return resp;
			}
			
			
			/*******************************
			 * 
			 * Lab module
			 * 
			 * ******************************/
			
			
			//**********************Blood reports sub module*********************************

			@RequestMapping(value="/labblood", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
			public List<Lab_bloodBean> allbloodprescriptions(){
				List<Lab_bloodBean> lst = patient.allbloodreports();
				System.out.println("size::"+lst.size());
				
//				PrescriptionResponse wr = new PrescriptionResponse();
//				wr.setResult(lst);
				return lst;
			}
			
			@RequestMapping(value = "/labblood/{mobile_no}", method = RequestMethod.GET)
			
			public List<Lab_bloodBean> uploadbloodreportbyid(@PathVariable("mobile_no") String mobile_no){
				System.out.println("city::"+mobile_no);
				List<Lab_bloodBean> lst = patient.bloodreportsbyid(mobile_no);
				System.out.println("size::"+lst.size());
//				DrugResponse wr = new DrugResponse();
//				wr.setResult(lst);
				return lst;
			}
			
			@RequestMapping(value="/labblood/queryparam", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
			public List<Lab_bloodBean> findbloodidQueryParam(@RequestParam("mobile_no") String mobile_no){
				System.out.println("Mobile::"+mobile_no);
				List<Lab_bloodBean> lst = patient.bloodreportsbyid(mobile_no);
				System.out.println("size::"+lst.size());
				return lst;
			}
			
			@RequestMapping(value="/bloodupload", method=RequestMethod.POST)
			public int uploadBlood(
					@RequestParam("mobile_no") String number,
			@RequestParam("lab_blood_file") MultipartFile file,@RequestParam("lab_blood_saved") String upload_saved_on,@RequestParam("lab_blood_type") String lab_blood_type ){

				Lab_bloodBean wb = new Lab_bloodBean();
			wb.setMobile_no(number);
			wb.setLab_blood_file(file);
			wb.setLab_blood_saved(upload_saved_on);
//			wb.setLab_blood_title(lab_blood_title);
			wb.setLab_blood_type(lab_blood_type);
			//System.out.println("file name::"+file);
			int resp = 0 ;

			resp = patient.uploadbloodreport(wb);
			System.out.println("status::"+resp);

			return resp;
			}
			
			
			@RequestMapping(value="/deleteblood", method=RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_VALUE)
			public int deleteBlood(@RequestBody Lab_bloodBean obj){
				
//				System.out.println("courtry::"+obj.getMobile_no());
				int resp = patient.removebloodreport(obj);
				System.out.println("status::"+resp);
				
				return resp;
			}
			
			
			//**********************Colonoscopy sub module*********************************


			@RequestMapping(value="/labcolonoscopy", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
			public List<Lab_colonoscopyBean> allcolonoscopyreports(){
				List<Lab_colonoscopyBean> lst = patient.allcolonoscopyreports();
				System.out.println("size::"+lst.size());
				
//				PrescriptionResponse wr = new PrescriptionResponse();
//				wr.setResult(lst);
				return lst;
			}
			
			@RequestMapping(value = "/labcolonoscopy/{mobile_no}", method = RequestMethod.GET)
			
			public List<Lab_colonoscopyBean> uploadcolonoscopyreportbyid(@PathVariable("mobile_no") String mobile_no){
				System.out.println("city::"+mobile_no);
				List<Lab_colonoscopyBean> lst = patient.colonoscopyreportsbyid(mobile_no);
				System.out.println("size::"+lst.size());
//				DrugResponse wr = new DrugResponse();
//				wr.setResult(lst);
				return lst;
			}
			
			@RequestMapping(value="/labcolonoscopy/queryparam", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
			public List<Lab_colonoscopyBean> findcolonoscopyidQueryParam(@RequestParam("mobile_no") String mobile_no){
				System.out.println("Mobile::"+mobile_no);
				List<Lab_colonoscopyBean> lst = patient.colonoscopyreportsbyid(mobile_no);
				System.out.println("size::"+lst.size());
				return lst;
			}
			
			@RequestMapping(value="/colonoscopyupload", method=RequestMethod.POST)
			public int uploadColonoscopy(
					@RequestParam("mobile_no") String number,
			@RequestParam("lab_colonoscopy_file") MultipartFile file,@RequestParam("lab_colonoscopy_saved") String upload_saved_on,@RequestParam("lab_colonoscopy_type") String lab_colonoscopy_type){

				Lab_colonoscopyBean wb = new Lab_colonoscopyBean();
			wb.setMobile_no(number);
			wb.setLab_colonoscopy_file(file);
			wb.setLab_colonoscopy_saved(upload_saved_on);
//			wb.setLab_colonoscopy_title(lab_colonoscopy_title);
			wb.setLab_colonoscopy_type(lab_colonoscopy_type);
			//System.out.println("file name::"+file);
			int resp = 0 ;

			resp = patient.uploadcolonoscopyreport(wb);
			System.out.println("status::"+resp);

			return resp;
			}
			
			
			@RequestMapping(value="/deletecolonoscopy", method=RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_VALUE)
			public int deleteBlood(@RequestBody Lab_colonoscopyBean obj){
				
//				System.out.println("courtry::"+obj.getMobile_no());
				int resp = patient.removecolonoscopyreport(obj);
				System.out.println("status::"+resp);
				
				return resp;
			}

			//**********************CTScan sub module*********************************

			@RequestMapping(value="/labctscan", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
			public List<Lab_ctscanBean> allctscanprescriptions(){
				List<Lab_ctscanBean> lst = patient.ctscanreports();
				System.out.println("size::"+lst.size());
				
//				PrescriptionResponse wr = new PrescriptionResponse();
//				wr.setResult(lst);
				return lst;
			}
			
			@RequestMapping(value = "/labctscan/{mobile_no}", method = RequestMethod.GET)
			
			public List<Lab_ctscanBean> uploadctscanreportbyid(@PathVariable("mobile_no") String mobile_no){
				System.out.println("city::"+mobile_no);
				List<Lab_ctscanBean> lst = patient.ctscanreportbyid(mobile_no);
				System.out.println("size::"+lst.size());
//				DrugResponse wr = new DrugResponse();
//				wr.setResult(lst);
				return lst;
			}
			
			@RequestMapping(value="/labctscan/queryparam", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
			public List<Lab_ctscanBean> findctscanidQueryParam(@RequestParam("mobile_no") String mobile_no){
				System.out.println("Mobile::"+mobile_no);
				List<Lab_ctscanBean> lst = patient.ctscanreportbyid(mobile_no);
				System.out.println("size::"+lst.size());
				return lst;
			}
			
			@RequestMapping(value="/ctscanupload", method=RequestMethod.POST)
			public int uploadctscan(
					@RequestParam("mobile_no") String number,
			@RequestParam("lab_ctscan_file") MultipartFile file,@RequestParam("lab_ctscan_saved") String upload_saved_on,@RequestParam("lab_ctscan_type") String lab_ctscan_type){

				Lab_ctscanBean wb = new Lab_ctscanBean();
			wb.setMobile_no(number);
			wb.setLab_ctscan_file(file);
			wb.setLab_ctscan_saved(upload_saved_on);
//			wb.setLab_ctscan_title(lab_ctscan_title);
			wb.setLab_ctscan_type(lab_ctscan_type);
			//System.out.println("file name::"+file);
			int resp = 0 ;

			resp = patient.uploadctscanreport(wb);
			System.out.println("status::"+resp);

			return resp;
			}
			
			
			@RequestMapping(value="/deletectscan", method=RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_VALUE)
			public int deleteBlood(@RequestBody Lab_ctscanBean obj){
				
//				System.out.println("courtry::"+obj.getMobile_no());
				int resp = patient.removedctscanreport(obj);
				System.out.println("status::"+resp);
				
				return resp;
			}
			
			//**********************ECG sub module*********************************


			@RequestMapping(value="/labecg", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
			public List<Lab_ecgBean> allecgprescriptions(){
				List<Lab_ecgBean> lst = patient.ecgreports();
				System.out.println("size::"+lst.size());
				
//				PrescriptionResponse wr = new PrescriptionResponse();
//				wr.setResult(lst);
				return lst;
			}
			
			@RequestMapping(value = "/labecg/{mobile_no}", method = RequestMethod.GET)
			
			public List<Lab_ecgBean> uploadecgreportbyid(@PathVariable("mobile_no") String mobile_no){
				System.out.println("city::"+mobile_no);
				List<Lab_ecgBean> lst = patient.ecgreportbyid(mobile_no);
				System.out.println("size::"+lst.size());
//				DrugResponse wr = new DrugResponse();
//				wr.setResult(lst);
				return lst;
			}
			
			@RequestMapping(value="/labecg/queryparam", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
			public List<Lab_ecgBean> findecgidQueryParam(@RequestParam("mobile_no") String mobile_no){
				System.out.println("Mobile::"+mobile_no);
				List<Lab_ecgBean> lst = patient.ecgreportbyid(mobile_no);
				System.out.println("size::"+lst.size());
				return lst;
			}
			
			@RequestMapping(value="/ecgupload", method=RequestMethod.POST)
			public int uploadecg(
					@RequestParam("mobile_no") String number,
			@RequestParam("lab_ecg_file") MultipartFile file,@RequestParam("lab_ecg_saved") String upload_saved_on,@RequestParam("lab_ecg_type") String lab_ecg_type){

				Lab_ecgBean wb = new Lab_ecgBean();
			wb.setMobile_no(number);
			wb.setLab_ecg_file(file);
			wb.setLab_ecg_saved(upload_saved_on);
//			wb.setLab_ecg_title(lab_ecg_title);
			wb.setLab_ecg_type(lab_ecg_type);
			//System.out.println("file name::"+file);
			int resp = 0 ;

			resp = patient.uploadecg(wb);
			System.out.println("status::"+resp);

			return resp;
			}
			
			
			@RequestMapping(value="/deleteecg", method=RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_VALUE)
			public int deleteecg(@RequestBody Lab_ecgBean obj){
				
//				System.out.println("courtry::"+obj.getMobile_no());
				int resp = patient.removeecg(obj);
				System.out.println("status::"+resp);
				
				return resp;
			}
			
			//**********************ECHO sub module*********************************

			@RequestMapping(value="/labecho", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
			public List<Lab_echoBean> allechoprescriptions(){
				List<Lab_echoBean> lst = patient.echoreports();
				System.out.println("size::"+lst.size());
				
//				PrescriptionResponse wr = new PrescriptionResponse();
//				wr.setResult(lst);
				return lst;
			}
			
			@RequestMapping(value = "/labecho/{mobile_no}", method = RequestMethod.GET)
			
			public List<Lab_echoBean> uploadechoreportbyid(@PathVariable("mobile_no") String mobile_no){
				System.out.println("city::"+mobile_no);
				List<Lab_echoBean> lst = patient.echoreportbyid(mobile_no);
				System.out.println("size::"+lst.size());
//				DrugResponse wr = new DrugResponse();
//				wr.setResult(lst);
				return lst;
			}
			
			@RequestMapping(value="/labecho/queryparam", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
			public List<Lab_echoBean> findechoidQueryParam(@RequestParam("mobile_no") String mobile_no){
				System.out.println("Mobile::"+mobile_no);
				List<Lab_echoBean> lst = patient.echoreportbyid(mobile_no);
				System.out.println("size::"+lst.size());
				return lst;
			}
			
			@RequestMapping(value="/echoupload", method=RequestMethod.POST)
			public int uploadecho(
					@RequestParam("mobile_no") String number,
			@RequestParam("lab_echo_file") MultipartFile file,@RequestParam("lab_echo_saved") String upload_saved_on,@RequestParam("lab_echo_type") String lab_echo_type){

				Lab_echoBean wb = new Lab_echoBean();
			wb.setMobile_no(number);
			wb.setLab_echo_file(file);
			wb.setLab_echo_saved(upload_saved_on);
//			wb.setLab_echo_title(lab_echo_title);
			wb.setLab_echo_type(lab_echo_type);
			//System.out.println("file name::"+file);
			int resp = 0 ;

			resp = patient.uploadecho(wb);
			System.out.println("status::"+resp);

			return resp;
			}
			
			
			@RequestMapping(value="/deleteecho", method=RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_VALUE)
			public int deleteecho(@RequestBody Lab_echoBean obj){
				
//				System.out.println("courtry::"+obj.getMobile_no());
				int resp = patient.removeecho(obj);
				System.out.println("status::"+resp);
				
				return resp;
			}

			
			//**********************MRI sub module*********************************

			@RequestMapping(value="/labmri", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
			public List<Lab_mriBean> allmriprescriptions(){
				List<Lab_mriBean> lst = patient.mrireports();
				System.out.println("size::"+lst.size());
				
//				PrescriptionResponse wr = new PrescriptionResponse();
//				wr.setResult(lst);
				return lst;
			}
			
			@RequestMapping(value = "/labmri/{mobile_no}", method = RequestMethod.GET)
			
			public List<Lab_mriBean> uploadmrireportbyid(@PathVariable("mobile_no") String mobile_no){
				System.out.println("city::"+mobile_no);
				List<Lab_mriBean> lst = patient.mrireportsbyid(mobile_no);
				System.out.println("size::"+lst.size());
//				DrugResponse wr = new DrugResponse();
//				wr.setResult(lst);
				return lst;
			}
			
			@RequestMapping(value="/labmri/queryparam", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
			public List<Lab_mriBean> findmriidQueryParam(@RequestParam("mobile_no") String mobile_no){
				System.out.println("Mobile::"+mobile_no);
				List<Lab_mriBean> lst = patient.mrireportsbyid(mobile_no);
				System.out.println("size::"+lst.size());
				return lst;
			}
			
			@RequestMapping(value="mriupload", method=RequestMethod.POST)
			public int uploadmri(
					@RequestParam("mobile_no") String number,
			@RequestParam("lab_mri_file") MultipartFile file,@RequestParam("lab_mri_saved") String upload_saved_on,@RequestParam("lab_mri_type") String lab_mri_type){

				Lab_mriBean wb = new Lab_mriBean();
			wb.setMobile_no(number);
			wb.setLab_mri_file(file);
			wb.setLab_mri_saved(upload_saved_on);
//			wb.setLab_mri_title(lab_mri_title);
			wb.setLab_mri_type(lab_mri_type);
			//System.out.println("file name::"+file);
			int resp = 0 ;

			resp = patient.uploadmrireport(wb);
			System.out.println("status::"+resp);

			return resp;
			}
			
			
			@RequestMapping(value="/deletemri", method=RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_VALUE)
			public int deletemri(@RequestBody Lab_mriBean obj){
				
//				System.out.println("courtry::"+obj.getMobile_no());
				int resp = patient.removemrireport(obj);
				System.out.println("status::"+resp);
				
				return resp;
			}
			
			
			//**********************OTHER sub module*********************************


			@RequestMapping(value="/labother", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
			public List<Lab_otherBean> otherprescriptions(){
				List<Lab_otherBean> lst = patient.otherreports();
				System.out.println("size::"+lst.size());
				
//				PrescriptionResponse wr = new PrescriptionResponse();
//				wr.setResult(lst);
				return lst;
			}
			
			@RequestMapping(value = "/labother/{mobile_no}", method = RequestMethod.GET)
			
			public List<Lab_otherBean> uploadotherreportbyid(@PathVariable("mobile_no") String mobile_no){
				System.out.println("city::"+mobile_no);
				List<Lab_otherBean> lst = patient.otherreportsbyid(mobile_no);
				System.out.println("size::"+lst.size());
//				DrugResponse wr = new DrugResponse();
//				wr.setResult(lst);
				return lst;
			}
			
			@RequestMapping(value="/labother/queryparam", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
			public List<Lab_otherBean> findotherQueryParam(@RequestParam("mobile_no") String mobile_no){
				System.out.println("Mobile::"+mobile_no);
				List<Lab_otherBean> lst = patient.otherreportsbyid(mobile_no);
				System.out.println("size::"+lst.size());
				return lst;
			}
			
			@RequestMapping(value="/labotherupload", method=RequestMethod.POST)
			public int uploadotherlab(
					@RequestParam("mobile_no") String number,
			@RequestParam("lab_others_file") MultipartFile file,@RequestParam("lab_others_saved") String upload_saved_on,@RequestParam("lab_others_type") String lab_others_type){

				Lab_otherBean wb = new Lab_otherBean();
			wb.setMobile_no(number);
			wb.setLab_others_file(file);
			wb.setLab_others_saved(upload_saved_on);
//			wb.setLab_others_title(lab_others_title);
			wb.setLab_others_type(lab_others_type);
			//System.out.println("file name::"+file);
			int resp = 0 ;

			resp = patient.uploadother(wb);
			System.out.println("status::"+resp);

			return resp;
			}
			
			
			@RequestMapping(value="/deleteother", method=RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_VALUE)
			public int deleteother(@RequestBody Lab_otherBean obj){
				
//				System.out.println("courtry::"+obj.getMobile_no());
				int resp = patient.removeother(obj);
				System.out.println("status::"+resp);
				
				return resp;
			}
			
			
			//**********************STRESS sub module*********************************


			@RequestMapping(value="/labstress", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
			public List<Lab_stressBean> allstresstestprescriptions(){
				List<Lab_stressBean> lst = patient.stressreports();
				System.out.println("size::"+lst.size());
				
//				PrescriptionResponse wr = new PrescriptionResponse();
//				wr.setResult(lst);
				return lst;
			}
			
			@RequestMapping(value = "/labstress/{mobile_no}", method = RequestMethod.GET)
			
			public List<Lab_stressBean> uploadstressreportbyid(@PathVariable("mobile_no") String mobile_no){
				System.out.println("city::"+mobile_no);
				List<Lab_stressBean> lst = patient.stressreportsbyid(mobile_no);
				System.out.println("size::"+lst.size());
//				DrugResponse wr = new DrugResponse();
//				wr.setResult(lst);
				return lst;
			}
			
			@RequestMapping(value="/labstress/queryparam", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
			public List<Lab_stressBean> findstressidQueryParam(@RequestParam("mobile_no") String mobile_no){
				System.out.println("Mobile::"+mobile_no);
				List<Lab_stressBean> lst = patient.stressreportsbyid(mobile_no);
				System.out.println("size::"+lst.size());
				return lst;
			}
			
			@RequestMapping(value="/stressupload", method=RequestMethod.POST)
			public int uploadstress(
					@RequestParam("mobile_no") String number,
			@RequestParam("lab_stresstest_file") MultipartFile file,@RequestParam("lab_stresstest_saved") String upload_saved_on,@RequestParam("lab_stresstest_type") String lab_stresstest_type){

				Lab_stressBean wb = new Lab_stressBean();
			wb.setMobile_no(number);
			wb.setLab_stresstest_file(file);
			wb.setLab_stresstest_saved(upload_saved_on);
//			wb.setLab_stresstest_title(lab_stresstest_title);
			wb.setLab_stresstest_type(lab_stresstest_type);
			//System.out.println("file name::"+file);
			int resp = 0 ;

			resp = patient.uploadstress(wb);
			System.out.println("status::"+resp);

			return resp;
			}
			
			
			@RequestMapping(value="/deletestress", method=RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_VALUE)
			public int deletestress(@RequestBody Lab_stressBean obj){
				
//				System.out.println("courtry::"+obj.getMobile_no());
				int resp = patient.removestresstest(obj);
				System.out.println("status::"+resp);
				
				return resp;
			}
			
			
			//**********************ULTRA SOUND sub module*********************************

			@RequestMapping(value="/labultrasound", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
			public List<Lab_ultrasoundBean> allultrasoundprescriptions(){
				List<Lab_ultrasoundBean> lst = patient.ultrasoundreports();
				System.out.println("size::"+lst.size());
				
//				PrescriptionResponse wr = new PrescriptionResponse();
//				wr.setResult(lst);
				return lst;
			}
			
			@RequestMapping(value = "/labultrasound/{mobile_no}", method = RequestMethod.GET)
			
			public List<Lab_ultrasoundBean> uploadultrasoundreportbyid(@PathVariable("mobile_no") String mobile_no){
				System.out.println("city::"+mobile_no);
				List<Lab_ultrasoundBean> lst = patient.ultrasoundreportsbyid(mobile_no);
				System.out.println("size::"+lst.size());
//				DrugResponse wr = new DrugResponse();
//				wr.setResult(lst);
				return lst;
			}
			
			@RequestMapping(value="/labultrasound/queryparam", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
			public List<Lab_ultrasoundBean> findultrasoundidQueryParam(@RequestParam("mobile_no") String mobile_no){
				System.out.println("Mobile::"+mobile_no);
				List<Lab_ultrasoundBean> lst = patient.ultrasoundreportsbyid(mobile_no);
				System.out.println("size::"+lst.size());
				return lst;
			}
			
			@RequestMapping(value="/ultrasoundupload", method=RequestMethod.POST)
			public int uploadultrasound(
					@RequestParam("mobile_no") String number,
			@RequestParam("lab_ultrasound_file") MultipartFile file,@RequestParam("lab_ultrasound_saved") String upload_saved_on,@RequestParam("lab_ultrasound_type") String lab_ultrasound_type){

				Lab_ultrasoundBean wb = new Lab_ultrasoundBean();
			wb.setMobile_no(number);
			wb.setLab_ultrasound_file(file);
			wb.setLab_ultrasound_saved(upload_saved_on);
//			wb.setLab_ultrasound_title(lab_ultrasound_title);
			wb.setLab_ultrasound_type(lab_ultrasound_type);
			//System.out.println("file name::"+file);
			int resp = 0 ;

			resp = patient.uploadultrasound(wb);
			System.out.println("status::"+resp);

			return resp;
			}
			
			
			@RequestMapping(value="/deleteultrasound", method=RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_VALUE)
			public int deleteultrasound(@RequestBody Lab_ultrasoundBean obj){
				
//				System.out.println("courtry::"+obj.getMobile_no());
				int resp = patient.removeultrasound(obj);
				System.out.println("status::"+resp);
				
				return resp;
			}
			

			//**********************URINE sub module*********************************

			@RequestMapping(value="/laburine", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
			public List<Lab_urineBean> allurineprescriptions(){
				List<Lab_urineBean> lst = patient.urinereports();
				System.out.println("size::"+lst.size());
				
//				PrescriptionResponse wr = new PrescriptionResponse();
//				wr.setResult(lst);
				return lst;
			}
			
			@RequestMapping(value = "/laburine/{mobile_no}", method = RequestMethod.GET)
			
			public List<Lab_urineBean> uploadurinereportbyid(@PathVariable("mobile_no") String mobile_no){
				System.out.println("city::"+mobile_no);
				List<Lab_urineBean> lst = patient.urinereportsbyid(mobile_no);
				System.out.println("size::"+lst.size());
//				DrugResponse wr = new DrugResponse();
//				wr.setResult(lst);
				return lst;
			}
			
			@RequestMapping(value="/laburine/queryparam", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
			public List<Lab_urineBean> findurineidQueryParam(@RequestParam("mobile_no") String mobile_no){
				System.out.println("Mobile::"+mobile_no);
				List<Lab_urineBean> lst = patient.urinereportsbyid(mobile_no);
				System.out.println("size::"+lst.size());
				return lst;
			}
			
			@RequestMapping(value="/urineupload", method=RequestMethod.POST)
			public int uploadurine(
					@RequestParam("mobile_no") String number,
			@RequestParam("lab_urine_report_file") MultipartFile file,@RequestParam("lab_urine_report_saved") String upload_saved_on,@RequestParam("lab_urine_report_type") String lab_urine_report_type){

				Lab_urineBean wb = new Lab_urineBean();
			wb.setMobile_no(number);
			wb.setLab_urine_report_file(file);
			wb.setLab_urine_report_saved(upload_saved_on);
//			wb.setLab_urine_report_title(lab_urine_report_title);
			wb.setLab_urine_report_type(lab_urine_report_type);
			//System.out.println("file name::"+file);
			int resp = 0 ;

			resp = patient.uploadurine(wb);
			System.out.println("status::"+resp);

			return resp;
			}
			
			
			@RequestMapping(value="/deleteurine", method=RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_VALUE)
			public int deleteBlood(@RequestBody Lab_urineBean obj){
				
//				System.out.println("courtry::"+obj.getMobile_no());
				int resp = patient.removeurine(obj);
				System.out.println("status::"+resp);
				
				return resp;
			}
			
			//**********************XRAY sub module*********************************

			@RequestMapping(value="/labxray", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
			public List<Lab_xrayBean> allxrayprescriptions(){
				List<Lab_xrayBean> lst = patient.xrayreports();
				System.out.println("size::"+lst.size());
				
//				PrescriptionResponse wr = new PrescriptionResponse();
//				wr.setResult(lst);
				return lst;
			}
			
			@RequestMapping(value = "/labxray/{mobile_no}", method = RequestMethod.GET)
			
			public List<Lab_xrayBean> uploadxrayreportbyid(@PathVariable("mobile_no") String mobile_no){
				System.out.println("city::"+mobile_no);
				List<Lab_xrayBean> lst = patient.xrayreportbyid(mobile_no);
				System.out.println("size::"+lst.size());
//				DrugResponse wr = new DrugResponse();
//				wr.setResult(lst);
				return lst;
			}
			
			@RequestMapping(value="/labxray/queryparam", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
			public List<Lab_xrayBean> findxrayidQueryParam(@RequestParam("mobile_no") String mobile_no){
				System.out.println("Mobile::"+mobile_no);
				List<Lab_xrayBean> lst = patient.xrayreportbyid(mobile_no);
				System.out.println("size::"+lst.size());
				return lst;
			}
			
			@RequestMapping(value="/xrayupload", method=RequestMethod.POST)
			public int uploadxray(
					@RequestParam("mobile_no") String number,
			@RequestParam("lab_xray_file") MultipartFile file,@RequestParam("lab_xray_saved") String upload_saved_on,@RequestParam("lab_xray_type") String lab_xray_type){

				Lab_xrayBean wb = new Lab_xrayBean();
			wb.setMobile_no(number);
			wb.setLab_xray_file(file);
			wb.setLab_xray_saved(upload_saved_on);
//			wb.setLab_xray_title(lab_xray_title);
			wb.setLab_xray_type(lab_xray_type);
			//System.out.println("file name::"+file);
			int resp = 0 ;

			resp = patient.uploadxray(wb);
			System.out.println("status::"+resp);

			return resp;
			}
			
			
			@RequestMapping(value="/deletexray", method=RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_VALUE)
			public int deletexray(@RequestBody Lab_xrayBean obj){
				
//				System.out.println("courtry::"+obj.getMobile_no());
				int resp = patient.removexray(obj);
				System.out.println("status::"+resp);
				
				return resp;
			}
			
			//**********************Emotional State*****************************************
			
			@RequestMapping(value="/emotionallist", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
			public List<EmotionalBean> getEmotionalList(){
				List<EmotionalBean> lst = patient.findEmotional_status();
				System.out.println("size::"+lst.size());
				
				return lst;
			}
			
			@RequestMapping(value="/emotionallist/{mobile_no}", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
			public List<EmotionalBean> findemotional_status(@PathVariable("mobile_no") String mobile){
				System.out.println("city::"+mobile);
				List<EmotionalBean> lst = patient.findemotional_statusbyid(mobile);
				System.out.println("size::"+lst.size());
				EmotionalResponse wr = new EmotionalResponse();
				wr.setResult(lst);
				return lst;
			}

			@RequestMapping(value="/addemotional", method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
			public ResponseEntity<EmotionalResponse> addEmotional(@RequestBody EmotionalBean obj){
				System.out.println("Mobile::"+obj.getMobile_no());
				int resp = patient.insertEmotional_status(obj);
				System.out.println("status::"+resp);
				EmotionalResponse wb = new EmotionalResponse();
				if(resp == 1) {
				wb.setResponse("success");
				return new ResponseEntity<EmotionalResponse>(wb, HttpStatus.OK);
				}else {
				return new ResponseEntity<EmotionalResponse>(wb, HttpStatus.INTERNAL_SERVER_ERROR);
				}
			}
			
			@RequestMapping(value="/updateemotional", method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
			public ResponseEntity<EmotionalResponse> updateBmi(@RequestBody EmotionalBean obj){
			//System.out.println("city::"+obj.getFirst_name()+","+obj.getMobile_no());
			int resp = patient.updateEmotional_status(obj);
			System.out.println("status::"+resp);
			EmotionalResponse wb = new EmotionalResponse();
			if(resp == 1) {
			wb.setResponse("success");
			return new ResponseEntity<EmotionalResponse>(wb, HttpStatus.OK);
			}else {
			return new ResponseEntity<EmotionalResponse>(wb, HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
			
			//*******************************Education blog*******************************
			
			@RequestMapping(value="/educationimg", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
			public List<EducationBean> alleduimages(){
				List<EducationBean> lst = patient.educationlistimages();
				System.out.println("size::"+lst.size());
				
//				PrescriptionResponse wr = new PrescriptionResponse();
//				wr.setResult(lst);
				return lst;
			}
			
			@RequestMapping(value = "/educationimg/{education_imagesubtype}", method = RequestMethod.GET)
			
			public List<EducationBean> educationimagesbymodelname(@PathVariable("education_imagesubtype") String education_imagesubtype){
				System.out.println("city::"+education_imagesubtype);
				List<EducationBean> lst = patient.educationlistimagesbymodelname(education_imagesubtype);
				System.out.println("size::"+lst.size());
//				DrugResponse wr = new DrugResponse();
//				wr.setResult(lst);
				return lst;
			}
			
			@RequestMapping(value="/eduimgupload", method=RequestMethod.POST)
			
			public int uploadEduimg(
					@RequestParam("education_imagetitle") String education_imagetitle,
			@RequestParam("education_image") MultipartFile file,@RequestParam("education_imagesubtype") String education_imagesubtype){

				EducationBean wb = new EducationBean();
			wb.setEducation_imagetitle(education_imagetitle);
			wb.setEducation_image(file);
			wb.setEducation_imagesubtype(education_imagesubtype);
		
			int resp = 0 ;
			resp = patient.uploadeducationimage(wb);
			System.out.println("status::"+resp);

			return resp;
			}
			
			
			@RequestMapping(value="/deleteeduimg", method=RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_VALUE)
			public int deleteimg(@RequestBody EducationBean obj){
				
//				System.out.println("courtry::"+obj.getMobile_no());
				int resp = patient.removeeducationimage(obj);
				System.out.println("status::"+resp);
				
				return resp;
			}
			


			//***************************** edu PDF upload**********************************
			
			@RequestMapping(value="/educationpdf", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
			public List<EducationBean> educationpdf(){
				List<EducationBean> lst = patient.educationlistpdf();
				System.out.println("size::"+lst.size());
				
//				PrescriptionResponse wr = new PrescriptionResponse();
//				wr.setResult(lst);
				return lst;
			}
			
			@RequestMapping(value = "/educationpdf/{education_pdfsubtype}", method = RequestMethod.GET)
			
			public List<EducationBean> educationpdfbysubtype(@PathVariable("education_pdfsubtype") String education_pdfsubtype){
				System.out.println("city::"+education_pdfsubtype);
				List<EducationBean> lst = patient.educationlistpdfbysubtype(education_pdfsubtype);
				System.out.println("size::"+lst.size());
//				DrugResponse wr = new DrugResponse();
//				wr.setResult(lst);
				return lst;
			}
			
			@RequestMapping(value="/edupdfupload", method=RequestMethod.POST)
			
			public int uploadEdupdf(
					@RequestParam("education_pdftitle") String education_pdftitle,
			@RequestParam("education_pdf") MultipartFile file,@RequestParam("education_pdfsubtype") String education_pdfsubtype){

				EducationBean wb = new EducationBean();
			wb.setEducation_pdftitle(education_pdftitle);
			wb.setEducation_pdf(file);
			wb.setEducation_pdfsubtype(education_pdfsubtype);
		
			int resp = 0 ;
			resp = patient.uploadeducationpdf(wb);
			System.out.println("status::"+resp);

			return resp;
			}
			
			
			@RequestMapping(value="/deleteedupdf", method=RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_VALUE)
			public int deletepdf(@RequestBody EducationBean obj){
				
//				System.out.println("courtry::"+obj.getMobile_no());
				int resp = patient.removeeducationpdf(obj);
				System.out.println("status::"+resp);
				
				return resp;
			}
			
			
			
			//education web links 
			@RequestMapping(value="/educationweb", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
			public List<EducationBean> educationweb(){
				
				List<EducationBean> lst = patient.educationlistweblinks();
				System.out.println("size::"+lst.size());			
				return lst;
			}
			
			@RequestMapping(value="/educationweb/{education_websubtype}", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
			public List<EducationBean> educationwebbysubtype(@PathVariable("education_websubtype") String education_websubtype){
				System.out.println("city::"+education_websubtype);
				List<EducationBean> lst = patient.educationlistweblinksbysubtype(education_websubtype);
				System.out.println("size::"+lst.size());
//				DiseaseResponse wr = new DiseaseResponse();
//				wr.setResult(lst);
				return lst;
			}
			

			@RequestMapping(value="/educationwebupload", method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
			public ResponseEntity<EducationBlogResponse> addweblinks(@RequestBody EducationBean obj){
//				System.out.println("Mobile::"+obj.getMobile_no());
				int resp = patient.uploadeducationweblinks(obj);
				System.out.println("status::"+resp);
				EducationBlogResponse wb = new EducationBlogResponse();
				if(resp == 1) {
				wb.setResponse("success");
				return new ResponseEntity<EducationBlogResponse>(wb, HttpStatus.OK);
				}else {
				return new ResponseEntity<EducationBlogResponse>(wb, HttpStatus.INTERNAL_SERVER_ERROR);
				}
			}
			
		
			
			@RequestMapping(value="/deleteeduweb", method=RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_VALUE)
			public int deleteeduweb(@RequestBody EducationBean obj){
				
//				System.out.println("courtry::"+obj.getMobile_no());
				int resp = patient.removeeducationweblinks(obj);
				System.out.println("status::"+resp);
				
				return resp;
			}
			
			
			
}
