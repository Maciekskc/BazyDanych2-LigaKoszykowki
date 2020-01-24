package Start;

import DataLayer.Components.MatchesEntity;
import DataLayer.Components.PeopleEntity;
import DataLayer.Components.PlayersEntity;
import DataLayer.Components.TeamsEntity;
import DataLayer.Components.Views.MatchResultsEntity;
import DataLayer.Components.Views.PlayersOtherStatEntity;
import DataLayer.Components.Views.PlayersStatEntity;
import DataLayer.DataAccesLayer.DataAccessImpl;
import DataLayer.DataAccesLayer.IDataAccess;

import javax.swing.*;
import java.awt.*;
import java.sql.Time;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.List;

public class Controller {

    public IDataAccess dtoData;


    public static void main(String args[]){
        new Controller();
    }

    public Controller() {
        //oldMain();
        //fullCrudTest();
        //shortTestPerson();
        shortTestPlayer();
        testShot();
    }

    public void shortTestPerson(){
        open();
        println("Metoda szybkiego testu CRUD dla tabeli osób - PeopleEntity");
        println("Inicjalizuje logowanie jako użytkownik\n\tlogi połączeniowe w podstawowej konsoli apliakcji");
        dtoData = new DataAccessImpl();
        println("Poprawnie nawiązano połączenie\n");

        //dla użytkownika
        if(true) {
            println("Ilosc Rekordow tabeli: " + dtoData.getAllPeople().size());
            dtoData.addSimplePerson();
            println("CREATE");
            println("Ilosc Rekordow tabeli: " + dtoData.getAllPeople().size());
            try{
                PeopleEntity person = dtoData.getSimplePerson();
                println("READ: " + "[id:"+person.getId()+"; name:"+person.getName()+"; surname:"+person.getSurname()+"]");
                println("Ilosc Rekordow tabeli: " + dtoData.getAllPeople().size());
                dtoData.updateSimplePerson();
                println("Update: " + "[id:"+person.getId()+"; name:"+person.getName()+"; surname:"+person.getSurname()+"]");
                println("Ilosc Rekordow tabeli: " + dtoData.getAllPeople().size());
            }catch(NullPointerException e){
                println("READ i UPDATE niewykonały się ponieważ obiekt nie został utworzony");
            }
            dtoData.removeSimplePerson();
            println("DROP");
            println("Ilosc Rekordow tabeli: " + dtoData.getAllPeople().size());
        }

        println("Inicjalizuje logowanie jako administrator\n\tlogi połączeniowe w podstawowej konsoli apliakcji");
        dtoData.loginAsAdmin();
        println("Poprawnie nawiązano połączenie\n");

        //to samo po zalogowaniu jako administrator
        if(true) {
            println("Ilosc Rekordow tabeli: " + dtoData.getAllPeople().size());
            dtoData.addSimplePerson();
            println("CREATE");
            println("Ilosc Rekordow tabeli: " + dtoData.getAllPeople().size());
            try{
                PeopleEntity person = dtoData.getSimplePerson();
                println("READ: " + "[id:"+person.getId()+"; name:"+person.getName()+"; surname:"+person.getSurname()+"]");
                println("Ilosc Rekordow tabeli: " + dtoData.getAllPeople().size());
                dtoData.updateSimplePerson();
                println("Update: " + "[id:"+person.getId()+"; name:"+person.getName()+"; surname:"+person.getSurname()+"]");
                println("Ilosc Rekordow tabeli: " + dtoData.getAllPeople().size());
            }catch(NullPointerException e){
                println("READ i UPDATE niewykonały się ponieważ obiekt nie został utworzony");
            }
            dtoData.removeSimplePerson();
            println("DROP");
            println("Ilosc Rekordow tabeli: " + dtoData.getAllPeople().size());
        }
    }

    public void shortTestPlayer(){
        open();
        println("Metoda szybkiego testu CRUD dla tabeli graczt - PlayersEntity");
        println("Inicjalizuje logowanie jako użytkownik\n\tlogi połączeniowe w podstawowej konsoli apliakcji");
        dtoData = new DataAccessImpl();
        println("Poprawnie nawiązano połączenie\n");

        //dla użytkownika
        if(true) {
            println("Ilosc Rekordow tabeli: " + dtoData.getAllPlayers().size());
            dtoData.addSimplePerson();
            dtoData.addSimplePlayer();
            println("CREATE");
            println("Ilosc Rekordow tabeli: " + dtoData.getAllPlayers().size());
            try{
                PlayersEntity player = dtoData.getSimplePlayer();
                println("READ: " + "[id:"+player.getId()+"; id osoby :"+player.getPeopleId()+"; id druzyny:"+player.getTeamsId()+"; nr :"+player.getJerseyNr()+"]");
                PeopleEntity person = dtoData.getPersonById(player.getPeopleId());
                if(person!=null) println("getterPlayera: " + "[id:"+person.getId()+"; name:"+person.getName()+"; surname:"+person.getSurname()+"]");
                println("Ilosc Rekordow tabeli: " + dtoData.getAllPlayers().size());
                dtoData.updateSimplePlayer();
                println("UPDATE: " + "[id:"+player.getId()+"; id osoby :"+player.getPeopleId()+"; id druzyny:"+player.getTeamsId()+"; nr :"+player.getJerseyNr()+"]");
                println("Ilosc Rekordow tabeli: " + dtoData.getAllPlayers().size());
            }catch(NullPointerException e){
                println("READ i UPDATE niewykonały się ponieważ obiekt nie został utworzony");
            }
            dtoData.removeSimplePlayer();
            println("DROP");
            println("Ilosc Rekordow tabeli: " + dtoData.getAllPlayers().size());
            dtoData.removeSimplePerson();
        }

        println("Inicjalizuje logowanie jako administrator\n\tlogi połączeniowe w podstawowej konsoli apliakcji");
        dtoData.loginAsAdmin();
        println("Poprawnie nawiązano połączenie\n");
        //to samo po zalogowaniu jako administrator
        if(true) {
            println("Ilosc Rekordow tabeli: " + dtoData.getAllPlayers().size());
            dtoData.addSimplePerson();
            dtoData.addSimplePlayer();
            println("CREATE");
            println("Ilosc Rekordow tabeli: " + dtoData.getAllPlayers().size());
            try{
                PlayersEntity player = dtoData.getSimplePlayer();
                println("READ: " + "[id:"+player.getId()+"; id osoby :"+player.getPeopleId()+"; id druzyny:"+player.getTeamsId()+"; nr :"+player.getJerseyNr()+"]");
                PeopleEntity person = dtoData.getPersonById(player.getPeopleId());
                if(person!=null) println("getterPlayera: " + "[id:"+person.getId()+"; name:"+person.getName()+"; surname:"+person.getSurname()+"]");
                println("Ilosc Rekordow tabeli: " + dtoData.getAllPlayers().size());
                dtoData.updateSimplePlayer();
                println("UPDATE: " + "[id:"+player.getId()+"; id osoby :"+player.getPeopleId()+"; id druzyny:"+player.getTeamsId()+"; nr :"+player.getJerseyNr()+"]");
                println("Ilosc Rekordow tabeli: " + dtoData.getAllPlayers().size());
            }catch(NullPointerException e){
                println("READ i UPDATE niewykonały się ponieważ obiekt nie został utworzony");
            }
            dtoData.removeSimplePlayer();
            println("DROP");
            println("Ilosc Rekordow tabeli: " + dtoData.getAllPlayers().size());
            dtoData.removeSimplePerson();
        }
    }

    public void testShot(){

        if(true) {
            println("Testujemy dodawanie zdarzeń dla rzutu: dane wejściowe\n");
            List<MatchResultsEntity> matchResults = dtoData.getMatchResults();
            for (MatchResultsEntity match : matchResults)
                println("[" + match.getId() + ";"+ match.getHost() + ";" + match.getGuest() + ";" + match.getHostPts() + "-" + match.getGuestPts() + "]");


            dtoData.addThrow();

            println("\n\n");
            println("Dodano rzut(trafiony rzut osobisty, gracza id 1 w meczu id 1), nowe dane:\n\n");

            dtoData.loginAsUser();
            matchResults = dtoData.getMatchResults();
            for (MatchResultsEntity match : matchResults)
                println("[" + match.getId() + ";"+ match.getHost() + ";" + match.getGuest() + ";" + match.getHostPts() + "-" + match.getGuestPts() + "]");

            if(false) {
                dtoData.removeThrow();

                println("Usunięto rzut rzutu, nowe dane:");
                matchResults = dtoData.getMatchResults();
                List<MatchResultsEntity> matchResultsAfterAdd = dtoData.getMatchResults();
                MatchResultsEntity match = dtoData.getMatchById(1);
                match = matchResults.get(0);
                println("[" + match.getHost() + ";" + match.getGuest() + ";" + match.getHostPts() + "-" + match.getGuestPts() + "]");
            }
        }
    }

    public void fullCrudTest(){
        open();
        println("Metoda testowa testu CRUD-u dla obu użytkowników");
        println("Inicjalizuje logowanie jako użytkownik\n\tlogi połączeniowe w podstawowej konsoli apliakcji");
        dtoData = new DataAccessImpl();
        println("Poprawnie nawiązano połączenie\n");


        for(int users = 0 ; users<2 ; users++){
            //przelogowanie na administratora w drugim obiegu
            if(users == 1){
                println("Inicjalizuje logowanie jako administrator\n\tlogi połączeniowe w podstawowej konsoli apliakcji");
                dtoData.loginAsAdmin();
                println("Poprawnie nawiązano połączenie\n");
            }

            //READ
            println("Inicjalizuje test READ/Select z tabeli graczy");
            try{
                List<PlayersEntity> players= dtoData.getAllPlayers();
                println("Odczytano zapytanie i pobrano: "+players.size()+" wyników");
            }catch (Exception e){
                println("Próba odczytu zwróciła wyjątek:"+e.getMessage());
            }finally {
                println("Test odczytu zakończony\n");
            }

//            //CREATE
//            println("Inicjalizuje test CREATE/insert do tabeli meczy");
//            try{
//                println("Przed wykonaniem zapytania do bazy, ilość meczy wynosi: "+dtoData.getAllPeople().size());
//                dtoData.addSimpleMatch();
//                println("Zrealizowano zapytanie, ilość meczy wynosi: "+dtoData.getAllPeople().size());
//            }catch (Exception e){
//                println("Próba dodania zwróciła wyjątek:"+e.getMessage());
//            }finally {
//                println("Test dodawania rekordów zakończony\n");
//            }
//
//            //UPDATE
//
//            //DROP
//            println("Inicjalizuje test DROP/remove do tabeli meczy");
//            try{
//                println("Przed wykonaniem zapytania do bazy, ilość meczy wynosi: "+dtoData.getAllPeople().size());
//                dtoData.removeSimpleMatch();
//                println("Zrealizowano zapytanie, ilość meczy wynosi: "+dtoData.getAllPeople().size());
//            }catch (Exception e){
//                println("Próba dodania zwróciła wyjątek:"+e.getMessage());
//            }finally {
//                println("Test dodawania rekordów zakończony\n");
//            }



            //CREATE
            println("Inicjalizuje test CREATE/insert do tabeli meczy");
            try{
                println("Przed wykonaniem zapytania do bazy, ilość meczy wynosi: "+dtoData.getMatchResults().size());
                dtoData.addSimpleMatch();
                println("Zrealizowano zapytanie, ilość meczy wynosi: "+dtoData.getMatchResults().size());
            }catch (Exception e){
                println("Próba dodania zwróciła wyjątek:"+e.getMessage());
            }finally {
                println("Test dodawania rekordów zakończony\n");
            }

            //CREATE
            println("Inicjalizuje test DROP/remove do tabeli meczy");
            try{
                println("Przed wykonaniem zapytania do bazy, ilość meczy wynosi: "+dtoData.getMatchResults().size());
                dtoData.removeSimpleMatch();
                println("Zrealizowano zapytanie, ilość meczy wynosi: "+dtoData.getMatchResults().size());
            }catch (Exception e){
                println("Próba dodania zwróciła wyjątek:"+e.getMessage());
            }finally {
                println("Test dodawania rekordów zakończony\n");
            }
        }
    }



    ///opcje paneklu wyświetlania
    public JTextArea textField;

    public void open() {
        JFrame frame = new JFrame("Konsola Kontrolna");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        // tworzymy pole tekstowe z domyślnym tekstem
        textField = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textField);

        panel.add(scrollPane);
        frame.add(panel);
        // tworzymy pole na którym będzie wypisany tekst
        frame.setVisible(true);
    }

    public void println(String line){
        Calendar loging = Calendar.getInstance();
        String timeMessage = "[" + loging.getTime().getHours() + ":" + loging.getTime().getMinutes() + ":" + loging.getTime().getSeconds() +"] ";
        textField.setText(textField.getText()+timeMessage+ line+"\n");
    }

    public void clearPane(){
        textField.setText(null);
    }

    public void oldMain(){

         /*
            ///cała operacja wykonywana przez interfejs dostępowy
        PersistenceProvider persistenceProvider = new HibernatePersistenceProvider();
         EntityManagerFactory entityManagerFactory = persistenceProvider.createEntityManagerFactory("AdminPersistenceUnit",new HashMap());
         EntityManager entityManager = entityManagerFactory.createEntityManager();
        for(PlayersEntity player: entityManager.createQuery(SELECT_QUERY,PlayersEntity.class).getResultList())
            System.out.println(player.getId()+" "+player.getPeopleByPeopleId().getName()+" "+player.getPeopleByPeopleId().getSurname());
        */
        open();
        println("Logowanie do Panelu Użytkownika...");
        dtoData = new DataAccessImpl();
        println("Zalogowano jako użytkownik");

        println("\n$$$ Execute select query from Table $$$");
        for(PlayersEntity player: dtoData.getAllPlayers()){
            System.out.println(player.getId()+" "+player.getPeopleByPeopleId().getName()+" "+player.getPeopleByPeopleId().getSurname());
            println(player.getId()+" "+player.getPeopleByPeopleId().getName()+" "+player.getPeopleByPeopleId().getSurname());
        }

        println("\n$$$ Execute select query from View $$$");
        for(MatchResultsEntity match: dtoData.getMatchResults()){
            System.out.println(match.getHost() +" vs "+ match.getGuest());
            println(match.getHost() +" vs "+ match.getGuest());
        }

        //tworzymy obiekt gracza
        PeopleEntity person = new PeopleEntity();
        LocalTime time = LocalTime.now();
        person.setBirthDate(Time.valueOf(time));
        person.setId((byte) 120);
        person.setName("TO MNIE");
        person.setSurname("DODANO!!!");

        TeamsEntity team = new TeamsEntity();
        team = dtoData.getTeamById(1);

        PlayersEntity addedPlayer = new PlayersEntity();
        addedPlayer.setId((byte) 126);
        addedPlayer.setJerseyNr(23);
        addedPlayer.setPeopleByPeopleId(person);
        addedPlayer.setTeamsByTeamsId(team);

        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        if(dtoData.addPlayerEntity(addedPlayer)){
            System.out.println("Dodałem gracza");
            println("\nUdało się dodać Gracza");
        }else{
            println("\nNie udało się dodać Gracza");
        }

        println("\nLogowanie do Panelu Administratora...");
        if(dtoData.loginAsAdmin()){
            println("\nZalogowano jako Administrator");
        }else{
            println("Nastąpił nieoczekiwany błąd");
        }

        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        if(dtoData.addPlayerEntity(addedPlayer)){;
            System.out.println("Dodałem gracza");
        }else{
            println("Nie udało się dodać Gracza");
        }

        println("\n$$$ Execute select query from Table $$$");
        for(PlayersEntity player: dtoData.getAllPlayers()){
            System.out.println(player.getId()+" "+player.getPeopleByPeopleId().getName()+" "+player.getPeopleByPeopleId().getSurname());
            println(player.getId()+" "+player.getPeopleByPeopleId().getName()+" "+player.getPeopleByPeopleId().getSurname());
        }
    }
}
