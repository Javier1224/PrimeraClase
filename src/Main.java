public class Main
{
    public static void main(String[] args)
    {
        int resultado=suma(5, 6, 7);
        System.out.println(resultado);
        coche renault= new coche();
        renault.aumentar_puertas();
        renault.aumentar_puertas();
        System.out.println(renault.numero_puertas());
    }
    public static int suma(int a, int b, int c)
    {
        return a+b+c;
    }
}

class coche
{
    public int puertas=0;
    public void aumentar_puertas()
    {
        puertas++;
    }
    public int numero_puertas()
    {
        return puertas;
    }
}