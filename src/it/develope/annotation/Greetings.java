package it.develope.annotation;

public class Greetings {
    @DevAnnotation(DevName = "Jonh", DevSurname = "Walker")
    public void sayWelcome(){}

    @DevAnnotation(DevName = "Mark", DevSurname = "Brown")
    public void sayGoodBye(){}
}
