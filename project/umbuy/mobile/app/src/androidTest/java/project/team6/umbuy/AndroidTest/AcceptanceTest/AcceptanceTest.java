package project.team6.umbuy.AndroidTest.AcceptanceTest;

/**
 * Created by yuanding on 2018-03-16.
 */

import android.support.design.widget.NavigationView;
import android.support.v7.widget.RecyclerView;
import android.test.ActivityInstrumentationTestCase2;
import android.view.View;

import com.robotium.solo.Solo;

import project.team6.umbuy.R;
import project.team6.umbuy.presentation.LoginActivity;
import project.team6.umbuy.presentation.MyAds;
import project.team6.umbuy.presentation.ProfilePageActivity;
import project.team6.umbuy.presentation.ViewAdsActivity;

public class AcceptanceTest extends ActivityInstrumentationTestCase2<LoginActivity>  {

    private Solo solo;

    public AcceptanceTest() {
        super(LoginActivity.class);
    }

    public void setUp() throws Exception {
        solo = new Solo(getInstrumentation(), getActivity());
    }

    @Override
    public void tearDown() throws Exception {
        solo.finishOpenedActivities();
    }

    public void testAllAcceptance() throws InterruptedException {
//
//        // **********************test login without correct credential ***************************
//        // make sure everything is completely layout
//        solo.assertCurrentActivity("wrong activity", LoginActivity.class);
//        assertTrue(solo.waitForText("Log In"));
//        assertTrue(solo.waitForText("Sign Up"));
//        assertTrue(solo.waitForText("Email"));
//        assertTrue(solo.waitForText("Password"));
//        assertTrue(solo.waitForText("Don't remember your password?"));
//
//       //  start testing login without a email or password
//        solo.clickOnText("LOG IN");
//        assertTrue(solo.searchText("Invalid Email Address"));
//        assertTrue(solo.searchText("Invalid Password"));
//
//        //start testing type wrong format email
//        solo.enterText(0, "1@.com");
//        assertTrue(solo.searchText("1@.com"));
//        assertTrue(solo.searchText("Invalid Email Address"));
//        solo.clearEditText(0);
//        // start testing login with wrong email or password
//        solo.enterText(0, "1@1.com");
//        assertTrue(solo.searchText("1@1.com"));
//        solo.enterText(1, "123");
//        assertTrue(solo.searchText("123"));
//        solo.clickOnText("LOG IN");
//      assertTrue(solo.searchText("THERE WAS AN ERROR PROCESSING THE SIGN IN"));
//
//
//      // start with valid email and password
//
////        Sign Up section
//        solo.clickOnText("Sign Up");
//
////        search everything
//        assertTrue(solo.searchText("Email"));
//        assertTrue(solo.searchText("Password"));
//        assertTrue(solo.searchText("By signing up, you agree to our terms of"));
//        assertTrue(solo.searchText("service and privacy policy"));
//        assertTrue(solo.searchText("SIGN UP"));
//
//        //start testing type wrong format email
//        solo.clearEditText(0);
//        solo.enterText(0, "qq@.com");
//        assertTrue(solo.searchText("qq@.com"));
//        assertTrue(solo.searchText("Invalid Email Address"));
//        solo.clearEditText(0);
//        // start testing login with valid email and  password
//        solo.enterText(0, "wow@umanitoba.ca");
//        assertTrue(solo.searchText("wow@umanitoba.ca"));
//        solo.enterText(1, "123");
//        assertTrue(solo.searchText("123"));
//        solo.clickOnText("SIGN UP");
//
//
//        // search for correct text when sign up with valid email and password
//
//        assertTrue(solo.searchText("FirstName"));
//        assertTrue(solo.searchText("LastName"));
//        assertTrue(solo.searchText("phone"));
//        assertTrue(solo.searchText("SIGN UP"));
//
//        //  testing register without fillout the name field and phone number
//        solo.clickOnText("SIGN UP");
//        assertTrue(solo.searchText("The value cannot be empty"));
//
//
//        // enter certain in register field and go to the viewAdsActivity
//
//        solo.enterText(0, "Franklin");
//        assertTrue(solo.searchText("Franklin"));
//        solo.enterText(1, "Bristow");
//        assertTrue(solo.searchText("Bristow"));
//        solo.enterText(2, "204-110110");
//        assertTrue(solo.searchText("204-110110"));
//        solo.clickOnText("SIGN UP");
//
//        //should go to loginActivity
//       // assertTrue(solo.waitForActivity(ViewAdsActivity.class));
//        solo.goBack();
//        solo.clickOnText("Log In");
//        solo.clearEditText(0);
//
//       //  ***************Testing login with correct credential*****************************
//
//        solo.searchEditText("Email");
//        solo.enterText(0, "1@1.com");
//        assertTrue(solo.searchText("1@1.com"));
//        solo.searchEditText("Password");
//        solo.enterText(1, "1");
//        assertTrue(solo.searchText("1"));
//        solo.clickOnText("LOG IN");
//
//
//        // *********Testing for ViewAdsActivity******************************************
//        solo.waitForActivity(ViewAdsActivity.class);
//       // solo.sleep(3000);
//        solo.assertCurrentActivity("Expected ViewAdsActivity", ViewAdsActivity.class);
//        assertTrue(solo.waitForView(RecyclerView.class));
//        View viewAdsView=solo.getCurrentActivity().findViewById(R.id.listViewAds);
//        assertEquals("Check viewads view not null", true, viewAdsView!=null);
//        assertEquals("Check RecylerView exists in viewAds page", true,viewAdsView instanceof RecyclerView);
//        assertTrue(solo.getView(R.id.toolbar) != null);
//        assertTrue(solo.getView(R.id.search_bar) != null);
//        assertTrue(solo.getView(R.id.search_button) != null);
//        assertTrue(solo.getView(R.id.main_create_ad) != null);
//        assertTrue(solo.getView(R.id.main_logout) != null);
//
//
//
//
//       // ********** testing on search**************
//       solo.scrollDown();
//       solo.scrollDown();
//       solo.scrollToTop();
//
//
//        //list the ads with matched title
//       solo.enterText(0, "Batman");
//       solo.clickOnButton(0);
//       solo.clearEditText(0);
//       assertTrue(solo.searchText("Batman"));
//
//       //test on empty input, show all the list
//        solo.enterText(0, "");
//        solo.clickOnButton(0);
//        solo.scrollToBottom();
//
//        //test for title not match
//        solo.clearEditText(0);
//        solo.enterText(0, "assertw");
//        solo.clickOnButton(0);
//        solo.clearEditText(0);
//        assertFalse(solo.searchText("assertw"));
//
//        // *********Testing On ViewAdsInfoActivity******************************************
//
//        solo.clearEditText(0);
//        solo.clickOnButton(0);
//
//        //click the first Item in the recyclerviewList
//        solo.clickInRecyclerView(0);
//
//        solo.assertCurrentActivity("Expected ViewAdsActivity", ViewAdsActivity.class);
//        assertTrue(solo.getView(R.id.view_ad_info_title) != null);
//        assertTrue(solo.getView(R.id.view_ad_info_category) != null);
//        assertTrue(solo.getView(R.id.view_ad_info_price) != null);
//        assertTrue(solo.getView(R.id.view_ad_info_description) != null);
//        assertTrue(solo.getView(R.id.view_ad_info_edit_btn) != null);
//
//        assertTrue(solo.waitForText("Title"));
//        assertTrue(solo.waitForText("Category"));
//        assertTrue(solo.waitForText("Price"));
//        assertTrue(solo.waitForText("Description"));
//
//        assertTrue(solo.searchText("Edit"));
//        assertTrue(solo.searchText("Dell laptop"));
//        solo.goBack();
//
//
//        // *********Testing On CreateAdActivity******************************************
//        solo.clickOnButton(1);
//        assertTrue(solo.waitForActivity(CreateAdActivity.class));
//        solo.assertCurrentActivity("Expected CreatedAdsActivity", CreateAdActivity.class);
//        assertTrue(solo.getView(R.id.create_ad_title_field) != null);
//        assertTrue(solo.getView(R.id.create_ad_description_field) != null);
//        assertTrue(solo.getView(R.id.create_ad_category_field) != null);
//        assertTrue(solo.getView(R.id.create_ad_price_field) != null);
//        assertTrue(solo.getView(R.id.create_ad_picture) != null);
//        assertTrue(solo.getView(R.id.create_ad_upload) != null);
//        assertTrue(solo.getView(R.id.create_ad_submit) != null);
//
//        assertTrue(solo.waitForText("Title*"));
//        assertTrue(solo.waitForText("Category"));
//        assertTrue(solo.waitForText("Price*"));
//        assertTrue(solo.waitForText("Description"));
//        assertTrue(solo.searchText("Upload"));
//        assertTrue(solo.searchText("Submit Advertisement"));
//
//        //Submit the newAds without edit anything
//         solo.clickOnText("Submit Advertisement");
//        assertTrue(solo.searchText("Please fill in all required field (*)"));
//
//        //submit with only title
//        solo.enterText(0, "AcceptanceTest");
//        solo.clickOnText("Submit Advertisement");
//        assertTrue(solo.searchText("Please input a valid price"));
//
//        //sumbit with only title and price
//        solo.enterText(1, "100");
//        solo.clickOnText("Submit Advertisement");
//        assertTrue(solo.waitForActivity(ViewAdsActivity.class));
//        solo.assertCurrentActivity("Expected ViewAdsActivity", ViewAdsActivity.class);
//        solo.enterText(0, "AcceptanceTest");
//        solo.clickOnButton(0);
//        solo.clearEditText(0);
//        assertTrue(solo.searchText("AcceptanceTest"));
//        assertTrue(solo.searchText("100"));
//
//        //submit with  completed form then sumbit
//
//        solo.clickOnButton(1);
//        assertTrue(solo.waitForActivity(CreateAdActivity.class));
//        solo.assertCurrentActivity("Expected CreatedAdsActivity", CreateAdActivity.class);
//        solo.enterText(0, "RobotiumTest");
//        assertTrue(solo.searchText("RobotiumTest"));
//
//        solo.enterText(1, "500");
//        assertTrue(solo.searchText("500"));
//
//        solo.enterText(2, "test");
//        assertTrue(solo.searchText("test"));
//
//        solo.enterText(3, "best test");
//        assertTrue(solo.searchText("best test"));
//
//        solo.clickOnText("Submit Advertisement");
//
//        assertTrue(solo.waitForActivity(ViewAdsActivity.class));
//        solo.assertCurrentActivity("Expected ViewAdsActivity", ViewAdsActivity.class);
//        solo.enterText(0, "RobotiumTest");
//        solo.clickOnButton(0);
//        solo.clearEditText(0);
//        assertTrue(solo.searchText("RobotiumTest"));
//        assertTrue(solo.searchText("500"));

        // *********Testing for Navigation ******************************************

        //*******test for Home*******
        NavigationView nagView = (NavigationView)solo.getView(R.id.nav_view);
         solo.clickOnActionBarHomeButton();

         solo.waitForText("Home");
         assertTrue(solo.waitForText("Log out"));

        assertTrue(solo.searchText("Home"));
        assertTrue(solo.searchText("My Ads"));
        assertTrue(solo.searchText("My Profile"));
        assertTrue(solo.searchText("Log out"));

        solo.clickOnText("Home");

        //********************test for My Profile*************************
        solo.clickOnActionBarHomeButton();
        assertTrue( solo.waitForText("Home"));
        assertTrue(solo.waitForText("Log out"));
        solo.clickOnText("My Profile");
        assertTrue(solo.waitForActivity(ProfilePageActivity.class));
        solo.assertCurrentActivity("Expected ProfilePageActivity",ProfilePageActivity.class);
        assertTrue(solo.searchText("First Name:"));
        assertTrue(solo.searchText("Last Name:"));
        assertTrue(solo.searchText("Email:"));
        assertTrue(solo.searchText("Phone:"));
        solo.clickOnText("Go Home");
        assertTrue(solo.waitForActivity(ViewAdsActivity.class));
        solo.assertCurrentActivity("Expected ViewAdsActivity", ViewAdsActivity.class);

        //*******************test for MyAds*************************
        solo.clickOnActionBarHomeButton();
        solo.clickOnText("My Ads");
        assertTrue(solo.waitForActivity(MyAds.class));
        solo.assertCurrentActivity("Expected MyAds", MyAds.class);
        assertTrue(solo.waitForView(RecyclerView.class));
        View viewMyAdsView=solo.getCurrentActivity().findViewById(R.id.listViewAds);
        assertEquals("Check viewads view not null", true, viewMyAdsView!=null);
        assertEquals("Check RecylerView exists in viewAds page", true,viewMyAdsView instanceof RecyclerView);
        assertTrue(solo.getView(R.id.search_bar) != null);
        assertTrue(solo.getView(R.id.search_button) != null);
        assertTrue(solo.getView(R.id.main_create_ad) != null);
        assertTrue(solo.getView(R.id.main_logout) != null);

       //test for search in myAds

        solo.enterText(0, "Acc");
        assertTrue(solo.searchText("Acc"));
        solo.clickOnButton(0);
        assertTrue(solo.searchText("AcceptanceTest"));
        assertTrue(solo.searchText("100"));

       //test for create in my Ads
        //check in the myAds list
        //also search in the viewAdsList

        //delete














    }
}
