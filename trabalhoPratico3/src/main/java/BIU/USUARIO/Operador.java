package BIU.USUARIO;

public class Operador {
    private String codigo;
    private String nome;
    private String cede;
    
    private CategoriaOperador categoria;

    public Operador(String codigo,String nome,String cede,int categoria){
        setCodigo(codigo);setCede(cede);setNome(nome);setCategoriaOperador(categoria);
    }

    public String getCodigo() {return codigo;}

    private void setCodigo(String codigo) {this.codigo = codigo;}

    public String getNome() {return nome;}

    private void setNome(String nome) {this.nome = nome;}

    public String getCede() {return cede;}

    private void setCede(String morada) {this.cede = morada;}
    private void setCategoriaOperador(int categoria){
        if(categoria==0){this.categoria=CategoriaOperador.Terrestre;}
        else if(categoria==1){this.categoria=CategoriaOperador.Maritimo;}
        else if(categoria==2){this.categoria=CategoriaOperador.Aereo;}
    }
    public void emitirLote(int codigo,int TotalLugares,double preco){
        Lote lote=new Lote(codigo,TotalLugares,preco);
    }
}
