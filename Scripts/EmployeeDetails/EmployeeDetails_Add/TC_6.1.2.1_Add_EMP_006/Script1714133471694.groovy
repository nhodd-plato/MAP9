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


WebUI.click(findTestObject('Object Repository/EmployeeDetails/Page_Employee Management/a_Employee List'))

WebUI.click(findTestObject('Object Repository/EmployeeDetails/Page_Employee Management/i_add'))

firstName = CustomKeywords.'text.generator.RandomString.createRandomString'()

lastName = CustomKeywords.'text.generator.RandomString.createRandomString'()

WebUI.setText(findTestObject('Object Repository/EmployeeDetails/Page_Employee Management/input__first-name-box'), firstName)

WebUI.setText(findTestObject('Object Repository/EmployeeDetails/Page_Employee Management/input__last-name-box'), lastName)

WebUI.click(findTestObject('Object Repository/EmployeeDetails/Page_Employee Management/i_arrow_drop_down'))

WebUI.click(findTestObject('Object Repository/EmployeeDetails/Page_Employee Management/span_Canadian Development Center'))

WebUI.selectOptionByValue(findTestObject('Object Repository/EmployeeDetails/Page_Employee Management/select_-- Select --AustraliaAustralia offic_24b8d4'), 
    'string:2', true)

WebUI.click(findTestObject('Object Repository/EmployeeDetails/Page_Employee Management/label_Create Login Details_custom-control-label'))

WebUI.click(findTestObject('Object Repository/EmployeeDetails/Page_Employee Management/button_Next'))

WebUI.verifyElementPresent(findTestObject('Object Repository/EmployeeDetails/Page_Employee Management/span_Required'),0)
