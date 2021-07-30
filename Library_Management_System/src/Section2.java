public class Section2 {


    public void Physics() {
        System.out.println(" ");

        String phy[] = {"Quantum mechanics,Nuclear Physics,Atomic physics,Mechanics,Thermodynamics"};


        System.out.println("Books available in Physics section are as follows : ");
        for (int i = 0; i < phy.length; i++) {

            System.out.println(phy[i]);

        }


    }


    public void Mathematics(){
        System.out.println(" ");
        String math[]={"Algebra,Geometry,Statistics,Probability,Set theory"};

        System.out.println("Books available in Mathematics section are as follows : ");

        for(int j=0;j< math.length;j++){

            System.out.println(math[j]);
        }

    }



    public void Chemistry(){
        System.out.println(" ");
        String chem[]={"organic,inorganic,physical,biochemistry,analytical"};

        for (int k=0;k< chem.length;k++){

            System.out.println(chem[k]);
        }
    }



}
