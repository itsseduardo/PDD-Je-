// Clase padre Vehículo
public class Vehiculo {
    private String marca;
    private String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String toString() {
        return "Marca: " + marca + ", Modelo: " + modelo;
    }
}

// Subclase Vehículo Terrestre
public class VehiculoTerrestre extends Vehiculo {
    private int numeroLlantas;

    public VehiculoTerrestre(String marca, String modelo, int numeroLlantas) {
        super(marca, modelo);
        this.numeroLlantas = numeroLlantas;
    }

    public int getNumeroLlantas() {
        return numeroLlantas;
    }

    @Override
    public String toString() {
        return super.toString() + ", Número de Llantas: " + numeroLlantas;
    }
}

// Subclase Vehículo Acuático
public class VehiculoAcuatico extends Vehiculo {
    private int numeroAsientos;

    public VehiculoAcuatico(String marca, String modelo, int numeroAsientos) {
        super(marca, modelo);
        this.numeroAsientos = numeroAsientos;
    }

    public int getNumeroAsientos() {
        return numeroAsientos;
    }

    @Override
    public String toString() {
        return super.toString() + ", Número de Asientos: " + numeroAsientos;
    }
}

// Ejemplo de uso
public class Main {
    public static void main(String[] args) {
        VehiculoTerrestre auto = new VehiculoTerrestre("Toyota", "Fortuner", 4);
        System.out.println(auto.toString());

        VehiculoAcuatico barco = new VehiculoAcuatico("Yamaha", "Waverunner", 2);
        System.out.println(barco.toString());
    }
}


