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

WebUI.callTestCase(findTestCase('3 Shopping cart/Cart Page'), [('carturl') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Object Repository/New Address/Page_Checkout  Boxes4U/select_-- Choose --123 test'), 
    'none', true)

WebUI.setText(findTestObject('Object Repository/New Address/Page_Checkout  Boxes4U/input_Company Name_customer_profile_billing_d16fd7'), 
    'Test')

//for phone number entring need to follow as below
String js = 'document.querySelector("#edit-customer-profile-billing-field-phone-und-0-value--2").value = "999-999-9999";'
WebUI.executeJavaScript(js, null)

WebUI.selectOptionByValue(findTestObject('Object Repository/New Address/Page_Checkout  Boxes4U/select_AfghanistanAland IslandsAlbaniaAlger_e0c357'), 
    'US', true)

WebUI.setText(findTestObject('Object Repository/New Address/Page_Checkout  Boxes4U/input__customer_profile_billingcommerce_cus_16c514'), 
    'Tharun')

WebUI.setText(findTestObject('Object Repository/New Address/Page_Checkout  Boxes4U/input__customer_profile_billingcommerce_cus_eed4da'), 
    '70000 Central')

WebUI.setText(findTestObject('Object Repository/New Address/Page_Checkout  Boxes4U/input_Address 2_customer_profile_billingcom_c14d2a'), 
    'Test Test')

WebUI.setText(findTestObject('Object Repository/New Address/Page_Checkout  Boxes4U/input__customer_profile_billingcommerce_cus_d16856'), 
    'Atlanta')

WebUI.selectOptionByValue(findTestObject('Object Repository/New Address/Page_Checkout  Boxes4U/select_- Select -AlabamaAlaskaArizonaArkans_49fdb6'), 
    'GA', true)

WebUI.setText(findTestObject('Object Repository/New Address/Page_Checkout  Boxes4U/input__customer_profile_billingcommerce_cus_4aea45'), 
    '30328')

WebUI.check(findTestObject('Object Repository/Checkbox/Page_Checkout  Boxes4U/input_Store Address1401 E Plano Pkwy,Plano, TX 75074, US_customer_profile_shippingcommerce_customer_profile_copy'))

WebUI.click(findTestObject('Object Repository/Page_Checkout  Boxes4U/input_Special notes_op'))

WebUI.delay(5)

checkouturl = WebUI.getUrl(FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl(checkouturl)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Shipping  Boxes4U/h1_Shipping'), 'SHIPPING')


