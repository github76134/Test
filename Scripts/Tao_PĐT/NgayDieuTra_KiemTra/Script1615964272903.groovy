import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import java.text.ParseException as ParseException
import java.text.SimpleDateFormat as SimpleDateFormat
import java.util.Date as Date
import com.kms.katalon.core.logging.KeywordLogger

WebUI.switchToWindowTitle('ELIBOT')

WebUI.click(findTestObject('Elibot_DieuTra/Div_2/btn_themPhieuDieuTra'))

WebUI.setText(findTestObject('Elibot_DieuTra/Div_2/btn_themPhieuDieuTra_/Page_ELIBOT/input-HoChuHo'), Ho)

WebUI.setText(findTestObject('Elibot_DieuTra/Div_2/btn_themPhieuDieuTra_/Page_ELIBOT/input-TenChuHo'), Ten)

WebUI.setText(findTestObject('Elibot_DieuTra/Div_2/btn_themPhieuDieuTra_/Page_ELIBOT/input-NgaySinh'), NgaySinh)

WebUI.sendKeys(findTestObject('Elibot_DieuTra/Div_2/btn_themPhieuDieuTra_/Page_ELIBOT/input-NgaySinh'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Elibot_DieuTra/Div_2/btn_themPhieuDieuTra_/Page_ELIBOT/input-SoPhieu'), SoPhieu)

WebUI.setText(findTestObject('Elibot_DieuTra/Div_2/btn_themPhieuDieuTra_/Page_ELIBOT/input-NgayDieuTra'), NgayDieuTra)

//WebUI.delay(3)
//KiemTraNgayNhap(NgayDieuTra)
WebUI.click(findTestObject('Elibot_DieuTra/Div_2/btn_themPhieuDieuTra_/Page_ELIBOT/btn_LuuPhieu'))

// Nếu các điều kiện đúng sẽ click được thông báo này
// Nếu các điều kiện sai sẽ không click được thông báo này
//if (KiemTraNgayNhap(NgayDieuTra) == true) 

KeywordLogger log = new KeywordLogger();


	if(Ten == '')
	{
		println("\nTên chủ hộ không được để trống\n");
		log.logFailed("Tên chủ hộ không được để trống")
	}
	if(Ho == '')
		{
			println("\nHọ chủ hộ không được để trống\n");
			log.logFailed("Họ chủ hộ không được để trống")
		}
	if(KiemTraNgay(NgaySinh) == false)
		{
			println("\nNgày sinh phải là ngày trong quá khứ\n");
			log.logFailed("Ngày sinh phải là ngày trong quá khứ")
			
		}
	if(KiemTraNgay(NgayDieuTra) == false)
		{
			println("\nNgày điều tra phải là ngày hiện tại hoặc quá khứ\n");
			log.logFailed("Ngày điều tra phải là ngày hiện tại hoặc quá khứ")
		}

		
if ((((Ten != '') && (Ho != '')) && (KiemTraNgay(NgaySinh) == true)) && (KiemTraNgay(NgayDieuTra) == true)) {
    WebUI.click(findTestObject('Elibot_DieuTra/Div_2/btn_themPhieuDieuTra_/ThongBao/div_ThemPDT_ThanhCong'))
} else {
    WebUI.click(findTestObject('Elibot_DieuTra/Div_2/btn_themPhieuDieuTra_/ThongBao/Page_ELIBOT/div_ThongTinKhongHopLe'))
    WebUI.click(findTestObject('Elibot_DieuTra/Div_2/btn_themPhieuDieuTra_/Page_ELIBOT/btn_thoat'))	
	}

boolean KiemTraNgay(String sDate) {
    SimpleDateFormat formatter = new SimpleDateFormat('dd/MM/yyyy')

    Date date = new Date()

    Date date1 = new SimpleDateFormat('dd/MM/yyyy').parse(sDate)

    if (date1.before(date) == false) {
        return false
    }
    
    return true
}

