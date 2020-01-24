Projekt realizowany w ramach zajêæ Bazy Danych 2, realizowanego na Politechnice wroc³awskiej, na zemstrze 5(2019/2020r),
którego opiekunem by³/jest dr in¿. Roman Ptak.

Projekt jest aplikacj¹ mapuj¹c¹ implementowan¹ tabele i widoki bazy danych OracleXE, zamieszczon¹ na serverze lokalnym.

Ewentualne wykorzystanie aplikacji przez osoby trzecie wymaga edycji pliku:
"\src\META-INF\persistance.xml" zgodnie z konfiguracj¹ bazy danych zamieszczon¹ na w³asnym komputerze.

Aplikacja jest pozbawiona interfejsu u¿ytkownika. Posiada jedynie interfejs programistyczny, pozwalaj¹cy odwo³ywaæ siê do danych.
Pakiet DataLayer.Components zawiera klasy zmapowane za pomoc¹ frameworku Hibernate. S¹ one reprezentacj¹ encji w naszej lokalnej bazie danych.
Obiekt "Controller" w pakiecie 'start' zawiera metody sprawdzaj¹ce dzia³anie interfejsu programistycznego pozwalaj¹cego na dostêp do danych.

Aplikacja nie posiada pe³nych mo¿liwoœci operacji na bazie danych, a jest jedynie dowodem udanej konfiguracji hibernat-a
i mo¿liwoœci wykonywania operacji na bazie danych z poziomu kodu.

Projekt w tej wersji, zosta³ finalnie zatwierdzony przez prowadz¹cego jako zaliczenie etapu 4:"aplikacja dostêpowa"
i nie jest planowana jego rozbudowa.

