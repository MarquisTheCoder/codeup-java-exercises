package src;

import java.util.*;

public class HashmapLecture{

    public static void main(String [] args){

        //In a hashmap every key must be unique
        HashMap<String, Beast> beastHashMap = new HashMap<>();

        //adding beast and beast gods to the beastHashMap hashmap
        beastHashMap.put("Gutz", new Beast("Beast Of Darkness",100,80));
        beastHashMap.put("Griffith",  new Beast("Femto(God of pride)", 1000,200));
        beastHashMap.put("Slan", new Beast("Slan(God of lust)", 700, 2));
        beastHashMap.put("Void", new Beast("Void(God of darkness)", 2000, 100));
        beastHashMap.put("Ubik", new Beast("Ubik(God of manipulation)", 900, 90));
        beastHashMap.put("Conrad", new Beast("Conrad(God of imputence)", 1400, 60));
        beastHashMap.put("Zodd", new Beast("Zodd", 400, 100));

        //iterating through the hasmap elements and and because hashmaps hold
        //Mao.entry type we are using that type to work with.
        for(Map.Entry<String, Beast> beast: beastHashMap.entrySet()){
            Beast beasts = beast.getValue();
            System.out.print(beast.getKey() + " : ");
            System.out.println(beasts.getName() +
                    " hitPoints: " + beasts.getHitPoints() );
        }
        beastHashMap.forEach((key, beast)->{
            System.out.println(key);
            System.out.println("-----------------------" + beast.getName());
        });

        List<String> beastNames = new ArrayList<>(beastHashMap.keySet().stream().toList());

        Collections.sort(beastNames);
        System.out.println(beastNames);

        TreeMap<String, Integer> Employees = new TreeMap<>();

        TreeMap<String, Beast> sortedBeastMap = new TreeMap<>(beastHashMap);
        //technique number two


        Object[] monstersArray = beastHashMap.values().toArray();

        for(Object beast: monstersArray){
            int hitPoints = ((Beast) beast).getHitPoints();
            System.out.println(hitPoints);
        }



    }
}

