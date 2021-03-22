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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://elibot.esoft.edu.vn')

WebUI.click(findTestObject('Page_ELIBOT_dangnhap/btn_dangNhapBangGmail'))

WebUI.switchToWindowTitle('')

WebUI.setText(findTestObject('Page_ELIBOT_dangnhap/btn_dangNhapBangGmail_/input_username'), 'hoangletranhaiminh@gmail.com')

WebUI.click(findTestObject('Page_ELIBOT_dangnhap/btn_dangNhapBangGmail_/div_Tiep theo_1'))

WebUI.verifyElementText(findTestObject('Page_ELIBOT_dangnhap/btn_dangNhapBangGmail_/khong_tim_thay_taiKhoan'), 'Không tìm thấy Tài khoản Google của bạn')

WebUI.delay(5)

WebUI.closeWindowTitle('Đăng nhập - Tài khoản Google')

WebUI.switchToWindowTitle('ELIBOT')

giatri = WebUI.waitForElementVisible(findTestObject('Page_ELIBOT_dangnhap/div_DangNhapKhongThanhCong'), 3)

if (giatri == false) {
    WebUI.acceptAlert()
}

