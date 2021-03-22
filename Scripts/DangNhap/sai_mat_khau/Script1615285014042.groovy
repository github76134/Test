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

WebUI.switchToWindowTitle('Đăng nhập - Tài khoản Google')

WebUI.setText(findTestObject('Page_ELIBOT_dangnhap/btn_dangNhapBangGmail_/input_username'), 'kiemthu543@gmail.com')

WebUI.click(findTestObject('Page_ELIBOT_dangnhap/btn_dangNhapBangGmail_/div_Tiep theo_1'))

WebUI.setText(findTestObject('Page_ELIBOT_dangnhap/btn_dangNhapBangGmail_/input_Password'), '123456')

WebUI.click(findTestObject('Page_ELIBOT_dangnhap/btn_dangNhapBangGmail_/div_Tiep theo_2'))

WebUI.verifyElementText(findTestObject('Page_ELIBOT_dangnhap/btn_dangNhapBangGmail_/Thong_bao_saimk'), 'Mật khẩu không chính xác. Hãy thử lại hoặc nhấp vào "Bạn quên mật khẩu" để đặt lại mật khẩu.')
