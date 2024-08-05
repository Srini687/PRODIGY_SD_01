import java.util.Scanner;

public class TemperatureConverter {

public static void main(String[] args) { Scanner scanner = new Scanner(System.in);

System.out.println("Temperature Conversion Program"); System.out.print("Enter the temperature value: ");

double temperature scanner.nextDouble();

System.out.print("Enter the unit of measurement (Celsius, Fahrenheit, or Kelvin): "); scanner.nextLine(); // Consume the newline character

String originalUnit = scanner.nextLine().toLowerCase();

double convertedTemperatureCelsius = 0;

double convertedTemperatureFahrenheit = 0;

double converted TemperatureKelvin = 0;

convertedTemperatureKelvin temperature;

} else {

if (originalUnit.equals("celsius")) {

convertedTemperatureCelsius = temperature;

converted Temperature Fahrenheit (temperature 9/5) + 32;

converted TemperatureKelvin temperature + 273.15;

} else if (originalUnit.equals("fahrenheit")) {

converted TemperatureCelsius (temperature 32) 5/9;

convertedTemperatureFahrenheit temperature;

converted TemperatureKelvin (temperature } else if (originalUnit.equals("kelvin")) { 32) 5/9 273.15;

convertedTemperatureCelsius temperature 273.15;

convertedTemperatureFahrenheit (temperature 273.15) 9/5 + 32;
convertedTemperatureKelvin = temperature;
} else {top 
System.out.println("Invalid unit of measurement. Please enter Celsius, Fahrenheit, or Kelvin.");
System.exit(1);

}

System.out.println("Converted Temperatures:");

System.out.println("Celsius: " + convertedTemperature Celsius + " °C"); System.out.println("Fahrenheit: " + converted Temperature Fahrenheit + " "F");

System.out.println("Kelvin: " + converted TemperatureKelvin + " K");

scanner.close();

}
