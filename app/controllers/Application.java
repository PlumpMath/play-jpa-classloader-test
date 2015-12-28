package controllers;

import java.util.List;
import java.util.Random;

import models.Foo;
import play.mvc.Controller;

public class Application extends Controller {

    public static void index() {
        Foo f = new Foo();
        f.bar = "Bar " + new Random().nextInt(100);
        f.save();

        List<Foo> foos = Foo.findAll();
        render(foos);
    }

}