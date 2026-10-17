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

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.click(findTestObject('Object Repository/Login_Object/btn_SignIn'))

WebUI.setText(findTestObject('Object Repository/Login_Object/input_Username'), GlobalVariable.valid_username)

WebUI.setText(findTestObject('Object Repository/Login_Object/input_Password'), GlobalVariable.valid_password)

WebUI.click(findTestObject('Object Repository/Login_Object/btn_Login'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Login_Object/msg_success'), 5)

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Homepage/input_SearchKeyword'), 'angelfish')

WebUI.click(findTestObject('Object Repository/Homepage/btn_Search'))

WebUI.waitForPageLoad(5)

WebUI.verifyTextPresent('Angelfish', false)

WebUI.click(findTestObject('Object Repository/Product/btn_FI-SW-01'))

WebUI.click(findTestObject('Object Repository/Product/btn_AddToCart'))

WebUI.setText(findTestObject('Object Repository/Product/input_Quantity'), '100')

WebUI.click(findTestObject('Product/btn_UpdateCart'))

WebUI.click(findTestObject('Product/btn_CheckOut'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Billing/select_CardType'), cardType, false)

WebUI.setText(findTestObject('Object Repository/Billing/input_CardNumber'), cardNumber)

WebUI.setText(findTestObject('Object Repository/Billing/input_ExpiryDate'), expiryDate)

WebUI.setText(findTestObject('Object Repository/Billing/input_FirstName'), firstName)

WebUI.setText(findTestObject('Object Repository/Billing/input_LastName'), lastName)

WebUI.setText(findTestObject('Object Repository/Billing/input_Address1'), address1)

WebUI.setText(findTestObject('Object Repository/Billing/input_Address2'), address2)

WebUI.setText(findTestObject('Object Repository/Billing/input_City'), city)

WebUI.setText(findTestObject('Object Repository/Billing/input_State'), state)

WebUI.setText(findTestObject('Object Repository/Billing/input_Zip'), zip)

WebUI.setText(findTestObject('Object Repository/Billing/input_Country'), country)

WebUI.click(findTestObject('Object Repository/Billing/btn_Continue'))

WebUI.verifyTextPresent('Please confirm the information below and then press continue...', false)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Billing/btn_Confirm'))

WebUI.verifyTextPresent('Thank you, your order has been submitted.', false)

WebUI.delay(5)

WebUI.closeBrowser()

