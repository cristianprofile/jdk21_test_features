package com.example.demojdk21;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.SequencedSet;

import org.junit.jupiter.api.Test;
 
class JavaTest {

  @Test
  void sequenceCollection() {

    List<String> sequencedList = new ArrayList<>(List.of("Element1", "Element2", "Element3"));
    sequencedList.addLast("Element4");

    // get first and last element jdk 17
    assertThat( sequencedList.get(sequencedList.size() - 1)).isEqualTo("Element4");
    assertThat( sequencedList.get(0)).isEqualTo("Element1");

    // get first and last element jdk 21
    assertThat(sequencedList.getLast()).isEqualTo("Element4");
    assertThat(sequencedList.getFirst()).isEqualTo("Element1");


    LinkedHashSet<String> sequenceSet = new LinkedHashSet<>();
    sequenceSet.add("Element1");
    sequenceSet.add("Element2");
    sequenceSet.add("Element3");

    // get first  element set  jdk 17
    assertThat( sequenceSet.iterator().next()).isEqualTo("Element1");

    // get first  element set  jdk 21
    assertThat( sequenceSet.getFirst()).isEqualTo("Element1");

    // remove first  element set  jdk 21
    sequenceSet.removeFirst();
    assertThat( sequenceSet.getFirst()).isEqualTo("Element2");

    // reverse  set  jdk 21
    SequencedSet<String> reversed = sequenceSet.reversed();

    assertThat( reversed.getFirst()).isEqualTo("Element3");

  }
  
  Integer getShapeValue(Shape shape)
  {
    return switch (shape){
      case Circle circle -> 1;
      case Rectangle rectangle -> 4;
    };
  }
  
  @Test
  void switchTest() {
    assertThat(Vehicle.BUS.process()).isEqualTo(180);
    Circle circle = new Circle(12.0);
    Integer shapeValue = getShapeValue(circle);
    assertThat(shapeValue).isEqualTo(1);
  }

  @Test
  void destructRecordTest() {

    record Person(String name, Integer age) {}

    Person person = new Person("Juan", 30);
    // jdk 17 instance of
    if (person instanceof Person p) {
      String name = p.name();
      int age = p.age();
      assertThat(name+age).isEqualTo("Juan30");
    }

    // jdk 21 instance of
    if (person instanceof Person(String name, Integer age)) {
      assertThat(name+age).isEqualTo("Juan30");
    }

    // jdk 21 instance of applies to switch patterns too
    switch (person) {
      case Person(String name, Integer age) -> {
        assertThat(name+age).isEqualTo("Juan30");
      }
    }
  }

  @Test
  void stringTemplateTest() {
    String name = "Cristian";

    // JDK 21 String template
    String cad = STR."My name is \{name}";
    assertThat(cad).isEqualTo("My name is Cristian");

    String cad2 = STR."My name is \{name.toUpperCase()}";
    assertThat(cad2).isEqualTo("My name is CRISTIAN");
  }


  @Test
  void unnamedVariableTest() {

    Person person = new Person("Juan", 30);

   
    // jdk 17 instance of
    if (person instanceof Person _) {
      System.out.println(STR."person = \{person}");
    }


    if (person instanceof Person(String name, _)) {

      System.out.println("Department Name is : " + name);  
    }

  }


}
