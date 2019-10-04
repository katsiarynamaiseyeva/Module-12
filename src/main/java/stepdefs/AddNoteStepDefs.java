package stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import element.NotesPopup;
import element.Popover;
import org.testng.Assert;
import page.*;

public class AddNoteStepDefs {


  Popover popover;
  NotesPopup comment;
  int numberOfNotesBefore;
  int numberOfNotesAfter;

  @And("^I navigate to forms$")
  public void iNavigateToForms() {
    new HamburgerMenu().navigateToForms();
  }

  @And("^I navigate to open tab$")
  public void iNavigateToOpenTab() {
    new OtherFormsPage().navigateToOpenTab();
  }

  @And("^I count number os notes$")
  public void iCountNumberOsNotes() {
    numberOfNotesBefore = new OtherFormsOpenTabPage().countNumberOfNotes();
  }

  @And("^I click on three dots$")
  public void iClickOnThreeDots() {
    popover = new OtherFormsOpenTabPage().clickOnThreeDots();
  }

  @And("^I open comment pop-up$")
  public void iOpenCommentPopUp() {
    comment = popover.openCommentPopup();
  }

  @And("^I add (.+)$")
  public void iAddText(String text) {
    comment.addComment(text);
  }

  @And("^I count notes$")
  public void iCountNotes() {
    OtherFormsOpenTabPage otherFormsOpenTabPage2 = new OtherFormsOpenTabPage();
    otherFormsOpenTabPage2.waitForNoteCounter2(numberOfNotesBefore + 1);
    numberOfNotesAfter = otherFormsOpenTabPage2.countNumberOfNotes();
  }

  @Then("^I assert added note$")
  public void iAssertAddedNote() {
    Assert.assertEquals(numberOfNotesAfter, numberOfNotesBefore + 1, "Note is not added");
  }
}
