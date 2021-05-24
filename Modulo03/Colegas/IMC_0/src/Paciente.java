
  import java.util.Scanner;
        public class Paciente {

            String nome;
            double peso=0.0;
            double altura=0.0;
            double imc;


           Scanner sc=new Scanner(System.in);

            public Paciente() {


            }

            void dadosPaciente() {

                System.out.println("CADASTRO DO PACIENTE");

                System.out.println("digite o nome do paciente");
                nome=sc.nextLine();

                System.out.println("Digite o peso");

                peso=sc.nextDouble();
                System.out.println("digite a altura");
                altura=sc.nextDouble();




            }







            double calculaIMC() {
                double v=0.0;

                 this.altura=altura;
                 this.peso=peso;
                v = peso /( altura * altura);
                return v;
            }


            public void diagnostico() {
              imc=calculaIMC();

                System.out.println("Paciente"+ " "+ nome);
                System.out.println("Seu Indice de massa corporal eh " + imc + "Kg/m2");
                if(imc<16.0 ) {
                    System.out.println("Diagnostico: Baixo Peso Muito grave");
                }

                if(imc>=16.0 && imc<=16.99 ) {
                    System.out.println("Diagnostico: Baixo Peso Grave");
                }

               if(imc>=17.0 && imc<=18.49 ) {
                   System.out.println("Diagnostico: Baixo Peso");
               }

                if(imc>=18.50 && imc<=24.99){


                    System.out.println("Diagnostico:Peso normal");
                }


                if(imc>25.00 && imc<=29.99){


                    System.out.println("Diagnostico:Sobrepeso");
                }

                if(imc>= 30.00 && imc<=34.99){


                    System.out.println("Diagnostico:Obesidade Grau I");
                }
                if(imc>=35.00 && imc<=39.99){


                    System.out.println("Diagnostico Obesidade grau II");
                }
                if(imc>=40.00){


                    System.out.println("Diagnostico:Obesidade grau III(Obesidade Morbida");
                }

            }

        }
