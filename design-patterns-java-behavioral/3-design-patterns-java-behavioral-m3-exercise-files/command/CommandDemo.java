package command;

import java.util.ArrayList;
import java.util.List;

//client
public class CommandDemo {

	public static void main(String args[]) {

//		Light light = new Light();
//
////		Zamiast wywołać metodę bezpośrednio:
//		light.on();
//
////		Używamy Command:
//		Switch lightSwitch = new Switch();
//		Command onCommand = new OnCommand(light);
//		lightSwitch.storeAndExecute(onCommand);
//// ? Switch przechowuje historyczne operacje, może przechowywać różne komendy (różne implementacje Command)
//// ? Klasa zapisująca jest jedna, gdyby pominąć Switch, metodę zapisywania trzeba by było pisać w każdej klasie Command



		Light bedroomLight = new Light();
		Light kitchenLight = new Light();

		Switch lightSwitch = new Switch();
		Command toggleCommand = new ToggleCommand(bedroomLight);
		lightSwitch.storeAndExecute(toggleCommand);
		//lightSwitch.storeAndExecute(toggleCommand);
		//lightSwitch.storeAndExecute(toggleCommand);

		List<Light> lights = new ArrayList<>();
		lights.add(kitchenLight);
		lights.add(bedroomLight);

		Command allLightsCommand = new AllLightsCommand(lights);

		lightSwitch.storeAndExecute(allLightsCommand);
	}
}

// rozdziela klienta od klasy, która wykonuje zadania

//▪ Encapsulate request as an Object
//▪ Object-oriented callback
//▪ Decouple sender from processor
//▪ Often used for “undo” functionality
//▪ Examples:
//	▪ java.lang.Runnable
//	▪ javax.swing.Action

//• Encapsulate each request as an object
//• Decouple sender from processor
//• Very few drawbacks
//• Often used for undo functionality

// wzorzec pozwala na stworzenie logiki operacji typu 'undo'
// Polecenie wzorcem projektowym który zmienia żądanie w samodzielny obiekt zawierający wszystkie informacje o tym żądaniu.
// Taka transformacja pozwala na parametryzowanie metod przy użyciu różnych żądań.
// Oprócz tego umożliwia opóźnianie lub kolejkowanie wykonywania żądań oraz pozwala na cofanie operacji.
