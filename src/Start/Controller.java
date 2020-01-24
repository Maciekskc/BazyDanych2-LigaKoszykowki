package Start;

import DataLayer.Components.PeopleEntity;
import DataLayer.Components.PlayersEntity;
import DataLayer.Components.Views.MatchResultsEntity;
import DataLayer.DataAccesLayer.DataAccessImpl;
import DataLayer.DataAccesLayer.IDataAccess;

import javax.swing.*;
import java.awt.*;
import java.util.Calendar;
import java.util.List;

public class Controller {

    private IDataAccess dtoData;


    public static void main(String args[]){
        new Controller();
    }

    public Controller() {
        //shortTestPerson();
        shortTestPlayer();
        testShot();
    }

    ///scenariusz sprawdzający funkcjonalność operacji na tabeli "People"
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

    ///scenariusz sprawdzający funkcjonalność operacji na tabeli "Player"
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

    ///scenariusz sprawdzający funkcjonalność operacji dodawania zdzarzenia i przypisywania do niego rzutu
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

    ///Panel wyświetlający wyniki operacji na na bazie danych

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

}
