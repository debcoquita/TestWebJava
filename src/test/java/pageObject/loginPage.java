package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
    private WebDriver navegador;
    public loginPage(WebDriver navegador) {
        this.navegador = navegador;
    }
    public loginPage informarUsuario(String usuario){
        navegador.findElement(By.cssSelector("label[for='usuario']")).click();
        navegador.findElement(By.id("usuario")).sendKeys(usuario);
        return this;

    }
    public loginPage informarSenha(String senha){
        navegador.findElement(By.cssSelector("label[for='senha']")).click();
        navegador.findElement(By.id("senha")).sendKeys((senha));
        return this;
    }

    public registroProdutosPage submeterFormularioLogin(){
        navegador.findElement(By.cssSelector("button[type='submit']")).click();

        return new registroProdutosPage(navegador);

    }


}
