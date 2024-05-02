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
import com.kms.katalon.core.util.KeywordUtil

String newTitle = "test"

WebUI.click(findTestObject('Object Repository/PayGrade/Page_Employee Management/HR Administration Tab'))

WebUI.click(findTestObject('Object Repository/PayGrade/Page_HR Administration/Job menu drop down'))

WebUI.click(findTestObject('Object Repository/PayGrade/Page_HR Administration/Manage Pay Grades Menu Button'))

WebUI.click(findTestObject('Object Repository/PayGrade/Page_Job/i_add'))

WebUI.setText(findTestObject('Object Repository/PayGrade/Page_Job/input_Add Pay Grade_name'), 'test')

WebUI.click(findTestObject('Object Repository/PayGrade/Page_Job/Cancel Button'))

String expectedTitle = WebUI.getText(findTestObject('Object Repository/PayGrade/Page_Job/td_Chief Executive Officer (C.E.O)'))

if(expectedTitle == newTitle) {
	KeywordUtil.markFailed('ERROR: The Pay Grade should not be saved')
}
