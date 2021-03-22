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

WebUI.click(findTestObject('Elibot_DieuTra/Div_2/btn_themPhieuDieuTra'))

WebUI.setText(findTestObject('null'), Ho)

WebUI.setText(findTestObject('null'), Ten)

WebUI.setText(findTestObject('null'), '')

WebUI.setText(findTestObject('null'), SoPhieu)

WebUI.click(findTestObject('null'))

giatri = WebUI.waitForElementVisible(findTestObject('Elibot_DieuTra/Div_2/btn_themPhieuDieuTra_/ThongBao/div_ThieuTenChuHo'), 
    5)

print(giatri)

if (giatri == false) {
    WebUI.acceptAlert()
}

