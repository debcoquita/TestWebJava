package modulos;

import java.time.Duration;

import org.asynchttpclient.util.Assertions;
import org.junit.Test;
import org.openqa.selenium.By;
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
        //Tempo de espera padrão
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //navegar na home page
        navegador.get("http://165.227.93.41/lojinha-web/v2/");
        //fazer login
        navegador.findElement(By.cssSelector("label[for='usuario']")).click();
        navegador.findElement(By.id("usuario")).sendKeys("admin");
        navegador.findElement(By.cssSelector("label[for='senha']")).click();
        navegador.findElement(By.id("senha")).sendKeys("admin");
        navegador.findElement(By.cssSelector("button[type='submit']")).click();

        //tela de registro de produtos
        navegador.findElement(By.linkText("ADICIONAR PRODUTO")).click();

        //preenchendo os dados do produto
        navegador.findElement(By.id("produtonome")).sendKeys("Oculos");
        navegador.findElement(By.id("produtovalor")).sendKeys("000");
        navegador.findElement(By.name("produtocores")).sendKeys("preto com astes prata");

        //registrar produto com valor zero
        navegador.findElement(By.cssSelector("button[type='submit']")).click();
        //validar mensagem de erro
        //<div class="toast rounded" style="top: 0px; transition: transform 0.2s ease 0s, opacity 0.2s ease 0s;">O valor do produto deve estar entre R$ 0,01 e R$ 7.000,00</div>
        final String mensagemToast = navegador.findElement(By.cssSelector(".toast.rounded")).getText();
        Assertions.assertNotEmpty("O valor do produto deve estar entre R$ 0,01 e R$ 7.000,00", mensagemToast);
        
        //fechar browser
        navegador.quit();
    }



}