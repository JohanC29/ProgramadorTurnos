import java.util.*;

public class Carga {

    private ArrayList<Turno> turnos;
    private ArrayList<Personal> listaPersonal;

    private String[] nombres = {"ESTEFANIA",
            "QUERALT",
            "JOAN",
            "JOAN",
            "MARC",
            "JOSEP",
            "ESTHER",
            "LAURA",
            "RAQUEL",
            "JOAN",
            "MARIA ISABEL",
            "ADRIÀ",
            "GERARD",
            "ELIOT",
            "JORDI",
            "LLUÍS",
            "LAURA",
            "JORDI",
            "DOUNYA",
            "JULIO",
            "ANDREU",
            "RAMON",
            "DAVID-JESE",
            "ARAN",
            "GEMMA",
            "IVAN",
            "DAVID",
            "XAVIER",
            "MARIO",
            "JESUS",
            "GEMMA",
            "SILVIA",
            "ALBERT",
            "MARIA",
            "BERTA",
            "BERTA",
            "MIREIA",
            "GEMMA",
            "MARIA ISABEL",
            "TONI",
            "ALEJANDRO",
            "JOAN MARTÍ",
            "INGRID",
            "OLIVER",
            "SANDRA",
            "JORDI",
            "MARC",
            "JORDINA",
            "MARIA JOSÉ",
            "RAQUEL",
            "ENRIC",
            "MARTA",
            "CARLA",
            "MARIA NOELIA",
            "CRISTINA",
            "CARLOS",
            "DAVID",
            "CRISTIAN",
            "JULIO ALBERTO",
            "SERGI",
            "ALEIX",
            "VERÒNICA",
            "MARIONA",
            "MARC",
            "GEMMA",
            "RICARD",
            "JUAN",
            "MARTA",
            "NATÀLIA",
            "MARTA",
            "LAURA",
            "JOAN",
            "ALEXIA",
            "FERRAN",
            "CRISTINA",
            "JOSÉ ANTONIO",
            "JORDI",
            "BEGONYA",
            "INGRID",
            "MIQUEL",
            "AGUSTÍ",
            "ANTONI",
            "JOAN",
            "MÒNICA",
            "GERARD",
            "GEMMA",
            "MARIA",
            "ORIOL",
            "VIRGINIA",
            "DAMIÀ",
            "VALENTÍ",
            "AINA",
            "DAVID",
            "GERARD",
            "MARTA",
            "MIREIA",
            "ELOI",
            "ANNA",
            "ALBA",
            "SANDRA",
            "ERIC",
            "LLUÍS",
            "CRISTIAN",
            "GUILLEM",
            "DIMAS",
            "ANA INÉS",
            "IVET",
            "JÚLIA",
            "DANIEL",
            "ABEL",
            "IRENE",
            "ADRIÀ",
            "JAIRO",
            "CRISTINA",
            "DAVID",
            "ADRIÀ",
            "LUCIA",
            "CARLA",
            "ADRIÀ",
            "MARTA",
            "MARC",
            "ALEX"
    };
    private String[] apellidos = {"AROCAS PASADAS",
            "VISO GILABERT",
            "AYALA FERRERAS",
            "BAEZ TEJADO",
            "BASTARDES SOTO",
            "ANGUERA VILAFRANCA",
            "PASCUAL ALOY",
            "VALLÉS GIRVENT",
            "RAYA GARCIA",
            "ANDREU CRUZ",
            "BARALDÉS COMAS",
            "BERENGUERAS CULLERÉS",
            "LÓPEZ DE PABLO GARCIA UCEDA",
            "ARNAU MORENO",
            "RAYA GAVILAN",
            "ZAMBUDIO FIGULS",
            "BIDAULT CULLERÉS",
            "BIOSCA FONTANET",
            "ZAFRA FIGULS",
            "ALEU ICART",
            "BADIA TORNÉ",
            "MORALES GESE",
            "BLANCO FONTANET",
            "ALVAREZ FERNÁNDEZ",
            "GARCIA ALMOGUERA",
            "LIBORI FIGUERAS",
            "BIDAULT PUEYO",
            "BENITEZ JOSE",
            "PASCUAL FLORES",
            "AYALA TORNÉ",
            "LISTAN FIGUERAS",
            "RASERO GAVILAN",
            "ARNALOT PUIG",
            "MOLINER GARRIDO",
            "GALOBART GARCIA",
            "LÓPEZ GARRIGASSAIT",
            "SÁNCHEZ GÓMEZ",
            "ALAVEDRA SUNYÉ",
            "ALIGUÉ BONVEHÍ",
            "MAS FRANCH",
            "ALOY COMPTE",
            "ASENSIO VEGA",
            "BIDAULT PÉREZ",
            "ALOY CODINACHS",
            "ALTIMIRAS ARMENTEROS",
            "BELMONTE SÁNCHEZ",
            "BAJONA GARCIA",
            "AGUILAR RODRIGUEZ",
            "BARRIGA SOTO",
            "AVILA MASJUAN",
            "PARRAMON FLORES",
            "AGUILAR RAMOS",
            "AYALA ALSINA",
            "ALVAREZ TROYANO",
            "ALINS GONZÁLEZ",
            "ACUÑA TORT",
            "ALGUÉ TRANCHO",
            "BADIA CASTILLO",
            "BENITEZ FLORES",
            "TORRUELLA GARCIA",
            "ALBERICH RODRIGUEZ",
            "ARMENCOT PUIG",
            "ALIGUÉ RIVERA",
            "BARRIGA RIU",
            "PORTELLA GISPETS",
            "AGUILERA BAENA",
            "RODRIGUEZ GARCÍA",
            "AGUILAR SUNYÉ",
            "BARRIGA TARDÀ",
            "BARCONS LARA",
            "AGUILERA TATJÉ",
            "ALEU PRAT",
            "VALLÉS GIRVENT",
            "MOLINA GARRIDO",
            "ARISSA HERMOSO",
            "BARALDÉS PARDO",
            "SUAREZ GARZÓN",
            "ARPA MORENO",
            "ALOY FARRANDO",
            "LUQUE GARRIGASAIT",
            "RIDÓ GÓMEZ",
            "SANTAMARIA FLOTATS",
            "HERMS GÓMEZ",
            "ARTIGAS MATURANO",
            "AGUILAR MASANA",
            "ALTIMIRAS SERAROLS",
            "TORRESCASANA GARCIA",
            "ARIZA PUIGBÓ",
            "ALVAREZ ARMENTEROS",
            "BARALDÉS TARRAGÓ",
            "GARCIA GARCÍA",
            "AROCA GÓMEZ",
            "ALONSO RODRIGUEZ",
            "CANO GÓMEZ",
            "ALCAIDE MOLINA",
            "AGUILERA PRAT",
            "ALAPONT ICART",
            "RIVERO FLORIDO",
            "AVILA MASJUAN",
            "GRANADOS ANDRÉS",
            "FERRER GASSET",
            "AMIGO MODREGO",
            "ABDIN TATJÈ",
            "CANELLAS GOMEZ",
            "HIDALGO ALTIMIRAS",
            "BASTARDAS FRANCH",
            "ABADIAS MASANA",
            "AREVALO SANCHEZ",
            "ALINS MULET",
            "GARCIA GONZÁLEZ",
            "ALVAREZ PARCERISA",
            "CASAS ANDRÉS",
            "MORALES GESE",
            "BARALDÉS MARTORELL",
            "AROCA GÓMEZ",
            "RUEDA ALVAREZ",
            "ALVAREZ DOMENECH",
            "BOIX GONZÁLEZ",
            "BARALDÉS MONRÓS",
            "AGUILERA MERINO",
            "BAREA D'HAENE",
            "BARROSO D'HAENE"
    };

    private String[] nombreEmpresas ={"Sabor Natural",
            "Yummy Café",
            "Fresh Food",
            "Deli Munchies",
            "Come Rico",
            "El tenedor de oro",
            "Reyes de la cocina",
            "Rock & Food"
    };


    public Carga(int cantPersonal, int cantTurnos) {
        this.datosAleatorios(cantPersonal, cantTurnos);
    }

    public ArrayList<Turno> getTurnos() {
        return turnos;
    }

    public ArrayList<Personal> getListaPersonal() {
        return listaPersonal;
    }


    public void datosAleatorios(int cantPersonal, int cantTurnos) {

        this.turnos = new ArrayList<>();

        // Generamos la lista de personas de manera aleatoria
        this.generateRandomListPersonal(cantPersonal);
        this.generateTurnos(cantTurnos);

    }

    public void generateRandomListPersonal(int cantPersonal) {

        this.listaPersonal = new ArrayList<>();
        String nombre;
        int id;
        int edad;

        for (int i = 0; i < cantPersonal; i++) {
            Personal personal = null;
            id = i + 1;
            nombre = this.nombreApellidoRando();
            edad = this.getRandomNumber(0, 65);
            IVehiculo iVehiculo = null;

            // Tipo de vehiculo de manera aleatoria
            if (this.randomBolean()) {
                iVehiculo = new Automovil(this.placaRandom(), this.getRandomNumber(2015,2023).toString(), this.getRamdonMarcaAutomovil());
            } else {
                iVehiculo = new Motocicleta(this.placaRandom(), this.getRandomNumber(2015,2023).toString(), this.getRamdonMarcaMotocicleta());
            }

            // Tipo de personal de manera aleatoria
            if (this.randomBolean()) {
                // Tipo de personal Medio Tiempo o Completo
                if (this.randomBolean()) {
//                    personal = new Mensajero(id, nombre, edad, iVehiculo);
                    personal = new MensajeroTiempoCompleto(id, nombre, edad, iVehiculo);
                }
                else {
                    personal = new MensajeroMedioTiempo(id, nombre, edad, iVehiculo);
                }
            } else {
                // Tipo de personal Medio Tiempo o Completo

                if (this.randomBolean()) {
//                    personal = new Domiciliario(id, nombre, edad, iVehiculo);
                    personal = new DomiciliarioTiempoCompleto(id, nombre, edad, iVehiculo);
                }
                else {
                    personal = new DomiciliarioMedioTiempo(id, nombre, edad, iVehiculo);
                }
            }
            this.listaPersonal.add(personal);
        }
    }

    public void generateTurnos(int cantTurnos){
        // Obtenemos la fecha de hoy
        Date date = this.dateNow();
        for (int i = 0; i < cantTurnos; i++) {
            Date fechaTurno = this.sumarRestarDiasFecha(date,i);
            Empresa empresa = new Empresa(this.nombreEmpresasRandom(),this.getRandomNumber(1,10));
            ArrayList<Personal> listPersonal = this.seleccionRandomPersonal(this.listaPersonal,this.getRandomNumber(1,this.listaPersonal.size()-1));
            this.turnos.add(new Turno(fechaTurno,empresa,listPersonal));
        }
    }

    public String nombreApellidoRando() {
        return this.nombres[this.getRandomNumber(0, (this.nombres.length - 1))] + " " + this.apellidos[this.getRandomNumber(0, (this.apellidos.length - 1))];
    }

    public String nombreEmpresasRandom() {
        return this.nombreEmpresas[this.getRandomNumber(0, (this.nombreEmpresas.length - 1))];
    }

    public String placaRandom() {
        String resultado = "";
        for (int i = 0; i < 3; i++) {
            resultado += this.getRandomChar();
        }
        for (int i = 0; i < 3; i++) {
            resultado += this.getRandomNumber(0, 9);
        }
        return resultado;
    }

    public String tipoVehiculoRamdom() {
        return this.randomBolean() ? "Moto" : "Carro";
    }

    public static boolean randomBolean() {
        return ((int) Math.round(Math.random()) == 1) ? true : false;
    }

    public Integer getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public char getRandomChar() {
        Random r = new Random();
        char c = (char) (r.nextInt(26) + 'a');
        return c;
    }


    // Suma los días recibidos a la fecha
    public Date sumarRestarDiasFecha(Date fecha, int dias) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fecha); // Configuramos la fecha que se recibe
        calendar.add(Calendar.DAY_OF_YEAR, dias);  // numero de días a añadir, o restar en caso de días<0
        return calendar.getTime(); // Devuelve el objeto Date con los nuevos días añadidos
    }

    public ArrayList<Personal> seleccionRandomPersonal(ArrayList<Personal> listaPersonal, int cantidadLista){
        ArrayList<Personal> listResult = new ArrayList<>();
        int nuAux ;
        for (int i = 0; i < cantidadLista; i++) {
            // Calculamos el numero aleatorio
            nuAux = this.getRandomNumber(0,listaPersonal.size()-1);

            // Agregamos y eliminamos la persona de las listas
            listResult.add(listaPersonal.get(nuAux));
            listaPersonal.remove(nuAux);
        }
        return listResult;
    }

    public Date dateNow(){
        Date now = new Date();
        Calendar cal = Calendar.getInstance(); // locale-specific
        cal.setTime(now);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        return cal.getTime();
    }

    public String getRamdonMarcaAutomovil(){
        List<String> lista = List.of("CHEVROLET", "RENAULT", "MAZDA", "KIA","HYUNDAI","TOYOTA","FORD","NISSAN");
        Random rand = new Random();
        return lista.get(rand.nextInt(lista.size()));
    }

    public String getRamdonMarcaMotocicleta(){
        List<String> lista = List.of("YAMAHA", "BAJAJ", "AKT", "AUTECO","BMW","HONDA","HERO","KAWASAKI");
        Random rand = new Random();
        return lista.get(rand.nextInt(lista.size()));
    }

}
