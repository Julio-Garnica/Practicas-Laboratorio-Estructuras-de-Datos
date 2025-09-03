public class MainPAlgoritmo {
    public static void main(String[] args) {
        PersonaCURP persona1 = new PersonaCURP("Navarro", "", "Lorena", "18/03/2000", "Mujer", "Guanajuato", "");
        PersonaCURP persona2 = new PersonaCURP("Garnica", "", "Julio", "30/08/2000", "Hombre", "Guanajuato", "");
        PersonaCURP persona3 = new PersonaCURP("Macias", "Padilla", "Diane", "04/12/2000", "Mujer", "Guanajuato", "");
        PersonaCURP persona4 = new PersonaCURP("Garnica", "", "Katia", "22/03/1974", "Mujer", "Guanajuato", "");
        PersonaCURP persona5 = new PersonaCURP("Garnica", "Renteria", "Rosa", "04/09/1948", "Mujer", "Guanajuato", "");

        PersonaCURP[] personasCURP = { persona1, persona2, persona3, persona4, persona5 };
        String[] CURPs = PAlgoritmo.guardarCURP(personasCURP);
        System.out.println("Este es el arreglo original de las personas: \n" + PAlgoritmo.imprimeArreglo(personasCURP));
        System.out.println("Y este es su arreglo de sus CURP:");
        System.out.println(PAlgoritmo.imprimeArreglo(CURPs));
        System.out.println("\n");
    }
}
