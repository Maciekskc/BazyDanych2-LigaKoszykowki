Projekt realizowany w ramach zaj�� Bazy Danych 2, realizowanego na Politechnice wroc�awskiej, na zemstrze 5(2019/2020r)

Projekt jest aplikacj� mapuj�c� implementowan� w bazie danych Oracle XE zamieszczon� na serverze lokalnym.

Ewentualne wykorzystanie aplikacji przez osoby trzecie wymaga edycji pliku:
"\src\META-INF\persistance.xml" zgodnie z baz� danych zamieszczon� na w�asnym komputerze.

Aplikacja jest pozbawiona interfejsu u�ytkownika. Posiada jedynie interfejs programistyczny, pozwalaj�cy odwo�ywa� si� do danych.
Pakiet DataLayer.Components zawiera klasy zmapowane za pomoc� frameworku hibernate. S� one reprezentacj� encji w naszej lokalnej bazie danych.
Obiekt "Controller" w pakiecie 'start' zawiera metody sprawdzaj�ce dzia�anie interfejsu u�ytkownika.

Aplikacja nie posiada pe�nych mo�liwo�ci operacji na bazie danych, a jest jedynie dowodem udanej konfiguracji hibernat-a
i mo�liwo�ci wykonywania operacji na bazie danych z poziomu kodu.

