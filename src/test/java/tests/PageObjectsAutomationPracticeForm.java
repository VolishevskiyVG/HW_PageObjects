package tests;

import org.junit.jupiter.api.Test;

public class PageObjectsAutomationPracticeForm extends TestBase {

    @Test
    void fillFormTest() {
        String userName = "Vasili",
                lastName = " Volishevskii",
                email = "Volishevskii@mail.ru",
                gender = "Male",
                phone = "7877987897",
                day = "30",
                month = "July",
                year = "2008",
                subject = "English",
                file = "img/image_2022-11-11_17-13-46.png",
                hobbies = "Reading",
                Address = "Krasnodar street gorkogo 53",
                state = "Uttar Pradesh",
                city = "Merrut";

        registrationPage.openPage()
                .setFirstName(userName)
                .setLastName(lastName)
                .setEmail(email)
                .setGender(gender)
                .setPhone(phone)
                .setBirthDate(day, month, year)
                .setSubjects(subject)
                .setLoadPicture(file)
                .setHobbiesWrapper(hobbies)
                .setAddress(Address)
                .setState(state)
                .setCity(city)
                .setSubmit();

        registrationPage.verifyResultsModalAppears()
                .verifyResult("Student Name", "Vasili Volishevskii")
                .verifyResult("Student Email", "Volishevskii@mail.ru")
                .verifyResult("Gender", "Male")
                .verifyResult("Mobile", "7877987897")
                .verifyResult("Date of Birth", "30 July,2008")
                .verifyResult("Subjects", "English")
                .verifyResult("Hobbies", "Reading")
                .verifyResult("Picture", "image_2022-11-11_17-13-46.png")
                .verifyResult("Address", "Krasnodar street gorkogo 53")
                .verifyResult("State and City", "Uttar Pradesh Merrut");


    }

}
