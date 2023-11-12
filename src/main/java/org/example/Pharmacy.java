package org.example;

import java.util.*;

public class Pharmacy {
    private Map<String, Medication> pharmacy = new HashMap<>();

    public Pharmacy() {
    }

    public Pharmacy(Map<String, Medication> pharmacy) {
        this.pharmacy = pharmacy;
    }
    public int getCount(){
        return pharmacy.size();
    }
    public void save(Medication medication){
        pharmacy.put(medication.getName(), medication);

    }
    public String find(String name){
        if (pharmacy.get(name) != null){
            System.out.println(name + " is found.");
            return name;
        }else{
            System.out.println(name + " isn't found.");
            return null;
        }
    }
    public Medication find1(String name){
        if (pharmacy.get(name) != null){
            System.out.println(name + " is found.");
            return pharmacy.get(name);
        }else{
            System.out.println(name + " isn't found.");
            return null;
        }
    }
    public Medication find2(String name){

        return pharmacy.getOrDefault(name,null);

    }


    public void delete(String name){
        if (pharmacy.get(name) != null){
            pharmacy.remove(name);
        }else{
            System.out.println("There isn't this medication.");
        }
    }
    public void delete1(String name){
        pharmacy.remove(name);
    }
    //method 1
    public void printAll(){
       /* for(int i=0;i<pharmacy.size();i++){
            System.out.println(pharmacy.values());
            pharmacy.
            Medication med = medList.get(i);
    System.out.println("Name: " + med.getName() + ", Price: " + med.getPrice() + ", Availability: " + med.getAvailability());
        }*/

        //System.out.println("pharmacy.values() is:");
        //System.out.println(pharmacy.values());


        for (Medication med : pharmacy.values()) {
            System.out.println("Name: " + med.getName() + ", Price: " + med.getPrice() + ", Availability: " + med.getAvailability());
        }

    }
    //method 2
    public void printAll1(){
       Collection<Medication> values = pharmacy.values();
       Iterator<Medication> iterator = values.iterator();
       while (iterator.hasNext()) {
           Medication med =  iterator.next();
           System.out.println("Name: " + med.getName() + ", Price: " + med.getPrice() + ", Availability: " + med.getAvailability());

       }
    }
    //method 3
    Set key = pharmacy.keySet();
    public void printAll2(){
        //System.out.println(key);
        for (Object med : key) {
            Medication m = pharmacy.get(med);
            System.out.println("Name: " + m.getName() + ", Price: " + m.getPrice() + ", Availability: " + m.getAvailability());
        }
    }
    //method 4
    public void printAll3(){
        Iterator iterator= key.iterator();
        while(iterator.hasNext()){
            Object med = iterator.next();
            Medication m = pharmacy.get(med);
            System.out.println("Name: " + m.getName() + ", Price: " + m.getPrice() + ", Availability: " + m.getAvailability());
        }
    }
    //method 5
    Set entrySet = pharmacy.entrySet();
    public void printAll4(){
        for (Object entry:entrySet) {
            Map.Entry m = (Map.Entry) entry;
            System.out.println(m.getKey()+"-"+m.getValue());

        }
    }
    


    @Override
    public String toString() {
        return "Pharmacy{" +
                "pharmacy=" + pharmacy +
                '}';
    }
}
