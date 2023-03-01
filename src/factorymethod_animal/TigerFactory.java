package factorymethod_animal;

class TigerFactory extends AnimalFactory {
    public Animal createAnimal() {
//Creating a Tiger
        return new Tiger();
    }
}