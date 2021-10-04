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

WebUI.callTestCase(findTestCase('2 Products/Product Selection'), [('carttxt') : ''], FailureHandling.STOP_ON_FAILURE)

String qty = WebUI.getAttribute(findTestObject('Object Repository/Update Cart/Page_Shopping cart  Boxes4U/input_Boxes_edit_quantity0'), 
    'value')

String addqty = '5'

//for decimal adding eg. 10.0
//Double number1 = Double.parseDouble(qty)
//Double number2 = Double.parseDouble(addqty)
//for adding and shows in integer
int number1 = Integer.parseInt(qty)

int number2 = Integer.parseInt(addqty)

result = (number1 + number2)

System.out.println(result)

String resultAsString = result.toString()

//to select the text in the box cntrl+A
WebUI.sendKeys(findTestObject('Object Repository/Update Cart/Page_Shopping cart  Boxes4U/input_Boxes_edit_quantity0'), Keys.chord(
        Keys.CONTROL, 'a'))

//to delete text, backspace
WebUI.sendKeys(findTestObject('Object Repository/Update Cart/Page_Shopping cart  Boxes4U/input_Boxes_edit_quantity0'), Keys.chord(
        Keys.BACK_SPACE))

WebUI.sendKeys(findTestObject('Object Repository/Update Cart/Page_Shopping cart  Boxes4U/input_Boxes_edit_quantity0'), resultAsString)

WebUI.click(findTestObject('Object Repository/Update Cart/Page_Shopping cart  Boxes4U/input_52.20_op'))

WebUI.delay(2)

//WebUI.verifyElementText(findTestObject('Object Repository/update message/Page_Shopping cart  Boxes4U/div_Status messageYour shopping cart has been updated'),'Status message'+"\n"+'Your shopping cart has been updated.')
WebUI.verifyTextPresent('Your shopping cart has been updated.', false)

WebUI.takeScreenshot()


