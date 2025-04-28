public class Empresa{
    public static void main(String[] args) {
        Funcionario vendedor = new Vendedor(2000,500);
        Funcionario freeLancer = new FreeLancer(20,150);
        Funcionario gerente = new Gerente(4000);
        
        System.out.println("Salário do vendedor: " + obterSalarioFinal(vendedor));
        System.out.println("Salário do freeLancer: " + obterSalarioFinal(freeLancer));
        System.out.println("Salário do gerente: " + obterSalarioFinal(gerente));
    }

    public static double obterSalarioFinal(Funcionario funcionario){
        return funcionario.calcularSalarioFinal();
    }
}