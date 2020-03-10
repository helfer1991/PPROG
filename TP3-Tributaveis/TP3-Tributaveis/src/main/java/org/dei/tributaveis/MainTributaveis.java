package org.dei.tributaveis;

public class MainTributaveis {

    public static void main(String[] args) {
        Veiculo v1 = new Veiculo("22-33-CC", 1000, "encarnado");
        System.out.println("v1");
        
        Veiculo v2 = new Veiculo("44-55-DD", 2500, Cores.AZUL);
        System.out.println(v2);
        
        Veiculo v3 = new Veiculo("11-22-BB", 1400, Veiculo.VERDE);
        System.out.println(v3);
        
        Moradia m1 = new Moradia("Rua do Bocage", 90, Moradia.CINZENTO);
        System.out.println(m1);
        
        //13 interface define um novo tipo de dados. Cores, neste caso, passa a ser um novo tipo de dados. Mas nao posso criar instancias de interfaces, ate por nao ter construtores
        Cores c;
        c = v1;
        c = m1;
        
        Object[] tributaveis = new Object[10]; //para evitar o downcasting na linha 32, basta-me escolher Tributavel ao inves de Object na declaracao deste array
        tributaveis[0] = v1;
        tributaveis[1] = v2;
        tributaveis[2] = v3;
        tributaveis[3] = m1;
        
        float totalImposto = 0;
        for(int i = 0; i < tributaveis.length; i++) {
            if(tributaveis[i] != null) {
                totalImposto += ((Tributavel)tributaveis[i]).calcularImposto();
            }
        }
        System.out.println(totalImposto);
        
        /*
        nos testes
        em Arrange ponho:
        Moradia instance = new Moradia("...", 98, Moradia.AZUL)
        
        no Act ponho:
        float result = instance.CalcularImposto();
        float expected = 198;
        
        no assert ponho
        asserEquals(expected, result, 0.0);
        */
    }
    
}
