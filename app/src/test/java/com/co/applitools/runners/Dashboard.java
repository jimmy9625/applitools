package com.co.applitools.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/front/dashboard.feature",
        glue = "com.co.applitools.stepdefinition",
        snippets = SnippetType.CAMELCASE
)
public class Dashboard {
}
