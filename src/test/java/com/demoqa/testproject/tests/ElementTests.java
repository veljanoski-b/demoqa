package com.demoqa.testproject.tests;

import com.demoqa.testproject.pages.elements.TextBox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElementTests extends BaseTest {


    //text box DONE
    @Test
    public void test1() {

        textBox.click_elements();
        textBox.text_box();
        textBox.type_full_name("Bojan Veljanoski");
        textBox.type_email("veljanoski_b@yahoo.com");
        textBox.current_address("Jane Sandanski");
        textBox.permanent_address("JANE SANDANSKI");
        textBox.select_submit("");
        sleep(3000);

        Assert.assertEquals(textBox.return_full_name(), "Name:Bojan Veljanoski");
        Assert.assertEquals(textBox.return_email(), "Email:veljanoski_b@yahoo.com");
        Assert.assertEquals(textBox.return_current_address(), "Current Address :Jane Sandanski");
        Assert.assertEquals(textBox.return_permanent_address(), "Permananet Address :JANE SANDANSKI");

    }

    //Check box click on home /DONE
    @Test
    public void test2() {
        checkBox.click_elements();
        checkBox.check_box();
        checkBox.check_box_home();

        sleep(3000);
        Assert.assertEquals(checkBox.returnclickhome(), "You have selected :\n" +
                "home\n" +
                "desktop\n" +
                "notes\n" +
                "commands\n" +
                "documents\n" +
                "workspace\n" +
                "react\n" +
                "angular\n" +
                "veu\n" +
                "office\n" +
                "public\n" +
                "private\n" +
                "classified\n" +
                "general\n" +
                "downloads\n" +
                "wordFile\n" +
                "excelFile");


    }

    // check box expanded/colapsed DONE
    @Test
    public void test3() {
        checkBox.click_elements();
        checkBox.check_box();
        checkBox.check_box_home();
        checkBox.check_box_click_home();
        sleep(3000);
        checkBox.check_box_colapse_all();
        sleep(5000);
    }

    //Radio Button YES DONE
    @Test
    public void test4() {
        radioButton.click_elements();
        radioButton.radio_button();
        radioButton.clickRadio(0);
        sleep(3000);

        Assert.assertEquals(radioButton.returnyes(), "You have selected Yes");

    }

    //Radio Button IMPRESSIVE DONE
    @Test
    public void test5() {
        radioButton.click_elements();
        radioButton.radio_button();
        radioButton.clickRadio(1);
        sleep(3000);

        Assert.assertEquals(radioButton.returnimpressive(), "You have selected Impressive");


    }

    //Web Tables Search DONE
    @Test
    public void test6() {
        webTables.click_elements();
        webTables.web_tables();
        webTables.web_tables_search("Alden");

        sleep(3000);
        Assert.assertEquals(webTables.returnsearch(), "Alden");
    }

    // Web Tables add/delete / DONE
    @Test
    public void test7() {
        webTables.click_elements();
        webTables.web_tables();
        webTables.web_tables_add();
        webTables.type_first_name("Bojan");
        webTables.type_last_name("Veljanoski");
        webTables.type_e_mail("veljanoski_b@yahoo.com");
        webTables.web_tables_age("30");
        webTables.tables_salary("555");
        webTables.tables_department("QQQ");
        webTables.select_submit("");
        sleep(3000);
        Assert.assertEquals(webTables.returnadd(), "Bojan");
        sleep(3000);
        webTables.delete_user();
        sleep(3000);


    }

    //buttons dynamic click DONE
    @Test
    public void test8() {
        buttons.click_elements();
        buttons.click_buttons();
        buttons.click_me(2);
        sleep(3000);

        Assert.assertEquals(buttons.returnclickbuttons(), "You have done a dynamic click");

    }

    //links click on HOME leading to new tab DONE
    @Test
    public void test9() {
        links.click_elements();
        links.click_links();
        sleep(2000);
        links.links_open();
        sleep(3000);
    }

    // links API call/assert DONE
    @Test
    public void test10() {
        links.click_elements();
        links.click_links();
        links.links_created();
        Assert.assertEquals(links.returncreated(), "Link has responded with staus 201 and status text Created");
        sleep(2000);
        links.links_no_content();
        sleep(2000);
        Assert.assertEquals(links.returnnocontent(), "Link has responded with staus 204 and status text No Content");
        sleep(2000);
        links.links_moved();
        sleep(2000);
        Assert.assertEquals(links.returnmoved(), "Link has responded with staus 301 and status text Moved Permanently");
        sleep(2000);
        links.links_bad_request();
        sleep(2000);
        Assert.assertEquals(links.returnbadrequest(), "Link has responded with staus 400 and status text Bad Request");
        sleep(2000);
        links.links_unauthorized();
        sleep(2000);
        Assert.assertEquals(links.returnunauthorized(), "Link has responded with staus 401 and status text Unauthorized");
        sleep(2000);
        links.links_forbidden();
        sleep(2000);
        Assert.assertEquals(links.returnforbidden(), "Link has responded with staus 403 and status text Forbidden");
        sleep(2000);
        links.links_not_found();
        sleep(2000);
        Assert.assertEquals(links.returnnotfound(), "Link has responded with staus 404 and status text Not Found");
        sleep(2000);

    }

    //broken links open VALID LINK DONE
    @Test
    public void test11() {
        brokenLinksImages.click_elements();
        brokenLinksImages.broken_links();
        sleep(2000);
        brokenLinksImages.valid_links();
        sleep(2000);


    }

    //broken links open Broken Link DONE
    @Test
    public void test12() {
        brokenLinksImages.click_elements();
        brokenLinksImages.broken_links();
        sleep(2000);
        brokenLinksImages.click_for_broken_link();
        sleep(2000);
    }



    //practice form filled,checked,closed/DONE
    @Test
    public void test13() {

        practiceForm.click_forms();
        practiceForm.click_practise_form();
        practiceForm.clickHobbies(0);
        practiceForm.type_first_name("Bojan");
        practiceForm.type_last_name("Veljanoski");
        practiceForm.type_e_mail("veljanoski_b@yahoo.com");
        practiceForm.clickGenders(0);
        practiceForm.type_phone_number("0123456789");
        practiceForm.type_current_address("Jane Sandanski");
        practiceForm.type_date_of_birth("");
        practiceForm.select_state("NCR");
        practiceForm.select_city("Delhi");
        practiceForm.select_submit("");
        sleep(3000);
        Assert.assertEquals(practiceForm.returnnamesurname(), "Student Name Bojan Veljanoski");
        Assert.assertEquals(practiceForm.returnemail(), "Student Email veljanoski_b@yahoo.com");
        Assert.assertEquals(practiceForm.returngender(), "Gender Male");
        Assert.assertEquals(practiceForm.returnmobile(), "Mobile 0123456789");
        Assert.assertEquals(practiceForm.returndateofbirth(), "Date of Birth 13 June,1990");
        Assert.assertEquals(practiceForm.returnhobbies(), "Hobbies Sports");
        Assert.assertEquals(practiceForm.returnaddress(), "Address Jane Sandanski");
        Assert.assertEquals(practiceForm.returnstatecity(), "State and City NCR Delhi");

        sleep(3000);
        practiceForm.click_close();


        sleep(3000);


    }

    //widgets click accordian click on all DONE
    @Test
    public void test14() {
        accordianPage.click_widgets();
        accordianPage.click_accordian();
        sleep(2000);
        accordianPage.click_comefrom();
        sleep(2000);
        accordianPage.click_whydoweuse();
        sleep(2000);

    }



    //widgets date change DONE
    @Test
    public void test15() {
        datePicker.click_widgets();
        datePicker.click_datePicker();
        sleep(2000);
        datePicker.date_picker("04/19/2000");
        sleep(2000);

    }

    //widgets date and time change DONE
    @Test
    public void test16() {
        datePicker.click_widgets();
        datePicker.click_datePicker();
        sleep(2000);
        datePicker.date_datetime("June 13, 2020 5:00 PM");
        sleep(2000);
    }


    //open NEW TAB DONE
    @Test
    public void test17() {
        browserWindows.click_alertframewindows();
        sleep(1000);
        browserWindows.click_broswerwindows();
        sleep(1000);
        browserWindows.click_newtab();
        sleep(2000);
        browserWindows.switchToWindow("");
        sleep(2000);
        browserWindows.closeTab();
        sleep(3000);

    }

    //open NEW window DONE
    @Test
    public void test18() {
        browserWindows.click_alertframewindows();
        sleep(1000);
        browserWindows.click_broswerwindows();
        sleep(1000);
        browserWindows.click_newwindow();
        sleep(3000);
    }

    //open New window message DONE
    @Test
    public void test19() {
        browserWindows.click_alertframewindows();
        sleep(1000);
        browserWindows.click_broswerwindows();
        sleep(1000);
        browserWindows.click_newwindowmessage();
        sleep(3000);

    }

    //click on alerts Button DONE
    @Test
    public void test20() {
        alertsPage.click_alertframewindows();
        sleep(1000);
        alertsPage.click_alerts();
        sleep(1000);
        alertsPage.click_onalertbutton();
        sleep(3000);
    }

    @Test
    public void test21() {
        framesPage.click_alertframewindows();
        sleep(3000);
        framesPage.click_onframes();
        sleep(3000);

    }

    @Test
    public void test22() {
        driver.navigate().to("https://demoqa.com/select-menu");
        sleep(1000);
        selectMenu.clickDropdown(0);
        sleep(1000);
        selectMenu.clickDropdown(1);
        sleep(1000);
        selectMenu.clickDropdown(2);
        sleep(2000);
    }

    @Test
    public void test23() {
        driver.navigate().to("https://demoqa.com/select-menu");
        sleep(1000);
        selectMenu.oldSelectMenu(5);
        sleep(2000);
    }

}
