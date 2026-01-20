package com.currency.conversor.main;

import com.currency.conversor.client.ExchangeClient;
import com.currency.conversor.models.CurrencyRecord;

import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ExchangeClient client = new ExchangeClient();
        Scanner scan = new Scanner(System.in);
        int option = 0;
        String base_code = "", target_code = "";
        double amount;

        CurrencyRecord record;


        while (option != 7) {
            try {
                System.out.print("""
                        1) MXN >> USD
                        2) USD >> MXN
                        3) EUR =>> MXN
                        4) EUR =>> USD
                        5) GBP =>> USD
                        6) GBP =>> MXN
                        7) Salir
                        Elija una opción válida: 
                        """);

                option = scan.nextInt();
                if(option == 7) break;


                if(option >= 1 && option <= 6){
                    System.out.println("Monto: ");
                    amount = scan.nextDouble();

                    switch (option){
                        case 1:
                            base_code = "MXN";
                            target_code = "USD";
                            break;
                        case 2:
                            base_code = "USD";
                            target_code = "MXN";
                            break;
                        case 3:
                            base_code = "EUR";
                            target_code = "MXN";
                            break;
                        case 4:
                            base_code = "EUR";
                            target_code = "USD";
                            break;
                        case 5:
                            base_code = "GBP";
                            target_code = "USD";
                            break;
                        case 6:
                            base_code = "GBP";
                            target_code = "MXN";
                            break;
                    }
                    record = client.requestExchage("MXN", "USD", 200);
                    System.out.println(amount + " " + record.base_code() + " a " + record.target_code() + "= " + record.conversion_result());

                } else {
                    System.out.println("Opción inválida");
                }
            } catch (InputMismatchException e) {
                option = 0;
                scan.next();
                System.out.println("Código inválido.");
            }
        }

    }
}
