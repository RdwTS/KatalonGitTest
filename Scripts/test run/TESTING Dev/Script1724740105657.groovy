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

WebUI.navigateToUrl('https://10.25.88.76:8099/')

'advance for open unsafe\r\n'
WebUI.click(findTestObject('privacy error/details-button'))

'link unsafe for unlock web'
WebUI.click(findTestObject('privacy error/proceed-link'))

'username'
WebUI.setText(findTestObject('Login page/input_Hobis_loginUsername'), 'CL012')

'password = 1'
WebUI.setEncryptedText(findTestObject('Login page/input_Hobis_loginPassword noXpath'), 'HeCM15nHKBI=')

'button login'
WebUI.click(findTestObject('Login page/button_Login noXpath'))

'waiting for load clds'
WebUI.waitForElementVisible(findTestObject('Main scren/td_CLDS'), 360)

WebUI.setText(findTestObject('Object Repository/CL01/input_COLLECTION_BCInp'), 'QA01')

'Filter inquiry qa01\r\n'
WebUI.click(findTestObject('QA01/inp_filterInquiry_qa01'))

'field filter'
WebUI.click(findTestObject('QA01/div_FIELD'))

'filter period start date'
WebUI.click(findTestObject('tes qa01/inp_endPeriod - Copy'))

'previous year'
WebUI.click(findTestObject('Object Repository/QA01/div_INQUIRY_calendar-nav calendar-prevyear _176344'), FailureHandling.OPTIONAL)

'previous year'
WebUI.click(findTestObject('Object Repository/QA01/div_INQUIRY_calendar-nav calendar-prevyear _176344'), FailureHandling.OPTIONAL)

'chose the date'
WebUI.click(findTestObject('Object Repository/QA01/chose date td 2'))

WebUI.setText(findTestObject('Object Repository/QA01/input_Bucket_inpCixNo'), '0001314859')

WebUI.click(findTestObject('Object Repository/QA01/button_INQUIRY'))

