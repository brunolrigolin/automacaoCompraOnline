package realizarCompra
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When


class Login {

	@Given("Entrar no site de comercio")
	def navegarParaSiteComercial(){
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://www.kabum.com.br/')
		WebUI.click(findTestObject('Object Repository/LojaComercio/btn_Cadastrar'))
	}

	@When("Usar o (.*) e (.*)")
	def realizarLogin(String username, String password){
		WebUI.setText(findTestObject('Object Repository/TelaLogin/input_Usuario'), username)
		WebUI.setEncryptedText(findTestObject('Object Repository/TelaLogin/input_Senha'), password)
	}

	@And("clicar no botão login")
	def clicarLogin(){
		WebUI.click(findTestObject('Object Repository/TelaLogin/input_Login'))
	}

	@Then("Verificar login no site de comercio")
	def verificarAcessar(){
		WebUI.verifyElementPresent(findTestObject('LojaComercio/btn_Sair'), 5)
		WebUI.delay(15)
		WebUI.closeBrowser()
	}
}