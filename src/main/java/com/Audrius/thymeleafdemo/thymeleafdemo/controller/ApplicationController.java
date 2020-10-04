package com.Audrius.thymeleafdemo.thymeleafdemo.controller;

import com.Audrius.thymeleafdemo.thymeleafdemo.model.Person;
import com.Audrius.thymeleafdemo.thymeleafdemo.model.Player;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class ApplicationController {

    @RequestMapping ("/hello")
    public String hello (HttpServletRequest request, Model model) {
        String name ="Vacys";
        name= request.getParameter("name");
        model.addAttribute("name", name);
        return "hello";
    }

    @RequestMapping ("/names")
    public String names (Model model) {
        List<String> names = new ArrayList<>();
        names.add("jonas");
        names.add("petras");
        names.add("rimas");

        model.addAttribute("names", names);
        return "names";
    }
    @RequestMapping ("/persons")
    public String persons (Model model) {
        Person person1 = new Person("Audrius", "Lunys", 37);
        Person person2 = new Person("Jonas", "Lasd", 53);
        Person person3 = new Person("Asdfs", "sdfsdf", 33);

        List<Person> persons = new ArrayList<>();
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);

        model.addAttribute("persons", persons);
        return "persons";
    }

    @RequestMapping ("/players")
    public String players (Model model) {
        Player player = new Player();
        player.setFirstName("Scottie");
        player.setLastName("Pippen");
        player.setAge(60);

          List<Player> players = new ArrayList<>();
          players.add(player);
          model.addAttribute("players", players);
          return "players";


    }
}
