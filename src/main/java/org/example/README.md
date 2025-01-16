# Einfache Taschenrechner-Anwendung

## Überblick
Dieses Projekt ist eine einfache Taschenrechner-Anwendung in Java. Sie ermöglicht es Benutzern, grundlegende mathematische Operationen wie Addition, Subtraktion, Multiplikation und Division auszuführen.

## Funktionen
- Addition (`+`)
- Subtraktion (`-`)
- Multiplikation (`*`)
- Division (`/`), mit Fehlerbehandlung für Division durch Null

## Bedienung
1. Der Benutzer wird aufgefordert, einen mathematischen Operator auszuwählen: `+`, `-`, `*` oder `/`.
2. Danach gibt der Benutzer zwei Zahlen ein.
3. Der Taschenrechner berechnet das Ergebnis basierend auf dem gewählten Operator und gibt das Ergebnis aus.

## Code
```java
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Willkommen beim Taschenrechner!");
        System.out.println("Wählen Sie eine Operation: +, -, *, /");
        char operator = scanner.next().charAt(0);

        System.out.print("Geben Sie die erste Zahl ein: ");
        double num1 = scanner.nextDouble();

        System.out.print("Geben Sie die zweite Zahl ein: ");
        double num2 = scanner.nextDouble();

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Das Ergebnis ist: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Das Ergebnis ist: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Das Ergebnis ist: " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Das Ergebnis ist: " + result);
                } else {
                    System.out.println("Fehler: Division durch Null ist nicht erlaubt.");
                }
                break;
            default:
                System.out.println("Ungültiger Operator! Bitte verwenden Sie +, -, * oder /.");
        }

        scanner.close();
    }
}
```

## Fehlerbehandlung
- **Division durch Null**: Der Taschenrechner erkennt eine Division durch Null und zeigt eine Fehlermeldung an, anstatt einen Absturz zu verursachen.
- **Ungültige Operatoren**: Wenn ein ungültiger Operator eingegeben wird, wird der Benutzer darauf hingewiesen.

## Anforderungen
- Java Development Kit (JDK) 8 oder höher
- Git (optional, für Versionskontrolle)

## Ausführen der Anwendung
1. Speichern Sie die Datei als `Calculator.java`.
2. Kompilieren Sie den Code:
   ```bash
   javac Calculator.java
   ```
3. Führen Sie die Anwendung aus:
   ```bash
   java Calculator
   ```

## Erweiterungsmöglichkeiten
- Unterstützung für weitere mathematische Operationen (z. B. Potenz, Wurzel).
- Eine grafische Benutzeroberfläche (GUI).
- Speicherung und Abruf von Berechnungsergebnissen.

---
Erstellt von: Einfache Taschenrechner-Entwicklungsteam

[![Java CI](https://github.com/perdix/Testing/actions/workflows/ci.yml/badge.svg)](https://github.com/perdix/Testing/actions/workflows/ci.yml)
