
public class Main {
    public static void main (String args[]){
        System.out.println("Olá Soares");
        Cliente cliente = new Cliente();
        cliente.cadastraEndereco("Rua Conego");
        cliente.setCodigo(01);
        cliente.imprimirEndereco();
        cliente.imprimirCodigoCliente();
    }
}
