# parkingLotGUI
Projektarbeit Parkhaus Simulationssoftware
Titel: Parkhaus-Simulationsprogramm

1. Einleitung
Das Parkhaus-Simulationsprogramm ist eine Java-basierte Anwendung, die entwickelt wurde, um das Parken und Entfernen von Fahrzeugen in einem mehrstöckigen Parkhaus zu simulieren. Die Anwendung verfügt über eine einfache grafische Benutzeroberfläche (GUI), die den Benutzern ermöglicht, Autos und Motorräder zu parken oder zu entfernen, und zeigt den aktuellen Status der Parkplätze an.

2. Anforderungen
Die Hauptanforderungen des Parkhaus-Simulationsprogramms sind:

2.1. Unterstützung für unterschiedliche Arten von Fahrzeugen
- Autos
- Motorräder

2.2. Einzigartige ID (Kennzeichen) für jedes Fahrzeug

2.3. Flexibilität bei der Anzahl der Etagen und Parkplätze pro Etage

2.4. Zuteilung eines freien Parkplatzes oder Ablehnung, wenn keine freien Parkplätze vorhanden sind

2.5. Verwaltungsfunktionen, wie die Position eines bestimmten Fahrzeugs und die Anzahl der freien Parkplätze abzufragen

3. Systemarchitektur
Die Anwendung besteht aus mehreren Klassen, die die verschiedenen Komponenten des Systems repräsentieren:

- Vehicle: Abstrakte Basisklasse für Fahrzeuge
- Car: Klasse, die Autos repräsentiert und von der Vehicle-Klasse erbt
- Motorcycle: Klasse, die Motorräder repräsentiert und von der Vehicle-Klasse erbt
- ParkingSpace: Klasse, die einen Parkplatz repräsentiert
- ParkingLot: Klasse, die das Parkhaus repräsentiert
- Garage: Klasse, die die Hauptfunktionen für das Parken und Entfernen von Fahrzeugen bereitstellt
- GarageGUI: Framework, das die grafische Benutzeroberfläche für das Parkhaus-Simulationsprogramm erstellt und verwaltet

4. Benutzerhandbuch
Um das Parkhaus-Simulationsprogramm zu verwenden, starten Sie die Anwendung, indem Sie die oben beschriebenen Schritte zum Kompilieren und Ausführen des Programms befolgen.

Die grafische Benutzeroberfläche besteht aus einem Textfeld, in das Sie das Kennzeichen des Fahrzeugs eingeben, und drei Schaltflächen zum Parken eines Autos, Parken eines Motorrads und Entfernen eines Fahrzeugs. Es gibt auch ein Textfeld, das den aktuellen Status der Parkplätze anzeigt.

Um ein Fahrzeug zu parken oder zu entfernen, führen Sie die folgenden Schritte aus:

1. Geben Sie das Kennzeichen des Fahrzeugs in das Textfeld ein.
2. Klicken Sie auf die entsprechende Schaltfläche, um ein Auto zu parken, ein Motorrad zu parken oder ein Fahrzeug zu entfernen.
3. Überprüfen Sie das Textfeld, um den aktuellen Status der Parkplätze und etwaige Meldungen über den Erfolg oder Misserfolg der Aktion zu sehen.

5. Fazit
Das Parkhaus-Simulationsprogramm bietet eine einfache und intuitive Möglichkeit, das Parken und Entfernen von Fahrzeugen in einem mehrstöckigen Parkhaus zu simulieren. Die Anwendung erfüllt die gestellten Anforderungen und ermöglicht den Benutzern, die Hauptfunktionen auf einfache Weise zu verwenden. Durch die modulare Architektur des Programms können in Zukunft weitere Verbesserungen und Funktionen hinzugefügt werden, um den Funktionsumfang zu erweitern oder auf spezifische Anforderungen zuzuschneiden.

6. Zukünftige Erweiterungen
Einige mögliche Erweiterungen für das Parkhaus-Simulationsprogramm sind:

6.1. Erweiterte Fahrzeugtypen
Die Unterstützung für zusätzliche Fahrzeugtypen wie Elektrofahrzeuge, Nutzfahrzeuge oder Fahrräder könnte hinzugefügt werden.

6.2. Reservierungssystem
Ein Reservierungssystem könnte implementiert werden, um Benutzern zu ermöglichen, Parkplätze im Voraus zu reservieren.

6.3. Preismodell
Ein Preismodell könnte hinzugefügt werden, um die Parkgebühren auf der Grundlage der Parkdauer, des Fahrzeugtyps oder der Tageszeit zu berechnen.

6.4. Statistiken und Berichte
Erweiterte Statistiken und Berichtsfunktionen könnten hinzugefügt werden, um detaillierte Informationen über die Nutzung des Parkhauses, Einnahmen und Auslastung zu liefern.

6.5. Integration mit externen Systemen
Das Parkhaus-Simulationsprogramm könnte mit externen Systemen wie Zahlungsanbietern, Navigationssystemen oder Parkhausmanagement-Software integriert werden.

7. Anhang
Im Anhang finden Sie den Quellcode für das Parkhaus-Simulationsprogramm und die zugehörige grafische Benutzeroberfläche. Stellen Sie sicher, dass alle Klassen in separaten Java-Dateien gespeichert sind und im selben Verzeichnis gespeichert sind, bevor Sie versuchen, das Programm zu kompilieren und auszuführen.
8. Installation und Systemvoraussetzungen

Um das Parkhaus-Simulationsprogramm auszuführen, stellen Sie sicher, dass Ihr System die folgenden Voraussetzungen erfüllt:

8.1. Java Development Kit (JDK)
Stellen Sie sicher, dass Sie das Java Development Kit (JDK) auf Ihrem System installiert haben. Das JDK enthält die notwendigen Tools, um Java-Anwendungen zu kompilieren und auszuführen. Sie können das JDK von der offiziellen Oracle-Website herunterladen: https://www.oracle.com/java/technologies/javase-downloads.html

8.2. Betriebssystem
Das Parkhaus-Simulationsprogramm ist plattformunabhängig und sollte auf jedem Betriebssystem ausgeführt werden können, das Java unterstützt, einschließlich Windows, macOS und Linux.

9. Support und Wartung
Für Fragen, Fehlerberichte oder Anregungen zur Verbesserung des Parkhaus-Simulationsprogramms wenden Sie sich bitte an den Entwickler oder das zuständige Support-Team. Regelmäßige Updates und Wartungsarbeiten werden durchgeführt, um sicherzustellen, dass das Programm fehlerfrei und auf dem neuesten Stand bleibt.

10. Lizenz und Urheberrecht
Das Parkhaus-Simulationsprogramm ist urheberrechtlich geschützt. Die Nutzung, Vervielfältigung oder Weitergabe des Programms oder eines Teils davon ist nur mit ausdrücklicher schriftlicher Genehmigung des Urheberrechtsinhabers gestattet. Alle Rechte vorbehalten.

11. Haftungsausschluss
Das Parkhaus-Simulationsprogramm wird "wie besehen" und ohne Gewährleistung jeglicher Art, weder ausdrücklich noch stillschweigend, zur Verfügung gestellt. Der Entwickler und der Urheberrechtsinhaber übernehmen keine Haftung für Schäden, die durch die Verwendung des Programms entstehen könnten. Die Verwendung des Programms erfolgt auf eigenes Risiko des Benutzers.
12. Schlussbemerkungen

Das Parkhaus-Simulationsprogramm wurde entwickelt, um den Betrieb eines Parkhauses in einer einfachen und benutzerfreundlichen Umgebung zu simulieren. Es ermöglicht Benutzern, Fahrzeuge zu parken, freie Parkplätze zu finden und Fahrzeugpositionen abzufragen. Die modulare Architektur des Programms ermöglicht es, weitere Funktionen und Verbesserungen hinzuzufügen, um den Anforderungen verschiedener Parkhausbetreiber gerecht zu werden.

Wir hoffen, dass dieses Programm dazu beiträgt, das Parkhausmanagement effizienter und benutzerfreundlicher zu gestalten und wertvolle Informationen zur Verfügung zu stellen, die bei der Planung und Optimierung von Parkhäusern helfen können.

Bei Fragen oder Anregungen zögern Sie bitte nicht, uns zu kontaktieren. Wir freuen uns darauf, Ihre Erfahrungen mit dem Parkhaus-Simulationsprogramm zu hören und Möglichkeiten zur Verbesserung des Programms zu erforschen.

Vielen Dank für Ihr Interesse an unserem Parkhaus-Simulationsprogramm.

Mit freundlichen Grüßen,



Daniel-Alfonsin Massa
[Entwickler / Unternehmen]
[Kontaktinformationen]
