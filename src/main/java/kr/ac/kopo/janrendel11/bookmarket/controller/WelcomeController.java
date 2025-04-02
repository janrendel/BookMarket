package kr.ac.kopo.janrendel11.bookmarket.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @RequestMapping(value = "/home",method = RequestMethod.GET)
    public String welcomeMethod() {
        String welcomeHtml = "<!DOCTYPE html>\n" +
                "<html lang=\"en\" xmlns:th=\"http://www.thymeleaf.org\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>도서 목록</title>\n" +
                "    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\"\n" +
                "          rel=\"stylesheet\" integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\"\n" +
                "          crossorigin=\"anonymous\">\n" +
                "</head>\n" +
                "<body>\n" +
                "    <main>\n" +
                "        <div class=\"container py-4\">\n" +
                "            <header class=\"pb-3 mb-4 border-bottom\">\n" +
                "                <a href=\"/welcome.html\" class=\"d-flex align_items center text-body-emphasis tex-docration-none\">\n" +
                "                <svg width=\"32px\" height=\"32px\" viewBox=\"0 0 32 32\" version=\"1.1\" xmlns=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\" xmlns:sketch=\"http://www.bohemiancoding.com/sketch/ns\">\n" +
                "                    <g id=\"Page-1\" stroke=\"none\" stroke-width=\"1\" fill=\"none\" fill-rule=\"evenodd\" sketch:type=\"MSPage\">\n" +
                "                        <g id=\"Icon-Set-Filled\" sketch:type=\"MSLayerGroup\" transform=\"translate(-414.000000, -101.000000)\" fill=\"#000000\">\n" +
                "                            <path d=\"M418,101 C415.791,101 414,102.791 414,105 L414,126 C414,128.209 415.885,129.313 418,130 L429,133 L429,104 C423.988,102.656 418,101 418,101 L418,101 Z M442,101 C442,101 436.212,102.594 430.951,104 L431,104 L431,133 C436.617,131.501 442,130 442,130 C444.053,129.469 446,128.209 446,126 L446,105 C446,102.791 444.209,101 442,101 L442,101 Z\" id=\"book-album\" sketch:type=\"MSShapeGroup\">\n" +
                "                            </path>\n" +
                "                        </g>\n" +
                "                    </g>\n" +
                "                    </svg>\n" +
                "                    <span class=\"fs-4\">&nbsp;&nbsp;BookMarket</span>\n" +
                "                </a>\n" +
                "            </header>\n" +
                "\n" +
                "            <div class=\"p-5 mb-4 bg-body-tertiary rounded-3\">\n" +
                "                <div class=\"container-fluid py-5\">\n" +
                "                    <h1 class=\"display-5 fw-bold\">도서 목록</h1>\n" +
                "                    <p class=\"col-md-8 fs-4\">BookMarket</p>\n" +
                "                </div>\n" +
                "            </div>\n" +
                "\n" +
                "            <div class=\"row align-items-md-stretch text-center\">\n" +
                "                <div class=\"col-md-4\" th:each=\"book:${bookList}\">\n" +
                "                    <h3 th:text=\"${book.getName()}\"></h3>\n" +
                "                    <p th:text=\"${book.getAuthor()}\"></p>\n" +
                "                    <p th:text=\"${book.getPublisher() + '|' + book.getReleaseDate()}\"></p>\n" +
                "                    <p th:text=\"${book.getDescription()}\" align=\"left\"></p>\n" +
                "                    <p th:text=\"${book.getUnitPrice()} + '원'\"></p>\n" +
                "\n" +
                "                </div>\n" +
                "            </div>\n" +
                "\n" +
                "            <footer class=\"pt-3 mt-4 text-body-secondary border-top\">\n" +
                "                 <span class=\"text-body-secondery\">&copy; 2025 BookMarket</span>\n" +
                "            </footer>\n" +
                "        </div>\n" +
                "    </main>\n" +
                "</body>\n" +
                "</html>";

        return welcomeHtml;
    }
}
