package ineritance;

class Animal
{
 Animal myType()
 {
  return new Animal();
 }
}

class Dog extends Animal
{
 Dog myType()     //Legal override after Java5 onward
 {
  return new Dog();
 }
}