import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

try {
    WebUI.setText(findTestObject('Page_Login/Input_Email'), GlobalVariable.loginUsername)

    WebUI.setText(findTestObject('Page_Login/Input_Password'), GlobalVariable.loginPassword)

    WebUI.click(findTestObject('Page_Login/Button_SignIn'))

    WebUI.waitForPageLoad(GlobalVariable.timeOut)
}
catch (Exception e) {
} 

/* We should be signed in now, so verify that the text Sign out is on the page */
WebUI.verifyTextPresent('Sign out', false)

