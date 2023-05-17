package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class registroProdutosPage {
    private WebDriver navegador;

    public registroProdutosPage(WebDriver navegador) {
        this.navegador = navegador;
    }

    public preenchendoAtributosPage acessarFormulario(){

        navegador.findElement(By.linkText("ADICIONAR PRODUTO")).click();
        return new preenchendoAtributosPage(navegador) ;
    }
  
    public String capturarMensagem(){
    return navegador.findElement(By.cssSelector(".toast.rounded")).getText();
    }
}
