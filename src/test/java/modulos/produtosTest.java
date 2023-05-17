package modulos;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@DisplayName("testes web do Modulo de Produtos")

public class produtosTest {
    @Test
    @DisplayName("não é permitido registrar produto com valor igual a zero")
    public void testNaoPermiteValorZero() {
        //abrir navegador
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        //maximizar 
        navegador.manage().window().maximize();
        //navegar na home page
        navegador.get("htpp://165.227.93.41/lojinha-web/v2/");
        //fazer login
        
        //registrar produto com valor zero
        //fechar browser
    }



}