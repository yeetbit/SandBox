package testing;

import testing.instantiableObjects.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class StreamTests {
    AnimalFactory factory;
    List<Animal> AnimalList;

    public StreamTests(){
        runThings();
		AnimalList = initAnimal();
       

    }

    private List<Animal> initAnimal(){
        factory = new AnimalFactory();
        List<Animal> animl = new ArrayList<Animal>();
        for(int i=0; i < 5; i++){
            animl.add(factory.createBeast());
        }
        return animl;
    }
        
    private void runThings(){

        Map<String, Map<String, Long>> animalTypecounts =
            AnimalList.stream().collect(Collectors.groupingBy(
                Animal::getType, TreeMap::new, Collectors.groupingBy(
                    Animal::getName, TreeMap::new, Collectors.counting()
                )
            )
        );
        Stream.iterate(10, t -> t <= 30, (t) -> t + 10);
        animalTypecounts.entrySet().forEach(System.out::println);

    }

}
