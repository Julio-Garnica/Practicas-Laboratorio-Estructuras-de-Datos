public class PersonaCURP implements TDAPersona {
    private String primerApellido;
    private String segundoApellido;
    private String nombre;
    private String fechaNacimiento;
    private String genero;
    private String entidadFederativa;
    private final String numeroCuentaUNAM = "420095390";

    public PersonaCURP(String primerApellido, String segundoApellido, String nombre,
            String fechaNacimiento, String genero, String entidadFederativa, String numeroCuentaUNAM) {
        this.primerApellido = primerApellido.toUpperCase();
        this.segundoApellido = segundoApellido != null ? segundoApellido.toUpperCase() : "";
        this.nombre = nombre.toUpperCase();
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero.toUpperCase();
        this.entidadFederativa = entidadFederativa.toUpperCase();
    }

    @Override
    public String devPL1Apellido() {
        return primerApellido.substring(0, 2);
    }

    @Override
    public String devPL2Apellido() {
        return segundoApellido.isEmpty() ? "X" : segundoApellido.substring(0, 1);
    }

    @Override
    public String devPLNombre() {
        return nombre.substring(0, 1);
    }

    @Override
    public String devFechaNacimiento() {
        String[] partes = fechaNacimiento.split("/");
        String dia = partes[0];
        String mes = partes[1];
        String anio = partes[2].substring(2);
        return anio + mes + dia;
    }

    @Override
    public String devGenero() {
        if (genero.startsWith("H"))
            return "H";
        if (genero.startsWith("M"))
            return "M";
        return "";
    }

    @Override
    public String devEntidadFederativa() {
        switch (entidadFederativa) {
            case "AGUASCALIENTES":
                return "AS";
            case "BAJA CALIFORNIA":
                return "BC";
            case "BAJA CALIFORNIA SUR":
                return "BS";
            case "CAMPECHE":
                return "CC";
            case "COAHUILA":
                return "CL";
            case "COLIMA":
                return "CM";
            case "CHIAPAS":
                return "CS";
            case "CHIHUAHUA":
                return "CH";
            case "CIUDAD DE MEXICO":
            case "DISTRITO FEDERAL":
                return "DF";
            case "DURANGO":
                return "DG";
            case "GUANAJUATO":
                return "GT";
            case "GUERRERO":
                return "GR";
            case "HIDALGO":
                return "HG";
            case "JALISCO":
                return "JC";
            case "MEXICO":
                return "MC";
            case "MICHOACAN":
                return "MN";
            case "MORELOS":
                return "MS";
            case "NAYARIT":
                return "NT";
            case "NUEVO LEON":
                return "NL";
            case "OAXACA":
                return "OC";
            case "PUEBLA":
                return "PL";
            case "QUERETARO":
                return "QT";
            case "QUINTANA ROO":
                return "QR";
            case "SAN LUIS POTOSI":
                return "SP";
            case "SINALOA":
                return "SL";
            case "SONORA":
                return "SR";
            case "TABASCO":
                return "TC";
            case "TAMAULIPAS":
                return "TS";
            case "TLAXCALA":
                return "TL";
            case "VERACRUZ":
                return "VZ";
            case "YUCATAN":
                return "YN";
            case "ZACATECAS":
                return "ZS";
            case "NACIDO EN EL EXTRANJERO":
                return "NE";
            default:
                return "NE";
        }
    }

    @Override
    public String devConsonantes() {
        String cons1Apellido = obtenerPrimeraConsonante(primerApellido, 2);
        String cons2Apellido = segundoApellido.isEmpty() ? "X" : obtenerPrimeraConsonante(segundoApellido, 1);
        String consNombre = obtenerPrimeraConsonante(nombre, 1);
        return cons1Apellido + cons2Apellido + consNombre;
    }

    private String obtenerPrimeraConsonante(String palabra, int indice) {
        String vocales = "AEIOU";
        for (int i = indice; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);
            if (!vocales.contains(String.valueOf(letra)) && Character.isLetter(letra)) {
                return String.valueOf(letra);
            }
        }
        return "X";
    }

    @Override
    public String devUltimosDigitos() {
        return numeroCuentaUNAM.substring(numeroCuentaUNAM.length() - 2);
    }

    @Override
    public String calcularCURP() {
        return devPL1Apellido() +
                devPL2Apellido() +
                devPLNombre() +
                devFechaNacimiento() +
                devGenero() +
                devEntidadFederativa() +
                devConsonantes() +
                devUltimosDigitos();
    }

    public String toString() {
        return nombre + " " + primerApellido + (segundoApellido.isEmpty() ? "" : " " + segundoApellido)
                + " | Fecha de nacimiento: " + fechaNacimiento + " | Genero: " + genero + " | Entidad Federativa: "
                + entidadFederativa;
    }

    public static void main(String[] args) {
        PersonaCURP persona1 = new PersonaCURP("Lozano", "Garnica", "Julio",
                "30/08/2000", "Hombre", "Guanajuato", "");
        System.out.println("CURP con 2 apellidos: " + persona1.calcularCURP());

        PersonaCURP persona2 = new PersonaCURP("Garnica", "", "Julio",
                "30/08/2000", "Hombre", "Guanajuato", "");
        System.out.println("CURP sin 2do apellido: " + persona2.calcularCURP());
    }
}