package com.co.applitools.runners.front;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/front/authentication.feature",
        glue = "com.co.applitools.stepdefinition.front",
        snippets = SnippetType.CAMELCASE)
public class Authentication {
}
