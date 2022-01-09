package pages;

import models.Ticket;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

/** Страница со списком тикетов */
public class TicketsPage extends HelpdeskBasePage {

    @FindBy (xpath = "//div[@class='tickettitle']/a")
    private WebElement TitleSearch;

    // todo: элементы страницы поиска тикетов

    public TicketsPage() {
        PageFactory.initElements(driver, this);
    }

    /** Ищем строку с тикетом и нажимаем на нее */
    public void openTicket() {

//        List <WebElement> search = driver.findElements(By.xpath("//*[@id='ticketTable']/tbody/tr/td/div/a"));
//        for (WebElement a : search){
//            if(a.getText().equals(ticket.getTitle())){
//                a.click();
//            }
        TitleSearch.click();
        // todo: найти и открыть тикет
    }
}
