package day46_AccessModifiers.Zoo;

import java.util.ArrayList;

public class Zoo {

    private String name;
        private String adress;

        private ArrayList<Animal> animals;

        public Zoo(String name, String adress) {
            this.name = name;
            this.adress = adress;
            this.animals = new ArrayList<>();
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAdress() {
            return adress;
        }

        public void setAdress(String adress) {
            this.adress = adress;
        }

        public ArrayList<Animal> getAnimals() {
            return animals;
        }

        public void setAnimals(ArrayList<Animal> animals) {
            this.animals = animals;
        }

        public void addAnimal(Animal animal){
            animals.add(animal);
        }

        public void addAnimal(Animal... animals){
            for (Animal animal1 : animals  ) {
                this.animals.add(animal1);
            }
        }


        private String printHeader() {
            String str = "Information of the Zoo \n";
            //str += "-".repeat(str.length()) + "\n";
            str += "-".repeat(60) + "\n";
            str += "Name of the zoo    : " + name + "\n";
            str += "Address of the zoo : " + adress + "\n";
            str += "Total numbers of Animal in the zoo : " + getAnimals().size() + "\n";
            str += "-".repeat(60) + "\n";
            str += "List of Animals in the Zoo:\n";
            return str;
        }




        public String toString(){
            String str="";
            for (Animal animal: getAnimals()  ) {
                str+=animal.toString()+"\n";
            }
            return str;
        }
}
