//Codificado por: sAfOrAs
//Identifica los numeros capicuas dando 2 parámetros como rango.
public class SyGNumerosCapicuas
{
    static SyGNumerosCapicuas numero = new SyGNumerosCapicuas();
     
    void defineCapicuas(int limiteMin,int limiteMax)
    {
            SyGNumerosCapicuas num = new SyGNumerosCapicuas();
            int numeroInvertidoOut[]=new int[limiteMax-limiteMin+1];            
            int j=0;            
            for(int i=limiteMin;i<=limiteMax;i++)
            {
                numeroInvertidoOut[j]=num.invertirNumero(i);
                 
                if(i==numeroInvertidoOut[j])
                {
                    System.out.println(i+" \t es capicua.");
                }
                j++;        
            }   
             
    }
     
    int invertirNumero(int i)
    {   
     
        int numeroAux=0;
         
        int numeroInvertido=0;
            numeroAux=i;
 
            numeroInvertido=numeroAux%10;
 
            while(numeroAux>9)
            {
                numeroAux=numeroAux/10;
                numeroInvertido=numeroInvertido*10 + numeroAux%10;
            }
 
 
        return numeroInvertido;
         
 
    }
 
    public static void main(String[] args)
    {
        SyGNumerosCapicuas numero = new SyGNumerosCapicuas();
        int limiteMax=0,limiteMin=0;
        if(args.length<=1||args.length>2)
            System.out.println("Ingrese solo los parámetros [Rango Minimo - Rango Máximo]: ");
        else if(args.length==2)
        {
             
            limiteMin=Integer.parseInt(args[0]);
            limiteMax=Integer.parseInt(args[1]);
            numero.defineCapicuas(limiteMin,limiteMax);
             
        }
    }
}
