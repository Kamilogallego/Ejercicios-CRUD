import java.util.HashMap;
import java.util.List;

public class Cajero {

    private String id;
    private String pin;
    private HashMap<String, Cuenta> cuentas;

    public Cajero(String id, String pin) {
        this.id = id;
        this.pin = pin;
        this.cuentas = new HashMap<>();

        Cuenta cuenta1 = new Cuenta("1234567890", 100000);
        cuentas.put("Cuenta1", cuenta1);

        Cuenta cuenta2 = new Cuenta("9876543210", 200000);
        cuentas.put("Cuenta2", cuenta2);
    }

    public void login() {
        System.out.println("Ingrese su ID: ");
        String ingresadoId = System.console().readLine();

        System.out.println("Ingrese su PIN: ");
        String ingresadoPin = System.console().readLine();

        if (ingresadoId.equals(this.id) && ingresadoPin.equals(this.pin)) {
            System.out.println("Inicio de sesión exitoso");
        } else {
            System.out.println("Inicio de sesión fallido");
        }
    }

    public void menu() {
        System.out.println("¿Qué desea hacer?");
        System.out.println("1. Consulta de saldo");
        System.out.println("2. Retiro de efectivo");
        System.out.println("3. Depósito");
        System.out.println("4. Transferencia");
        System.out.println("5. Salir");

        int opcion = Integer.parseInt(System.console().readLine());

        switch (opcion) {
            case 1:
                this.consultaSaldo();
                break;
            case 2:
                this.retiroEfectivo();
                break;
            case 3:
                this.deposito();
                break;
            case 4:
                this.transferencia();
                break;
            case 5:
                System.out.println("Gracias por usar nuestro cajero automático");
                break;
            default:
                System.out.println("Opción incorrecta");
                break;
        }
    }

    private void consultaSaldo() {
        System.out.println("Ingrese el nombre de la cuenta: ");
        String nombreCuenta = System.console().readLine();

        Cuenta cuenta = cuentas.get(nombreCuenta);

        if (cuenta != null) {
            System.out.println("El saldo de la cuenta " + nombreCuenta + " es de " + cuenta.getSaldo());
        } else {
            System.out.println("No existe la cuenta " + nombreCuenta);
        }
    }

    private void retiroEfectivo() {
        System.out.println("Ingrese el nombre de la cuenta: ");
        String nombreCuenta = System.console().readLine();

        Cuenta cuenta = cuentas.get(nombreCuenta);

        if (cuenta != null) {
            System.out.println("Ingrese el monto a retirar: ");
            int monto = Integer.parseInt(System.console().readLine());

            if (monto % 50000 == 0 && monto <= cuenta.getSaldo()) {
                cuenta.setSaldo(cuenta.getSaldo() - monto);
                System.out.println("Retiro exitoso");
            } else {
                System.out.println("Error: monto incorrecto o saldo insuficiente");
            }
        } else {
            System.out.println("No existe la cuenta " + nombreCuenta);
        }
    }

    private void deposito() {
        System.out.println("Ingrese el nombre de la cuenta: ");
        String nombreCuenta = System.console().readLine();

        Cuenta cuenta = cuentas.get(nombreCuenta);

        if (cuenta != null) {
            System.out.println("Ingrese el monto a depositar: ");
            int monto = Integer.parseInt(System.console().readLine());

            cuenta.setSaldo(cuenta.
