package factorymethod_animal;

class DogFactory extends AnimalFactory {
    public Animal createAnimal() {
//Creating a Dog
        return new Dog();
    }
}