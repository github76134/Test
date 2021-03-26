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

WebUI.switchToWindowTitle('ELIBOT')

WebUI.setText(findTestObject('Page_ELIBOT_dangnhap/input_Loi n v_search'), 'Phường/Xã')

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Chon_Loai_DV/input_Tnh_search'), 'Long An')

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ENTER))
////
WebUI.setText(findTestObject('Chon_Loai_DV/input_QunHuyn_search'), 'Đức Hòa')

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Chon_Loai_DV/input_PhngX_search'), 'Đức Hòa')

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Chon_Loai_DV/btn_dangKySudung'))

