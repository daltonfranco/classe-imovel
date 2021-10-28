public class App{

    public static void main(String[] args){

        Novo novo = new Novo();

        Velho velho = new Velho();

        System.out.println("Imovel novo: ");

        novo.setEndereco("Jose Pereira Mendes");

        novo.setPreco(250000);

        novo.setAdicionalPreco(0.2 * novo.getPreco());

        System.out.println("Preco imovel novo: " + (novo.getPreco() + novo.getAdicionalPreco()));

        
        System.out.println("------------------------------------------------------");

        System.out.println("Imovel usado:");



        velho.setEndereco("Jacinto Melo Pinto");

        velho.setPreco(300000);

        velho.setDescontoPreco(0.1 * velho.getPreco());

        System.out.println("Preco imovel velho: " + (velho.getPreco() - velho.getDescontoPreco()));
       
    }
}