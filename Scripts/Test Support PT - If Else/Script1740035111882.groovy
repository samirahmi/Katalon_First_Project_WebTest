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

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.urlPTSupport)

WebUI.click(findTestObject('Test Support PT/Base64/a_Encode'))

WebUI.delay(GlobalVariable.Delay)

WebUI.click(findTestObject('Test Support PT/Base64/textarea_Encode_Input'))

WebUI.setText(findTestObject('Test Support PT/Base64/textarea_Encode_Input'), 'laalalall')

WebUI.click(findTestObject('Test Support PT/Base64/button_Encode'))

WebUI.delay(GlobalVariable.Delay)

WebUI.click(findTestObject('Test Support PT/Base64/textarea_Encode_Output'))

String Decode = WebUI.getAttribute(findTestObject('Test Support PT/Base64/textarea_Encode_Output'), 'value')

println('The value is: ' + Decode)

WebUI.click(findTestObject('Test Support PT/Base64/a_Decode'))

WebUI.delay(GlobalVariable.Delay)

WebUI.click(findTestObject('Test Support PT/Base64/textarea_Decode_Input'))

WebUI.setText(findTestObject('Test Support PT/Base64/textarea_Decode_Input'), Decode)

WebUI.click(findTestObject('Test Support PT/Base64/button_Decode'))

laalalall = WebUI.verifyElementVisible(findTestObject('Test Support PT/Base64/textarea_Decode_Output'))

WebUI.delay(GlobalVariable.Delay)

WebUI.click(findTestObject('Test Support PT/Base64/a_Encode_by_File'))

def Filename = 'D:\\Katalon Studio\\My First Project\\fileUpload.png'

WebUI.sendKeys(findTestObject('Test Support PT/Base64/DocumentUpload'), Filename)

WebUI.waitForElementPresent(findTestObject('Test Support PT/Base64/Encoded_File_Base64'), 10, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Test Support PT/Base64/textarea_EncodeFile_Output'))

String EncodeFile = WebUI.getAttribute(findTestObject('Test Support PT/Base64/textarea_EncodeFile_Output'), 'value')

println('Encode is: ' + EncodeFile)

WebUI.delay(GlobalVariable.Delay)

WebUI.closeBrowser()

