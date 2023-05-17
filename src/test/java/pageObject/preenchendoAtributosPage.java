package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class preenchendoAtributosPage {
    private WebDriver navegador;
    public preenchendoAtributosPage(WebDriver navegador) {
        this.navegador = navegador;

    }
    public preenchendoAtributosPage informarNome(String produtoNome) {
        navegador.findElement(By.cssSelector("label[for='produtoNome']")).sendKeys(produtoNome);
        return this;
    }
    public preenchendoAtributosPage informarValor(String produtoValor){
        navegador.findElement(By.cssSelector("label[for='produtovalor']")).sendKeys(produtoValor);
        return this;
    }

    public preenchendoAtributosPage informarCor(String produtoCor){
        navegador.findElement(By.name("produtocores")).sendKeys(produtoCor);
        return this;
    }
    public registroProdutosPage submeterProdutoComErro(){
        navegador.findElement(By.cssSelector("button[type='submit']")).click();
        return new registroProdutosPage(navegador);
    }
}
