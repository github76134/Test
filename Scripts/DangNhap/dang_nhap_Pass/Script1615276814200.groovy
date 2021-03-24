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

'Mở trình duyệt'
WebUI.openBrowser('')

'truy cập vào đường dẫn\r\n\r\n'
WebUI.navigateToUrl('https://elibot.esoft.edu.vn')

'Mở full cửa sổ trình duyệt'
WebUI.maximizeWindow()

'Chọn vào nút đăng nhập bằng mail'
WebUI.click(findTestObject('Page_ELIBOT_dangnhap/btn_dangNhapBangGmail'))

'Chuyển sang cửa sổ có tiêu đề'
WebUI.switchToWindowTitle('Đăng nhập - Tài khoản Google')

WebUI.delay(5)

'Nhập tài khoản Gmail'
WebUI.setText(findTestObject('Page_ELIBOT_dangnhap/btn_dangNhapBangGmail_/input_username'), user)

'Chọn vào nút tiếp tục'
WebUI.click(findTestObject('Page_ELIBOT_dangnhap/btn_dangNhapBangGmail_/div_Tiep theo_1'))

'Chờ 2 giây'
WebUI.delay(2)

'Nhập mật khẩu'
WebUI.setText(findTestObject('Page_ELIBOT_dangnhap/btn_dangNhapBangGmail_/input_Password'), pass)

//asb
'Chọn vào nút tiếp tục'
WebUI.click(findTestObject('Page_ELIBOT_dangnhap/btn_dangNhapBangGmail_/div_Tiep theo_2'))

WebUI.delay(2)

