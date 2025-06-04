package com.comcast.crm.opportunitiestest;
import org.testng.annotations.Test;

import com.comcast.crm.generic.basetest.BaseClass;
import com.comcast.crm.objectrepositoryutility.HomePage;
import com.comcast.crm.objectrepositoryutility.LoginPage;
import com.comcast.crm.objectrepositoryutility.OpportunitiesPage;

public class CreateOpportunitiesTest extends BaseClass {

    @Test
    public void createOpportunitiesTest() throws Throwable {
        // Fetching data from Excel and appending random number
        String opportunityName = elib.getDataFromExcel("org", 10, 3);

        // Navigating to Opportunities Page
        HomePage hp = new HomePage(driver);
        hp.getOpportunitiesLink().click();

        // Creating a new Opportunity
        OpportunitiesPage op = new OpportunitiesPage(driver);
        op.getOpportunitiesBtn().click();
        op.getOpportunitiesName(opportunityName);
        op.getOpportunitiesSaveBtn().click();
    }
}
