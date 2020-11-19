package com.roomie.Web;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HttpRequestTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void homeShouldReturnDefaultMessage()throws Exception{
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/home",
                String.class)).contains("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "    <title>Roomiez</title>\n" +
                "    <link rel=\"stylesheet\" href=\"/Images/stylesheet/style.css\">\n" +
                "\n" +
                "</head>\n" +
                "\n" +
                "<div class=\"header\">\n" +
                "\n" +
                "\n" +
                "        <img class=\"roomiez\" src=\"/Images/images/Roomiez.png\"/>\n" +
                "\n" +
                "        <div class=\"links\">\n" +
                "            <a href=\"https://www.facebook.com\"><img class=\"facebook\" src=\"/Images/images/facebook.png\"/></a>\n" +
                "\n" +
                "            <a href=\"https://www.twitter.com\"><img class=\"twitter\" src=\"/Images/images/twitter.png\"/></a>\n" +
                "\n" +
                "            <a href=\"https://www.instagram.com\"><img class=\"insta\" src=\"/Images/images/insta.jpeg\"/></a>\n" +
                "\n" +
                "\n" +
                "    </div>\n" +
                "</div>\n" +
                "<br>\n" +
                "<body>\n" +
                "\n" +
                "<div class=\"mainpagecontainer\">\n" +
                "\n" +
                "<div class=\"homeh1\">\n" +
                "    <h1>Find your roomie today!</h1>\n" +
                "</div>\n" +
                "\n" +
                "\n" +
                "<h2>Discover your potential roommate</h2>\n" +
                "<h2>and newest friends here on <b>Roomiez</b></h2>\n" +
                "<br>\n" +
                "<br>\n" +
                "<br>\n" +
                "\n" +
                "\n" +
                "\n" +
                "<div class=\"alignbutton\">\n" +
                "<form method=\"get\" action=\"/Registration\">\n" +
                "    <input type=\"submit\" class=\"button\" id=\"signupbutton\" value=\"Join Today!\" align=\"center\">\n" +
                "</form>\n" +
                "</div>\n" +
                "    <br>\n" +
                "    <br>\n" +
                "    <br>\n" +
                "    <br>\n" +
                "    <br>\n" +
                "    <br>\n" +
                "    <br>\n" +
                "    <br>\n" +
                "    <br>\n" +
                "    <br>\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "</body>\n" +
                "</html>");
    }

}
