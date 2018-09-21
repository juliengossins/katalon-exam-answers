import com.kms.katalon.core.exception.StepFailedException as StepFailedException
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint

not_run: currentUrl = ''

not_run: try {
    not_run: currentUrl = WebUI.getUrl()
}
catch (StepFailedException e) {
    // browser not open	
    not_run: WebUI.openBrowser(url)

    not_run: WebUI.maximizeWindow()

    not_run: currentUrl = WebUI.getUrl()
} 

not_run: if (!(currentUrl.equals(url))) {
    not_run: WebUI.navigateToUrl(url)

    not_run: WebUI.waitForPageLoad(GlobalVariable.timeOut)
}

try {
    /* Do we need to sign in? Check so by looking for text Sign in */
    WebUI.verifyTextPresent('Sign in', false)

    WebUI.click(findTestObject('Page_Home/Button_SignIn'))

    WebUI.setText(findTestObject('Page_Login/Input_Email'), GlobalVariable.loginUsername)

    WebUI.setText(findTestObject('Page_Login/Input_Password'), GlobalVariable.loginPassword)

    WebUI.click(findTestObject('Page_Login/Button_SignIn'))

    WebUI.navigateToUrl(url)

    WebUI.waitForPageLoad(GlobalVariable.timeOut)
}
catch (def e) {
    /* Sign in does not need to be present */ 
} 

/* We should be signed in now, so verify that the text Sign out is on the page */
WebUI.verifyTextPresent('Sign out', false)

