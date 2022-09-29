package tests.Practise06;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.DhtmlgoodiesTestPage;
import utilities.Driver;

import javax.swing.*;

public class P01 {

    // Go to URL : http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html
    // Fill in capitals by country.

    @Test
    public void test01() {
        Driver.getDriver().get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        DhtmlgoodiesTestPage dthmlgoodiesPage = new DhtmlgoodiesTestPage();

        Actions actions = new Actions(Driver.getDriver());

        actions.dragAndDrop(dthmlgoodiesPage.oslo,dthmlgoodiesPage.norway).perform();
        actions.dragAndDrop(dthmlgoodiesPage.seoul,dthmlgoodiesPage.soutkorea).perform();
        actions.dragAndDrop(dthmlgoodiesPage.madrid,dthmlgoodiesPage.spain).perform();
        actions.dragAndDrop(dthmlgoodiesPage.rome,dthmlgoodiesPage.italy).perform();
        actions.dragAndDrop(dthmlgoodiesPage.stockholm,dthmlgoodiesPage.sweden).perform();
        actions.dragAndDrop(dthmlgoodiesPage.washington,dthmlgoodiesPage.usa).perform();
        actions.dragAndDrop(dthmlgoodiesPage.copenhagen,dthmlgoodiesPage.denmark).perform();

      /*
        actions.dragAndDrop(dthmlgoodiesPage.oslo,dthmlgoodiesPage.norway).
                dragAndDrop(dthmlgoodiesPage.seoul,dthmlgoodiesPage.soutkorea).
                dragAndDrop(dthmlgoodiesPage.madrid,dthmlgoodiesPage.spain).
                dragAndDrop(dthmlgoodiesPage.rome,dthmlgoodiesPage.italy).
                dragAndDrop(dthmlgoodiesPage.stockholm,dthmlgoodiesPage.sweden).
                dragAndDrop(dthmlgoodiesPage.washington,dthmlgoodiesPage.usa).
                dragAndDrop(dthmlgoodiesPage.copenhagen,dthmlgoodiesPage.denmark).perform();
*/


    }
}
