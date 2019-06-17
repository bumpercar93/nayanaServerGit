package nayana.main;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import nayana.Inbody.service.IInbodyService;
import nayana.Inbody.service.InbodyServiceImpl;
import nayana.MedicalCertficate.service.IMedicalCertficateService;
import nayana.MedicalCertficate.service.MedicalCertficateServiceImpl;
import nayana.MedicalReport.service.IMedicalReportService;
import nayana.MedicalReport.service.MedicalReportServiceImpl;
import nayana.Prescription.service.IPrescriptionService;
import nayana.Prescription.service.PrescriptionServiceImpl;
import nayana.SelfTest.service.ISelfTestService;
import nayana.SelfTest.service.SelfTestServiceImpl;
import nayana.SelfTestInfo.service.ISelfTestInfoService;
import nayana.SelfTestInfo.service.SelfTestInfoServiceImpl;
import nayana.SelfTestQuestion.service.ISelfTestQuestionService;
import nayana.SelfTestQuestion.service.SelfTestQuestionServiceImpl;
import nayana.SelfTestResult.service.ISelfTestResultService;
import nayana.SelfTestResult.service.SelfTestResultServiceImpl;
import nayana.SurgicalConfirmation.service.ISurgicalConfirmationService;
import nayana.SurgicalConfirmation.service.SurgicalConfirmationServiceImpl;
import nayana.boardFlag.dao.IBoardFlagDao;
import nayana.boardFlag.service.BoardFlagServiceImpl;
import nayana.boardFlag.service.IBoardFlagService;
import nayana.boardHealth.service.BoardHealthServiceImpl;
import nayana.boardHealth.service.IBoardHealthService;
import nayana.boardNotice.service.BoardNoticeServiceImpl;
import nayana.boardNotice.service.IBoardNoticeService;
import nayana.docDown.service.DocDownServiceImpl;
import nayana.docDown.service.IDocDownService;
import nayana.docUpdate.service.DocUpdateServiceImpl;
import nayana.docUpdate.service.IDocUpdateService;
import nayana.member.service.IMemberService;
import nayana.member.service.MemberServiceImpl;
import nayana.myFile.service.IMyFileService;
import nayana.myFile.service.MyFileServiceImpl;
import nayana.rAge.service.IRAgeService;
import nayana.rAge.service.RAgeServiceImpl;
import nayana.rDFood.service.IRDFoodService;
import nayana.rDFood.service.RDFoodServiceImpl;
import nayana.rDResult.service.IRDResultService;
import nayana.rDResult.service.RDResultServiceImpl;
import nayana.rDWeight.service.IRDWeightService;
import nayana.rDWeight.service.RDWeightServiceImpl;
import nayana.rDisease.service.IRDiseaseService;
import nayana.rDisease.service.RDiseaseServiceImpl;
import nayana.rE.service.IREService;
import nayana.rE.service.REServiceImpl;
import nayana.rEBody.service.IREBodyService;
import nayana.rEBody.service.REBodyServiceImpl;
import nayana.rEResult.service.IREResultService;
import nayana.rEResult.service.REResultServiceImpl;
import nayana.rESituation.service.IRESituationService;
import nayana.rESituation.service.RESituationServiceImpl;

public class ServerMain {
	public static void main(String[] args) {
		try {
			Registry reg = LocateRegistry.createRegistry(8888);
			
			// 각각의 서비스 객체 만들기
			IMemberService memberService = new MemberServiceImpl();
			IInbodyService inbodyService = new InbodyServiceImpl();
			IMedicalCertficateService medicalCertficateService = new MedicalCertficateServiceImpl();
			IMedicalReportService medicalReportService = new MedicalReportServiceImpl();
			IPrescriptionService prescriptionService = new PrescriptionServiceImpl();
			ISurgicalConfirmationService surgicalConfirmationService = new SurgicalConfirmationServiceImpl();
			IDocUpdateService docUpdateService = new DocUpdateServiceImpl();
			IDocDownService docDownService = new DocDownServiceImpl();
			IRAgeService rAgeService = new RAgeServiceImpl();
			IRDFoodService rDFoodService = new RDFoodServiceImpl();
			IRDiseaseService rDiseaseServie = new RDiseaseServiceImpl();
			IRDResultService rDResultService = new RDResultServiceImpl();
			IRDWeightService rDWeightService = new RDWeightServiceImpl();
			IREService rEService = new REServiceImpl();
			IREBodyService rEBodyService = new REBodyServiceImpl(); 
			IREResultService rEResultService = new REResultServiceImpl();
			IRESituationService rESituationService = new RESituationServiceImpl();
			IBoardNoticeService boardNoticeService = new BoardNoticeServiceImpl();
			ISelfTestService selfTestService = new SelfTestServiceImpl();
			ISelfTestQuestionService selfTestQuestionService = new SelfTestQuestionServiceImpl();
			IBoardHealthService boardHealthService = new BoardHealthServiceImpl();
			ISelfTestResultService selfTestResultService = new SelfTestResultServiceImpl();
			ISelfTestInfoService selfTestInfoService = new SelfTestInfoServiceImpl();
			IBoardFlagService boardFlagService = new BoardFlagServiceImpl();
			IMyFileService myFileService = new MyFileServiceImpl();
			
			reg.rebind("memberService", memberService);
			reg.rebind("inbodyService", inbodyService);
			reg.rebind("medicalCertficateService", medicalCertficateService);
			reg.rebind("medicalReportService", medicalReportService);
			reg.rebind("prescriptionService", prescriptionService);
			reg.rebind("surgicalConfirmationService", surgicalConfirmationService);
			reg.rebind("docUpdateService", docUpdateService);
			reg.rebind("docDownService", docDownService);
			reg.rebind("rAgeService", rAgeService);
			reg.rebind("rDFoodService", rDFoodService);
			reg.rebind("rDiseaseServie", rDiseaseServie);
			reg.rebind("rDResultService", rDResultService);
			reg.rebind("rDWeightService", rDWeightService);
			reg.rebind("rEService", rEService);
			reg.rebind("rEBodyService", rEBodyService);
			reg.rebind("rEResultService", rEResultService);
			reg.rebind("rESituationService", rESituationService);
			reg.rebind("boardNoticeService", boardNoticeService);
			reg.rebind("selfTestService", selfTestService);
			reg.rebind("selfTestQuestionService", selfTestQuestionService);
			reg.rebind("boardHealthService", boardHealthService);
			reg.rebind("selfTestResultService", selfTestResultService);
			reg.rebind("selfTestInfoService", selfTestInfoService);
			reg.rebind("boardFlagService", boardFlagService);
			reg.rebind("myFileService", myFileService);
			
			System.out.println("서버 시작!");
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
}
