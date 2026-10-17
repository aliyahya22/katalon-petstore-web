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
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable


WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.click(findTestObject('Object Repository/Login_Object/btn_SignIn'))

WebUI.setText(findTestObject('Object Repository/Login_Object/input_Username'), GlobalVariable.valid_username)

WebUI.setText(findTestObject('Object Repository/Login_Object/input_Password'), GlobalVariable.valid_password)

WebUI.click(findTestObject('Object Repository/Login_Object/btn_Login'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Login_Object/msg_success'), 5)

WebUI.delay(2)

WebUI.navigateToUrl('https://petstore.octoperf.com/actions/Account.action?editAccountForm=')

WebUI.setText(findTestObject('Object Repository/User_Information/input_NewPassword'), 'finalproject')

WebUI.setText(findTestObject('Object Repository/User_Information/input_RepeatPassword'), 'finalproject')

WebUI.setText(findTestObject('Object Repository/Account_Information/input_FirstName'), var_firstName)

WebUI.setText(findTestObject('Object Repository/Account_Information/input_LastName'), var_lastName)

WebUI.setText(findTestObject('Object Repository/Account_Information/input_Email'), var_email)

WebUI.setText(findTestObject('Object Repository/Account_Information/input_PhoneNumber'), var_phone)

WebUI.setText(findTestObject('Object Repository/Account_Information/input_Address1'), var_address1)

WebUI.setText(findTestObject('Object Repository/Account_Information/input_Address2'), var_address2)

WebUI.setText(findTestObject('Object Repository/Account_Information/input_City'), var_city)

WebUI.setText(findTestObject('Object Repository/Account_Information/input_State'), var_state)

WebUI.setText(findTestObject('Object Repository/Account_Information/input_Zip'), var_zip)

WebUI.setText(findTestObject('Object Repository/Account_Information/input_Country'), var_country)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Profile_Information/select_Language'), 'japanese', false)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Profile_Information/select_Favorit'), 'FISH', false)

WebUI.check(findTestObject('Object Repository/Profile_Information/checkbox_Mylist'))

WebUI.check(findTestObject('Object Repository/Profile_Information/checkbox_Banner'))

WebUI.click(findTestObject('Object Repository/Profile_Information/btn_Save'))

WebUI.closeBrowser()
