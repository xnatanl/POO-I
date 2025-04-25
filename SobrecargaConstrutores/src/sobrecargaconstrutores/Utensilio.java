package sobrecargaconstrutores;

/**
 *
 * @author Natan
 */
public class Utensilio {
    private String nome;
    private String material;
    private String tamanho;

    public Utensilio(String nome, String material, String tamanho){
        this.material = material;
        this.nome = nome;
        this.tamanho = tamanho;
    }
    public String getNome() {
        return nome;
    }

    public String getMaterial() {
        return material;
    }

    public String getTamanho() {
        return tamanho;
    }
    
}