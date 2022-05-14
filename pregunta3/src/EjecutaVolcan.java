import java.util.Scanner;
public class EjecutaVolcan {

    public static void main(String[] args){
        String cadena="2-4>3-5>1-6";
            /*System.out.println("Ingrese la de la siguiente forma ord-nAst>ord2-nAst2 :");
            Scanner sc=new Scanner(System.in);


            String cadena=ca.next();

             */
            String[] separados= cadena.split(">");



            for(String s: separados){
                String[] a=s.split("-");
                int orden=Integer.valueOf(a[0]);
                int cantAst=Integer.valueOf(a[1]);
                System.out.println("IMPRIMIENDO EL CASO "+orden);
                System.out.println("IMPRIMIENDO EL nivel "+cantAst);
                for(int i=1;i<=cantAst;i++){
                    for(int vacio=1;vacio<=cantAst-i;vacio++){
                        System.out.print(" ");
                    }
                    for(int j=1;j<=(Math.pow(2,i));j++){
                        System.out.print("*");
                    }
                    System.out.println();

                }

            }

    }

}
